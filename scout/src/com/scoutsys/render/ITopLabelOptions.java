package com.scoutsys.render;

import java.awt.Color;
import java.awt.Font;

public interface ITopLabelOptions {
    Color getBackColor();
    /**
     * Gets the firstValue property (int) value.
     * @return The firstValue property value.
     * @see #setFirstValue
     */
    int getFirstValue();
    Color getForeColor();
    Font getMajorFont();
    /**
     * This method was created in VisualAge.
     * @return java.lang.String
     */
    String getMajorHeaderField();
    Font getMinorFont();
    /**
     * Gets the minorHeaderField property (java.lang.String) value.
     * @return The minorHeaderField property value.
     * @see #setMinorHeaderField
     */
    String getMinorHeaderField();
    /**
     * Gets the valueInterval property (int) value.
     * @return The valueInterval property value.
     * @see #setValueInterval
     */
    int getValueInterval();
    void setBackColor(Color newVal);
    /**
     * Sets the firstValue property (int) value.
     * @param firstValue The new value for the property.
     * @see #getFirstValue
     */
    void setFirstValue(int firstValue);
    void setForeColor(Color newVal);
    void setMajorFont(Font newVal);
    /**
     * This method was created in VisualAge.
     * @param field java.lang.String
     */
    void setMajorHeaderField(String field);
    void setMinorFont(Font newVal);
    /**
     * Sets the minorHeaderField property (java.lang.String) value.
     * @param minorHeaderField The new value for the property.
     * @see #getMinorHeaderField
     */
    void setMinorHeaderField(String minorHeaderField);
    /**
     * Sets the valueInterval property (int) value.
     * @param valueInterval The new value for the property.
     * @see #getValueInterval
     */
    void setValueInterval(int valueInterval);
}