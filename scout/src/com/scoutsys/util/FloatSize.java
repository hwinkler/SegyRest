package com.scoutsys.util;

public class FloatSize implements Cloneable {
    public float m_cx = 0.f;
    public float m_cy = 0.f;
    public FloatSize() {
    }
    public FloatSize(float cx, float cy) {
        m_cx = cx;
        m_cy = cy;
    }
}