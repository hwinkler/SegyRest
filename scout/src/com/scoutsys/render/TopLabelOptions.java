/*
 * Created on Jun 4, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.render;

import java.awt.Color;
import java.awt.Font;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TopLabelOptions implements ITopLabelOptions {
    Color foreColor = Color.BLACK;
    Color backColor = Color.WHITE;
    Font majorFont = new Font ("SansSerif", Font.BOLD, 16);
    Font minorFont = new Font ("SansSerif", Font.PLAIN, 10);


    public TopLabelOptions() {
        super();
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getBackColor()
     */
    public Color getBackColor() {

        return backColor;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getFirstValue()
     */
    public int getFirstValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getForeColor()
     */
    public Color getForeColor() {
        // TODO Auto-generated method stub
        return foreColor;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getMajorFont()
     */
    public Font getMajorFont() {
        // TODO Auto-generated method stub
        return majorFont;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getMajorHeaderField()
     */
    public String getMajorHeaderField() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getMinorFont()
     */
    public Font getMinorFont() {
        // TODO Auto-generated method stub
        return minorFont;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getMinorHeaderField()
     */
    public String getMinorHeaderField() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#getValueInterval()
     */
    public int getValueInterval() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setBackColor(java.awt.Color)
     */
    public void setBackColor(Color newVal) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setFirstValue(int)
     */
    public void setFirstValue(int firstValue) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setForeColor(java.awt.Color)
     */
    public void setForeColor(Color newVal) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setMajorFont(java.awt.Font)
     */
    public void setMajorFont(Font newVal) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setMajorHeaderField(java.lang.String)
     */
    public void setMajorHeaderField(String field) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setMinorFont(java.awt.Font)
     */
    public void setMinorFont(Font newVal) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setMinorHeaderField(java.lang.String)
     */
    public void setMinorHeaderField(String minorHeaderField) {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see com.scoutsys.render.ITopLabelOptions#setValueInterval(int)
     */
    public void setValueInterval(int valueInterval) {
        // TODO Auto-generated method stub

    }

}
