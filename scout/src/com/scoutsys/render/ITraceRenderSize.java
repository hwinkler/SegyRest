package com.scoutsys.render;

import java.awt.Dimension;

import com.scoutsys.util.FloatSize;

/**
 * Methods for calculating the size of a rendered trace image.
 * @author Hugh Winkler
 * @version 1.0
 */
public interface ITraceRenderSize {
    /**
     * Calculate the size in centimeters of the entire rendering.
     * Accepts the anticipated number of traces, number of samples, and sample interval.
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @return size in centimeters
     */
    FloatSize calculateSizeCM(
        int numTraces,
        int numSamples,
        double sampleIntervalUS);
    /**
     * Calculate the size in pixels of the entire rendering.
     * Accepts the anticipated number of traces, number of samples, and sample interval.
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @return size in pixels
     */
    Dimension calculateSizePixels(
        int numTraces,
        int numSamples,
        double sampleIntervalUS);
}