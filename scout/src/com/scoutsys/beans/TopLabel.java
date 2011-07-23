package com.scoutsys.beans;

import java.awt.Font;
/**
 * Draws the top annotations for a seismic plot.
 */
public class TopLabel extends java.awt.Component {
    private com.scoutsys.trace.ITrace[] fieldTraces;
    protected transient java.beans.PropertyChangeSupport propertyChange;
    private String fieldMajorFieldName = new String();
    private String fieldFieldName = new String();
    private int fieldFirstValue = 0;
    private int fieldValueInterval = 0;
    private java.awt.Font fieldFont =
        new java.awt.Font("SansSerif", Font.PLAIN, 12);
    private com.scoutsys.render.ITraceRenderOptions fieldTraceRenderOptions =
        null;
    /**
     * TopLabel constructor comment.
     */
    protected TopLabel() {
        super();
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * The firePropertyChange method was generated to support the propertyChange field.
     */
    public void firePropertyChange(
        String propertyName,
        Object oldValue,
        Object newValue) {
        getPropertyChange().firePropertyChange(
            propertyName,
            oldValue,
            newValue);
    }
    /**
     * Gets the fieldName property (java.lang.String) value.
     * @return The fieldName property value.
     * @see #setFieldName
     */
    public String getFieldName() {
        return fieldFieldName;
    }
    /**
     * Gets the firstValue property (int) value.
     * @return The firstValue property value.
     * @see #setFirstValue
     */
    public int getFirstValue() {
        return fieldFirstValue;
    }
    /**
     * Gets the font property (java.awt.Font) value.
     * @return The font property value.
     * @see #setFont
     */
    public java.awt.Font getFont() {
        return fieldFont;
    }
    /**
     * Accessor for the propertyChange field.
     */
    protected java.beans.PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    /**
     * Gets the traceRenderOptions property (com.scoutsys.render.ITraceRenderOptions) value.
     * @return The traceRenderOptions property value.
     * @see #setTraceRenderOptions
     */
    public com.scoutsys.render.ITraceRenderOptions getTraceRenderOptions() {
        return fieldTraceRenderOptions;
    }
    /**
     * No documentation for this method.
     * @return com.scoutsys.trace.ITrace[]
     */
    public com.scoutsys.trace.ITrace[] getTraces() {
        return fieldTraces;
    }
    /**
     * Gets the valueInterval property (int) value.
     * @return The valueInterval property value.
     * @see #setValueInterval
     */
    public int getValueInterval() {
        return fieldValueInterval;
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Sets the fieldName property (java.lang.String) value.
     * @param fieldName The new value for the property.
     * @see #getFieldName
     */
    public void setFieldName(String fieldName) {
        String oldValue = fieldFieldName;
        fieldFieldName = fieldName;
        firePropertyChange("fieldName", oldValue, fieldName);
    }
    /**
     * Sets the firstValue property (int) value.
     * @param firstValue The new value for the property.
     * @see #getFirstValue
     */
    public void setFirstValue(int firstValue) {
        int oldValue = fieldFirstValue;
        fieldFirstValue = firstValue;
        firePropertyChange(
            "firstValue",
            new Integer(oldValue),
            new Integer(firstValue));
    }
    /**
     * Sets the font property (java.awt.Font) value.
     * @param font The new value for the property.
     * @see #getFont
     */
    public void setFont(java.awt.Font font) {
        java.awt.Font oldValue = fieldFont;
        fieldFont = font;
        firePropertyChange("font", oldValue, font);
    }
    /**
     * Sets the traceRenderOptions property (com.scoutsys.render.ITraceRenderOptions) value.
     * @param traceRenderOptions The new value for the property.
     * @see #getTraceRenderOptions
     */
    public void setTraceRenderOptions(
        com.scoutsys.render.ITraceRenderOptions traceRenderOptions) {
        com.scoutsys.render.ITraceRenderOptions oldValue =
            fieldTraceRenderOptions;
        fieldTraceRenderOptions = traceRenderOptions;
        firePropertyChange("traceRenderOptions", oldValue, traceRenderOptions);
    }
    /**
     * No documentation for this method.
     * @param newValue com.scoutsys.trace.ITrace[]
     */
    public void setTraces(com.scoutsys.trace.ITrace[] newValue) {
        this.fieldTraces = newValue;
    }
    /**
     * Sets the valueInterval property (int) value.
     * @param valueInterval The new value for the property.
     * @see #getValueInterval
     */
    public void setValueInterval(int valueInterval) {
        int oldValue = fieldValueInterval;
        fieldValueInterval = valueInterval;
        firePropertyChange(
            "valueInterval",
            new Integer(oldValue),
            new Integer(valueInterval));
    }
}