package com.scoutsys.render;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageProducer;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.awt.image.RenderedImage;

/**
 * Renders seismic samples, returning a java.awt.Image
 * @author Hugh winkler
 * @version 1.0
 */
public class TraceRenderer {

    private double m_tracesPerCm;
    private double m_cmPerSecond;
    private double m_wiggleThrowInTraces;
    private double m_hPixPerInch;
    private double m_vPixPerInch;

    private boolean m_scaleToConstant;
    private boolean m_scaleEachTrace;
    private double m_scaleValue;
    private boolean m_useColor;
    private boolean m_useWiggle;
    private short m_fillPercent;
    private boolean m_fillRight;
    private boolean m_positiveRight;

    private ColorModel m_colorModel;

    /**
     * Construct a TraceRenderer with some good defaults.
     * Defaults are:
     * <br> 18 traces per inch
     * <br> 4 inches per second
     * <br> 96 pixels per inch
     * <br> individual trace scaling
     * <br> color on
     * <br> wiggle on
     * <br> no area fill 
     */
    public TraceRenderer() {
        m_tracesPerCm = 18. / 2.54;
        m_cmPerSecond = 4. * 2.54;
        m_wiggleThrowInTraces = 1.0;
        m_hPixPerInch = 96;
        m_vPixPerInch = 96;
        m_scaleToConstant = false;
        m_scaleEachTrace = true;
        m_scaleValue = 1.0;
        m_useColor = true;
        m_useWiggle = true;
        m_fillPercent = 0;
        m_fillRight = true;
        m_colorModel = null;
    }
    /**
     * Create a new instance of an object implementing the ITraceRenderOptions interface.
     * @return a new object exposing ITraceRenderOptions, as well as ITraceRenderSize and ITransform
     * @see ITraceRenderSize
     * @see ITransform
     */
    public static ITraceRenderOptions createOptions() {
        return new TraceRenderOptions();
    }
    private void failIf(int errNum, String msg) throws RenderException {
        if (errNum != 0) {
            throw new RenderException(errNum, msg);
        }
    }
    private double msToPixels(int ms) {
        double vPixPerCM = m_vPixPerInch * Constants.INCHPERCM;
        double pixPerSecond = vPixPerCM * m_cmPerSecond;
        return Math.abs(.001 * ms * pixPerSecond);

    }
    /**
     * Render the seismic samples according to the given TraceRenderOptions.
     * The input is an array of arrays of samples.
     * @param pfArray array of sample vectors (i.e. array of traces)
     * @param sampleIntervalUS sample interval of the seismic data, in microseconds
     * @param pOptions TraceRenderOptions, may be <code>null</code>
     * @return an ImageProducer you can use to render an Image.
     * @exception RenderException the rendering options were incorrect
     * @see java.awt.ImageProducer
     * @see java.awt.image
     */
    private synchronized ImageProducer renderImageProducer(
        float pfArray[][],
        int delayMS,
        double sampleIntervalUS,
        ITraceRenderOptions pOptions)
        throws RenderException {
        int numTraces = pfArray.length;
        if (numTraces == 0)
            return new MemoryImageSource(
                0,
                0,
                new IndexColorModel(
                    8,
                    0,
                    new byte[0],
                    new byte[0],
                    new byte[0]),
                new byte[0],
                0,
                0);

        return renderSeisDib(pfArray, delayMS, sampleIntervalUS, pOptions)
            .getImageProducer();
    }

    private synchronized RenderedImage renderRenderedImage(
        float pfArray[][],
        int delayMS,
        double sampleIntervalUS,
        ITraceRenderOptions pOptions)
        throws RenderException {
        int numTraces = pfArray.length;
        if (numTraces == 0)
            return new BufferedImage(0, 0, 0);

        return renderSeisDib(pfArray, delayMS, sampleIntervalUS, pOptions)
            .getRenderedImage();
    }

