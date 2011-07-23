package com.scoutsys.render;

/**
 * Methods for transforming between trace-time space, and x-y pixel space.
 *
 */
public interface ITransform {

    /**
     * Convert a vertical pixel location to time in milliseconds.
     * @param vPixel the vertical pixel number, 0 at top
     * @return the time in milliseconds of that location
     */
    public float pixelToTimeMS(int vPixel);
    /**
     * Convert a horizontal pixel location to trace number.
     * @param hPixel the horizontal pixel number, 0 at left
     * @return the trace number (has a nonzero fractional part between traces)
     */
    public float pixelToTrace(int hPixel);
    /**
     * Convert a time in milliseconds to a vertical pixel location.
     * @param fTimeMS time in milliseconds
     * @return the vertical pixel location for that time
     */

    public int timeMSToPixel(float fTimeMS);
    /**
     * Convert a trace number to a horizontal pixel location.
     * @param fTrace the trace number (may have a fractional part between traces).
     * @return the horizontal pixel location for that trace
     */
    public int traceToPixel(float fTrace);
}