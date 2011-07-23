package com.scoutsys.render;

import java.awt.Color;
import java.awt.Font;

public interface ITimeLabelOptions {
    Color getBackColor();
    Color getForeColor();
    Font getMajorTimingLineFont();
    Font getMinorTimingLineFont();
    void setBackColor(Color newVal);
    void setForeColor(Color newVal);
    void setMajorTimingLineFont(Font newVal);
    void setMinorTimingLineFont(Font newVal);
}