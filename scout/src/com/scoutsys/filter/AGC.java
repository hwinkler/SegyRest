package com.scoutsys.filter;

import com.scoutsys.trace.ITrace;

public class AGC {

    int m_applyTimeMS = 100000;
    int m_gateLengthMS = 0;
    int m_startTimeMS = 0;

    private float[] agcOneTrace(float[] trc, int n, double siMS) {

        float[] wrk = new float[n];
        float[] retVal = new float[n];

        int gateSamples = (int) (m_gateLengthMS / siMS);
        int applySamples = (int) (m_applyTimeMS / siMS);
        int startSamples = (int) (m_startTimeMS / siMS);
        int halfGateSamples = (int) (gateSamples / 2);

        int startGate = startSamples - halfGateSamples;
        int stopGate = startSamples + halfGateSamples;
        int stopSamples = Math.min(n, startSamples + applySamples);

        // n.b. use (float)0. instead of 0.f to workaround VAJ bug
        float e = (float) 0.;
        for (int i = 0; i < n; i++) {
            e += Math.abs(trc[i]);
            wrk[i] = e;
        }

        for (int i = startSamples; i < stopSamples; i++) {
            float e1 = (startGate >= 0) ? wrk[startGate] : (float) 0.;
            float e2 = (stopGate < n) ? wrk[stopGate] : wrk[n - 1];
            float eWind = e2 - e1;
            float scale =
                (eWind != ((float) 0.)) ? (((float) 1) / eWind) : (float) 0.;

            retVal[i] = trc[i] * scale;

            startGate++;
            stopGate++;
        }
        return retVal;
    }
    private ITrace agcOneTrace(ITrace trace) {
        ITrace outTrace = (ITrace) trace.clone();
        float[] trc = outTrace.getSamples();
        int n = trc.length;

        double siMS = outTrace.getSampleInterval();
        siMS *= .001;
        outTrace.setSamples(agcOneTrace(trc, n, siMS));
        return outTrace;
    }
    public ITrace[] apply(ITrace[] inTraces)
        throws CloneNotSupportedException {

        int numTraces = inTraces.length;
        ITrace[] retVal = (ITrace[]) inTraces.clone();
        for (int iTrace = 0; iTrace < numTraces; iTrace++) {
            retVal[iTrace] = apply(retVal[iTrace]);
        }
        return retVal;
    }
    public ITrace apply(ITrace inTrace) throws CloneNotSupportedException {
        ITrace outTrace = agcOneTrace(inTrace);
        return outTrace;
    }
    public int getApplyTimeMS() {

        return m_applyTimeMS;

    }
    public int getGateLengthMS() {
        return m_gateLengthMS;
    }
    public int getStartTimeMS() {
        return m_startTimeMS;
    }
    public void setApplyTimeMS(int timeMS) {
        m_applyTimeMS = timeMS;
    }
    public void setGateLengthMS(int timeMS) {
        m_gateLengthMS = timeMS;
    }
    public void setStartTimeMS(int timeMS) {
        m_startTimeMS = timeMS;
    }
}