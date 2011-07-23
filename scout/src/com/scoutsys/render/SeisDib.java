package com.scoutsys.render;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.ImageProducer;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;

class SeisDib {
    private int m_numColors;
    private int m_numColorsMinusThree;
    private Dimension m_size;
    private byte[] m_pix;
    private ColorModel m_colorModel;

    protected SeisDib(Dimension size, ColorModel colorModel) {
        m_size = size;
        m_colorModel = colorModel;
        m_pix = new byte[size.width * size.height];
        m_numColors = 0;

        if (m_colorModel == null) {
            throw new RuntimeException(); // caller please handle;	
        }
        try {
            IndexColorModel ixcm = (IndexColorModel) m_colorModel;
            m_numColors = ixcm.getMapSize();
            m_numColorsMinusThree = m_numColors - 3;
        } catch (ClassCastException x) {

        }

    }
    protected void colorTraces(
        float[][] traces,
        boolean bNegate,
        short scaleEachTrace,
        short compareEachTrace,
        float scaleValue,
        WiggleTransform pwt) {

        int numTraces = traces.length;
        int numSamples = traces[0].length;

        double samplesPerPixel = numSamples / (double) Math.abs(m_size.height);

        int numSamplesMinus2 = numSamples - 2;

        int traceOffsetPixels = (int) pwt.getTraceOffsetPixels();
        //int( (double)(m_pixelCols) / (double) ( numTraces - 1 + 2 * pctOverlap / 100.0)); //trace offset
        int traceHalfWidthPixels = (int) pwt.getTraceThrowPixels();
        //int(traceOffsetPixels * pctOverlap/ 100.);
        int traceHalfOffsetPixels = traceOffsetPixels / 2;

        ScaleOffset[] so = new ScaleOffset[numTraces];

        if (scaleEachTrace == Constants.SCALETOVALUE) {
            compareEachTrace = Constants.COMPAREALLTRACES;
        }

        switch (compareEachTrace) {
            case Constants.COMPAREINDIVIDUALLY :
                {
                    for (int iTrace = numTraces - 1; iTrace >= 0; --iTrace) {
                        float[] trace = traces[iTrace];
                        double maxAbsVal = scanMaxAbsVal(trace);
                        so[iTrace] = new ScaleOffset();
                        so[iTrace].scale =
                            (maxAbsVal > 0.)
                                ? ((float) (.5 / maxAbsVal))
                                : 1.0f;
                        so[iTrace].offset = .5f;
                    }
                }
                break;
            case Constants.COMPAREALLTRACES :
                {
                    double maxAbsVal = 1.0;

                    if (scaleEachTrace == Constants.SCALETOVALUE)
                        maxAbsVal = scaleValue;
                    else
                        maxAbsVal = scanMaxAbsVal(traces);

                    double scale =
                        (maxAbsVal > 0.) ? ((float) (.5 / maxAbsVal)) : 1.0f;
                    for (int iTrace = numTraces - 1; iTrace >= 0; --iTrace) {
                        so[iTrace].scale = (float) scale;
                        so[iTrace].offset = .5f;
                    }
                }
                break;
        }

        int leftWidthPixels = traceHalfWidthPixels;
        int rightWidthPixels = traceHalfWidthPixels;

        int numRows = Math.abs(m_size.height);
        int sgn = (m_size.height >= 0) ? 1 : -1;
        for (int iy = 0, jy = 0; iy < numRows; iy++, jy += sgn) {

            double tSample = iy * samplesPerPixel;
            int floorSample = (int) tSample;

            for (int iTrace = 0; iTrace < numTraces; iTrace++) {

                int midTrace = iTrace;

                double midVal = so[iTrace].scale;

                //int pByte  =  Math.abs(m_size.m_cy-1 - iy) * m_size.m_cx;
                int pByte = iy * m_size.width;

                int byteOffset =
                    (int) Math.round(
                        traceHalfWidthPixels + iTrace * traceOffsetPixels);

                pByte += byteOffset;

                if (floorSample <= numSamplesMinus2) {
                    double w2 = tSample - floorSample;
                    double w1 = 1.0 - w2;

                    midVal *= w1 * traces[midTrace][floorSample]
                        + w2 * traces[midTrace][floorSample
                        + 1];

                } else {

                    midVal *= traces[midTrace][numSamples - 1];

                }

                midVal += .5;

                if (bNegate) {

                    midVal = -midVal;

                }

                if (iy != 0) {
                    doColor(
                        pByte,
                        -leftWidthPixels,
                        rightWidthPixels,
                        getColor(midVal));
                }
                pByte += rightWidthPixels;
            }

        }
    }
    protected void colorTracesInterpolated(
        float[][] traces,
        boolean bNegate,
        short scaleEachTrace,
        short compareEachTrace,
        float scaleValue,
        WiggleTransform pwt,
        float[] fractionalPositions) {

        int numTraces = traces.length;
        int numSamples = traces[0].length;

        double samplesPerPixel = numSamples / (double) Math.abs(m_size.height);

        int numSamplesMinus2 = numSamples - 2;

        int traceOffsetPixels = (int) pwt.getTraceOffsetPixels();
        //int( (double)(m_pixelCols) / (double) ( numTraces - 1 + 2 * pctOverlap / 100.0)); //trace offset
        int traceHalfWidthPixels = (int) pwt.getTraceThrowPixels();
        //int(traceOffsetPixels * pctOverlap/ 100.);
        int traceHalfOffsetPixels = traceOffsetPixels / 2;

        ScaleOffset[] so = new ScaleOffset[numTraces];

        if (scaleEachTrace == Constants.SCALETOVALUE) {
            compareEachTrace = Constants.COMPAREALLTRACES;
        }

        switch (compareEachTrace) {
            case Constants.COMPAREINDIVIDUALLY :
                {
                    for (int iTrace = 0; iTrace < numTraces; iTrace++) {
                        float[] trace = traces[iTrace];
                        double maxAbsVal = scanMaxAbsVal(trace);
                        so[iTrace] = new ScaleOffset();
                        so[iTrace].scale =
                            (maxAbsVal > 0.)
                                ? ((float) (.5 / maxAbsVal))
                                : 1.0f;
                        so[iTrace].offset = .5f;
                    }
                }
                break;
            case Constants.COMPAREALLTRACES :
                {
                    double maxAbsVal = 1.0;

                    if (scaleEachTrace == Constants.SCALETOVALUE)
                        maxAbsVal = scaleValue;
                    else
                        maxAbsVal = scanMaxAbsVal(traces);

                    double scale =
                        (maxAbsVal > 0.) ? ((float) (.5 / maxAbsVal)) : 1.0f;
                    for (int iTrace = 0; iTrace < numTraces; iTrace++) {
                        so[iTrace].scale = (float) scale;
                        so[iTrace].offset = .5f;
                    }
                }
                break;
        }

        int leftWidthPixels = traceHalfWidthPixels;
        int rightWidthPixels = traceHalfWidthPixels;

        int numRows = Math.abs(m_size.height);
        int sgn = (m_size.height >= 0) ? 1 : -1;
        for (int iy = 0, jy = 0; iy < numRows; iy++, jy += sgn) {

            double tSample = iy * samplesPerPixel;
            int floorSample = (int) tSample;

            for (int iTrace = 0; iTrace < numTraces; iTrace++) {

                if (fractionalPositions != null) {
                    leftWidthPixels =
                        (int) Math.round(
                            (fractionalPositions[iTrace]
                                - fractionalPositions[iTrace
                                - 1])
                                * (numTraces - 1)
                                * traceHalfWidthPixels);
                    rightWidthPixels =
                        (int) Math.round(
                            (fractionalPositions[iTrace
                                + 1]
                                - fractionalPositions[iTrace])
                                * (numTraces - 1)
                                * traceHalfWidthPixels);

                    if (iTrace == 0) {
                        leftWidthPixels = traceHalfWidthPixels;
                    }

                    if (iTrace == numTraces - 1) {
                        rightWidthPixels = traceHalfWidthPixels;
                    }
                }

                int midTrace = iTrace;
                int leftTrace;
                int rightTrace;

                double midVal = so[iTrace].scale;
                double leftVal;
                double rightVal;

                if (iTrace == 0) {
                    leftTrace = midTrace;
                    if (numTraces == 1) {
                        rightTrace = midTrace;
                        rightVal = so[iTrace].scale;
                    } else {
                        rightTrace = midTrace + 1;
                        rightVal = so[iTrace + 1].scale;
                    }
                    leftVal = so[iTrace].scale;
                } else if (iTrace == numTraces - 1) {
                    leftTrace = midTrace - 1;
                    rightTrace = midTrace;
                    leftVal = so[iTrace - 1].scale;
                    rightVal = so[iTrace].scale;
                } else {
                    leftTrace = midTrace - 1;
                    rightTrace = midTrace + 1;
                    leftVal = so[iTrace - 1].scale;
                    rightVal = so[iTrace + 1].scale;
                }

                //int pByte  =  Math.abs(m_size.m_cy-1 - iy) * m_size.m_cx;
                int pByte = iy * m_size.width;

                int byteOffset =
                    (int) Math.round(
                        (fractionalPositions == null)
                            ? (traceHalfWidthPixels + iTrace * traceOffsetPixels)
                            : (traceHalfWidthPixels
                                + fractionalPositions[iTrace]
                                    * (numTraces - 1)
                                    * traceHalfWidthPixels));

                pByte += byteOffset;

                if (floorSample <= numSamplesMinus2) {
                    double w2 = tSample - floorSample;
                    double w1 = 1.0 - w2;
                    leftVal *= w1 * traces[leftTrace][floorSample]
                        + w2 * traces[leftTrace][floorSample
                        + 1];
                    midVal *= w1 * traces[midTrace][floorSample]
                        + w2 * traces[midTrace][floorSample
                        + 1];
                    rightVal *= w1 * traces[rightTrace][floorSample]
                        + w2 * traces[rightTrace][floorSample
                        + 1];
                } else {
                    leftVal *= traces[leftTrace][numSamples - 1];
                    midVal *= traces[midTrace][numSamples - 1];
                    rightVal *= traces[rightTrace][numSamples - 1];
                }

                leftVal += .5;
                midVal += .5;
                rightVal += .5;

                if (bNegate) {
                    leftVal = -leftVal;
                    midVal = -midVal;
                    rightVal = -rightVal;
                }

                if (iy != 0) {
                    doColor(
                        pByte,
                        -leftWidthPixels,
                        rightWidthPixels,
                        getColor(leftVal),
                        getColor(midVal),
                        getColor(rightVal));
                }
                pByte += rightWidthPixels;
            }

        }
    }
    private final void doColor(
        int pByte,
        int beginOffset,
        int numBytes,
        byte clrMid) {
        pByte += beginOffset;

        while (numBytes >= 4) {
            m_pix[pByte++] = clrMid;
            m_pix[pByte++] = clrMid;
            m_pix[pByte++] = clrMid;
            m_pix[pByte++] = clrMid;
            numBytes -= 4;
        }
        while (numBytes-- > 0) {
            m_pix[pByte++] = clrMid;
        }
    }
    private final void doColor(
        int pByte,
        int beginOffset,
        int numBytes,
        byte clrLeft,
        byte clrMid,
        byte clrRight) {
        pByte += beginOffset;
        for (int i = numBytes; i >= 0; --i) {
            m_pix[pByte++] = clrMid;
        }
    }
    private final void doLine(int pByte, int h2, int h1, int fillPct) {
        // do line from h1 to h2, filling to h2 if necessary
        // h1 is on the row above h2.

        int dh = h2 - h1;
        int dh2 = dh >> 1;
        int dh1 = dh - dh2;

        if (dh == 0) {
            m_pix[pByte + h2] = (byte) 0;
        } else if (dh == 1 || dh == -1) {
            m_pix[pByte + h2] = (byte) 0;
            m_pix[pByte + m_size.width + h1] = (byte) 0;
        } else if (dh > 0) {
            memset(pByte + m_size.width + h1, 0, dh1);
            memset(pByte + h2 - dh2, 0, dh2);
        } else {
            memset(pByte + m_size.width + h1 + dh1, 0, -dh1);
            memset(pByte + h2, 0, -dh2);
        }

        if (fillPct > 0 && h2 > 0) // always doing 100% fill for now
            {
            h2 = Math.min(h2, m_pix.length - 1 - pByte);
            memset(pByte, 0, h2);
        } else if (fillPct < 0 && h2 < 0) {
            h2 = Math.max(h2, 0 - pByte);
            memset(pByte + h2, 0, -h2);
        }

    }
    protected void erase() {
        if ((m_pix == null) || (m_size == null) || (m_colorModel == null))
            return;
        int n = m_size.width * m_size.height;
        for (int i = n - 1; i >= 0; --i)
            m_pix[i] = 1;

    }
    private final byte getColor(double val) {
        return (byte) (2.5 + val * (m_numColorsMinusThree));
    }
    protected ImageProducer getImageProducer() {
        return new MemoryImageSource(
            m_size.width,
            m_size.height,
            m_colorModel,
            m_pix,
            0,
            m_size.width);
    }

