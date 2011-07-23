package com.scoutsys.beans20;

public class SeisMouseEvent extends java.util.EventObject {
    public float iTrace;
    public float iTime;
    public float val;

    public SeisMouseEvent(Object source, float itr, float itm, float v) {
        super(source);
        iTrace = itr;
        iTime = itm;
        val = v;
    }
}