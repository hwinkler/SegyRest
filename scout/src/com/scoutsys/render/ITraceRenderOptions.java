package com.scoutsys.render;

public interface ITraceRenderOptions {
    /** Get the clip as a percentage. 200% clipping clips at two traces.
     * @return current setting*/
    public int getClipPercent();
    /**
     * No documentation for this method.
     * @return java.awt.image.IndexColorModel
     */
    java.awt.image.IndexColorModel getColorModel();
    /** Get the area fill as a percentage.
     * @return current setting*/
    public int getFillPercent();
    /** Horizontal pixels per inch. 
     * @return horizontal pixels per inch setting */
    public int getHPixelsPerInch();
    /** Get inches per second. Controls vertical resolution.
     * @return current setting
     * */
    public double getInchesPerSecond();
    /** Get spacing in milliseconds for major timing lines.
     * @return timing line spacing in milliseconds*/
    public int getMajorTimingLineIntervalMS();
    /** Get line thickness in pixels for major timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getMajorTimingLineWeight();
    /** Get spacing in milliseconds for minor timing lines.
     * @return timing line spacing in milliseconds*/
    public int getMinorTimingLineIntervalMS();
    /** Get line thickness in pixels for minor timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getMinorTimingLineWeight();
    /** Get the trace overlap as a percentage. Controls "brightness".
     * @return current setting
     * */
    public int getOverlapPercent();
    /** Get the value for scaling to, if scaling to a constant.
     * @return current setting*/
    public double getScaleMaxValue();
    /** Get the scale type.
     * @return current setting
     * @see Constants*/
    public short getScaleType();
    /** Get spacing in milliseconds for tertiary timing lines.
     * @return timing line spacing in milliseconds*/
    public int getTertiaryTimingLineIntervalMS();
    /** Line thickness in pixels for tertiary timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getTertiaryTimingLineWeight();
    /** Get traces per inch. Controls horizontal spacing.
     * @return current setting
     * */
    public double getTracesPerInch();
    /** Get vertical pixels per inch. 
     * @return vertical pixels per inch setting */
    public int getVPixelsPerInch();
    /** Return whether color density drawing is on.
     * @return current setting*/
    public boolean isDoColor();
    /** Return whether wiggle trace drawing is on.
    * @return current setting*/
    public boolean isDoWiggle();
    /** True if area fill to right.
     * @return current setting
     * */

    public boolean isFillRight();
    /** True if positive amplitudes drawn to right.
     * @return current setting
     */
    public boolean isPositiveRight();
    /** Set the clipping as a percentage. 200% clipping clips at two traces.
     * @param clipPercent new setting
     * */
    public void setClipPercent(int clipPercent);
    /**
     * No documentation for this method.
     * @param colors java.awt.image.IndexColorModel
     */
    void setColorModel(java.awt.image.IndexColorModel colors);
    /** Set whether color density drawing is on.
     * @param doColor new setting*/
    public void setDoColor(boolean doColor);
    /** Set whether wiggle trace drawing is on.
     * @param doWiggle new setting*/
    public void setDoWiggle(boolean doWiggle);
    /** Set the area fill as a percentage.
     * @param fillPercent new setting
     * */
    public void setFillPercent(int fillPercent);
    /** True if area fill to right.
     * @param new setting
     * */
    public void setFillRight(boolean fillRight);
    /** Horizontal pixels per inch.
     * This setting should normally match the device resolution.
     * @param vPixelsPerInch new vertical pixels per inch */

    public void setHPixelsPerInch(int hPixelsPerInch);
    /** Inches per second. Controls vertical resolution.
     * @param inchesPerSecond new setting
     * */
    public void setInchesPerSecond(double inchesPerSecond);
    /** Set spacing in milliseconds for major timing lines.
     * @param newVal new spacing in milliseconds */
    public void setMajorTimingLineIntervalMS(int newVal);
    /** Set line thickness in pixels for major timing lines.
     * Set to 0 to omit these lines. Default is 2.
     * @param newVal new timing line weight in pixels*/
    public void setMajorTimingLineWeight(short newVal);
    /** Set spacing in milliseconds for minor timing lines.
     * @param newVal new spacing in milliseconds */
    public void setMinorTimingLineIntervalMS(int newVal);
    /** Set line thickness in pixels for minor timing lines.
     * Set to 0 to omit these lines. Default is 1.
     * @param newVal new timing line weight in pixels*/

    public void setMinorTimingLineWeight(short newVal);
    /** Overlap as a number of traces. Controls "brightness".
     * @param overlapPercent new setting
     * */
    public void setOverlapPercent(int overlapPercent);
    /** True if positive amplitudes drawn to right.
     * @param new setting
     * */
    public void setPositiveRight(boolean positiveRight);
    /** Set the value for scaling to, if scaling to a constant.
     * @param new setting*/
    public void setScaleMaxValue(double scaleMaxValue);
    /** Set the scale type.
    * @param scaleType new setting
    * @see Constants*/
    public void setScaleType(short scaleType);
    /** Set spacing in milliseconds for tertiary timing lines.
     * @param newVal new spacing in milliseconds */
    public void setTertiaryTimingLineIntervalMS(int newVal);
    /** Line thickness in pixels for tertiary timing lines.
     * Set to 0 to omit these lines. 
     * @param newVal new timing line weight in pixels*/
    public void setTertiaryTimingLineWeight(short newVal);
    /*
    public void setTracesPerInch(double tracesPerInch);
    public double getTracesPerInch();
    public void setInchesPerSecond(double inchesPerSecond);
    public double getInchesPerSecond();
    public void setOverlapPercent(int overlapPercent);
    public int getOverlapPercent();
    public void setFillPercent(int fillPercent);
    public int getFillPercent();
    public void setClipPercent(int clipPercent);
    public int getClipPercent();
    public void setScaleType(short scaleType);
    public short getScaleType();
    public void setScaleMaxValue(double scaleMaxValue);
    public double getScaleMaxValue();
    public void setColorPalette(java.lang.String colorPalette);
    public java.lang.String getColorPalette();
    public void setPositiveRight(boolean positiveRight);
    public boolean isPositiveRight();
    public void setFillRight(boolean fillRight);
    public boolean isFillRight();
    public void setHPixelsPerInch(int hPixelsPerInch);
    public int getHPixelsPerInch();
    public void setVPixelsPerInch(int vPixelsPerInch);
    public int getVPixelsPerInch();
    public void setDoWiggle(boolean doWiggle);
    public boolean isDoWiggle();
    public void setDoColor(boolean doColor);
    public boolean isDoColor();
    
    
    public short getTertiaryTimingLineWeight ();
    public void  setTertiaryTimingLineWeight (short newVal);
    public short getMinorTimingLineWeight ();
    public void  setMinorTimingLineWeight ( short newVal);
    public short getMajorTimingLineWeight ();
    public void  setMajorTimingLineWeight ( short newVal);
    public int   getMajorTimingLineIntervalMS ();
    public void  setMajorTimingLineIntervalMS (int newVal);
    public int   getMinorTimingLineIntervalMS ();
    public void  setMinorTimingLineIntervalMS (int newVal);
    public int   getTertiaryTimingLineIntervalMS ();
    public void  setTertiaryTimingLineIntervalMS (int newVal);
    */

    /** Set traces per inch. Controls horizontal spacing.
    	 * @param tracesPerInch new setting
    	 * */
    public void setTracesPerInch(double tracesPerInch);
    /** Vertical pixels per inch.
     * This setting should normally match the device resolution.
     * @param vPixelsPerInch new vertical pixels per inch
    */
    public void setVPixelsPerInch(int vPixelsPerInch);
}