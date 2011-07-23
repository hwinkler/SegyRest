package com.scoutsys.segy;

import java.rmi.RemoteException;

import com.scoutsys.trace.ITrace;
/**
 * This functionality is here rather than in SeisBrowse to avoid classDefNotFound for rmi.Remote
 * when running in IE.
 */
public class SegyRMILoader {
    /**
     * SegyRMILoader constructor comment.
     */
    public SegyRMILoader() {
        super();
    }
    public static com.scoutsys.trace.ITrace[] loadTraces(
        String host,
        String fileName,
        int firstTrace,
        int stride,
        int numTraces,
        boolean isLittleEndian)
        throws Exception {
        ITrace[] traces = new ITrace[0];
        try {
            ISegyServer srv =
                (
                    ISegyServer) java.rmi.Naming.lookup("//" + host
            /*getCodeBase().getHost()*/
            +"/SegyServer");
            ISegyFile syf = srv.getSegyFile();
            //String fileName = segyURL.substring (4, segyURL.length());
            syf.openReadOnly(fileName, false);
            traces =
                syf.getTraces(firstTrace, stride, numTraces, 0, isLittleEndian);
        } catch (RemoteException x) {
            System.err.println(x);
            throw new Exception("A remote error occured.");

        }
        return traces;
    }
}