    protected RenderedImage getRenderedImage() {
        BufferedImage image =
            new BufferedImage(
                m_size.width,
                m_size.height,
                BufferedImage.TYPE_BYTE_INDEXED,
                (IndexColorModel) m_colorModel);
        WritableRaster raster =
            Raster.createBandedRaster(
                DataBuffer.TYPE_INT,
                m_size.width,
                m_size.height,
                1,
                null);

        // they don't seem to have setPixels(...,byte[]) so we copy rows to a temporary array
        int[] intPix = new int[m_size.width];
        for (int i = 0; i < m_size.height; i++) {
            int ii = i * m_size.width;
            for (int j = m_size.width - 1; j >= 0; --j) {
                intPix[j] = m_pix[ii + j];
            }
            raster.setPixels(0, i, m_size.width, 1, intPix);
        }

        image.setData(raster);

        return image;
    }
    private void memset(int i1, int val, int n) {
        byte b = (byte) val;
        int i2 = i1 + n;
        if (n >= 0) {
            for (int i = i1; i < i2; i++) {
                m_pix[i] = b;
            }
        } else {
            for (int i = i2; i < i1; i++) {
                m_pix[i] = b;
            }
        }
    }
    protected void renderTimingLines(
        double delayRows,
        double dblIntervalPix,
        int nWeight) {
        if (nWeight <= 0)
            return;

        double remainder = Math.IEEEremainder(delayRows, dblIntervalPix);
        if (remainder < 0.)
            remainder += dblIntervalPix;
        double dblRow = dblIntervalPix - remainder;
        int numRows = Math.abs(m_size.height);
        int rowBytes = m_size.width;
        while (dblRow < numRows) {
            int iCentralRow = (int) Math.round(dblRow);

            for (int i = 0; i < nWeight; i++) {
                int iRow = iCentralRow - nWeight / 2 + i;
                if (iRow >= 0 && iRow < numRows) {
                    memset(iRow * rowBytes, 0, rowBytes);
                }
            }

            dblRow += dblIntervalPix;
        }

    }
    protected void renderTraces(
        float[][] traces,
        boolean bNegate,
        short scaleEachTrace,
        short compareEachTrace,
        float scaleValue,
        WiggleTransform pwt,
        int fillPct,
        float[] fractionalPositions) {

        int lastH = 0;
        int ih = 0;
        int numTraces = traces.length;
        int numSamples = traces[0].length;

        double globalMaxAbsVal = 1.0;

        if (scaleEachTrace == Constants.SCALETOVALUE && scaleValue != 0.f) {
            compareEachTrace = Constants.COMPAREALLTRACES;
            globalMaxAbsVal = scaleValue;
        } else if (compareEachTrace == Constants.COMPAREALLTRACES) {
            globalMaxAbsVal = scanMaxAbsVal(traces);
        }

        for (int iTrace = 0; iTrace < numTraces; iTrace++) {

            float[] trace = traces[iTrace];
            if (bNegate) {
                trace = (float[]) traces[iTrace].clone();
                for (int i = trace.length - 1; i >= 0; --i)
                    trace[i] = -trace[i];
            }

            double maxAbsVal = 1.0;

            if (scaleEachTrace == Constants.SCALETOVALUE)
                maxAbsVal = scaleValue;
            else if (compareEachTrace == Constants.COMPAREINDIVIDUALLY)
                maxAbsVal = scanMaxAbsVal(trace);
            else
                maxAbsVal = globalMaxAbsVal;

            double scale = (maxAbsVal > 0.) ? (1.0 / maxAbsVal) : 1.0;

            double samplesPerPixel =
                numSamples / (double) Math.abs(m_size.height);
            int numSamplesMinus2 = numSamples - 2;

            int traceOffsetPixels = (int) pwt.getTraceOffsetPixels();
            int traceHalfWidthPixels = (int) pwt.getTraceThrowPixels();

            int pByte = 0; //Math.abs(m_size.m_cy-1) * m_size.m_cx;
            int byteOffset =
                (int) Math.round(
                    (fractionalPositions == null)
                        ? (traceHalfWidthPixels + iTrace * traceOffsetPixels)
                        : (traceHalfWidthPixels
                            + fractionalPositions[iTrace]
                                * (numTraces - 1)
                                * traceHalfWidthPixels));

            pByte += byteOffset;

            int numRows = Math.abs(m_size.height);
            int sgn = (m_size.height >= 0) ? 1 : -1;

            for (int iy = 0, jy = 0; iy < numRows; iy++, jy += sgn) {
                double tSample = iy * samplesPerPixel;
                int floorSample = (int) tSample;

                double val;
                if (floorSample <= numSamplesMinus2) {
                    double w2 = tSample - floorSample;
                    double w1 = 1.0 - w2;
                    val = w1 * trace[floorSample] + w2 * trace[floorSample + 1];
                } else {
                    val = trace[numSamples - 1];
                }
                val *= scale;

                lastH = ih;
                ih = (int) (val * traceHalfWidthPixels);
                if (iy != numRows - 1 /*0 */
                    )
                    doLine(pByte, lastH, ih, fillPct);
                else
                    ;
                pByte += m_size.width;
            }
        }

    }
    private static float scanMaxAbsVal(float[][] x) {
        float maxAbsVal = 0.f;
        for (int i = x.length - 1; i > 0; --i) {
            float thisAbsVal = scanMaxAbsVal(x[i]);
            if (thisAbsVal > maxAbsVal)
                maxAbsVal = thisAbsVal;
        }
        return maxAbsVal;
    }
    private static float scanMaxAbsVal(float[] x) {
        float maxAbsVal = Math.abs(x[0]);
        for (int i = x.length - 1; i > 0; --i) {
            float thisAbsVal = Math.abs(x[i]);
            if (thisAbsVal > maxAbsVal)
                maxAbsVal = thisAbsVal;
        }
        return maxAbsVal;
    }
}