package com.scoutsys.segy;

/**
 * An IBM floating point number, parsed into mantisssa, exponent, and sign.
 * @author Hugh Winkler
 * @version 1.0
 */
class IBMFloat {
    protected int mantissa; //24
    protected short exponent; // 7
    protected short sign; // 1

    public IBMFloat() {
        fromFloat(0.f);
    }
    public IBMFloat(float f) {
        fromFloat(f);
    }

    /**
     * Load from a byte array
     * @param b array of bytes in big-endian order.
     * @param starting offset offset into the array b.
     */
    protected void fromBytes(byte b[], int offset) {
        sign = (short) (((b[0 + offset] & 0x80) == 0) ? 0 : 1);
        exponent = (short) (b[0 + offset] & 0x7f);
        mantissa =
            (unsignedb(b[1 + offset]) << 16)
                | (unsignedb(b[2 + offset]) << 8)
                | (unsignedb(b[3 + offset]));
    }
    /**
     * Convert to a 4 byte array
     * @return the 4 byte array
     */
    protected void toBytes(byte b[], int offset) {
        b[0 + offset] = (byte) (((sign == 0) ? 0 : 0x80) | (exponent & 0x7f));
        b[1 + offset] = (byte) ((mantissa & 0x00ff0000) >> 16);
        b[2 + offset] = (byte) ((mantissa & 0x0000ff00) >> 8);
        b[3 + offset] = (byte) ((mantissa & 0x000000ff) >> 0);
    }

    /**
     * 
     * Load from a float and prepare for conversion to IBM format.
     * @param f the floating point number.
     */
    protected void fromFloat(float f) {
        IEEEFloat ieee = new IEEEFloat(f);

        int signedExponent = ieee.exponent;
        long mantissa = unsigned(ieee.mantissa);

        // normalized input

        if (signedExponent > 0 && signedExponent < 255) {
            signedExponent += 130;
            mantissa = ieee.mantissa | 0x00800000;

            // we need to divide the signedExponent by 4. We may not be able to
            // do so evenly, so we have to shift the mantissa right and add 1
            // to signedExponent until we can divide signedExponent evenly by 4.

            while ((signedExponent & 0x00000003) != 0) {
                signedExponent++;
                mantissa >>= 1;
            }
        }

        // denormalized or zero input
        else if (signedExponent == 0) {
            if (mantissa != 0) {

                //  signedExponent	= 131; -- but we'll do the shift.
                // try to preserve significant bits if possible

                if ((mantissa & 0x00e00000) != 0) {
                    // shift right if shifting left 3 bits would shift off msb's
                    signedExponent = 132;
                    mantissa >>= 1;
                } else { // ..but shift left if possible to avoid shifting off lsb's
                    signedExponent = 128;
                    mantissa <<= 3;
                }
            } else {
                mantissa = signedExponent = 0;
            }
        }

        // inf or nan input
        else {
            mantissa = 0x00ffffff;
            signedExponent = 0x7f << 2;
            // shift because we're going to unshift below
        }

        this.sign = ieee.sign;
        this.exponent = (short) (signedExponent >> 2);
        // here's the divide by 4
        this.mantissa = (int) mantissa;

    }
    /**
     * Return a float after converting from IBM format.
     * @return the converted float.
     */
    protected float toFloat() {
        IEEEFloat ieee = new IEEEFloat();
        long ieeeMantissa = unsigned(mantissa);

        // ibm.mantissa  * 2^-24 * 16^(ibm.exponent - 64)
        // ieee.mantissa * 2^-23 * 2^(ieee.exponent - 127)
        // set ibm.mantissa = ieee.mantissa, solve for ieee.exponent:

        long ieeeExponent = (exponent << 2) - 130;
        // as a power of 2 not 16	

        if (ieeeMantissa != 0L) {

            // normalize -- shift until bit 24 of mantissa  is 1

            while ((ieeeMantissa & 0x00800000L) == 0) {
                --ieeeExponent;
                ieeeMantissa <<= 1;
            }

            // if exponent is nonpositive, denormalize until exp = 0 

            while (ieeeExponent <= 0) {
                ieeeMantissa >>= 1;
                if (ieeeMantissa == 0) {
                    ieeeExponent = 0; // zero
                    break;
                }
                if (ieeeExponent == 0)
                    // break if we have normalized, before bumping the exp
                    break;
                ieeeExponent++;
            }

            if (ieeeExponent >= 255) {
                ieeeExponent = 255; // inf
                ieeeExponent = 0; // set infinite numbers to 0
                ieeeMantissa = 0;
                // throw an error ?
            }

            ieee.sign = sign;
            ieee.exponent = (short) ieeeExponent;
            ieee.mantissa = (int) (0x7fffff & ieeeMantissa);

        } else {
            ieee.sign = sign;
            ieee.exponent = 0;
            ieee.mantissa = 0;
        }
        return ieee.toFloat();
    }
    private static final long unsigned(int x) {
        long lx = x;
        if (lx < 0) {
            lx += 0x0000000100000000L;
        }
        return lx;
    }
    private static final int unsignedb(byte x) {
        int ix = x;
        if (ix < 0) {
            ix += 0x00000100;
        }
        return ix;
    }
}