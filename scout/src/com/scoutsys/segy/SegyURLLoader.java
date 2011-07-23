package com.scoutsys.segy;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SegyURLLoader {
    /**
     * No documentation for this method.
     * @return com.scoutsys.segy.SegyLineHeader
     * @param url java.net.URL
     * @exception java.io.IOException The exception description.
     */
    public static SegyLineHeader loadLineHeader(
        URL url,
        boolean isLittleEndian)
        throws IOException {
        InputStream is = url.openStream();

        byte[] buf = new byte[3200];
        read(is, buf, 3200);

        read(is, buf, 400);
        SegyLineHeader lh = new SegyLineHeader();
        lh.load(buf, isLittleEndian);

        return lh;
    }
    /**
     * No documentation for this method.
     * @return java.lang.String[]
     * @param url java.net.URL
     * @param isLittleEndian boolean
     * @exception java.io.IOException The exception description.
     */
    public static String[] loadReelHeader(URL url, boolean isLittleEndian)
        throws IOException {
        InputStream is = url.openStream();

        byte[] buf = new byte[3200];
        read(is, buf, 3200);
        String[] strings = new String[40];
        byte[] e = new byte[80];
        for (int i = 0; i < 40; i++) {
            System.arraycopy(buf, i * 80, e, 0, 80);
            strings[i] = new String(Ebcdic.e2a(e));
        }
        return strings;

    }

    public static SegyTrace[] loadTraces(
        URL url,
        int firstTrace,
        int stride,
        int numTraces,
        int numSamples,
        boolean isLittleEndian) {
        SegyTrace[] traces = new SegyTrace[0];
        try {
            InputStream is = url.openStream();

            byte[] buf = new byte[100000];
            read(is, buf, 3200);

            read(is, buf, 400);
            SegyLineHeader lh = new SegyLineHeader();
            lh.load(buf, isLittleEndian);

            if (numSamples == 0) {
                numSamples = lh.numSamples;
                if (numSamples == 0)
                    numSamples = lh.originalNumSamples;
            }
            if (numSamples != 0) {
                traces = new SegyTrace[numTraces];
                int count = 0;
                try {
                    // Skip to first trace
                    int bytesPerTrace = numSamples * 4 + 240;
                    skip(is, (long) (firstTrace - 1) * (long) bytesPerTrace);

                    for (int i = 0; i < numTraces; i++) {
                        traces[i] = new SegyTrace();
                        read(is, buf, bytesPerTrace);
                        traces[i].fromBytes(
                            buf,
                            0,
                            bytesPerTrace,
                            isLittleEndian);

                        if (traces[i].getSampleInterval() == 0)
                            if (lh.sampleIntervalUS == 0)
                                traces[i].setSampleInterval(1000);
                            else
                                traces[i].setSampleInterval(
                                    lh.sampleIntervalUS);
                        count++;
                        skip(is, (long) (stride - 1) * (long) bytesPerTrace);
                    }
                } catch (IOException x) {
                }
                if (count != numTraces) {
                    SegyTrace[] copyTraces = new SegyTrace[count];
                    System.arraycopy(traces, 0, copyTraces, 0, count);
                    traces = copyTraces;
                }

            }
        } catch (Exception x) {
            System.err.print(x);
        }
        return traces;
    }
    private static void read(InputStream is, byte[] buf, int n)
        throws IOException {
        int ndone = 0;
        int ntodo = n;
        int nlast;
        while ((ndone += (nlast = is.read(buf, ndone, ntodo))) < n) {
            ntodo -= nlast;
        }
    }
    private static void skip(InputStream is, long n) throws IOException {
        long ndone = 0;
        long ntodo = n;
        long nlast;
        while ((ndone += (nlast = is.skip(ntodo))) < n) {
            ntodo -= nlast;
        }
    }
}