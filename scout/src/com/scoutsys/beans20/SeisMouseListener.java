package com.scoutsys.beans20;

public interface SeisMouseListener extends java.util.EventListener {
    void handleMove(SeisMouseEvent evt);
    /**
     * No documentation for this method.
     * @param sme com.scoutsys.beans.SeisMouseEvent
     */
    void handleSelect(SeisMouseEvent sme);
}