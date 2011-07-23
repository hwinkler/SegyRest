package com.scoutsys.segy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Serves up traces, line header, and reel header from a SEG-Y file.
 */
public interface ISegyFile extends java.rmi.Remote {
    /**
     * Save the SEG-Y data to the file.
     * @param traces array of SegyTrace to save
     */
    public void appendTraces(SegyTrace[] traces) throws RemoteException;
    /**
    * Close the file.
    */
    void close() throws RemoteException;
    /**
     * Estimate the number of traces in the SEG-Y file.
     * @param numSamples if nonzero, use this as the number of samples per trace; else use line header value for number of samples per trace.
     */
    int estimateTraceCount(int nNumSamples) throws RemoteException;
    /** 
     * Get the line header object.
     * @return binary line header
     */
    SegyLineHeader getLineHeader() throws RemoteException;
    /**
     * Return the trace header size in bytes.
     * @return line header size in bytes.
     */
    int getLineHeaderSize() throws RemoteException;
    /** 
     * Return the EBCDIC reel header as a String array
     * @return EBCDIC reel header as a String array
     */
    String[] getReelHeader() throws RemoteException;
    /**
     * Return the reel header size in bytes.
     * @return trace header size in bytes.
     */
    int getReelHeaderSize() throws RemoteException;
    /**
     * Return the trace header size in bytes.
     * @return trace header size in bytes.
     */
    int getTraceHeaderSize() throws RemoteException;
    /**
     * Get traces from the file.
     * @param firstTrace index of first trace to get (base is 1).
     * @param numTraces how many traces to get.
     * @param numSamples how many samples per trace, or 0 to use line header value.
     * @param stride how many traces in the file between traces in the returned bunch;  use 1 to retrieve contiguous traces.
     * @return array of traces.
     * */
    SegyTrace[] getTraces(
        int firstTrace,
        int stride,
        int numTraces,
        int numSamples,
        boolean swap)
        throws FileNotFoundException, IOException, RemoteException;
    /**
     * Get the indicated traces from the file.
     * @param pos array of file positions, base 1, of traces to retrieve.
     * @param numSamples how many samples per trace, or 0 to use line header value.
     * @return array of traces.
     */
    SegyTrace[] getTracesByFilePositions(
        int[] pos,
        int numSamples,
        boolean swap)
        throws FileNotFoundException, IOException, RemoteException;
    /**
     * Get the indicated traces from the file.
     * @param indexes array of indexes, base 1, of traces to retrieve.
     * @param numSamples how many samples per trace, or 0 to use line header value.
     * @return array of traces
     */
    SegyTrace[] getTracesByIndexes(int[] indexes, int numSamples, boolean swap)
        throws FileNotFoundException, IOException, RemoteException;
    /**
     * Open the specified file for appending.
     * @param pszFileName file name to open.
     * @param byteReverse true if file is little-endian (normally false).
     * @param bFailIfMissing true if you want to throw an IOException if the file is not there.
     */
    void openAppend(
        String pszFileName,
        boolean byteReverse,
        boolean bFailIfMissing)
        throws FileNotFoundException, IOException, RemoteException;
    void openReadOnly(String pszFileName, boolean byteReverse)
    /**
     * Open the specified file for read-only access.
     * @param pszFileName file name to open
     * @param byteReverse true if file is little-endian (normally false)
     */
    throws FileNotFoundException, IOException, RemoteException;
    /**
     * Set the line header object.
     * @param hdr new binary line header
     */
    void setLineHeader(SegyLineHeader hdr) throws RemoteException;
    /**
     * Set the line header size in bytes. Default is 400.
     * @param newVal line header size in bytes.
     */
    void setLineHeaderSize(int newVal) throws RemoteException;
    /**
     * Set the EBCDIC reel header to the String array
     * @param pVal String array representing EBCDIC header.
     */
    void setReelHeader(String[] pVal) throws RemoteException;
    /**
     * Set the reel header size in bytes. Default is 3200.
     * @param newVal reel header size in bytes.
     */
    void setReelHeaderSize(int newVal) throws RemoteException;
    /**
     * Set the trace header size in bytes. Default is 240.
     * @param newVal trace header size in bytes.
     */
    void setTraceHeaderSize(int newVal) throws RemoteException;
}