package com.scoutsys.render;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class LabelRenderer {
    private final static float TIMELABEL_PADFACTOR = 1.1f;
    private final static float TOPLABEL_PADFACTOR = 1.8f;
    private final static String WIDESTRING = "000000";

    private static int adjustInterval(
        ITransform xfrm,
        int textHeight,
        int interval,
        int maxInterval) {
        // Determine the pixel distance between two ticks
        // If too small, double it
        int dpix = 0;
        while (dpix <= textHeight) {
            int pix0 = xfrm.timeMSToPixel(0.f);
            int pix1 = xfrm.timeMSToPixel(interval);
            dpix = Math.abs(pix1 - pix0);
            if (dpix <= textHeight)
                interval *= 2;
            if (interval >= maxInterval)
                break;
        }
        return interval;
    }
    public static Dimension getImageSize(
        Component component,
        ITimeLabelOptions pTimeLabelOptions,
        ITraceRenderSize pTraceRenderSize,
        int lengthMS)
        throws RenderException {
        // determine max size of text using the MAJOR font
        Graphics g0 = component.getGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();

        FontMetrics majorFontMetrics =
            g0.getFontMetrics(pTimeLabelOptions.getMajorTimingLineFont());
        int widthMajorText = majorFontMetrics.stringWidth(WIDESTRING);

        int width = Math.round(widthMajorText * TIMELABEL_PADFACTOR);
        // pad and round
        int height =
            pTraceRenderSize.calculateSizePixels(1, lengthMS, 1000).height;

        return new Dimension(width, height);
    }
    public static Dimension getImageSize(
        Component component,
        ITopLabelOptions pTopLableOptions,
        ITraceRenderSize pTraceRenderSize,
        int numTraces)
        throws RenderException {
        // determine max size of text using the MAJOR font
        Graphics g0 = component.getGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();

        FontMetrics majorFontMetrics =
            g0.getFontMetrics(pTopLableOptions.getMajorFont());
        int widthMajorText = majorFontMetrics.stringWidth(WIDESTRING);

        int width =
            pTraceRenderSize.calculateSizePixels(numTraces, 1000, 1000).width;
        int height =
            (int) (Math
                .round(majorFontMetrics.getHeight() * TOPLABEL_PADFACTOR));

        return new Dimension(width, height);
    }
    public static synchronized Image renderTimeLabel(
        Component component,
        ITimeLabelOptions pTimeLabelOptions,
        ITraceRenderOptions pTraceRenderOptions,
        int startTimeMS,
        int lengthMS)
        throws RenderException {

        // If either Options is missing, create it. Otherwise AddRef
        // it so that we can Release it whether we create it here or not.

        if (pTimeLabelOptions == null) {
            pTimeLabelOptions = new TimeLabelOptions();
        }

        if (pTraceRenderOptions == null) {
            pTraceRenderOptions = new TraceRenderOptions();
        }

        // obtain vital info from the options

        int lInterval1 = pTraceRenderOptions.getMajorTimingLineIntervalMS();
        Font pFont1 = pTimeLabelOptions.getMajorTimingLineFont();
        int lInterval2 = pTraceRenderOptions.getMinorTimingLineIntervalMS();
        Font pFont2 = pTimeLabelOptions.getMinorTimingLineFont();
        Color fgColor = pTimeLabelOptions.getForeColor();
        Color bgColor = pTimeLabelOptions.getBackColor();

        // determine max size of text using the MAJOR font
        Graphics g0 = component.getGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();
        FontMetrics majorFontMetrics = g0.getFontMetrics(pFont1);
        Dimension sizeMajorText =
            new Dimension(
                majorFontMetrics.stringWidth(WIDESTRING),
                majorFontMetrics.getHeight());
        int widthOneMajorChar = majorFontMetrics.charWidth('0');

        int width = Math.round(sizeMajorText.width * TIMELABEL_PADFACTOR);
        // pad and round
        int height =
            ((ITraceRenderSize) pTraceRenderOptions).calculateSizePixels(
                1,
                lengthMS,
                1000).height;

        Image img = component.createImage(width, height);
        Graphics g = img.getGraphics();
        Color oldColor = g.getColor(); // save old color
        Font oldFont = g.getFont();

        // Erase
        g.setColor(bgColor);
        g.fillRect(0, 0, width, height);

        g.setColor(fgColor);

        g.setFont(pFont1);
        ITransform xfrm = (ITransform) pTraceRenderOptions;
        int delayPix = xfrm.timeMSToPixel(startTimeMS);

        // Draw the major times

        // Start at the first interval past start time
        if (lInterval1 > 0) {
            int curTime = (startTimeMS + lInterval1) / lInterval1 * lInterval1;

            while (curTime < startTimeMS + lengthMS) {

                String labelText = String.valueOf(curTime);
                int widthText = majorFontMetrics.stringWidth(labelText);

                int curPix = xfrm.timeMSToPixel(curTime) - delayPix;

                int iTop = curPix - sizeMajorText.height / 2;
                int iBase = iTop + majorFontMetrics.getAscent();
                int iLeft = width - widthText - widthOneMajorChar;
                g.drawString(labelText, iLeft, iBase);

                curTime += lInterval1;
            }
        }

        // Draw the minor times

        // determine size of text using the minor font

        FontMetrics minorFontMetrics =
            component.getGraphics().getFontMetrics(pFont2);
        Dimension sizeMinorText =
            new Dimension(
                minorFontMetrics.stringWidth("000000"),
                minorFontMetrics.getHeight());
        int widthOneMinorChar = minorFontMetrics.stringWidth("0");

        g.setFont(pFont2);
        lInterval2 =
            adjustInterval(xfrm, sizeMinorText.height, lInterval2, lInterval1);
        if (lInterval2 > 0) {

            // Start at the first interval past start time
            int curTime = (startTimeMS + lInterval2) / lInterval2 * lInterval2;

            while (curTime < startTimeMS + lengthMS) {
                if (curTime % lInterval1 != 0) {

                    String labelText = String.valueOf(curTime);
                    int widthText = minorFontMetrics.stringWidth(labelText);

                    int curPix = xfrm.timeMSToPixel(curTime) - delayPix;

                    int iTop = curPix - sizeMinorText.height / 2;
                    int iBase = iTop + minorFontMetrics.getAscent();
                    int iLeft = width - widthText - widthOneMinorChar;
                    g.drawString(labelText, iLeft, iBase);
                }

                curTime += lInterval2;
            }
        }

        // restore old color
        g.setColor(oldColor);
        g.setFont(oldFont);

        return img;

    }

    public static synchronized RenderedImage renderTimeLabel(
        ITimeLabelOptions pTimeLabelOptions,
        ITraceRenderOptions pTraceRenderOptions,
        int startTimeMS,
        int lengthMS)
        throws RenderException {

        // If either Options is missing, create it. Otherwise AddRef
        // it so that we can Release it whether we create it here or not.

        if (pTimeLabelOptions == null) {
            pTimeLabelOptions = new TimeLabelOptions();
        }

        if (pTraceRenderOptions == null) {
            pTraceRenderOptions = new TraceRenderOptions();
        }

        // obtain vital info from the options

        int lInterval1 = pTraceRenderOptions.getMajorTimingLineIntervalMS();
        Font pFont1 = pTimeLabelOptions.getMajorTimingLineFont();
        int lInterval2 = pTraceRenderOptions.getMinorTimingLineIntervalMS();
        Font pFont2 = pTimeLabelOptions.getMinorTimingLineFont();
        Color fgColor = pTimeLabelOptions.getForeColor();
        Color bgColor = pTimeLabelOptions.getBackColor();

        // determine max size of text using the MAJOR font
        Graphics2D g0 =
            new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB)
                .createGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();
        FontMetrics majorFontMetrics = g0.getFontMetrics(pFont1);
        Dimension sizeMajorText =
            new Dimension(
                majorFontMetrics.stringWidth(WIDESTRING),
                majorFontMetrics.getHeight());
        int widthOneMajorChar = majorFontMetrics.charWidth('0');

        int width = Math.round(sizeMajorText.width * TIMELABEL_PADFACTOR);
        // pad and round
        int height =
            ((ITraceRenderSize) pTraceRenderOptions).calculateSizePixels(
                1,
                lengthMS,
                1000).height;

        //        Image img = component.createImage(width, height);
        BufferedImage img =
            new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        Color oldColor = g.getColor(); // save old color
        Font oldFont = g.getFont();

        // Erase
        g.setColor(bgColor);
        g.fillRect(0, 0, width, height);

        g.setColor(fgColor);

        g.setFont(pFont1);
        ITransform xfrm = (ITransform) pTraceRenderOptions;
        int delayPix = xfrm.timeMSToPixel(startTimeMS);

        // Draw the major times

        // Start at the first interval past start time
        if (lInterval1 > 0) {
            int curTime = (startTimeMS + lInterval1) / lInterval1 * lInterval1;

            while (curTime < startTimeMS + lengthMS) {

                String labelText = String.valueOf(curTime);
                int widthText = majorFontMetrics.stringWidth(labelText);

                int curPix = xfrm.timeMSToPixel(curTime) - delayPix;

                int iTop = curPix - sizeMajorText.height / 2;
                int iBase = iTop + majorFontMetrics.getAscent();
                int iLeft = width - widthText - widthOneMajorChar;
                g.drawString(labelText, iLeft, iBase);

                curTime += lInterval1;
            }
        }

        // Draw the minor times

        // determine size of text using the minor font

        FontMetrics minorFontMetrics = g0.getFontMetrics(pFont2);
        Dimension sizeMinorText =
            new Dimension(
                minorFontMetrics.stringWidth("000000"),
                minorFontMetrics.getHeight());
        int widthOneMinorChar = minorFontMetrics.stringWidth("0");

        g.setFont(pFont2);
        lInterval2 =
            adjustInterval(xfrm, sizeMinorText.height, lInterval2, lInterval1);
        if (lInterval2 > 0) {

            // Start at the first interval past start time
            int curTime = (startTimeMS + lInterval2) / lInterval2 * lInterval2;

            while (curTime < startTimeMS + lengthMS) {
                if (curTime % lInterval1 != 0) {

                    String labelText = String.valueOf(curTime);
                    int widthText = minorFontMetrics.stringWidth(labelText);

                    int curPix = xfrm.timeMSToPixel(curTime) - delayPix;

                    int iTop = curPix - sizeMinorText.height / 2;
                    int iBase = iTop + minorFontMetrics.getAscent();
                    int iLeft = width - widthText - widthOneMinorChar;
                    g.drawString(labelText, iLeft, iBase);
                }

                curTime += lInterval2;
            }
        }

        // restore old color
        g.setColor(oldColor);
        g.setFont(oldFont);

        return img;

    }
    public static synchronized RenderedImage renderTopLabel(
        ITopLabelOptions pTopLabelOptions,
        ITraceRenderOptions pTraceRenderOptions,
        com.scoutsys.trace.IHeader[] headers)
        throws RenderException {

        // If either Options is missing, create it. 
        if (pTopLabelOptions == null) {
            pTopLabelOptions = new TopLabelOptions();
        }

        if (pTraceRenderOptions == null) {
            pTraceRenderOptions = new TraceRenderOptions();
        }

        String headerFieldName = "";
        boolean useHeader = false;
        int n1 = 12;
        int dn = 12;

        // obtain vital info from the options

        Font pFont1 = pTopLabelOptions.getMajorFont();
        Font pFont2 = pTopLabelOptions.getMinorFont();
        Color fgColor = pTopLabelOptions.getForeColor();
        Color bgColor = pTopLabelOptions.getBackColor();

        // determine max size of text using the MAJOR font
        // just create a temporary BufferedImage

        Graphics2D g0 =
            new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB)
                .createGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();
        FontMetrics majorFontMetrics = g0.getFontMetrics(pFont1);

        Dimension sizeMajorText =
            new Dimension(
                majorFontMetrics.stringWidth(WIDESTRING),
                majorFontMetrics.getHeight());
        int widthOneMajorChar = majorFontMetrics.charWidth('0');

        int width =
            ((ITraceRenderSize) pTraceRenderOptions).calculateSizePixels(
                headers.length,
                1000,
                1000).width;
        int height = Math.round(sizeMajorText.height * TOPLABEL_PADFACTOR);
        // pad and round

        //        width = Math.max(width, component.getSize().width);
        //        height = Math.max(height, component.getSize().height);

        //        Image img = component.createImage(width, height);
        BufferedImage img =
            new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        Color oldColor = g.getColor(); // save old color
        Font oldFont = g.getFont();

        // Erase
        g.setClip(0, 0, width, height);
        g.setColor(bgColor);
        g.fillRect(0, 0, width, height);
        g.setColor(fgColor);
        g.setFont(pFont1);

        ITransform xfrm = (ITransform) pTraceRenderOptions;

        for (int iHeader = 0; iHeader < headers.length; iHeader++) {
            int n = iHeader + 1;

            if (useHeader) {
                try {
                    Object value = headers[iHeader].getValue(headerFieldName);
                    n = Integer.parseInt(value.toString());
                } catch (NumberFormatException x) {
                }
            }

            if (0 == (n - n1) % dn) {
                int centerPix = xfrm.traceToPixel(iHeader + 1);
                String labelText = Integer.toString(n);
                int widthText = majorFontMetrics.stringWidth(labelText);
                int iBase = majorFontMetrics.getAscent() + 2;
                g.drawString(labelText, centerPix - widthText / 2, iBase);

                g.drawLine(centerPix, (iBase + height) / 2, centerPix, height);
            }

        }

        // restore old color
        g.setColor(oldColor);
        g.setFont(oldFont);

        g.dispose();
        g0.dispose();
        
        return img;

    }

    public static synchronized Image renderTopLabel(
        Component component,
        ITopLabelOptions pTopLabelOptions,
        ITraceRenderOptions pTraceRenderOptions,
        com.scoutsys.trace.IHeader[] headers)
        throws RenderException {

        // If either Options is missing, create it. Otherwise AddRef
        // it so that we can Release it whether we create it here or not.

        //if (pTopLabelOptions == null)
        //{
        //	pTopLabelOptions = new TopLabelOptions ();
        //}

        if (pTraceRenderOptions == null) {
            pTraceRenderOptions = new TraceRenderOptions();
        }

        String headerFieldName = "";
        boolean useHeader = false;
        int n1 = 12;
        int dn = 12;

        // obtain vital info from the options

        Font pFont1 = pTopLabelOptions.getMajorFont();
        Font pFont2 = pTopLabelOptions.getMinorFont();
        Color fgColor = pTopLabelOptions.getForeColor();
        Color bgColor = pTopLabelOptions.getBackColor();

        // determine max size of text using the MAJOR font
        Graphics g0 = component.getGraphics();
        if (g0 == null)
            throw new RenderNoGraphicsException();
        FontMetrics majorFontMetrics = g0.getFontMetrics(pFont1);
        Dimension sizeMajorText =
            new Dimension(
                majorFontMetrics.stringWidth(WIDESTRING),
                majorFontMetrics.getHeight());
        int widthOneMajorChar = majorFontMetrics.charWidth('0');

        int width =
            ((ITraceRenderSize) pTraceRenderOptions).calculateSizePixels(
                headers.length,
                1000,
                1000).width;
        int height = Math.round(sizeMajorText.height * TOPLABEL_PADFACTOR);
        // pad and round

        width = Math.max(width, component.getSize().width);
        height = Math.max(height, component.getSize().height);

        Image img = component.createImage(width, height);
        Graphics g = img.getGraphics();
        Color oldColor = g.getColor(); // save old color
        Font oldFont = g.getFont();

        // Erase
        g.setClip(0, 0, width, height);
        g.setColor(bgColor);
        g.fillRect(0, 0, width, height);
        g.setColor(fgColor);
        g.setFont(pFont1);

        ITransform xfrm = (ITransform) pTraceRenderOptions;

        for (int iHeader = 0; iHeader < headers.length; iHeader++) {
            int n = iHeader + 1;

            if (useHeader) {
                try {
                    Object value = headers[iHeader].getValue(headerFieldName);
                    n = Integer.parseInt(value.toString());
                } catch (NumberFormatException x) {
                }
            }

            if (0 == (n - n1) % dn) {
                int centerPix = xfrm.traceToPixel(iHeader + 1);
                String labelText = Integer.toString(n);
                int widthText = majorFontMetrics.stringWidth(labelText);
                int iBase = majorFontMetrics.getAscent() + 2;
                g.drawString(labelText, centerPix - widthText / 2, iBase);

                g.drawLine(centerPix, (iBase + height) / 2, centerPix, height);
            }

        }

        // restore old color
        g.setColor(oldColor);
        g.setFont(oldFont);

        g.dispose();
        g0.dispose();
        return img;

    }
}