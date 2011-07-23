package com.scoutsys.trace;

/**
 * Methods common to all seismic traces.
 * @version 1.0
 * @author Hugh Winkler
 */

public interface ITrace {
    Object clone();
    /**
     * This method was created in VisualAge.
     * @return int
     */
    int getDelayMS();
    /**
     * Return the sample interval, in microseconds.
     * @return the sample interval in microseconds
     */
    double getSampleInterval();
    /**
     * Return the samples as an array of <code>float</code>.
     * @return the array of samples 
     */
    float[] getSamples();
    /**
     * This method was created in VisualAge.
     * @param delayMS int
     */
    void setDelayMS(int delayMS);
    /**
     * Set the sample interval, in microseconds.
     * @param sampleInterval the new sample interval in microseconds
     */
    void setSampleInterval(double si);
    /**
     * Set the samples to the given array of <code>float</code>. 
     * @param samples new array of samples
     */
    void setSamples(float[] samples);
}