package com.scoutsys.segy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * The SEG-Y binary line header.
 * @author Hugh Winkler
 * @version 1.0
 */
public class SegyLineHeader implements java.io.Serializable {

    /** Sweep type is linear*/
    public static final short LINEARSWEEP = 1;
    /** Sweep type is parabolic*/
    public static final short PARABOLICSWEEP = 2;
    /** Sweep type is exponential*/
    public static final short EXPONENTIALSWEEP = 2;

    /** Taper type is linear*/
    public static final short LINEARTAPER = 1;
    /** Taper type is squared cosine*/
    public static final short COSSQTAPER = 2;

    /** Sample format is IBM float */
    public static final short FLOATFORMAT = 1;
    /** Sample format is four byte integer */
    public static final short FIXED4FORMAT = 2;
    /** Sample format is two byte integer */
    public static final short FIXED2FORMAT = 3;
    /** Sample format is integer with gain*/
    public static final short FIXEDWITHGAINFORMAT = 4;

    /** Sort type is as recorded */
    public static final short ASRECORDEDSORT = 1;
    /** Sort type is CDP */
    public static final short CDPSORT = 2;
    /** Sort type is single fold continuous profile */
    public static final short SINGLEFOLDCONTINUOUSPROFILESORT = 3;
    /** Sort type is as horizontal stack */
    public static final short HORIZONTALSTACKSORT = 4;

    /** Amplitude recovery is none */
    public static final short NORECOVERY = 1;
    /** Amplitude recovery is spherical divergence */
    public static final short SPHERICALDIVERGENCERECOVERY = 2;
    /** Amplitude recovery is AGC */
    public static final short AGCRECOVERY = 3;
    /** Coordinate units are meters */
    public static final short METERS = 1;
    /** Coordinate units feet*/
    public static final short FEET = 2;
    /** Polarity is negative */
    public static final short NEGATIVEPOLARITY = 1;
    /** Polarity is positive*/
    public static final short POSITIVEPOLARITY = 2;
    /** Vibratory polarity: seismic signal lags pilot signal by 337.5 to 22.5 degrees.*/
    public static final short N = 1;
    /**  Vibratory polarity: seismic signal lags pilot signal by 22.5 to 67.5 degrees.*/
    public static final short NE = 2;
    /**  Vibratory polarity: seismic signal lags pilot signal by 67.5 to 112.5  degrees.*/
    public static final short E = 3;
    /**  Vibratory polarity: seismic signal lags pilot signal by 112.5 to 157.5degrees.*/
    public static final short SE = 4;
    /**  Vibratory polarity: seismic signal lags pilot signal by 157.5 to 202.5 degrees.*/
    public static final short S = 5;
    /**  Vibratory polarity: seismic signal lags pilot signal by 202.5 to 247.5 degrees.*/
    public static final short SW = 6;
    /**  Vibratory polarity: seismic signal lags pilot signal by 247.5 to 292.5 degrees.*/
    public static final short W = 7;
    /**  Vibratory polarity: seismic signal lags pilot signal by 292.5 to 337.5 degrees.*/
    public static final short NW = 8;

    /** Job identification number.*/
    public int jobID = 0;
    /** Line number.*/
    public int lineNumber = 0;
    /** Reel number.*/
    public int reelNumber = 0;
    /** Number of data traces per record.*/
    public short tracesPerRecord = 0;
    /** Number of auxiliary traces per record.*/
    public short auxTracesPerRecord = 0;
    /** Sample interval in microseconds.*/
    public short sampleIntervalUS = 0;
    /** Sample interval in microseconds for original field recording.*/
    public short originalSampleIntervalUS = 0;
    /** Number of samples per data trace.*/
    public short numSamples = 0;
    /** Number of samples per data trace for original field recording.*/
    public short originalNumSamples = 0;
    /** Data sample format code. May be <code>FLOATFORMAT, FIXED4FORMAT, FIXED2FORMAT, FIXEDWITHGAINFORMAT.</code>*/
    public short sampleFormat = 0;
    /** Expected number of data traces per CDP ensemble.*/
    public short fold = 0;
    /** Trace sorting code. May be <code>ASRECORDEDSORT,CDPSORT,SINGLEFOLDCONTINUOUSPROFILESORT,HORIZONTALSTACKSORT.</code>*/
    public short traceSort = 0;
    /** Vertical sum code. 1= no sum, 2= two sum, etc.*/
    public short verticalSum = 0;
    /** Frequency at start of sweep.*/
    public short sweepFrequencyStart = 0;
    /** Frequency at end of sweep.*/
    public short sweepFrequencyEnd = 0;
    /** Sweep length (ms).*/
    public short sweepLengthMS = 0;
    /** Sweep type code. May be <code>LINEARSWEEP, PARABOLICSWEEP, EXPONENTIALSWEEP</code>, or other.*/
    public short sweepType = 0;
    /** Trace number of sweep channel.*/
    public short sweepTraceNumber = 0;
    /** Sweep trace taper length in ms at start if tapered. The taper starts at zero time and is effective for this length.*/
    public short sweepTaperLengthStartMS = 0;
    /** Sweep trace taper length in ms at end if tapered. The ending taper starts at sweep length minus the taper length at end.*/
    public short sweepTaperLengthEndMS = 0;
    /** Taper type. May be <code>LINEARTAPER, COSSQTAPER</code>, or other.*/
    public short sweepTaperType = 0;
    /** Correlated data traces.*/
    public boolean correlated = false;
    /** Binary gain recovered.*/
    public boolean binaryGainRecovered = false;
    /** Amplitude recovery method. May be <code>NORECOVERY , SPHERICALDIVERGENCERECOVERY, AGCRECOVERY</code> or other.  */
    public short amplitudeRecovery = 0;
    /** Measurement system. May be <code>METERS, FEET</code>.*/
    public short measurementSystem = 0;
    /** Impulse signal polarity. May be <code>NEGATIVEPOLARITY, POSITIVEPOLARITY</code>.*/
    public short polarity = 0;
    /** Vibratory polarity code. May be <code>N, NE, E, SE, S, SW, W, NW</code>.*/
    public short vibratoryPolarityCode = 0;

