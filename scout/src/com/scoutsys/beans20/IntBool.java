package com.scoutsys.beans20;

/**
 * This type was created in VisualAge.
 */
class IntBool {
    protected transient java.beans.PropertyChangeSupport propertyChange;
    private double fieldDoubleVal = 0.;

    private double fieldBoolConstant = 1;
    /**
     * IntBool constructor comment.
     */
    public IntBool() {
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
     * Gets the boolConstant property (double) value.
     * @return The boolConstant property value.
     * @see #setBoolConstant
     */
    public double getBoolConstant() {
        return fieldBoolConstant;
    }
    /**
     * Gets the boolVal property (boolean) value.
     * @return The boolVal property value.
     * @see #setBoolVal
     */
    public boolean getBoolVal() {
        return fieldDoubleVal != 0.;
    }
    /**
     * Gets the doubleVal property (double) value.
     * @return The doubleVal property value.
     * @see #setDoubleVal
     */
    public double getDoubleVal() {
        return fieldDoubleVal;
    }
    /**
     * Gets the floatVal property (float) value.
     * @return The floatVal property value.
     * @see #setFloatVal
     */
    public float getFloatVal() {
        return (float) fieldDoubleVal;
    }
    /**
     * Gets the intVal property (int) value.
     * @return The intVal property value.
     * @see #setIntVal
     */
    public int getIntVal() {
        return (int) fieldDoubleVal;
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
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Sets the boolConstant property (double) value.
     * @param boolConstant The new value for the property.
     * @see #getBoolConstant
     */
    public void setBoolConstant(double boolConstant) {
        double oldValue = fieldBoolConstant;
        fieldBoolConstant = boolConstant;
        firePropertyChange(
            "boolConstant",
            new Double(oldValue),
            new Double(boolConstant));
    }
    /**
     * Sets the boolVal property (boolean) value.
     * @param boolVal The new value for the property.
     * @see #getBoolVal
     */
    public void setBoolVal(boolean boolVal) {
        setDoubleVal((boolVal) ? getBoolConstant() : 0);
    }
    /**
     * Sets the doubleVal property (double) value.
     * @param doubleVal The new value for the property.
     * @see #getDoubleVal
     */
    public void setDoubleVal(double doubleVal) {
        double oldValue = fieldDoubleVal;
        fieldDoubleVal = doubleVal;
        firePropertyChange(
            "doubleVal",
            new Double(oldValue),
            new Double(doubleVal));
        firePropertyChange(
            "floatVal",
            new Float(oldValue),
            new Float(doubleVal));
        firePropertyChange(
            "intVal",
            new Integer((int) oldValue),
            new Integer((int) doubleVal));
        firePropertyChange(
            "shortVal",
            new Short((short) oldValue),
            new Short((short) doubleVal));
        firePropertyChange(
            "boolVal",
            new Boolean(oldValue != 0.),
            new Boolean(doubleVal != 0.));
    }
    /**
     * Sets the floatVal property (float) value.
     * @param floatVal The new value for the property.
     * @see #getFloatVal
     */
    public void setFloatVal(float floatVal) {
        setDoubleVal(floatVal);
    }
    /**
     * Sets the intVal property (int) value.
     * @param intVal The new value for the property.
     * @see #getIntVal
     */
    public void setIntVal(int intVal) {
        setDoubleVal(intVal);
    }
}