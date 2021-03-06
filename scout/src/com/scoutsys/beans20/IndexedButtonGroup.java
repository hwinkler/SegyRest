package com.scoutsys.beans20;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
/**
 * This type was created in VisualAge.
 */
public class IndexedButtonGroup extends ButtonGroup {
    protected transient java.beans.PropertyChangeSupport propertyChange;
    /**
     * IndexedButtonGroup constructor comment.
     */
    public IndexedButtonGroup() {
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
     * Accessor for the propertyChange field.
     */
    protected java.beans.PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    /**
     * Gets the selected property (short) value.
     * @return The selected property value.
     * @see #setSelected
     */
    public short getSelected() {
        java.util.Enumeration e = getElements();

        for (short i = 0; e.hasMoreElements(); i++) {
            AbstractButton m = (AbstractButton) e.nextElement();
            if (m.isSelected())
                return i;
        }
        return -1;
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * This method was created in VisualAge.
     * @param m com.sun.java.swing.ButtonModel
     * @param b boolean
     */
    public void setSelected(ButtonModel m, boolean b) {
        short oldValue = getSelected();
        super.setSelected(m, b);
        firePropertyChange(
            "selected",
            new Short(oldValue),
            new Short(getSelected()));

    }
    /**
     * Sets the selected property (short) value.
     * @param selected The new value for the property.
     * @see #getSelected
     */
    public void setSelected(short selected) {
        short oldValue = getSelected();
        java.util.Enumeration e = getElements();

        AbstractButton m = null;
        for (short i = 0; e.hasMoreElements() && i <= selected; i++) {
            m = (AbstractButton) e.nextElement();
        }
        if (m != null && !m.isSelected()) {
            m.setSelected(true);
            firePropertyChange(
                "selected",
                new Short(oldValue),
                new Short(selected));
        }

    }
}