    /** Unassigned bytes.*/
    public byte[] unassigned;

    /**
     * Load this line header from the bytes obtained from a SEG-Y file.
     * @param bytes array of SEG-Y image bytes from which to load
     * @param bSwap <code>true</code> if the file is little-endian format (should usually be <code>false</code>).
     */
    public void load(byte[] bytes, boolean bSwap) throws IOException {
        if (bSwap) {
            try {
                bytes = (byte[]) bytes.clone();
            } catch (Exception x) {
                // supercede wants us to catch this for some reason
                throw new IOException();
            }
            for (int i = 0; i < 12; i += 4) {
                Swap.swap4(bytes, i);
            }
            for (int i = 12; i < 60; i += 2) {
                Swap.swap2(bytes, i);
            }

        }

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        DataInputStream dis = new DataInputStream(bais);

        jobID = dis.readInt();
        lineNumber = dis.readInt();
        reelNumber = dis.readInt();
        tracesPerRecord = dis.readShort();
        auxTracesPerRecord = dis.readShort();
        sampleIntervalUS = dis.readShort();
        originalSampleIntervalUS = dis.readShort();
        numSamples = dis.readShort();
        originalNumSamples = dis.readShort();
        sampleFormat = dis.readShort();
        fold = dis.readShort();
        traceSort = dis.readShort();
        verticalSum = dis.readShort();
        sweepFrequencyStart = dis.readShort();
        sweepFrequencyEnd = dis.readShort();
        sweepLengthMS = dis.readShort();
        sweepType = dis.readShort();
        sweepTraceNumber = dis.readShort();
        sweepTaperLengthStartMS = dis.readShort();
        sweepTaperLengthEndMS = dis.readShort();
        sweepTaperType = dis.readShort();
        correlated = dis.readShort() == 2;
        binaryGainRecovered = dis.readShort() == 1;
        amplitudeRecovery = dis.readShort();
        measurementSystem = dis.readShort();
        polarity = dis.readShort();
        vibratoryPolarityCode = dis.readShort();

    }
    /**
     * Save this line header to bytes which may be stored to
     * a SEG-Y file.
     * @param numBytes how many bytes of SEG-Y line header to create. Pass 0 to use default size.
     * @return array containing the bytes.
     */
    public byte[] save(boolean bSwap) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream(400);
        DataOutputStream dos = new java.io.DataOutputStream(baos);

        dos.writeInt(jobID);
        dos.writeInt(lineNumber);
        dos.writeInt(reelNumber);
        dos.writeShort(tracesPerRecord);
        dos.writeShort(auxTracesPerRecord);
        dos.writeShort(sampleIntervalUS);
        dos.writeShort(originalSampleIntervalUS);
        dos.writeShort(numSamples);
        dos.writeShort(originalNumSamples);
        dos.writeShort(sampleFormat);
        dos.writeShort(fold);
        dos.writeShort(traceSort);
        dos.writeShort(verticalSum);
        dos.writeShort(sweepFrequencyStart);
        dos.writeShort(sweepFrequencyEnd);
        dos.writeShort(sweepLengthMS);
        dos.writeShort(sweepType);
        dos.writeShort(sweepTraceNumber);
        dos.writeShort(sweepTaperLengthStartMS);
        dos.writeShort(sweepTaperLengthEndMS);
        dos.writeShort(sweepTaperType);
        dos.writeShort(correlated ? 2 : 1);
        //TODO  handle "correlated" here and in trace header
        dos.writeShort(binaryGainRecovered ? 1 : 0);
        dos.writeShort(amplitudeRecovery);
        dos.writeShort(measurementSystem);
        dos.writeShort(polarity);
        dos.writeShort(vibratoryPolarityCode);
        dos.flush();
        baos.flush();

        int size = baos.size();
        byte[] zeros = new byte[(int) Math.max(0, 400 - size)];
        dos.write(zeros);
        dos.flush();
        baos.flush();

        byte[] bytes = baos.toByteArray();
        if (bSwap) {
            for (int i = 0; i < 12; i += 4) {
                Swap.swap4(bytes, i);
            }
            for (int i = 12; i < 60; i += 2) {
                Swap.swap2(bytes, i);
            }

        }
        return bytes;

    }
}