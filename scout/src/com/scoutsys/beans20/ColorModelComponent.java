package com.scoutsys.beans20;

import javax.swing.JComponent;
/**
 * No documentation for this type.
 */
class ColorModelComponent extends JComponent {
    protected transient java.beans.PropertyChangeSupport propertyChange;

    private java.awt.image.ColorModel fieldColorModelToDraw = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public ColorModelComponent() {
        super();
        initialize();
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
     * Gets the colorModelToDraw property (java.awt.image.ColorModel) value.
     * @return The colorModelToDraw property value.
     * @see #setColorModelToDraw
     */
    public java.awt.image.ColorModel getColorModelToDraw() {
        return fieldColorModelToDraw;
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
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("ColorModelComponent");
        setSize(150, 150);
        // user code begin {2}
        // user code end
    }
    /**
     * No documentation for this method.
     * @param g java.awt.Graphics
     */
    public void paint(java.awt.Graphics g) {
        java.awt.image.IndexColorModel colorModel = null;
        try {
            colorModel = (java.awt.image.IndexColorModel) getColorModelToDraw();
        } catch (ClassCastException x) {
            // it's not an index color model, so return

        }
        if (colorModel == null) {
            super.paint(g);
            return;
        }

        java.awt.Color oldColor = g.getColor();
        java.awt.Dimension size = getSize();

        int numColors = colorModel.getMapSize();
        int dh = 8;
        int dv = 8;

        int numCols = size.width / dh;
        int numRows = 1 + (numColors - 1) / numCols;

        int iColor = 0;
        for (int iRow = 0; iRow < numRows; iRow++) {
            int iTop = iRow * dv;
            for (int iCol = 0; iCol < numCols; iCol++) {
                int iLeft = iCol * dh;
                java.awt.Color c =
                    new java.awt.Color(colorModel.getRGB(iColor++));

                g.setColor(c);
                g.fillRect(iLeft, iTop, dh, dv);
            }
        }
        g.setColor(oldColor);

    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Sets the colorModelToDraw property (java.awt.image.ColorModel) value.
     * @param colorModelToDraw The new value for the property.
     * @see #getColorModelToDraw
     */
    public void setColorModelToDraw(
        java.awt.image.ColorModel colorModelToDraw) {
        java.awt.image.ColorModel oldValue = fieldColorModelToDraw;
        fieldColorModelToDraw = colorModelToDraw;
        repaint();
        firePropertyChange("colorModelToDraw", oldValue, colorModelToDraw);
    }
}