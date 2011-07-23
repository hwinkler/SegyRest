package com.scoutsys.segy;

/**
 * An IEEE floating point number, parsed into mantisssa (significand), exponent, and sign.
 * @author Hugh Winkler
 * @version 1.0
 */
class IEEEFloat {
    int mantissa; //23
    short exponent; // 8
    short sign; // 1

    public IEEEFloat() {

    }
    public IEEEFloat(float f) {
        fromFloat(f);
    }
    /**
     * Initialize from a <code>float</code>.
     * @param f the floating point number to parse.
     */
    protected void fromFloat(float f) {
        int bits = Float.floatToIntBits(f);
        sign = (short) Math.abs(((bits & 0x80000000) >> 31));
        exponent = (short) ((bits & 0x7F800000) >> 23);
        mantissa = (int) ((bits & 0x007FFFFF));
    }
    /**
     * Convert to a <code>float</code>.
     * @return the floating point number.
     */
    protected float toFloat() {
        return Float.intBitsToFloat(
            (((int) sign << 31))
                | (((int) exponent << 23))
                | (((int) mantissa)));

    }
}