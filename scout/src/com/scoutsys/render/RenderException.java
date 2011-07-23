package com.scoutsys.render;

/**
 * Exception class for trace rendering errors.
 * @version 1.0
 * @author Hugh Winkler
 */
public class RenderException extends Exception {
    public static final int NO_GRAPHICS = -10;
    int m_nErr;

    /**
     * Construct a RenderException with a generic error code.
     * @param nErr the error code
     */
    public RenderException() {
        super();
        m_nErr = -1;
    }
    /**
     * Construct a RenderException with the given error code.
     * @param nErr the error code
     */
    public RenderException(int nErr) {
        super();
        m_nErr = nErr;
    }
    /**
     * Construct a RenderException with the given error code and explanatory message.
     * @param nErr the error code
     * @param s explanatory message
     */
    public RenderException(int nErr, String s) {
        super(s);
        m_nErr = nErr;
    }
}