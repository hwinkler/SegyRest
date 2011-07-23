package com.scoutsys.render;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

public class TimeLabelOptions implements ITimeLabelOptions, Serializable {
    private Font m_majorTimingLineFont = new Font("Serif", Font.ITALIC, 16);
    private Font m_minorTimingLineFont = new Font("Serif", Font.ITALIC, 10);
    private Color m_foreColor  = Color.BLACK;
    private Color m_backColor  = Color.WHITE;

    public Color getBackColor() {
        return m_backColor;
    }
    public Color getForeColor() {
        return m_foreColor;
    }
    public Font getMajorTimingLineFont() {
        return m_majorTimingLineFont;
    }
    public Font getMinorTimingLineFont() {
        return m_minorTimingLineFont;
    }
    public void setBackColor(Color newVal) {
        m_backColor = newVal;
    }
    public void setForeColor(Color newVal) {
        m_foreColor = newVal;
    }
    public void setMajorTimingLineFont(Font newVal) {
        m_majorTimingLineFont = newVal;
    }
    public void setMinorTimingLineFont(Font newVal) {
        m_minorTimingLineFont = newVal;
    }
}