package com.scoutsys.util;

import java.applet.Applet;
import java.io.Serializable;

public class AppletParams implements Serializable {
    private Applet m_applet;

    public AppletParams(Applet applet) {
        m_applet = applet;
    }
    public double getParam(String strName, double fDefault) {
        double fValue = fDefault;
        String strValue = m_applet.getParameter(strName);
        if (strValue != null) {
            fValue = Double.valueOf(strValue).floatValue();
        }
        return fValue;
    }
    public float getParam(String strName, float fDefault) {
        float fValue = fDefault;
        String strValue = m_applet.getParameter(strName);
        if (strValue != null) {
            fValue = Float.valueOf(strValue).floatValue();
        }
        return fValue;
    }
    public int getParam(String strName, int nDefault) {
        int nValue = nDefault;
        String strValue = m_applet.getParameter(strName);
        if (strValue != null) {
            nValue = Integer.parseInt(strValue);
        }
        return nValue;
    }
    public String getParam(String strName, String strDefault) {
        String strValue = m_applet.getParameter(strName);
        if (strValue == null) {
            strValue = strDefault;
        }
        return strValue;
    }
    public short getParam(String strName, short nDefault) {
        short nValue = nDefault;
        String strValue = m_applet.getParameter(strName);
        if (strValue != null) {
            nValue = Short.parseShort(strValue);
        }
        return nValue;
    }
    public boolean getParam(String strName, boolean bDefault) {
        boolean bValue = bDefault;
        String strValue = m_applet.getParameter(strName);
        if (strValue != null) {
            bValue = Boolean.valueOf(strValue).booleanValue();
        }
        return bValue;
    }
}