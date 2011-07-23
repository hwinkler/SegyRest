package com.scoutsys.beans;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.scoutsys.render.ITransform;
import com.scoutsys.render.TraceRenderOptions;

/**
 * No documentation for this type.
 */
public class ZoomTracker
    extends Component
    implements MouseListener, MouseMotionListener, java.io.Serializable {
    private SeisBean fieldSeisBean = new SeisBean();
    protected transient java.util.Vector aZoomListener = null;
    private transient boolean m_tracking = false;
    private transient int m_x0 = 0, m_y0 = 0;
    private transient int m_xLast = 0, m_yLast = 0;

    private Color fieldSelectionColor = Color.red;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public ZoomTracker() {
        super();
        initialize();
    }
    /**
     * Add a com.scoutsys.beans.ZoomListener.
     */
    public void addZoomListener(ZoomListener newListener) {
        if (aZoomListener == null) {
            aZoomListener = new java.util.Vector();
        };
        aZoomListener.addElement(newListener);
    }
    /**
     * connEtoC1:  (ZoomTracker.mouse.mousePressed(java.awt.event.MouseEvent) --> ZoomTracker.zoomTracker_MousePressed(Ljava.awt.event.MouseEvent;)V)
     * @param arg1 java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC1(MouseEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.zoomTracker_MousePressed(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC2:  (ZoomTracker.mouse.mouseReleased(java.awt.event.MouseEvent) --> ZoomTracker.zoomTracker_MouseReleased(Ljava.awt.event.MouseEvent;)V)
     * @param arg1 java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC2(MouseEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.zoomTracker_MouseReleased(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC3:  (ZoomTracker.mouseMotion.mouseMoved(java.awt.event.MouseEvent) --> ZoomTracker.zoomTracker_MouseMoved(Ljava.awt.event.MouseEvent;)V)
     * @param arg1 java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC3(MouseEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.zoomTracker_MouseMoved(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * Method to support listener events.
     */
    protected void fireHandleZoom(
        float trace1,
        float timeMS1,
        float trace2,
        float timeMS2) {
        if (aZoomListener == null) {
            return;
        };
        int currentSize = aZoomListener.size();
        com.scoutsys.beans.ZoomListener tempListener = null;
        for (int index = 0; index < currentSize; index++) {
            tempListener =
                (com.scoutsys.beans.ZoomListener) aZoomListener.elementAt(
                    index);
            if (tempListener != null) {
                tempListener.handleZoom(trace1, timeMS1, trace2, timeMS2);
            };
        };
    }
    /**
     * Gets the seisBean property (com.scoutsys.beans.SeisBean) value.
     * @return The seisBean property value.
     * @see #setSeisBean
     */
    public SeisBean getSeisBean() {
        return fieldSeisBean;
    }
    /**
     * Gets the selectionColor property (java.awt.Color) value.
     * @return The selectionColor property value.
     * @see #setSelectionColor
     */
    public Color getSelectionColor() {
        return fieldSelectionColor;
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
     * Initializes connections
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initConnections() {
        // user code begin {1}
        // user code end
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("ZoomTracker");
        setSize(150, 150);
        initConnections();
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
            ZoomTracker aZoomTracker;
            aZoomTracker = new ZoomTracker();
            frame.add("Center", aZoomTracker);
            frame.setSize(aZoomTracker.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of com.scoutsys.beans.ZoomTracker");
            exception.printStackTrace(System.out);
        }
    }
    /**
     * Method to handle events for the MouseListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseClicked(MouseEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseMotionListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseDragged(MouseEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseEntered(MouseEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseExited(MouseEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseMotionListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseMoved(MouseEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == this)) {
            connEtoC3(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mousePressed(MouseEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == this)) {
            connEtoC1(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the MouseListener interface.
     * @param e java.awt.event.MouseEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void mouseReleased(MouseEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == this)) {
            connEtoC2(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * No documentation for this method.
     * @param g java.awt.Graphics
     */
    public synchronized void paint(Graphics g) {
    }
    /**
     * Remove a com.scoutsys.beans.ZoomListener.
     */
    public void removeZoomListener(ZoomListener newListener) {
        if (aZoomListener != null) {
            aZoomListener.removeElement(newListener);
        };
    }
    /**
     * Sets the seisBean property (com.scoutsys.beans.SeisBean) value.
     * @param seisBean The new value for the property.
     * @see #getSeisBean
     */
    public void setSeisBean(SeisBean seisBean) {
        fieldSeisBean = seisBean;
    }
    /**
     * Sets the selectionColor property (java.awt.Color) value.
     * @param selectionColor The new value for the property.
     * @see #getSelectionColor
     */
    public void setSelectionColor(Color selectionColor) {
        fieldSelectionColor = selectionColor;
    }
    /**
     * Comment
     */
    public void zoomTracker_MouseMoved(MouseEvent evt) {
        if (!m_tracking)
            return;

        Point p = evt.getPoint();

        Graphics g = getGraphics();
        Color oldColor = g.getColor();
        g.setColor(getSelectionColor());
        g.setXORMode(getSelectionColor());
        g.drawRect(m_x0, m_y0, m_xLast - m_x0, m_yLast - m_y0);

        m_xLast = evt.getX();
        m_yLast = evt.getY();
        g.drawRect(m_x0, m_y0, m_xLast - m_x0, m_yLast - m_y0);

        g.setPaintMode();
        g.setColor(oldColor);

    }
    /**
     * Comment
     */
    public void zoomTracker_MousePressed(MouseEvent evt) {
        SeisBean seisBean = getSeisBean();
        if (seisBean == null)
            return;

        TraceRenderOptions options = seisBean.getOptions();

        int x = evt.getX();
        int y = evt.getY();

        Graphics g = getGraphics();
        Color oldColor = g.getColor();
        g.setColor(getSelectionColor());
        g.setXORMode(getSelectionColor());

        m_x0 = x;
        m_y0 = y;
        m_xLast = x;
        m_yLast = y;

        g.drawRect(m_x0, m_y0, m_xLast - m_x0, m_yLast - m_y0);

        g.setPaintMode();
        g.setColor(oldColor);

        m_tracking = true;

        return;
    }
    /**
     * Comment
     */
    public void zoomTracker_MouseReleased(java.awt.event.MouseEvent evt) {
        if (!m_tracking)
            return;
        m_tracking = false;

        Graphics g = getGraphics();
        Color oldColor = g.getColor();
        g.setColor(getSelectionColor());
        g.setXORMode(getSelectionColor());

        int x = evt.getX();
        int y = evt.getY();

        g.drawRect(m_x0, m_y0, x - m_x0, y - m_y0);

        g.setPaintMode();
        g.setColor(oldColor);

        // fire the ZoomEvent

        SeisBean seisBean = getSeisBean();
        if (seisBean == null)
            return;

        TraceRenderOptions options = seisBean.getOptions();

        float time1 = ((ITransform) options).pixelToTimeMS(m_x0);
        float trace1 = ((ITransform) options).pixelToTrace(m_y0);
        float time2 = ((ITransform) options).pixelToTimeMS(y);
        float trace2 = ((ITransform) options).pixelToTrace(x);

        fireHandleZoom(trace1, time1, trace2, time2);
        return;
    }
}