    private synchronized SeisDib renderSeisDib(
        float pfArray[][],
        int delayMS,
        double sampleIntervalUS,
        ITraceRenderOptions pOptions)
        throws RenderException {

        if (pOptions == null) {
            pOptions = new TraceRenderOptions();
            pOptions.setColorModel(makeDefaultColorModel());
        }

        int numTraces = pfArray.length;
        if (numTraces == 0)
            return new SeisDib(new Dimension(0, 0), m_colorModel);

        int numSamples = pfArray[0].length;

        setOptions(pOptions);

        // Calculate the desired size of the bitmap in pixels, based on
        // traces per inch, inches per second, etc

        Dimension sizePixels =
            TraceRenderOptions.calculateSizePixels(
                numTraces,
                numSamples,
                sampleIntervalUS,
                m_tracesPerCm,
                m_cmPerSecond,
                m_wiggleThrowInTraces,
                (int) (m_hPixPerInch),
                (int) (m_vPixPerInch));

        SeisDib seisDib = new SeisDib(sizePixels, m_colorModel);
        seisDib.erase();

        short scaleType =
            (m_scaleToConstant)
                ? Constants.SCALETOVALUE
                : Constants.SCALETOMAXTRACE;
        short compareType =
            (m_scaleEachTrace)
                ? Constants.COMPAREINDIVIDUALLY
                : Constants.COMPAREALLTRACES;

        WiggleTransform wt = new WiggleTransform();
        wt.set(
            numTraces,
            m_wiggleThrowInTraces,
            1.0 / (m_hPixPerInch * Constants.INCHPERCM),
            0);
        wt.setTracesPerCm(m_tracesPerCm);

        seisDib.erase();
        if (m_useColor)
            seisDib.colorTraces(pfArray, false /* !m_positiveRight*/
            , scaleType, compareType, (float) (m_scaleValue), wt);

        if (m_useWiggle)
            seisDib.renderTraces(
                pfArray,
                !m_positiveRight,
                scaleType,
                compareType,
                (float) (m_scaleValue),
                wt,
                (m_fillRight) ? m_fillPercent : -m_fillPercent,
                null);

        seisDib.renderTimingLines(
            this.msToPixels(delayMS),
            this.msToPixels(pOptions.getMajorTimingLineIntervalMS()),
            pOptions.getMajorTimingLineWeight());
        seisDib.renderTimingLines(
            this.msToPixels(delayMS),
            this.msToPixels(pOptions.getMinorTimingLineIntervalMS()),
            pOptions.getMinorTimingLineWeight());

        return seisDib;

    }
    /**
     * @return
     */
    private IndexColorModel makeDefaultColorModel() {
        final String rainbowPalette = "/com/scoutsys/beans20/rainbow.plx";
        java.awt.image.IndexColorModel colorModel =
            (java.awt.image.IndexColorModel) com
                .scoutsys
                .render
                .TraceRenderOptions
                .loadColors(getClass().getResource(rainbowPalette));

        return colorModel;
    }
    /**
     * Render the seismic samples according to the given TraceRenderOptions.
     * Pass in a Component that will act as the drawing context for the image.
     * The input is an array of arrays of samples.
     * @param component the component that acts as the context for the image
     * @param pfArray array of sample vectors (i.e. array of traces)
     * @param delayMS delay time of first sample, milliseconds
     * @param sampleIntervalUS sample interval of the seismic data, in microseconds
     * @param pOptions TraceRenderOptions, may be <code>null</code>
     * @return an Image object you can draw using graphics.drawIamge()
     * @exception RenderException the rendering options were incorrect
     * @see java.awt.Image
     * @see java.awt.image
     */
    public synchronized Image render(
        Component component,
        float pfArray[][],
        int delayMS,
        double sampleIntervalUS,
        ITraceRenderOptions pOptions)
        throws RenderException {
        ImageProducer producer =
            renderImageProducer(pfArray, delayMS, sampleIntervalUS, pOptions);
        return component.createImage(producer);
    }

    /**
     * Render the seismic samples according to the given TraceRenderOptions.
     * Pass in a Component that will act as the drawing context for the image.
     * The input is an array of arrays of samples.
     * @param pfArray array of sample vectors (i.e. array of traces)
     * @param delayMS delay time of first sample, milliseconds
     * @param sampleIntervalUS sample interval of the seismic data, in microseconds
     * @param pOptions TraceRenderOptions, may be <code>null</code>
     * @return a RenderedImage
     * @throws RenderException  the rendering options were incorrect
     */
    public synchronized RenderedImage render(
        float pfArray[][],
        int delayMS,
        double sampleIntervalUS,
        ITraceRenderOptions pOptions)
        throws RenderException {

        RenderedImage image =
            renderRenderedImage(pfArray, delayMS, sampleIntervalUS, pOptions);

        return image;
    }
    private void setOptions(ITraceRenderOptions pOptions)
        throws RenderException {
        // Suck out the rendering options.

        if (pOptions == null)
            return;

        short maxType = Constants.MAXABSVALUE;
        short scaleType = Constants.SCALEEACHTRACE;

        m_tracesPerCm = pOptions.getTracesPerInch() * Constants.INCHPERCM;
        m_cmPerSecond = pOptions.getInchesPerSecond() / Constants.INCHPERCM;
        m_wiggleThrowInTraces = pOptions.getOverlapPercent() * .01;
        m_hPixPerInch = pOptions.getHPixelsPerInch();
        m_vPixPerInch = pOptions.getVPixelsPerInch();

        //maxType = pOptions.getS;
        scaleType = pOptions.getScaleType();

        m_scaleToConstant = (scaleType == Constants.SCALETOVALUE);
        m_scaleEachTrace = (scaleType == Constants.SCALEEACHTRACE);

        m_scaleValue = pOptions.getScaleMaxValue();
        m_useColor = pOptions.isDoColor();
        m_useWiggle = pOptions.isDoWiggle();

        m_fillPercent = (short) pOptions.getFillPercent();

        m_fillRight = pOptions.isFillRight();

        m_positiveRight = pOptions.isPositiveRight();

        // We can only accept a string file name for color palette
        // will be nice someday to accept a Picture (bitmap color table) as well

        m_colorModel = pOptions.getColorModel();

        // QC the params
        if (maxType != Constants.MAXABSVALUE) {
            failIf(-1, "Rendering options error: MaxType must be maxAbsValue");
        }

    }
}