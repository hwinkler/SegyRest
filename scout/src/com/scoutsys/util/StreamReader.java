package com.scoutsys.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * Reads all the requested bytes
 */
public class StreamReader {
    public static void read(InputStream is, byte[] buf, int n)
        throws IOException {
        int ndone = 0;
        int ntodo = n;
        int nlast;
        while ((ndone += (nlast = is.read(buf, ndone, ntodo))) < n) {
            ntodo -= nlast;
        }
    }
}