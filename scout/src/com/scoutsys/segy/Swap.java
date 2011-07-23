package com.scoutsys.segy;

/**
 * Routines for swapping bytes.
 * @version 1.0
 * @author Hugh Winkler
 */
class Swap {
    /**
     * Swap a four byte integer
     * @return swapped integer
     * @param n int to be swapped
     */
    public int swap(int n) {
        return n;
    }
    /**
     * Swap a two byte integer
     * @return swapped integer
     * @param s short to be swapped
     */
    public short swap(short s) {
        return s;
    }
    /**
     * Swap two bytes in the array
     * @param bytes array of bytes
     * @param iStart offset to first byte to swap
     */
    protected static void swap2(byte[] bytes, int iStart) {
        byte t = bytes[iStart];
        bytes[iStart] = bytes[iStart + 1];
        bytes[iStart + 1] = t;
    }
    /**
     * Swap four bytes in the array
     * @param bytes array of bytes
     * @param iStart offset to first byte to swap
     */
    protected static void swap4(byte[] bytes, int iStart) {
        byte t = bytes[iStart];
        bytes[iStart] = bytes[iStart + 3];
        bytes[iStart + 3] = t;
        t = bytes[iStart + 1];
        bytes[iStart + 1] = bytes[iStart + 2];
        bytes[iStart + 2] = t;
    }
}