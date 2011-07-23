package com.scoutsys.util;

public class NotImplException extends RuntimeException {
    public NotImplException() {
        super("Method not implemented");
    }
    public NotImplException(String who) {
        super("Method not implemented: " + who);
    }
}