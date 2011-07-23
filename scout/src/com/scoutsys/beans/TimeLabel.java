package com.scoutsys.beans;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

import com.scoutsys.render.ITimeLabelOptions;
import com.scoutsys.render.ITraceRenderOptions;
import com.scoutsys.render.ITraceRenderSize;
import com.scoutsys.render.LabelRenderer;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;

public class TimeLabel
    extends Component
    implements ITimeLabelOptions, Serializable {
    private Font m_majorTimingLineFont = new Font("SansSerif", Font.PLAIN, 12);
    private Font m_minorTimingLineFont = new Font("SansSerif", Font.PLAIN, 9);
    private int m_startTimeMS = 0;
    private int m_lengthMS = 1000;
    private transient Image m_img;
    ITraceRenderOptions m_traceRenderOptions = new TraceRenderOptions();
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public TimeLabel() {
        super();
        initialize();
    }
    public Color getBackColor() {
        return getBackground();
    }
    public Color getForeColor() {
        return getForeground();
    }
    public Dimension getImageSize() {
        try {
            return LabelRenderer.getImageSize(
                this,
                this,
                (ITraceRenderSize) m_traceRenderOptions,
                m_lengthMS);
        } catch (RenderException x) {
            return getSize();
        }
    }
    public int getLengthMS() {
        return m_lengthMS;
    }
    public Font getMajorTimingLineFont() {
        return m_majorTimingLineFont;
    }
    // ITimeLabelOptions
    public Font getMinorTimingLineFont() {
        return m_minorTimingLineFont;
    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredSize() {
        return getImageSize();
    }
    public int getStartTimeMS() {
        return m_startTimeMS;
    }
    public ITraceRenderOptions getTraceRenderOptions() {
        return m_traceRenderOptions;
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
        // user code end
        setName("TimeLabel");
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
            Frame frame = new java.awt.Frame();
            TimeLabel aTimeLabel;
            aTimeLabel = new TimeLabel();
            frame.add("Center", aTimeLabel);
            frame.setSize(aTimeLabel.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of com.scoutsys.beans.TimeLabel");
            exception.printStackTrace(System.out);
        }
    }
    private Image makeImage() {
        LabelRenderer rndr = new LabelRenderer();
        try {
            Image img =
                LabelRenderer.renderTimeLabel(
                    this,
                    this,
                    m_traceRenderOptions,
                    m_startTimeMS,
                    m_lengthMS);
            return img;
        } catch (RenderException x) {
            return null;
        }
    }
    public void paint(Graphics g) {
        if (m_img == null)
            m_img = makeImage();

        if (m_img != null)
            g.drawImage(m_img, 0, 0, this);
    }
    public void refresh() {
        m_img = makeImage();
        this.invalidate();
    }
    public void setBackColor(Color newVal) {
        setBackground(newVal);
        this.refresh();
    }
    public void setForeColor(Color newVal) {
        setForeground(newVal);
        this.refresh();
    }
    public void setLengthMS(int lengthMS) {
        m_lengthMS = lengthMS;
        setSize(getImageSize());
        this.refresh();
    }
    public void setMajorTimingLineFont(Font newVal) {
        m_majorTimingLineFont = newVal;
        this.refresh();
    }
    public void setMinorTimingLineFont(Font newVal) {
        m_minorTimingLineFont = newVal;
        this.refresh();
    }
    public void setStartTimeMS(int startTimeMS) {
        m_startTimeMS = startTimeMS;
        this.refresh();
    }
    public void setTraceRenderOptions(ITraceRenderOptions options) {
        m_traceRenderOptions = options;
        this.refresh();
    }
}