/*
 * Created on Jun 1, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;

import com.scoutsys.segy.SegyLineHeader;
import com.scoutsys.segy.SegyTrace;
import com.scoutsys.segy.SegyURLLoader;

/**
 * Base class for returning a subset from a SEG-Y file. The file
 * must be organized as sequential lines, each having the
 * same number of traces. That is, it must employ a 3-D rectangular survey
 * grid. 
 */
public abstract class SegyLineContentBase implements Content, ContentComposer {
    private URI fileURI;
    private File file;
    private URL url;
    protected SegyLineHeader lineHeader;
    protected String[] reelHeader;
    protected SegyTrace[] traces;
    protected long[] traceIDs;

    /**
     * 
     */
    public SegyLineContentBase(URI fileURI, File file) throws IOException {
        super();
        this.fileURI = fileURI;
        this.file = file;
        this.url = file.toURL();
        reelHeader = SegyURLLoader.loadReelHeader(url, false);
        lineHeader = SegyURLLoader.loadLineHeader(url, false);
    }

    /**
     * The formula is 3200 + 400 + (samplesPerTrace * 4 + 240) * numberOfTraces.
     * 
     * @see com.scoutsys.servlet.segy.content.Content#getContentLength()
     */
    public long getContentLength() {
        return 3600
            + traces.length
                * ((traces != null && traces.length > 0)
                    ? (240 + 4 * traces[0].numSamples)
                    : 0);
    }

    /**
     * Writes the 3200 byte EBCDIC reel header, the 400 byte line header, and 
     * the SEG-Y format (IBM floating point) traces, each with its 240 byte trace header.
     * 
     * @param contentType requested content type, must be  &quot;application/x-segy&quot;.
     * @param out stream to write upon
     * @see com.scoutsys.servlet.segy.content.Content#writeContent(java.lang.String, java.io.OutputStream)
     */
    public void writeContent(String contentType, OutputStream out)
        throws UnsupportedContentTypeException, IOException {
        if (!contentType.equals(ContentType.SEGY)) {
            throw new UnsupportedContentTypeException(contentType);
        }
        //TODO ebcdic header
        out.write(new byte[3200]);
        out.write(lineHeader.save(false));
        for (int i = 0; i < traces.length; i++) {
            int lineNumber = traces[i].fieldFileNum;
            int xlineNumber = traces[i].seqNumFieldFile;
            out.write(traces[i].toBytes(false));
        }
    }

    /**
     * Returns an array having the single element &quot;application/x-segy&quot;.
     * @see com.scoutsys.servlet.segy.content.Content#availableContentTypes()
     */
    public String[] availableContentTypes() {
        return new String[] { ContentType.SEGY };
    }

    /**
     * You cannnot compose an inline or crossline key with 
     * any subkeys, so this implementation returns null.
     * @return Always null
     * @see com.scoutsys.servlet.segy.content.ContentComposer#composeWith(java.lang.String, java.lang.String)
     */
    public ContentComposer composeWith(String keyName, String keyValue) throws NotFoundException {
        
        throw new NotFoundException();
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentComposer#getContent(boolean)
     */
    public Content getContent(boolean listing) {
        if (listing) {
            return new SegyTraceListingContent(fileURI, file, traceIDs);
        } else {
            return this;
        }

    }

    /**
     * Subclasses call this to load traces from the file.
     * @param firstTrace
     * @param stride
     * @param numTraces
     */
    protected void loadTraces(long firstTrace, long stride, long numTraces) throws NotFoundException {
        int useDefaultNumSamples = 0; // 0 => read num samples from file
        
        // preflight the trace bounds
        long lastTrace = firstTrace + stride * (numTraces - 1);
        if ( (firstTrace <= 0L )|| (lastTrace > determineTotalNumTraces())){
            throw new NotFoundException();
        }
        traces =
            SegyURLLoader.loadTraces(
                url,
                (int) firstTrace,
                (int) stride,
                (int)numTraces,
                useDefaultNumSamples,
                false);
    

        // traceIDs is an array of trace indexes
        traceIDs = new long[traces.length];
        for (int i = 0; i < traceIDs.length; i++) {
            traceIDs[i] = firstTrace + (long) i * (long) stride;
        }
        if (traces.length == 0){
            throw new NotFoundException();
        }
    }

    /**
     * Scan the file, examining the line number field of the trace
     * headers, to determine the number of traces per line.
     * @return
     */
    protected long determineLineLength() throws IOException{
        // scan traces until the line number changes;
        int numScanned = 0;
        int numLoaded = 0;
        int tracesPerLine = 0;

        final int numToLoad = 1000;

        SegyTrace[] traces = SegyURLLoader.loadTraces(url, 1, 1, 1, 0, false);
        if (traces.length > 0) {
            int firstLineNumber = traces[0].fieldFileNum;
            while (tracesPerLine == 0 && traces.length > 0) {
                traces =
                    SegyURLLoader.loadTraces(
                        url,
                        numLoaded + 1,
                        1,
                        numToLoad,
                        0,
                        false);
                numLoaded += traces.length;
                for (int i = 0; i < traces.length; i++) {
                    numScanned++;
                    if (traces[i].fieldFileNum != firstLineNumber) {
                        tracesPerLine = numScanned - 1;
                        break;
                    }
                }
            }
        }

        return tracesPerLine;

    }

    /**
     * @return
     */
    protected long determineTotalNumTraces() {
        long fileBytes = file.length();
        
        return (fileBytes - 3600)/(240 + 4 * lineHeader.numSamples);
    }


    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.Content#getLastModified()
     */
    public long getLastModified() {

        return file.lastModified();
    }

    /**
     * @return
     */
    public SegyLineHeader getLineHeader() {
        return lineHeader;
    }

    /**
     * @return
     */
    public String[] getReelHeader() {
        return reelHeader;
    }

    /**
     * @return
     */
    public SegyTrace[] getTraces() {
        return traces;
    }

}
