package com.scoutsys.beans;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Vector;

import com.scoutsys.render.ITraceRenderSize;
import com.scoutsys.render.ITransform;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;
import com.scoutsys.render.TraceRenderer;
import com.scoutsys.segy.SegyTrace;
import com.scoutsys.trace.ITrace;

/**
 * Seismic drawing component
 */

public class SeisBean
    extends Component
    implements MouseMotionListener, Serializable {

    private transient Image m_img;
    protected transient PropertyChangeSupport propertyChange;
    protected transient Vector aSeisMouseListener = null;
    private TraceRenderOptions fieldOptions = new TraceRenderOptions();
    private com.scoutsys.trace.ITrace[] fieldTraces = new SegyTrace[0];
    protected transient ComponentListener aComponentListener = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public SeisBean() {
        super();
        initialize();
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * Add a com.scoutsys.beans.SeisMouseListener.
     */
    public void addSeisMouseListener(SeisMouseListener newListener) {
        if (aSeisMouseListener == null) {
            aSeisMouseListener = new java.util.Vector();
        };
        aSeisMouseListener.addElement(newListener);
    }
    /**
     * Method to support listener events.
     */
    protected void fireComponentHidden(ComponentEvent e) {
        if (aComponentListener == null) {
            return;
        };
        aComponentListener.componentHidden(e);
    }
    /**
     * Method to support listener events.
     */
    protected void fireComponentMoved(ComponentEvent e) {
        if (aComponentListener == null) {
            return;
        };
        aComponentListener.componentMoved(e);
    }
    /**
     * Method to support listener events.
     */
    protected void fireComponentResized(ComponentEvent e) {
        if (aComponentListener == null) {
            return;
        };
        aComponentListener.componentResized(e);
    }
    /**
     * Method to support listener events.
     */
    protected void fireComponentShown(ComponentEvent e) {
        if (aComponentListener == null) {
            return;
        };
        aComponentListener.componentShown(e);
    }
    /**
     * Method to support listener events.
     */
    protected void fireHandleMove(SeisMouseEvent evt) {
        if (aSeisMouseListener == null) {
            return;
        };
        int currentSize = aSeisMouseListener.size();
        com.scoutsys.beans.SeisMouseListener tempListener = null;
        for (int index = 0; index < currentSize; index++) {
            tempListener =
                (
                    com
                        .scoutsys
                        .beans
                        .SeisMouseListener) aSeisMouseListener
                        .elementAt(
                    index);
            if (tempListener != null) {
                tempListener.handleMove(evt);
            };
        };
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
     * Gets the options property (com.scoutsys.render.TraceRenderOptions) value.
     * @return The options property value.
     * @see #setOptions
     */
    public TraceRenderOptions getOptions() {
        return fieldOptions;
    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredScrollableViewportSize() {
        Dimension d = null;
        if (fieldTraces != null) {
            d = new Dimension();
            int numTraces = fieldTraces.length;
            if (numTraces > 0) {
                int numSamples = fieldTraces[0].getSamples().length;
                double si = fieldTraces[0].getSampleInterval();
                d =
                    ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                        numTraces,
                        numSamples,
                        si);
            }
        }
        return d;

    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredSize() {
        Dimension d = new Dimension(1, 1); //= super.getPreferredSize();
        if (/* d == null &&*/
            fieldTraces != null) {
            //d = new Dimension();
            int numTraces = fieldTraces.length;
            if (numTraces > 0) {
                int numSamples = fieldTraces[0].getSamples().length;
                double si = fieldTraces[0].getSampleInterval();
                d =
                    ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                        numTraces,
                        numSamples,
                        si);
            }
        }
        return d;

    }
    /**
     * Accessor for the propertyChange field.
     */
    protected PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    private float[][] getSamplesFromTraces(ITrace[] traces) {
        int numTraces = traces.length;

        float[][] samples = new float[numTraces][];

        for (int i = 0; i < numTraces; i++) {
            samples[i] = fieldTraces[i].getSamples();
        }
        return samples;
    }
    /**
     * This method was created in VisualAge.
     * @return int
     * @param visibleRect java.awt.Rectangle
     * @param orientation int
     * @param direction int
     */
    public int getScrollableBlockIncrement(
        Rectangle visibleRect,
        int orientation,
        int direction) {
        return 100;
    }
    /**
     * This method was created in VisualAge.
     * @return boolean
     */
    public boolean getScrollableTracksViewportHeight() {
        return false;
    }
    /**
     * This method was created in VisualAge.
     * @return boolean
     */
    public boolean getScrollableTracksViewportWidth() {
        return false;
    }
    /**
     * This method was created in VisualAge.
     * @return int
     * @param visibleRect java.awt.Rectangle
     * @param orientation int
     * @param direction int
     */
    public int getScrollableUnitIncrement(
        Rectangle visibleRect,
        int orientation,
        int direction) {
        return 10;
    }
    /**
     * Gets the traces property (com.scoutsys.trace.ITrace[]) value.
     * @return The traces property value.
     * @see #setTraces
     */
    public com.scoutsys.trace.ITrace[] getTraces() {
        return fieldTraces;
    }
    /**
     * Called whenever the part throws an exception.
     * @param exception java.lang.Throwable
     */
    private void handleException(Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        // System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        // exception.printStackTrace(System.out);
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        addMouseMotionListener(this);
        // user code end
        setName("SeisBean");
        setSize(150, 150);
        // user code begin {2}
        // user code end
    }
    /**
     * main entrypoint - starts the part when it is run as an application
     * @param args java.lang.String[]
     */
    public static void main(java.lang.String[] args) {
        try {
            Frame frame;
            try {
                Class aFrameClass =
                    Class.forName("com.ibm.uvm.abt.edit.TestFrame");
                frame = (Frame) aFrameClass.newInstance();
            } catch (java.lang.Throwable ivjExc) {
                frame = new Frame();
            }
            SeisBean aSeisBean;
            aSeisBean = new SeisBean();
            aSeisBean.setTraces(makeDummyTraces());
            frame.add("Center", aSeisBean);
            frame.setSize(aSeisBean.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of com.scoutsys.beans.SeisBean");
            exception.printStackTrace(System.out);
        }
    }
    /**
     * No documentation for this method.
     * @return com.scoutsys.trace.ITrace[]
     */
    static com.scoutsys.trace.ITrace[] makeDummyTraces() {

        int numTraces = 120;
        int numSamples = 1501;
        int gap = 3;
        float dt = (float) .002;
        float dx = (float) 110;
        double t0[] = { .5, 1.0, 1.5, 2.0, 2.5 };
        float v = (float) 6000;
        float x0 = (float) ((numTraces + gap) * dx / 2.0);

        int numWaveletSamples = 40;
        float wavelet[] = new float[numWaveletSamples];
        double omega = 3.141592654 / numWaveletSamples;
        // build a wavelet
        for (int i = 0; i < numWaveletSamples; i++) {
            double c = Math.sin(2 * i * omega);
            wavelet[i] = (float) c;

        }

        // Headers
        String[] headerNames = { "CHAN", "TX", "RX", "FFID" };
        java.util.Hashtable headerIndices =
            new java.util.Hashtable(10, (float) .5);
        for (int i = 0; i < headerNames.length; i++) {
            headerIndices.put(headerNames[i], new Integer(i));
        }

        com.scoutsys.trace.ITrace[] tcs =
            new com.scoutsys.trace.ITrace[numTraces];

        for (int i = 0; i < numTraces; i++) {
            float x = 0;
            if (i < numTraces / 2) {
                x = x0 - i * dx;
            } else {
                x = x0 - (i + gap) * dx;
            }

            float[] samples = new float[numSamples];

            for (int j = 0; j < t0.length; j++) {
                double t = Math.sqrt(t0[j] * t0[j] + x * x / (v * v));
                int it = (int) Math.round(t / dt);
                int j1 = Math.max(0, it - numWaveletSamples / 2);
                int j2 = Math.min(numSamples, it + numWaveletSamples / 2);
                for (int k = j1; k < j2; k++) {
                    samples[k] = wavelet[k - j1];
                }
            }
            com.scoutsys.segy.SegyTrace tr = new com.scoutsys.segy.SegyTrace();
            tr.setSamples(samples);
            tr.setSampleInterval(dt * 1000000);

            tcs[i] = tr;

        }
        return tcs;
    }
    public void mouseDragged(MouseEvent e) {
    }
    public void mouseMoved(MouseEvent e) {

        int x = e.getX();
        int y = e.getY();

        float timeMS = ((ITransform) fieldOptions).pixelToTimeMS(y);
        float trace = ((ITransform) fieldOptions).pixelToTrace(x);

        int iTrace = Math.round(trace);
        float val = 0.f;
        if (iTrace >= 0 && iTrace < fieldTraces.length) {
            ITrace tr = fieldTraces[iTrace];

            int iSample =
                (int) Math.round(timeMS * 1000 / tr.getSampleInterval());
            if (iSample >= 0 && iSample < tr.getSamples().length) {
                val = tr.getSamples()[iSample];
            }
        }

        fireHandleMove(new SeisMouseEvent(this, trace, timeMS, val));
    }
    public void paint(Graphics g) {
        if (m_img != null)
            g.drawImage(m_img, 0, 0, this);
    }
    public void refresh() {
        int numTraces = fieldTraces.length;
        int numSamples = 0;
        double sampleIntervalUS = 1000;
        int delayMS = 0;
        if (numTraces > 0) {
            numSamples = fieldTraces[0].getSamples().length;
            sampleIntervalUS = fieldTraces[0].getSampleInterval();
            delayMS = fieldTraces[0].getDelayMS();
        }

        try {
            TraceRenderer rndr = new TraceRenderer();
            m_img =
                rndr.render(
                    this,
                    getSamplesFromTraces(fieldTraces),
                    delayMS,
                    sampleIntervalUS,
                    fieldOptions);
            Dimension size =
                ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                    numTraces,
                    numSamples,
                    sampleIntervalUS);
            this.setSize(size);
            this.repaint();
            this.fireComponentResized(new ComponentEvent(this, 0));
        } catch (RenderException x) {
            System.err.print(x);
        } catch (Exception x) {
            System.err.print(x);
        }
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Remove a com.scoutsys.beans.SeisMouseListener.
     */
    public void removeSeisMouseListener(SeisMouseListener newListener) {
        if (aSeisMouseListener != null) {
            aSeisMouseListener.removeElement(newListener);
        };
    }
    /**
     * Comment
     */
    public void seisBean_MouseClicked1(java.awt.event.MouseEvent evt) {
        if (evt.isPopupTrigger()) {

        }
        return;
    }
    /**
     * Sets the options property (com.scoutsys.render.TraceRenderOptions) value.
     * @param options The new value for the property.
     * @see #getOptions
     */
    public void setOptions(TraceRenderOptions options) {
        TraceRenderOptions oldValue = fieldOptions;
        fieldOptions = options;
        refresh();
        firePropertyChange("options", oldValue, options);
    }
    /**
     * Sets the traces property (com.scoutsys.trace.ITrace[]) value.
     * @param traces The new value for the property.
     * @see #getTraces
     */
    public void setTraces(com.scoutsys.trace.ITrace[] traces) {
        com.scoutsys.trace.ITrace[] oldValue = fieldTraces;
        fieldTraces = traces;
        refresh();
        firePropertyChange("traces", oldValue, traces);
    }
}