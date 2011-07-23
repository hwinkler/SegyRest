package com.scoutsys.render;

/**
 * Shared constants used by traced rendering classes.
 * @version 1.0
 * @author Hugh Winkler
 * @see com.scoutsys.render.TraceRenderOptions
 */

public class Constants {
    /** Scale each trace individually.*/
    public static final short SCALEEACHTRACE = 0;
    /** Scale each trace relative to the largest trace.*/
    public static final short SCALETOMAXTRACE = 1;
    /** Scale each trace relative to a given value.*/
    public static final short SCALETOVALUE = 2;

    /** Use absolute value as scaling criterion.*/
    public static final short MAXABSVALUE = 0;
    /** Use RMS value as scaling criterion.*/
    public static final short MAXRMSVALUE = 1;

    /** Scale each trace individually.*/
    public static final short COMPAREINDIVIDUALLY = 0;
    /** Scale each trace relative to the largest trace.*/
    public static final short COMPAREALLTRACES = 1;

    /** Number of inches per centimeter.*/
    public static final double INCHPERCM = 1. / 2.54;
    /** Number of centimeters per inch.*/
    public static final double CMPERINCH = 2.54;

}