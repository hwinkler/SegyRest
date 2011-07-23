package com.scoutsys.segy;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * No documentation for this type.
 */
public interface ISegyServer extends Remote {
    /**
     * No documentation for this method.
     * @return com.scoutsys.segy.ISegyFile
     * @exception java.rmi.RemoteException The exception description.
     */
    ISegyFile getSegyFile() throws RemoteException;
}