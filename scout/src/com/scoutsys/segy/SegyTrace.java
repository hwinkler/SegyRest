package com.scoutsys.segy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * A seismic trace having all the fields of a SEG-Y trace.
 * You can use the <code>toBytes()</code> and <code>fromBytes()</code> members to 
 * store the trace to and load it from bytes in a SEG-Y file. 
 * @version 1.0
 * @author Hugh Winkler
 * @see com.scoutsys.trace.ITrace
 */
public class SegyTrace
    implements com.scoutsys.trace.ITrace, java.io.Serializable, Cloneable {
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

    /** Trace type is seismic data*/
    public static final short SEISMICDATA = 1;
    /** Trace type is dead*/
    public static final short DEAD = 2;
    /** Trace type is dummy*/
    public static final short DUMMY = 3;
    /** Trace type is time break*/
    public static final short TIMEBREAK = 4;
    /** Trace type is uphole*/
    public static final short UPHOLE = 5;
    /** Trace type is sweep*/
    public static final short SWEEP = 6;
    /** Trace type is timing*/
    public static final short TIMING = 7;
    /** Trace type is water break*/
    public static final short WATERBREAK = 8;

    /** Usage type is production*/
    public static final short PRODUCTION = 1;
    /** Usage type is test*/
    public static final short TEST = 2;

    /** Coordinate type is length*/
    public static final short LENGTH = 1;
    /** Coordinate type is seconds of arc*/
    public static final short SECONDS = 2;

    /** Gain type is fixed*/
    public static final short GAINFIXED = 1;
    /** Gain type is binary*/
    public static final short GAINBINARY = 2;
    /** Gain type is floating point*/
    public static final short GAINFLOATINGPOINT = 3;

    /** Time type is local*/
    public static final short LOCALTIME = 1;
    /** Time type is Greenwich Mean Time*/
    public static final short GMT = 2;

    /** Overtravel type is down or behind*/
    public static final short BEHIND = 1;
    /** Overtravel type is up or ahead*/
    public static final short AHEAD = 2;

    /** The array of samples.*/
    public float[] samples = new float[0];

    /**	trace sequence number within line. */
    public int seqNumLine = 0;

    /**	trace sequence number within reel. */
    public int seqNumReel = 0;

    /**	field record number. */
    public int fieldFileNum = 0;

    /**	trace number within field record. */
    public int seqNumFieldFile = 0;

    /** energy source point number. */
    public int sourcePointNum = 0;

    /** CDP ensemble number.*/
    public int cmpNum = 0;

    /** trace number within CDP ensemble.*/
    public int seqNumCMP = 0;

    /** trace identification code. May be 
    	<CODE>
    	SEISMICDATA,
    	DEAD,
    	DUMMY,
    	TIMEBREAK,
    	UPHOLE,
    	SWEEP,
    	TIMING,
    	WATERBREAK,	</CODE>
    	or other.*/

    public short traceIDCode = 0;

    /** number of vertically summed traces.*/
    public short numVerticalSum = 0;

    /** number of horizontally summed traces.*/
    public short numHorizontalSum = 0;

    /** data use. May be <code>PRODUCTION</code> or <code>TEST</code>. */
    public short dataUse = 0;

    /** distance from source point to receiver
    		   group. (negative if opposite to direction
    		   in which the line was shot).*/
    public int offset = 0;

    /**  receiver group elevation from sea level.
    		   (above sea level is positive) .*/
    public int groupElevation = 0;

    /** source elevation from sea level.
    		   (above sea level is positive).*/
    public int sourceElevation = 0;

    /** source depth (positive).*/
    public int sourceDepth = 0;

    /** datum elevation at receiver group.*/
    public int groupDatumElevation = 0;

    /** datum elevation at source.*/
    public int sourceDatumElevation = 0;

    /** water depth at source.*/
    public int sourceWaterDepth = 0;

    /** water depth at receiver group.*/
    public int groupWaterDepth = 0;

    /** scale factor for 
    	<code>
    	groupElevation,
    	sourceElevation,
    	sourceDepth,
    	groupDatumElevation,
    	sourceDatumElevation,
    	sourceWaterDepth,
    	</code> and <code>
    	groupWaterDepth</code>.
    
    	Value plus or minus 10 to the
    	power 0, 1, 2, 3, or 4 (if positive,
    	multiply, if negative divide).*/

    public short elevationScale = 0;

    /** scale factor for 
    	<code>
    	coordinateScale,
    	sourceX,
    	</code> and <code>
    	sourceY</code>.
    
    	Value plus or minus 10 to the
    	power 0, 1, 2, 3, or 4 (if positive,
    	multiply, if negative divide).*/

    public short coordinateScale = 0;

    /** X source coordinate.*/
    public int sourceX = 0;

    /** Y source coordinate.*/
    public int sourceY = 0;

    /** X group coordinate.*/
    public int groupX = 0;

    /** Y group coordinate.*/
    public int groupY = 0;

    /** coordinate units code for 
    	<code>
    	coordinateScale,
    	sourceX,
    	</code> and <code>
    	sourceY</code>.
    
    	May be LENGTH (meters or feet) or SECONDS
    	(of arc) (in this case, the
    	X values are longitude and the Y values
    	are latitude, a positive value designates
    	the number of seconds east of Greenwich
    	or north of the equator.
    
    
    */
    public short coordinateUnits = 0;

    /** weathering velocity.*/
    public short weatheringVelocity = 0;

    /** subweathering velocity.*/
    public short subweatheringVelocity = 0;

    /** uphole time at source.*/
    public short sourceUpholeTime = 0;

    /** uphole time at receiver group.*/
    public short groupUpholeTime = 0;

    /** source static correction.*/
    public short sourceStatic = 0;

    /** uphole time at receiver group.*/
    public short groupStatic = 0;

    /** total static applied.*/
    public short totalStatic = 0;

    /** lag time A. Time in ms between end of 240-
    		   byte trace identification header and time
    		   break, positive if time break occurs after
    		   end of header, time break is defined as
    		   the initiation pulse which maybe recorded
    		   on an auxiliary trace or as otherwise
    		   specified by the recording system.*/
    public short lagTimeA = 0;

    /** lag time B. Time in ms between the time break
    		   and the initiation time of the energy source,
    		   may be positive or negative .*/
    public short lagTimeB = 0;

    /** delay recording time. Time in ms between
    		   initiation time of energy source and time
    		   when recording of data samples begins
    		   (for deep water work if recording does not
    		   start at zero time).*/
    public short delay = 0;

    /** mute time--start.*/
    public short muteStart = 0;

    /** mute time--end.*/
    public short muteEnd = 0;

    /** number of samples in this trace.*/
    public int numSamples = 0;

    /** sample interval in microseconds.*/
    public short sampleInterval = 1000;

    /** gain type of field instruments. May be
    	<code>GAINFIXED,GAINBINARY,GAINFLOATINGPOINT,</code>
    	or other.*/
    public short gainType = 0;

    /** instrument gain constant.*/
    public short gainConstant = 0;

    /** instrument early or initial gain.*/
    public short earlyGain = 0;

    /** correlated.*/
    public boolean correlated = false;

    /** sweep frequency at start.*/
    public short sweepFrequencyStart = 0;

    /** sweep frequency at end.*/
    public short sweepFrequencyEnd = 0;

    /** sweep length in ms.*/
    public short sweepTime = 0;

    /**	sweep type code.
    	May be <code>LINEARSWEEP, PARABOLICSWEEP, EXPONENTIALSWEEP, </code>or other.*/
    public short sweepType = 0;

    /** sweep taper length at start in ms .*/
    public short sweepTaperLengthStart = 0;

    /** sweep taper length at end in ms.*/
    public short sweepTaperLengthEnd = 0;

    /** taper type. May be <code>LINEARTAPER, COSSQTAPER</code>, or other.*/
    public short sweepTaperType = 0;

    /** alias filter frequency if used.*/
    public short aliasFilterFrequency = 0;

    /** alias filter slope.*/
    public short aliasFilterSlope = 0;

    /** notch filter frequency if used.*/
    public short notchFilterFrequency = 0;

    /** notch filter slope.*/
    public short notchFilterSlope = 0;

    /** low cut frequency if used.*/
    public short lowCutFrequency = 0;

    /** high cut frequncy if used.*/
    public short highCutFrequency = 0;

    /** low cut slope.*/
    public short lowCutSlope = 0;

    /** high cut slope.*/
    public short highCutSlope = 0;

    /** year data recorded.*/
    public short year = 0;

    /** day of year.*/
    public short day = 0;

    /** hour of day (24 hour clock).*/
    public short hour = 0;

    /** minute of hour.*/
    public short minute = 0;

    /** second of minute .*/
    public short second = 0;

    /** time basis code. May be <CODE>LOCALTIME, GMT</CODE>.*/
    public short timeBasis = 0;

    /** trace weighting factor. Defined as 1/2^N
    		   volts for the least sigificant bit.*/
    public short traceWeightingFactor = 0;

    /** geophone group number of roll switch
    		   position one.*/
    public short rollFirstGroupNum = 0;

    /** geophone group number of trace one within
    		   original field record.*/
    public short fieldFileFirstGroupNum = 0;

    /** geophone group number of last trace within
    		   original field record.*/
    public short fieldFileLastGroupNum = 0;

    /** gap size. (total number of groups dropped).*/
    public short gapSize = 0;

    /** overtravel taper code. May be BEHIND, AHEAD */
    public short overtravel = 0;

    /**
     * Overriden to perform a deep copy so that samples are cloned too.
     * @return copy of this trace
     */
    public Object clone() {
        SegyTrace tr;
        try {
            tr = (SegyTrace) super.clone();
            tr.samples = (float[]) tr.samples.clone();
        } catch (CloneNotSupportedException x) {
            tr = new SegyTrace();
        }
        return tr;
    }
    /**
     * Load this trace from the elements in the raw SEG-Y image byte array.
     * 
     * @param bytes array of bytes read from a SEG-Y file
     * @param offs offset to the first byte within the array to process
     * @param len number of bytes to process
     * 
     */
    public void fromBytes(byte[] bytes, int offs, int len, boolean swap)
        throws IOException {
        traceHeaderFromBytes(bytes, offs, len, swap);
        samplesFromBytes(bytes, offs, len);
        // todo: swap samples
    }
    /**
     * Get the delay recording time in milliseconds
     * @return delay recording time in milliseconds
     */
    public int getDelayMS() {
        return delay;
    }
    /**
     * Return the sample interval, in microseconds.
     * @return the sample interval in microseconds
     */
    public double getSampleInterval() {
        return this.sampleInterval;
    }
    /**
     * Return the samples as an array of <code>float</code>.
     * @return the array of samples 
     */
    public float[] getSamples() {
        return this.samples;
    }
    private void samplesFromBytes(byte[] bytes, int offs, int len) {
        numSamples = (len - 240) / 4;
        samples = new float[numSamples];
        IBMFloat ibm = new IBMFloat();
        for (int i = 0; i < numSamples; i++) {
            ibm.fromBytes(bytes, offs + 240 + i * 4);
            samples[i] = ibm.toFloat();
        }
    }
    /**
     * Set the delay recording time in milliseconds
     * @param delayMS delay recording time in milliseconds
     */
    public void setDelayMS(int delayMS) {
        delay = (short) delayMS;
    }
    /**
     * Set the sample interval, in microseconds.
     * @param sampleInterval the new sample interval in microseconds
     */
    public void setSampleInterval(double sampleInterval) {
        this.sampleInterval = (short) sampleInterval;
    }
    /**
     * Set the samples to the given array of <code>float</code>. 
     * @param samples new array of samples
     */
    public void setSamples(float[] samples) {
        this.samples = samples;
    }
    /**
     * Save this trace to the byte array as a raw SEG-Y image.
     * @return the bytes to write to the SEG-Y file
     */
    public byte[] toBytes(boolean bSwap) throws IOException {
        Swap swap;
        if (bSwap) {
            swap = new DoSwap();
        } else {
            swap = new Swap();
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new java.io.DataOutputStream(baos);

        /**	trace sequence number within line. */
        dos.writeInt(swap.swap(seqNumLine));

        /**	trace sequence number within reel. */
        dos.writeInt(swap.swap(seqNumReel));

        /**	field record number. */
        dos.writeInt(swap.swap(fieldFileNum));

        /**	trace number within field record. */
        dos.writeInt(swap.swap(seqNumFieldFile));

        /** energy source point number. */
        dos.writeInt(swap.swap(sourcePointNum));

        /** CDP ensemble number.*/
        dos.writeInt(swap.swap(cmpNum));

        /** trace number within CDP ensemble.*/
        dos.writeInt(swap.swap(seqNumCMP));

        /** trace identification code. May be 
        	<CODE>
        	SEISMICDATA,
        	DEAD,
        	DUMMY,
        	TIMEBREAK,
        	UPHOLE,
        	SWEEP,
        	TIMING,
        	WATERBREAK,	</CODE>
        	or other.*/

        dos.writeShort(swap.swap(traceIDCode));

        /** number of vertically summed traces.*/
        dos.writeShort(swap.swap(numVerticalSum));

        /** number of horizontally summed traces.*/
        dos.writeShort(swap.swap(numHorizontalSum));

        /** data use. May be <code>PRODUCTION</code> or <code>TEST</code>. */
        dos.writeShort(swap.swap(dataUse));

        /** distance from source point to receiver
        		   group. (negative if opposite to direction
        		   in which the line was shot).*/
        dos.writeInt(swap.swap(offset));

        /**  receiver group elevation from sea level.
        		   (above sea level is positive) .*/
        dos.writeInt(swap.swap(groupElevation));

        /** source elevation from sea level.
        		   (above sea level is positive).*/
        dos.writeInt(swap.swap(sourceElevation));

        /** source depth (positive).*/
        dos.writeInt(swap.swap(sourceDepth));

        /** datum elevation at receiver group.*/
        dos.writeInt(swap.swap(groupDatumElevation));

        /** datum elevation at source.*/
        dos.writeInt(swap.swap(sourceDatumElevation));

        /** water depth at source.*/
        dos.writeInt(swap.swap(sourceWaterDepth));

        /** water depth at receiver group.*/
        dos.writeInt(swap.swap(groupWaterDepth));

        /** scale factor for 
        	<code>
        	groupElevation,
        	sourceElevation,
        	sourceDepth,
        	groupDatumElevation,
        	sourceDatumElevation,
        	sourceWaterDepth,
        	</code> and <code>
        	groupWaterDepth</code>.
        
        	Value plus or minus 10 to the
        	power 0, 1, 2, 3, or 4 (if positive,
        	multiply, if negative divide).*/

        dos.writeShort(swap.swap(elevationScale));

        /** scale factor for 
        	<code>
        	coordinateScale,
        	sourceX,
        	</code> and <code>
        	sourceY</code>.
        
        	Value plus or minus 10 to the
        	power 0, 1, 2, 3, or 4 (if positive,
        	multiply, if negative divide).*/

        dos.writeShort(swap.swap(coordinateScale));

        /** X source coordinate.*/
        dos.writeInt(swap.swap(sourceX));

        /** Y source coordinate.*/
        dos.writeInt(swap.swap(sourceY));

        /** X group coordinate.*/
        dos.writeInt(swap.swap(groupX));

        /** Y group coordinate.*/
        dos.writeInt(swap.swap(groupY));

        /** coordinate units code for 
        	<code>
        	coordinateScale,
        	sourceX,
        	</code> and <code>
        	sourceY</code>.
        
        	May be LENGTH (meters or feet) or SECONDS
        	(of arc) (in this case, the
        	X values are longitude and the Y values
        	are latitude, a positive value designates
        	the number of seconds east of Greenwich
        	or north of the equator.
        
        
        */
        dos.writeShort(swap.swap(coordinateUnits));

        /** weathering velocity.*/
        dos.writeShort(swap.swap(weatheringVelocity));

        /** subweathering velocity.*/
        dos.writeShort(swap.swap(subweatheringVelocity));

        /** uphole time at source.*/
        dos.writeShort(swap.swap(sourceUpholeTime));

        /** uphole time at receiver group.*/
        dos.writeShort(swap.swap(groupUpholeTime));

        /** source static correction.*/
        dos.writeShort(swap.swap(sourceStatic));

        /** uphole time at receiver group.*/
        dos.writeShort(swap.swap(groupStatic));

        /** total static applied.*/
        dos.writeShort(swap.swap(totalStatic));

        /** lag time A. Time in ms between end of 240-
        		   byte trace identification header and time
        		   break, positive if time break occurs after
        		   end of header, time break is defined as
        		   the initiation pulse which maybe recorded
        		   on an auxiliary trace or as otherwise
        		   specified by the recording system.*/
        dos.writeShort(swap.swap(lagTimeA));

        /** lag time B. Time in ms between the time break
        		   and the initiation time of the energy source,
        		   may be positive or negative .*/
        dos.writeShort(swap.swap(lagTimeB));

        /** delay recording time. Time in ms between
        		   initiation time of energy source and time
        		   when recording of data samples begins
        		   (for deep water work if recording does not
        		   start at zero time).*/
        dos.writeShort(swap.swap(delay));

        /** mute time--start.*/
        dos.writeShort(swap.swap(muteStart));

        /** mute time--end.*/
        dos.writeShort(swap.swap(muteEnd));

        /** number of samples in this trace.*/
        dos.writeShort(swap.swap(numSamples));

        /** sample interval in microseconds.*/
        dos.writeShort(swap.swap(sampleInterval));

        /** gain type of field instruments. May be
        	<code>GAINFIXED,GAINBINARY,GAINFLOATINGPOINT,</code>
        	or other.*/
        dos.writeShort(swap.swap(gainType));

        /** instrument gain constant.*/
        dos.writeShort(swap.swap(gainConstant));

        /** instrument early or initial gain.*/
        dos.writeShort(swap.swap(earlyGain));

        /** correlated.*/
        //dos.writeShort(correlated?

        /** sweep frequency at start.*/
        dos.writeShort(swap.swap(sweepFrequencyStart));

        /** sweep frequency at end.*/
        dos.writeShort(swap.swap(sweepFrequencyEnd));

        /** sweep length in ms.*/
        dos.writeShort(swap.swap(sweepTime));

        /**	sweep type code.
        	May be <code>LINEARSWEEP, PARABOLICSWEEP, EXPONENTIALSWEEP, </code>or other.*/
        dos.writeShort(swap.swap(sweepType));

        /** sweep taper length at start in ms .*/
        dos.writeShort(swap.swap(sweepTaperLengthStart));

        /** sweep taper length at end in ms.*/
        dos.writeShort(swap.swap(sweepTaperLengthEnd));

        /** taper type. May be <code>LINEARTAPER, COSSQTAPER</code>, or other.*/
        dos.writeShort(swap.swap(sweepTaperType));

        /** alias filter frequency if used.*/
        dos.writeShort(swap.swap(aliasFilterFrequency));

        /** alias filter slope.*/
        dos.writeShort(swap.swap(aliasFilterSlope));

        /** notch filter frequency if used.*/
        dos.writeShort(swap.swap(notchFilterFrequency));

        /** notch filter slope.*/
        dos.writeShort(swap.swap(notchFilterSlope));

        /** low cut frequency if used.*/
        dos.writeShort(swap.swap(lowCutFrequency));

        /** high cut frequncy if used.*/
        dos.writeShort(swap.swap(highCutFrequency));

        /** low cut slope.*/
        dos.writeShort(swap.swap(lowCutSlope));

        /** high cut slope.*/
        dos.writeShort(swap.swap(highCutSlope));

        /** year data recorded.*/
        dos.writeShort(swap.swap(year));

        /** day of year.*/
        dos.writeShort(swap.swap(day));

        /** hour of day (24 hour clock).*/
        dos.writeShort(swap.swap(hour));

        /** minute of hour.*/
        dos.writeShort(swap.swap(minute));

        /** second of minute .*/
        dos.writeShort(swap.swap(second));

        /** time basis code. May be <CODE>LOCALTIME, GMT</CODE>.*/
        dos.writeShort(swap.swap(timeBasis));

        /** trace weighting factor. Defined as 1/2^N
        		   volts for the least sigificant bit.*/
        dos.writeShort(swap.swap(traceWeightingFactor));

        /** geophone group number of roll switch
        		   position one.*/
        dos.writeShort(swap.swap(rollFirstGroupNum));

        /** geophone group number of trace one within
        		   original field record.*/
        dos.writeShort(swap.swap(fieldFileFirstGroupNum));

        /** geophone group number of last trace within
        		   original field record.*/
        dos.writeShort(swap.swap(fieldFileLastGroupNum));

        /** gap size. (total number of groups dropped).*/
        dos.writeShort(swap.swap(gapSize));

        /** overtravel taper code. May be BEHIND, AHEAD */
        dos.writeShort(swap.swap(overtravel));
        dos.flush();

        int size = baos.size();
        byte[] zeros = new byte[(int) Math.max(0, 240 - size)];
        dos.write(zeros);

        IBMFloat ibmFloat = new IBMFloat();
        byte[] bytes = new byte[4 * samples.length];
        for (int i = 0; i < samples.length; i++) {
            ibmFloat.fromFloat(samples[i]);
            ibmFloat.toBytes(bytes, i * 4);
            //Swap.swap4(bytes, 0);
        }
        dos.write(bytes);

        dos.flush();
        baos.flush();

        return baos.toByteArray();

    }

    private void traceHeaderFromBytes(
        byte[] bytes,
        int offs,
        int len,
        boolean bSwap)
        throws IOException {
        Swap swap;
        if (bSwap) {
            swap = new DoSwap();
        } else {
            swap = new Swap();
        }

        {

            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            DataInputStream dis = new DataInputStream(bais);

            /**	trace sequence number within line. */
            seqNumLine = swap.swap(dis.readInt());

            /**	trace sequence number within reel. */
            seqNumReel = swap.swap(dis.readInt());

            /**	field record number. */
            fieldFileNum = swap.swap(dis.readInt());

            /**	trace number within field record. */
            seqNumFieldFile = swap.swap(dis.readInt());

            /** energy source point number. */
            sourcePointNum = swap.swap(dis.readInt());

            /** CDP ensemble number.*/
            cmpNum = swap.swap(dis.readInt());

            /** trace number within CDP ensemble.*/
            seqNumCMP = swap.swap(dis.readInt());

            /** trace identification code. May be 
            	<CODE>
            	SEISMICDATA,
            	DEAD,
            	DUMMY,
            	TIMEBREAK,
            	UPHOLE,
            	SWEEP,
            	TIMING,
            	WATERBREAK,	</CODE>
            	or other.*/

            traceIDCode = swap.swap(dis.readShort());

            /** number of vertically summed traces.*/
            numVerticalSum = swap.swap(dis.readShort());

            /** number of horizontally summed traces.*/
            numHorizontalSum = swap.swap(dis.readShort());

            /** data use. May be <code>PRODUCTION</code> or <code>TEST</code>. */
            dataUse = swap.swap(dis.readShort());

            /** distance from source point to receiver
            		   group. (negative if opposite to direction
            		   in which the line was shot).*/
            offset = swap.swap(dis.readInt());

            /**  receiver group elevation from sea level.
            		   (above sea level is positive) .*/
            groupElevation = swap.swap(dis.readInt());

            /** source elevation from sea level.
            		   (above sea level is positive).*/
            sourceElevation = swap.swap(dis.readInt());

            /** source depth (positive).*/
            sourceDepth = swap.swap(dis.readInt());

            /** datum elevation at receiver group.*/
            groupDatumElevation = swap.swap(dis.readInt());

            /** datum elevation at source.*/
            sourceDatumElevation = swap.swap(dis.readInt());

            /** water depth at source.*/
            sourceWaterDepth = swap.swap(dis.readInt());

            /** water depth at receiver group.*/
            groupWaterDepth = swap.swap(dis.readInt());

            /** scale factor for 
            	<code>
            	groupElevation,
            	sourceElevation,
            	sourceDepth,
            	groupDatumElevation,
            	sourceDatumElevation,
            	sourceWaterDepth,
            	</code> and <code>
            	groupWaterDepth</code>.
            
            	Value plus or minus 10 to the
            	power 0, 1, 2, 3, or 4 (if positive,
            	multiply, if negative divide).*/

            elevationScale = swap.swap(dis.readShort());

            /** scale factor for 
            	<code>
            	coordinateScale,
            	sourceX,
            	</code> and <code>
            	sourceY</code>.
            
            	Value plus or minus 10 to the
            	power 0, 1, 2, 3, or 4 (if positive,
            	multiply, if negative divide).*/

            coordinateScale = swap.swap(dis.readShort());

            /** X source coordinate.*/
            sourceX = swap.swap(dis.readInt());

            /** Y source coordinate.*/
            sourceY = swap.swap(dis.readInt());

            /** X group coordinate.*/
            groupX = swap.swap(dis.readInt());

            /** Y group coordinate.*/
            groupY = swap.swap(dis.readInt());

            /** coordinate units code for 
            	<code>
            	coordinateScale,
            	sourceX,
            	</code> and <code>
            	sourceY</code>.
            
            	May be LENGTH (meters or feet) or SECONDS
            	(of arc) (in this case, the
            	X values are longitude and the Y values
            	are latitude, a positive value designates
            	the number of seconds east of Greenwich
            	or north of the equator.
            
            
            */
            coordinateUnits = swap.swap(dis.readShort());

            /** weathering velocity.*/
            weatheringVelocity = swap.swap(dis.readShort());

            /** subweathering velocity.*/
            subweatheringVelocity = swap.swap(dis.readShort());

            /** uphole time at source.*/
            sourceUpholeTime = swap.swap(dis.readShort());

            /** uphole time at receiver group.*/
            groupUpholeTime = swap.swap(dis.readShort());

            /** source static correction.*/
            sourceStatic = swap.swap(dis.readShort());

            /** uphole time at receiver group.*/
            groupStatic = swap.swap(dis.readShort());

            /** total static applied.*/
            totalStatic = swap.swap(dis.readShort());

            /** lag time A. Time in ms between end of 240-
            		   byte trace identification header and time
            		   break, positive if time break occurs after
            		   end of header, time break is defined as
            		   the initiation pulse which maybe recorded
            		   on an auxiliary trace or as otherwise
            		   specified by the recording system.*/
            lagTimeA = swap.swap(dis.readShort());

            /** lag time B. Time in ms between the time break
            		   and the initiation time of the energy source,
            		   may be positive or negative .*/
            lagTimeB = swap.swap(dis.readShort());

            /** delay recording time. Time in ms between
            		   initiation time of energy source and time
            		   when recording of data samples begins
            		   (for deep water work if recording does not
            		   start at zero time).*/
            delay = swap.swap(dis.readShort());

            /** mute time--start.*/
            muteStart = swap.swap(dis.readShort());

            /** mute time--end.*/
            muteEnd = swap.swap(dis.readShort());

            /** number of samples in this trace.*/
            numSamples = swap.swap(dis.readShort());

            /** sample interval in microseconds.*/
            sampleInterval = swap.swap(dis.readShort());

            /** gain type of field instruments. May b				<code>GAINFIXED,GAINBINARY,GAINFLOATINGPOINT,</code>
            	or other.*/
            gainType = swap.swap(dis.readShort());

            /** instrument gain constant.*/
            gainConstant = swap.swap(dis.readShort());

            /** instrument early or initial gain.*/
            earlyGain = swap.swap(dis.readShort());

            /** correlated.*/
            correlated = false;

            /** sweep frequency at start.*/
            sweepFrequencyStart = swap.swap(dis.readShort());

            /** sweep frequency at end.*/
            sweepFrequencyEnd = swap.swap(dis.readShort());

            /** sweep length in ms.*/
            sweepTime = swap.swap(dis.readShort());

            /**	sweep type code.
            	May be <code>LINEARSWEEP, PARABOLICSWEEP, EXPONENTIALSWEEP, </code>or other.*/
            sweepType = swap.swap(dis.readShort());

            /** sweep taper length at start in ms .*/
            sweepTaperLengthStart = swap.swap(dis.readShort());

            /** sweep taper length at end in ms.*/
            sweepTaperLengthEnd = swap.swap(dis.readShort());

            /** taper type. May be <code>LINEARTAPER, COSSQTAPER</code>, or other.*/
            sweepTaperType = swap.swap(dis.readShort());

            /** alias filter frequency if used.*/
            aliasFilterFrequency = swap.swap(dis.readShort());

            /** alias filter slope.*/
            aliasFilterSlope = swap.swap(dis.readShort());

            /** notch filter frequency if used.*/
            notchFilterFrequency = swap.swap(dis.readShort());

            /** notch filter slope.*/
            notchFilterSlope = swap.swap(dis.readShort());

            /** low cut frequency if used.*/
            lowCutFrequency = swap.swap(dis.readShort());

            /** high cut frequncy if used.*/
            highCutFrequency = swap.swap(dis.readShort());

            /** low cut slope.*/
            lowCutSlope = swap.swap(dis.readShort());

            /** high cut slope.*/
            highCutSlope = swap.swap(dis.readShort());

            /** year data recorded.*/
            year = swap.swap(dis.readShort());

            /** day of year.*/
            day = swap.swap(dis.readShort());

            /** hour of day (24 hour clock).*/
            hour = swap.swap(dis.readShort());

            /** minute of hour.*/
            minute = swap.swap(dis.readShort());

            /** second of minute .*/
            second = swap.swap(dis.readShort());

            /** time basis code. May be <CODE>LOCALTIME, GMT</CODE>.*/
            timeBasis = swap.swap(dis.readShort());

            /** trace weighting factor. Defined as 1/2^N
            		   volts for the least sigificant bit.*/
            traceWeightingFactor = swap.swap(dis.readShort());

            /** geophone group number of roll switch
            		   position one.*/
            rollFirstGroupNum = swap.swap(dis.readShort());

            /** geophone group number of trace one within
            		   original field record.*/
            fieldFileFirstGroupNum = swap.swap(dis.readShort());

            /** geophone group number of last trace within
            		   original field record.*/
            fieldFileLastGroupNum = swap.swap(dis.readShort());

            /** gap size. (total number of groups dropped).*/
            gapSize = swap.swap(dis.readShort());

            /** overtravel taper code. May be BEHIND, AHEAD */
            overtravel = swap.swap(dis.readShort());
        }

    }
}