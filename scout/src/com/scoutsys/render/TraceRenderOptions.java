package com.scoutsys.render;

import java.awt.Dimension;
import java.awt.image.IndexColorModel;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.net.URL;

import com.scoutsys.util.FloatSize;

/**
 * Trace rendering options class.
 */
public class TraceRenderOptions implements /*Serializable, */
ITraceRenderOptions, ITransform, ITraceRenderSize, Cloneable {

    private boolean m_bRequiresSave = false;
    /** Traces per inch. Controls horizontal spacing.*/
    public double m_tracesPerInch = 18.;
    /** Inches per second. Controls vertical resolution.*/
    public double m_inchesPerSecond = 4.;
    /** Overlap as a number of traces. Controls "brightness".*/
    public double m_throw = 1.;
    /** Clip as number of traces.*/
    public double m_clip = 1.;
    /** Scale type.
     * @see Constants*/
    public short m_scaleType = Constants.SCALEEACHTRACE;
    /** Value for scaling to, if scaling to a constant.*/
    public double m_scaleMaxValue = 1.;
    /** True if positive amplitudes drawn to right.*/
    public boolean m_positiveRight = true;
    /** Area fill percentage.*/
    public short m_fillPercent = 0;
    /** True if area fill to right.*/
    public boolean m_fillRight = true;
    /** Measure to use for maximum.
     * @see Constants*/
    public short m_maxType = Constants.MAXABSVALUE;
    /** Position traces by value of this member.*/
    public String m_positionField = "";
    /** Horizontal pixels per inch.*/
    public double m_hPixPerInch = 96.;
    /** Vertical pixels per inch.*/
    public double m_vPixPerInch = 96.;
    /** True if wiggle trace drawing is on.*/
    public boolean m_doWiggle = true;
    /** True if color density drawing is on.*/
    public boolean m_doColor = true;

    /** Line thickness in pixels for major timing lines.
     * Set to 0 to omit these lines. Default is 2.*/
    public short m_majorTimingLineWeight = 2;
    /** Line thickness in pixels for minor timing lines.
     * Set to 0 to omit these lines. Default is 1.*/
    public short m_minorTimingLineWeight = 1;
    /** Line thickness in pixels for tertiary timing lines.
     * Set to 0 to omit these lines. Default is 0.*/
    public short m_tertiaryTimingLineWeight = 0;

    /** Spacing in milliseconds for major timing lines.*/
    public int m_majorTimingLineIntervalMS = 1000;
    /** Spacing in milliseconds for minor timing lines.*/
    public int m_minorTimingLineIntervalMS = 100;
    /** Spacing in milliseconds for tertiary timing lines.*/
    public int m_tertiaryTimingLineIntervalMS = 0;

    private IndexColorModel fieldColorModel = buildGrayscaleColorModel();
    protected transient java.beans.PropertyChangeSupport propertyChange;
    //private IndexColorModel fieldColors =buildGrayscaleColorModel();
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    private static IndexColorModel buildGrayscaleColorModel() {
        int numColors = 40;
        byte r[] = new byte[numColors + 2];
        byte g[] = new byte[numColors + 2];
        byte b[] = new byte[numColors + 2];

        double scale = 255.0 / (numColors - 1);
        for (int i = 0; i < numColors; i++) {
            byte c = (byte) Math.round(i * scale);
            r[i + 2] = g[i + 2] = b[i + 2] = c;
        }
        r[0] = g[0] = b[0] = 0; // black
        r[1] = g[1] = b[1] = (byte) 0xff; // white

        return new IndexColorModel(8, numColors + 2, r, g, b);

    }
    /**
     * Calculate the size in centimeters of the entire rendering.
     * Accepts the anticipated number of traces, number of samples, and sample interval.
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @return size in centimeters
     */
    public FloatSize calculateSizeCM(
        int numTraces,
        int numSamples,
        double sampleIntervalUS) {

        return calculateSizeCM(
            numTraces,
            numSamples,
            sampleIntervalUS,
            1.0 / (m_hPixPerInch * Constants.INCHPERCM),
            m_tracesPerInch / Constants.CMPERINCH,
            m_inchesPerSecond * Constants.CMPERINCH,
            m_throw);

    }
    /**
     * Calculate the size in centimeters of the entire rendering.
     * Accepts the anticipated drawing parameters and data parameters
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @param cmPerPixel number of centimeters per pixel
     * @param tracesPerCm traces per centimeter
     * @param cmPerSecond centimeters per second
     * @param wiggleThrowInTraces overlap as a number of traces
     * @return size in centimeters
     */
    public static FloatSize calculateSizeCM(
        int numTraces,
        int numSamples,
        double sampleIntervalUS,
        double cmPerPixel,
        double tracesPerCm,
        double cmPerSecond,
        double wiggleThrowInTraces) {

        if (tracesPerCm <= 0.)
            tracesPerCm = 1.0;

        WiggleTransform wt = new WiggleTransform();
        wt.set(numTraces, wiggleThrowInTraces, cmPerPixel, 0);
        wt.setTracesPerCm(tracesPerCm);

        float heightCm =
            (float) (numSamples * sampleIntervalUS * 1.0E-6 * cmPerSecond);

        // no field to position by, position by index
        // (3/3/98 hvw -- is the long cast a mistake???)
        // (4/23/98 hvw -- on second look, looks like I'm just rounding up for safety margin)
        // (9/10/98 hvw -- third look. Is ceil() what we want?

        float widthCm =
            (float) Math.ceil(wt.getTotalWidthPixels() * cmPerPixel);
        return new FloatSize(widthCm, heightCm);

    }
    /**
     * Calculate the size in pixels of the entire rendering.
     * Accepts the anticipated number of traces, number of samples, and sample interval.
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @return size in pixels
     */
    public Dimension calculateSizePixels(
        int numTraces,
        int numSamples,
        double sampleIntervalUS) {
        return calculateSizePixels(
            numTraces,
            numSamples,
            sampleIntervalUS,
            m_tracesPerInch / Constants.CMPERINCH,
            m_inchesPerSecond * Constants.CMPERINCH,
            m_throw,
            (int) m_hPixPerInch,
            (int) m_vPixPerInch);
    }
    /**
     * Calculate the size in pixels of the entire rendering.
     * Accepts the anticipated drawing parameters and data parameters
     * @param numTraces number of traces in rendering
     * @param numSamples number of samples in rendering
     * @param sampleIntervalUS sample interval in microseconds
     * @param cmPerPixel number of centimeters per pixel
     * @param tracesPerCm traces per centimeter
     * @param cmPerSecond centimeters per second
     * @param wiggleThrowInTraces overlap as a number of traces
     * @return size in pixels
     */
    public static Dimension calculateSizePixels(
        int numTraces,
        int numSamples,
        double sampleIntervalUS,
        double tracesPerCM,
        double cmPerSecond,
        double wiggleThrowInTraces,
        int hPixPerInch,
        int vPixPerInch) {

        FloatSize fs =
            calculateSizeCM(
                numTraces,
                numSamples,
                sampleIntervalUS,
                1.0 / (hPixPerInch * Constants.INCHPERCM),
                tracesPerCM,
                cmPerSecond,
                wiggleThrowInTraces);

        return new Dimension(
            (int) (fs.m_cx * Constants.INCHPERCM * hPixPerInch),
            (int) (fs.m_cy * Constants.INCHPERCM * vPixPerInch));

    }
    private int changeProperty(String name, int oldVal, int newVal) {
        if (oldVal != newVal) {
            firePropertyChange(name, new Integer(oldVal), new Integer(newVal));
        }
        return newVal;
    }
    private short changeProperty(String name, short oldVal, short newVal) {
        if (oldVal != newVal) {
            firePropertyChange(name, new Short(oldVal), new Short(newVal));
        }
        return newVal;
    }
    private boolean changeProperty(
        String name,
        boolean oldVal,
        boolean newVal) {
        if (oldVal != newVal) {
            firePropertyChange(name, new Boolean(oldVal), new Boolean(newVal));
        }
        return newVal;
    }
    /**
     * This method was created in VisualAge.
     * @return java.lang.Object
     */
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception x) {
            return null;
        }
    }
    /**
     * The firePropertyChange method was generated to support the propertyChange field.
     */
    public void firePropertyChange(
        String propertyName,
        Object oldValue,
        Object newValue) {
        getPropertyChange().firePropertyChange(
            propertyName,
            oldValue,
            newValue);
    }
    /** Get the clip as a percentage. 200% clipping clips at two traces.
     * @return current setting*/
    public int getClipPercent() {
        return (int) (this.m_clip * 100.);
    }
    /**
     * Gets the colorModel property (java.awt.image.IndexColorModel) value.
     * @return The colorModel property value.
     * @see #setColorModel
     */
    public IndexColorModel getColorModel() {
        return fieldColorModel;
    }
    /** Get the area fill as a percentage.
     * @return current setting*/
    public int getFillPercent() {
        return this.m_fillPercent;
    }
    /** Horizontal pixels per inch. 
     * @return horizontal pixels per inch setting */
    public int getHPixelsPerInch() {
        return (int) this.m_hPixPerInch;
    }
    /** Get inches per second. Controls vertical resolution.
     * @return current setting
     * */
    public double getInchesPerSecond() {
        return this.m_inchesPerSecond;
    }
    /** Get spacing in milliseconds for major timing lines.
     * @return timing line spacing in milliseconds*/
    public int getMajorTimingLineIntervalMS() {
        return m_majorTimingLineIntervalMS;
    }
    /** Get line thickness in pixels for major timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getMajorTimingLineWeight() {
        return m_majorTimingLineWeight;
    }
    /** Get spacing in milliseconds for minor timing lines.
     * @return timing line spacing in milliseconds*/
    public int getMinorTimingLineIntervalMS() {
        return m_minorTimingLineIntervalMS;
    }
    /** Get line thickness in pixels for minor timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getMinorTimingLineWeight() {
        return m_minorTimingLineWeight;
    }
    /** Get the trace overlap as a percentage. Controls "brightness".
     * @return current setting
     * */
    public int getOverlapPercent() {
        return (int) (this.m_throw * 100);
    }
    /**
     * Accessor for the propertyChange field.
     */
    protected java.beans.PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    /** Get the value for scaling to, if scaling to a constant.
     * @return current setting*/
    public double getScaleMaxValue() {
        return this.m_scaleMaxValue;
    }
    /** Get the scale type.
     * @return current setting
     * @see Constants*/
    public short getScaleType() {
        return this.m_scaleType;
    }
    /** Get spacing in milliseconds for tertiary timing lines.
     * @return timing line spacing in milliseconds*/
    public int getTertiaryTimingLineIntervalMS() {
        return m_tertiaryTimingLineIntervalMS;
    }
    /** Line thickness in pixels for tertiary timing lines.
     * Set to 0 to omit these lines. 
     * @return timing line weight in pixels*/
    public short getTertiaryTimingLineWeight() {
        return m_tertiaryTimingLineWeight;
    }
    /** Get traces per inch. Controls horizontal spacing.
     * @return current setting
     * */
    public double getTracesPerInch() {
        return this.m_tracesPerInch;
    }
    /** Get vertical pixels per inch. 
     * @return vertical pixels per inch setting */
    public int getVPixelsPerInch() {
        return (int) this.m_vPixPerInch;
    }
    /** Return whether color density drawing is on.
     * @return current setting*/
    public boolean isDoColor() {
        return this.m_doColor;
    }
    /** Return whether wiggle trace drawing is on.
     * @return current setting*/
    public boolean isDoWiggle() {
        return this.m_doWiggle;
    }
    /** True if area fill to right.
     * @return current setting
     * */

    public boolean isFillRight() {
        return this.m_fillRight;
    }
    /** True if positive amplitudes drawn to right.
     * @return current setting
     */
    public boolean isPositiveRight() {
        return this.m_positiveRight;
    }
    /**
     * No documentation for this method.
     * @return java.awt.image.ColorModel
     * @param url java.net.URL
     */
    public static java.awt.image.IndexColorModel loadColors(java.net.URL url) {
        IndexColorModel mdl = null;
        try {
            InputStream is = url.openStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            StreamTokenizer tzr = new StreamTokenizer(in);

            tzr.parseNumbers();

            tzr.nextToken();
            int numColors = 2 + (int) tzr.nval;
            byte r[] = new byte[numColors];
            byte g[] = new byte[numColors];
            byte b[] = new byte[numColors];
            for (int i = 2; i < numColors; i++) {
                tzr.nextToken();
                r[i] = (byte) tzr.nval;
                tzr.nextToken();
                g[i] = (byte) tzr.nval;
                tzr.nextToken();
                b[i] = (byte) tzr.nval;
            }
            r[0] = g[0] = b[0] = 0; // black
            r[1] = g[1] = b[1] = (byte) 0xff; // white
            mdl = new IndexColorModel(8, numColors, r, g, b);
        } catch (Exception x) {

            System.err.println(
                "Error loading colors url="
                    + url
                    + " Exception= "
                    + x.getMessage());
            mdl = buildGrayscaleColorModel();
        }
        return mdl;
    }
    /**
     * Return the ColorModel corresponding to the color palette String member.
     * @return the ColorModel object
     */
    public static IndexColorModel loadColors(
        URL context,
        String colorPalette) {
        if (colorPalette == null || colorPalette == "")
            return buildGrayscaleColorModel();

        IndexColorModel mdl = null;
        try {
            URL url = new URL(context, colorPalette);
            mdl = loadColors(url);
        } catch (Exception x) {
            mdl = buildGrayscaleColorModel();
        }
        return mdl;
    }
    /**
     * Convert a vertical pixel location to time in milliseconds.
     * @param vPixel the vertical pixel number, 0 at top
     * @return the time in milliseconds of that location
     */
    public float pixelToTimeMS(int vPixel) {

        if (m_inchesPerSecond <= 0. || m_vPixPerInch <= 0.)
            throw new IllegalStateException();

        double cmPerPixel = Constants.CMPERINCH / m_vPixPerInch;
        double msPerCm = 1000.0 / (m_inchesPerSecond * Constants.CMPERINCH);
        double msPerPixel = msPerCm * cmPerPixel;
        return (float) (vPixel * msPerPixel);
    }
    /**
     * Convert a horizontal pixel location to trace number.
     * @param hPixel the horizontal pixel number, 0 at left
     * @return the trace number (has a nonzero fractional part between traces)
     */
    public float pixelToTrace(int hPixel) {
        // Create a CWiggleTransform and ask it to make the calculation

        if (m_tracesPerInch <= 0. || m_hPixPerInch <= 0.)
            throw new IllegalStateException();

        double cmPerPixel = Constants.CMPERINCH / m_hPixPerInch;
        double tracesPerCm = m_tracesPerInch / Constants.CMPERINCH;

        WiggleTransform wt = new WiggleTransform();
        wt.set(100000, m_throw, cmPerPixel, 0);
        // any value for numTraces will do e.g. 100000
        wt.setTracesPerCm(tracesPerCm);
        return (float) wt.pixelToTrace(hPixel);

    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /** Set the clipping as a percentage. 200% clipping clips at two traces.
     * @param clipPercent new setting
     * */
    public void setClipPercent(int clipPercent) {
        if (this.m_clip * 100 != clipPercent) {
            Integer oldValue = new Integer((int) (this.m_clip * 100));
            Integer newValue = new Integer(clipPercent);
            this.m_clip = clipPercent / 100.;
            firePropertyChange("clipTraces", oldValue, newValue);
        }
    }
    /**
     * Sets the colorModel property (java.awt.image.IndexColorModel) value.
     * @param colorModel The new value for the property.
     * @see #getColorModel
     */
    public void setColorModel(IndexColorModel colorModel) {
        IndexColorModel oldValue = fieldColorModel;
        fieldColorModel = colorModel;
        firePropertyChange("colorModel", oldValue, colorModel);
    }
    /** Set whether color density drawing is on.
     * @param doColor new setting*/
    public void setDoColor(boolean doColor) {
        if (this.m_doColor != doColor) {
            Boolean oldValue = new Boolean(this.m_doColor);
            Boolean newValue = new Boolean(doColor);
            this.m_doColor = doColor;
            firePropertyChange("doColor", oldValue, newValue);
        }
    }
    /** Set whether wiggle trace drawing is on.
     * @param doWiggle new setting*/
    public void setDoWiggle(boolean doWiggle) {
        if (this.m_doWiggle != doWiggle) {
            Boolean oldValue = new Boolean(this.m_doWiggle);
            Boolean newValue = new Boolean(doWiggle);
            this.m_doWiggle = doWiggle;
            firePropertyChange("doWiggle", oldValue, newValue);
        }
    }
    /** Set the area fill as a percentage.
     * @param fillPercent new setting
     * */
    public void setFillPercent(int fillPercent) {
        if (this.m_fillPercent != fillPercent) {
            Integer oldValue = new Integer(this.m_fillPercent);
            Integer newValue = new Integer(fillPercent);
            this.m_fillPercent = (short) fillPercent;
            firePropertyChange("fillPercent", oldValue, newValue);
        }
    }
    /** True if area fill to right.
     * @param new setting
     * */
    public void setFillRight(boolean fillRight) {
        if (this.m_fillRight != fillRight) {
            Boolean oldValue = new Boolean(this.m_fillRight);
            Boolean newValue = new Boolean(fillRight);
            this.m_fillRight = fillRight;
            firePropertyChange("fillRight", oldValue, newValue);
        }
    }
    /** Horizontal pixels per inch.
     * This setting should normally match the device resolution.
     * @param vPixelsPerInch new vertical pixels per inch */

    public void setHPixelsPerInch(int hPixelsPerInch) {
        if (this.m_hPixPerInch != hPixelsPerInch) {
            Integer oldValue = new Integer((int) this.m_hPixPerInch);
            Integer newValue = new Integer(hPixelsPerInch);
            this.m_hPixPerInch = hPixelsPerInch;
            firePropertyChange("hPixelsPerInch", oldValue, newValue);
        }
    }
    /** Inches per second. Controls vertical resolution.
     * @param inchesPerSecond new setting
     * */
    public void setInchesPerSecond(double inchesPerSecond) {

        if (this.m_inchesPerSecond != inchesPerSecond) {
            Double oldValue = new Double(this.m_inchesPerSecond);
            Double newValue = new Double(inchesPerSecond);
            this.m_inchesPerSecond = inchesPerSecond;
            firePropertyChange("inchesPerSecond", oldValue, newValue);
        }
    }
    /** Set spacing in milliseconds for major timing lines.
     * @param newVal new spacing in milliseconds */
    public void setMajorTimingLineIntervalMS(int newVal) {
        m_majorTimingLineIntervalMS =
            changeProperty(
                "majorTimingLineIntervalMS",
                m_majorTimingLineIntervalMS,
                newVal);
    }
    /** Set line thickness in pixels for major timing lines.
     * Set to 0 to omit these lines. Default is 2.
     * @param newVal new timing line weight in pixels*/
    public void setMajorTimingLineWeight(short newVal) {
        m_majorTimingLineWeight =
            changeProperty(
                "majorTimingLineWeight",
                m_majorTimingLineWeight,
                newVal);
    }
    /** Set spacing in milliseconds for minor timing lines.
     * @param newVal new spacing in milliseconds */
    public void setMinorTimingLineIntervalMS(int newVal) {
        m_minorTimingLineIntervalMS =
            changeProperty(
                "minorTimingLineIntervalMS",
                m_minorTimingLineIntervalMS,
                newVal);
    }
    /** Set line thickness in pixels for minor timing lines.
     * Set to 0 to omit these lines. Default is 1.
     * @param newVal new timing line weight in pixels*/

    public void setMinorTimingLineWeight(short newVal) {
        m_minorTimingLineWeight =
            changeProperty(
                "minorTimingLineWeight",
                m_minorTimingLineWeight,
                newVal);
    }
    /** Overlap as a number of traces. Controls "brightness".
     * @param overlapPercent new setting
     * */
    public void setOverlapPercent(int overlapPercent) {
        if (this.m_throw * 100 != overlapPercent) {
            Integer oldValue = new Integer((int) (this.m_throw * 100));
            Integer newValue = new Integer(overlapPercent);
            this.m_throw = overlapPercent / 100.0;
            firePropertyChange("overlapPercent", oldValue, newValue);
        }
    }
    /** True if positive amplitudes drawn to right.
     * @param new setting
     * */
    public void setPositiveRight(boolean positiveRight) {
        if (this.m_positiveRight != positiveRight) {
            Boolean oldValue = new Boolean(this.m_positiveRight);
            Boolean newValue = new Boolean(positiveRight);
            this.m_positiveRight = positiveRight;
            firePropertyChange("positiveRight", oldValue, newValue);
        }
    }
    /** Set the value for scaling to, if scaling to a constant.
     * @param new setting*/
    public void setScaleMaxValue(double scaleMaxValue) {
        if (this.m_scaleMaxValue != scaleMaxValue) {
            Double oldValue = new Double(this.m_scaleMaxValue);
            Double newValue = new Double(scaleMaxValue);
            this.m_scaleMaxValue = scaleMaxValue;
            firePropertyChange("scaleMaxValue", oldValue, newValue);
        }
    }
    /** Set the scale type.
     * @param scaleType new setting
     * @see Constants*/
    public void setScaleType(short scaleType) {
        if (this.m_scaleType != scaleType) {
            Integer oldValue = new Integer(this.m_scaleType);
            Integer newValue = new Integer(scaleType);
            this.m_scaleType = scaleType;
            firePropertyChange("scaleType", oldValue, newValue);
        }
    }
    /** Set spacing in milliseconds for tertiary timing lines.
     * @param newVal new spacing in milliseconds */
    public void setTertiaryTimingLineIntervalMS(int newVal) {
        m_tertiaryTimingLineIntervalMS =
            changeProperty(
                "tertiaryTimingLineIntervalMS",
                m_tertiaryTimingLineIntervalMS,
                newVal);
    }
    /** Line thickness in pixels for tertiary timing lines.
     * Set to 0 to omit these lines. 
     * @param newVal new timing line weight in pixels*/
    public void setTertiaryTimingLineWeight(short newVal) {

        m_tertiaryTimingLineWeight =
            changeProperty(
                "tertiaryTimingLineWeight",
                m_tertiaryTimingLineWeight,
                newVal);
    }
    /** Set traces per inch. Controls horizontal spacing.
    	 * @param tracesPerInch new setting
    	 * */
    public void setTracesPerInch(double tracesPerInch) {
        if (this.m_tracesPerInch != tracesPerInch) {
            Double oldValue = new Double(this.m_tracesPerInch);
            Double newValue = new Double(tracesPerInch);
            this.m_tracesPerInch = tracesPerInch;
            firePropertyChange("tracesPerInch", oldValue, newValue);
        }
    }
    /** Vertical pixels per inch.
     * This setting should normally match the device resolution.
     * @param vPixelsPerInch new vertical pixels per inch
    */
    public void setVPixelsPerInch(int vPixelsPerInch) {
        if (this.m_vPixPerInch != vPixelsPerInch) {
            Integer oldValue = new Integer((int) this.m_vPixPerInch);
            Integer newValue = new Integer(vPixelsPerInch);
            this.m_vPixPerInch = vPixelsPerInch;
            firePropertyChange("vPixelsPerInch", oldValue, newValue);
        }
    }
    /**
     * Convert a time in milliseconds to a vertical pixel location.
     * @param fTimeMS time in milliseconds
     * @return the vertical pixel location for that time
     */

    public int timeMSToPixel(float fTimeMS) {

        if (m_inchesPerSecond <= 0. || m_vPixPerInch <= 0.)
            throw new IllegalStateException();

        double pixelPerCM = m_vPixPerInch / Constants.CMPERINCH;
        double cmPerMS = m_inchesPerSecond * Constants.CMPERINCH * .001;
        double pixelPerMS = pixelPerCM * cmPerMS;

        return (int) (fTimeMS * pixelPerMS);

    }
    /**
     * This method was created in VisualAge.
     * @return java.lang.String
     */
    public String toString() {
        return "["
            + " m_bRequiresSave="
            + m_bRequiresSave
            + ", m_tracesPerInch="
            + m_tracesPerInch
            + ", m_inchesPerSecond="
            + m_inchesPerSecond
            + ", m_throw="
            + m_throw
            + ", m_clip="
            + m_clip
            + ", m_scaleType="
            + m_scaleType
            + ", m_positiveRight="
            + m_positiveRight
            + ", m_fillPercent="
            + m_fillPercent
            + ", m_fillRight="
            + m_fillRight
            + ", m_maxType ="
            + m_maxType
            + ", m_positionField ="
            + m_positionField
            + ", m_hPixPerInch="
            + m_hPixPerInch
            + ", m_vPixPerInch="
            + m_vPixPerInch
            + ", m_doWiggle="
            + m_doWiggle
            + ", m_doColor="
            + m_doColor
            + ", m_majorTimingLineWeight="
            + m_majorTimingLineWeight
            + ", m_minorTimingLineWeight="
            + m_minorTimingLineWeight
            + ", m_tertiaryTimingLineWeight="
            + m_tertiaryTimingLineWeight
            + ", m_majorTimingLineIntervalMS="
            + m_majorTimingLineIntervalMS
            + ", m_minorTimingLineIntervalMS="
            + m_minorTimingLineIntervalMS
            + ", m_tertiaryTimingLineIntervalMS="
            + m_tertiaryTimingLineIntervalMS
            + ", fieldColorModel="
            + fieldColorModel
            + ", propertyChange="
            + propertyChange
            + "]";
    }
    /**
     * Convert a trace number to a horizontal pixel location.
     * @param fTrace the trace number (may have a fractional part between traces).
     * @return the horizontal pixel location for that trace
     */
    public int traceToPixel(float fTrace) {
        // Create a CWiggleTransform and ask it to make the calculation

        if (m_tracesPerInch <= 0. || m_hPixPerInch <= 0.)
            throw new IllegalStateException();

        double cmPerPixel = Constants.CMPERINCH / m_hPixPerInch;
        double tracesPerCm = m_tracesPerInch / Constants.CMPERINCH;

        WiggleTransform wt = new WiggleTransform();
        wt.set(100000, m_throw, cmPerPixel, 0);
        // any value for numTraces will do e.g. 100000
        wt.setTracesPerCm(tracesPerCm);
        return (int) wt.traceToPixel(fTrace);

    }
}