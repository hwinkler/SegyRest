package com.scoutsys.render;

class WiggleTransform {
    private double m_totalWidthPixels;
    private double m_traceOffsetPixels;

    private double m_traceThrowTraces;
    private double m_tracesPerCm;
    private double m_cmPerPixel;
    private int m_numTraces;
    private int m_scrollPos;

    protected WiggleTransform() {
        m_totalWidthPixels = 1000.;
        m_traceOffsetPixels = 50.;
        m_traceThrowTraces = 1.;
        m_tracesPerCm = 18. / 2.54;
        m_cmPerPixel = 1. / 96 * 2.54;
        m_numTraces = 120;
        m_scrollPos = 0;
    }
    protected double getTotalWidthPixels() {
        return m_totalWidthPixels;
    }
    protected double getTraceOffsetPixels() {
        return m_traceOffsetPixels;
    }
    protected double getTracesPerPixel() {
        return m_tracesPerCm * m_cmPerPixel;
    }
    protected double getTraceThrowPixels() {
        double tracesPerPixel = getTracesPerPixel();
        if (tracesPerPixel == 0.) {
            return 0.;
        }
        return m_traceThrowTraces / tracesPerPixel;
    }
    protected double leftBoundTraces() {
        return pixelToTrace(0.);
    }
    double pixelToTrace(double pix) {

        //                  Left Edge       Traces              Right Edge
        // ----------------------------------------------------------------
        //  [Trace space]   1-throw         1   2 ...  n           n+throw
        //
        //  [Pixel space]   0                                        width
        //

        double r = m_traceThrowTraces;

        if (m_totalWidthPixels == 0.)
            return 0.0;

        return (2. * r + m_numTraces - 1) / m_totalWidthPixels * pix
            + 1.
            - r
            + m_scrollPos * getTracesPerPixel();

    }
    protected double rightBoundTraces() {
        return pixelToTrace(m_totalWidthPixels);
    }
    protected void set(
        int numTraces,
        double traceThrowTraces,
        double cmPerPixel,
        int scrollPos) {
        m_numTraces = numTraces;
        m_traceThrowTraces = traceThrowTraces;
        m_cmPerPixel = cmPerPixel;
        m_scrollPos = scrollPos;
    }
    double setBestTracesPerCm(double tryTracesPerCm) {
        // use m_cmPerPixel	to determine a tracesPerCm yielding an integral
        // number of pixels per trace

        double tryTracesPerPixel = tryTracesPerCm * m_cmPerPixel;
        int truncPixelsPerTrace = (int) (1.0 / tryTracesPerPixel);
        if (truncPixelsPerTrace < 2)
            truncPixelsPerTrace = 2;

        m_traceOffsetPixels = truncPixelsPerTrace;

        return 1.0 / (truncPixelsPerTrace * m_cmPerPixel);

    }
    protected void setTracesPerCm(double tracesPerCm) {
        m_tracesPerCm = setBestTracesPerCm(tracesPerCm);

        // Calculate the new total width
        m_totalWidthPixels =
            (m_numTraces - 1) * m_traceOffsetPixels
                + 2.0 * getTraceThrowPixels();

    }
    double traceToPixel(double m) {
        double r = m_traceThrowTraces;
        double denom = 2. * r + m_numTraces - 1.;

        if (denom == 0.)
            return 0;

        m -= m_scrollPos * getTracesPerPixel();

        return (m - 1. + r) * m_totalWidthPixels / denom;
    }
}