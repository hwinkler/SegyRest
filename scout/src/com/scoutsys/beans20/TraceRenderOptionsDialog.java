package com.scoutsys.beans20;

/**
 * This type was created in VisualAge.
 */
public class TraceRenderOptionsDialog
    extends javax.swing.JDialog
    implements
        javax.swing.event.ChangeListener,
        java.awt.event.ActionListener,
        java.awt.event.ItemListener,
        java.beans.PropertyChangeListener {
    private javax.swing.JButton ivjBtnApply = null;
    private javax.swing.JButton ivjBtnCancel = null;
    private javax.swing.JButton ivjBtnOK = null;
    private javax.swing.JPanel ivjJDialogContentPane = null;
    private javax.swing.JTabbedPane ivjJTabbedPane1 = null;
    private javax.swing.JPanel ivjPgGeneral = null;
    private javax.swing.JCheckBox ivjChkFillRight = null;
    private javax.swing.JCheckBox ivjChkPositiveRight = null;
    private javax.swing.JLabel ivjJLabel1 = null;
    private javax.swing.JLabel ivjJLabel2 = null;
    private javax.swing.JLabel ivjJLabel3 = null;
    private javax.swing.JRadioButton ivjRdoScaleAll = null;
    private javax.swing.JRadioButton ivjRdoScaleEach = null;
    private javax.swing.JPanel ivjJPanel2 = null;
    private NumberField ivjNbrTPI = null;
    private NumberField ivjNbrIPS = null;
    private NumberField ivjNbrOlap = null;
    protected transient java.beans.PropertyChangeSupport propertyChange;
    private javax.swing.JRadioButton ivjRdoScaleConst = null;
    private com.scoutsys.render.TraceRenderOptions fieldTraceRenderOptions =
        new com.scoutsys.render.TraceRenderOptions();
    private boolean ivjConnPtoP1Aligning = false;
    private boolean ivjConnPtoP2Aligning = false;
    private boolean ivjConnPtoP3Aligning = false;
    private boolean ivjConnPtoP4Aligning = false;
    private com.scoutsys.render.TraceRenderOptions ivjTraceRenderOptions1 =
        null;
    private NumberField ivjNbrScaleMaxValue = null;
    private boolean ivjConnPtoP7Aligning = false;
    private boolean ivjConnPtoP8Aligning = false;
    private IndexedButtonGroup ivjIndexedButtonGroup = null;
    private javax.swing.JLabel ivjLabel1 = null;
    private javax.swing.JPanel ivjPgColor = null;
    private ColorModelComponent ivjColorBean = null;
    private javax.swing.JComboBox ivjCboFile = null;
    private boolean ivjConnPtoP9Aligning = false;
    protected transient java.util.Vector aChangeListener = null;
    private javax.swing.JCheckBox ivjChkUseColor = null;
    private javax.swing.JCheckBox ivjJCheckBox1 = null;
    private javax.swing.JCheckBox ivjChkAreaFill = null;
    private IntBool ivjIntBool = null;
    private boolean ivjConnPtoP11Aligning = false;
    private boolean ivjConnPtoP12Aligning = false;
    private boolean ivjConnPtoP13Aligning = false;
    private boolean ivjConnPtoP5Aligning = false;
    private boolean ivjConnPtoP6Aligning = false;
    private javax.swing.JLabel ivjJLabel4 = null;
    private javax.swing.JLabel ivjJLabel41 = null;
    private javax.swing.JPanel ivjJPanel1 = null;
    private NumberField ivjNbrMajorInterval = null;
    private NumberField ivjNbrMinorInterval = null;
    private boolean ivjConnPtoP14Aligning = false;
    private boolean ivjConnPtoP15Aligning = false;
    private boolean ivjConnPtoP10Aligning = false;
    private javax.swing.JButton ivjbtnDEBUG = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public TraceRenderOptionsDialog() {
        super();
        initialize();
    }
    /**
     * TraceRenderOptionsDialog constructor comment.
     * @param owner java.awt.Frame
     */
    public TraceRenderOptionsDialog(java.awt.Frame owner) {
        super(owner);
    }
    /**
     * TraceRenderOptionsDialog constructor comment.
     * @param owner java.awt.Frame
     * @param title java.lang.String
     */
    public TraceRenderOptionsDialog(java.awt.Frame owner, String title) {
        super(owner, title);
    }
    /**
     * TraceRenderOptionsDialog constructor comment.
     * @param owner java.awt.Frame
     * @param title java.lang.String
     * @param modal boolean
     */
    public TraceRenderOptionsDialog(
        java.awt.Frame owner,
        String title,
        boolean modal) {
        super(owner, title, modal);
    }
    /**
     * TraceRenderOptionsDialog constructor comment.
     * @param owner java.awt.Frame
     * @param modal boolean
     */
    public TraceRenderOptionsDialog(java.awt.Frame owner, boolean modal) {
        super(owner, modal);
    }
    /**
     * Method to handle events for the ActionListener interface.
     * @param e java.awt.event.ActionEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == getbtnDEBUG())) {
            connEtoC1(e);
        }
        if ((e.getSource() == getBtnApply())) {
            connEtoC3(e);
        }
        if ((e.getSource() == getBtnOK())) {
            connEtoC4(e);
        }
        if ((e.getSource() == getBtnCancel())) {
            connEtoC5(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Add a javax.swing.event.ChangeListener.
     */
    public void addChangeListener(
        javax.swing.event.ChangeListener newListener) {
        if (aChangeListener == null) {
            aChangeListener = new java.util.Vector();
        };
        aChangeListener.addElement(newListener);
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * Comment
     */
    public void btnApply_ActionPerformed(
        java.awt.event.ActionEvent actionEvent) {
        this.fireStateChanged(new javax.swing.event.ChangeEvent(this));
    }
    /**
     * Comment
     */
    public void btnCancel_ActionEvents() {
        this.dispose();
        return;
    }
    /**
     * Comment
     */
    public void btnCancel_ActionPerformed(
        java.awt.event.ActionEvent actionEvent) {
        this.dispose();
        return;
    }
    /**
     * Comment
     */
    public void btnOK_ActionPerformed(java.awt.event.ActionEvent actionEvent) {
        this.fireStateChanged(new javax.swing.event.ChangeEvent(this));
        this.dispose();
    }
    /**
     * Comment
     */
    public void cboFile_ItemStateChanged(java.awt.event.ItemEvent itemEvent) {

        java.awt.image.IndexColorModel colorModel =
            (java.awt.image.IndexColorModel) com
                .scoutsys
                .render
                .TraceRenderOptions
                .loadColors(
                    getClass().getResource(itemEvent.getItem().toString()));

        getColorBean().setColorModelToDraw(colorModel);
        getTraceRenderOptions().setColorModel(colorModel);
        return;
    }
    /**
     * connEtoC1:  (JButton1.action.actionPerformed(java.awt.event.ActionEvent) --> TraceRenderOptionsDialog.jButton1_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
     * @param arg1 java.awt.event.ActionEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC1(java.awt.event.ActionEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.jButton1_ActionPerformed(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC2:  (CboFile.item.itemStateChanged(java.awt.event.ItemEvent) --> TraceRenderOptionsDialog.cboFile_ItemStateChanged(Ljava.awt.event.ItemEvent;)V)
     * @param arg1 java.awt.event.ItemEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC2(java.awt.event.ItemEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.cboFile_ItemStateChanged(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC3:  (BtnApply.action.actionPerformed(java.awt.event.ActionEvent) --> TraceRenderOptionsDialog.btnApply_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
     * @param arg1 java.awt.event.ActionEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC3(java.awt.event.ActionEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.btnApply_ActionPerformed(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC4:  (BtnOK.action.actionPerformed(java.awt.event.ActionEvent) --> TraceRenderOptionsDialog.btnOK_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
     * @param arg1 java.awt.event.ActionEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC4(java.awt.event.ActionEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.btnOK_ActionPerformed(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC5:  (BtnCancel.action.actionPerformed(java.awt.event.ActionEvent) --> TraceRenderOptionsDialog.btnCancel_ActionPerformed(Ljava.awt.event.ActionEvent;)V)
     * @param arg1 java.awt.event.ActionEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC5(java.awt.event.ActionEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.btnCancel_ActionPerformed(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP10SetSource:  (TraceRenderOptions1.doColor <--> ChkUseColor.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP10SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP10Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP10Aligning = true;
                getTraceRenderOptions1().setDoColor(
                    getChkUseColor().isSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP10Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP10Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP10SetTarget:  (TraceRenderOptions1.doColor <--> ChkUseColor.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP10SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP10Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP10Aligning = true;
                getChkUseColor().setSelected(
                    getTraceRenderOptions1().isDoColor());
                // user code begin {2}
                // user code end
                ivjConnPtoP10Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP10Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP11SetSource:  (TraceRenderOptions1.doWiggle <--> JCheckBox1.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP11SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP11Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP11Aligning = true;
                getTraceRenderOptions1().setDoWiggle(
                    getJCheckBox1().isSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP11Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP11Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP11SetTarget:  (TraceRenderOptions1.doWiggle <--> JCheckBox1.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP11SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP11Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP11Aligning = true;
                getJCheckBox1().setSelected(
                    getTraceRenderOptions1().isDoWiggle());
                // user code begin {2}
                // user code end
                ivjConnPtoP11Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP11Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP12SetSource:  (TraceRenderOptions1.fillPercent <--> IntBool.intVal)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP12SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP12Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP12Aligning = true;
                getTraceRenderOptions1().setFillPercent(
                    getIntBool().getIntVal());
                // user code begin {2}
                // user code end
                ivjConnPtoP12Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP12Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP12SetTarget:  (TraceRenderOptions1.fillPercent <--> IntBool.intVal)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP12SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP12Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP12Aligning = true;
                getIntBool().setIntVal(
                    getTraceRenderOptions1().getFillPercent());
                // user code begin {2}
                // user code end
                ivjConnPtoP12Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP12Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP13SetSource:  (IntBool.boolVal <--> ChkAreaFill.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP13SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP13Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP13Aligning = true;
                getIntBool().setBoolVal(getChkAreaFill().isSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP13Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP13Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP13SetTarget:  (IntBool.boolVal <--> ChkAreaFill.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP13SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP13Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP13Aligning = true;
                getChkAreaFill().setSelected(getIntBool().getBoolVal());
                // user code begin {2}
                // user code end
                ivjConnPtoP13Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP13Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP14SetSource:  (NbrMajorInterval.intValue <--> TraceRenderOptions1.majorTimingLineIntervalMS)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP14SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP14Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP14Aligning = true;
                getTraceRenderOptions1().setMajorTimingLineIntervalMS(
                    getNbrMajorInterval().getIntValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP14Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP14Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP14SetTarget:  (NbrMajorInterval.intValue <--> TraceRenderOptions1.majorTimingLineIntervalMS)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP14SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP14Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP14Aligning = true;
                getNbrMajorInterval().setIntValue(
                    getTraceRenderOptions1().getMajorTimingLineIntervalMS());
                // user code begin {2}
                // user code end
                ivjConnPtoP14Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP14Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP15SetSource:  (NbrMinorInterval.intValue <--> TraceRenderOptions1.minorTimingLineIntervalMS)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP15SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP15Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP15Aligning = true;
                getTraceRenderOptions1().setMinorTimingLineIntervalMS(
                    getNbrMinorInterval().getIntValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP15Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP15Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP15SetTarget:  (NbrMinorInterval.intValue <--> TraceRenderOptions1.minorTimingLineIntervalMS)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP15SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP15Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP15Aligning = true;
                getNbrMinorInterval().setIntValue(
                    getTraceRenderOptions1().getMinorTimingLineIntervalMS());
                // user code begin {2}
                // user code end
                ivjConnPtoP15Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP15Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP1SetSource:  (TraceRenderOptionsDialog.traceRenderOptions <--> TraceRenderOptions1.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                this.setTraceRenderOptions(getTraceRenderOptions1());
                // user code begin {2}
                // user code end
                ivjConnPtoP1Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP1Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP1SetTarget:  (TraceRenderOptionsDialog.traceRenderOptions <--> TraceRenderOptions1.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                setTraceRenderOptions1(this.getTraceRenderOptions());
                // user code begin {2}
                // user code end
                ivjConnPtoP1Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP1Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP2SetSource:  (TraceRenderOptions1.tracesPerInch <--> NbrTPI.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP2SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP2Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP2Aligning = true;
                getTraceRenderOptions1().setTracesPerInch(
                    getNbrTPI().getValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP2Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP2Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP2SetTarget:  (TraceRenderOptions1.tracesPerInch <--> NbrTPI.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP2SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP2Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP2Aligning = true;
                getNbrTPI().setValue(
                    getTraceRenderOptions1().getTracesPerInch());
                // user code begin {2}
                // user code end
                ivjConnPtoP2Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP2Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP3SetSource:  (TraceRenderOptions1.inchesPerSecond <--> NbrIPS.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP3SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP3Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP3Aligning = true;
                getTraceRenderOptions1().setInchesPerSecond(
                    getNbrIPS().getValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP3Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP3Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP3SetTarget:  (TraceRenderOptions1.inchesPerSecond <--> NbrIPS.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP3SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP3Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP3Aligning = true;
                getNbrIPS().setValue(
                    getTraceRenderOptions1().getInchesPerSecond());
                // user code begin {2}
                // user code end
                ivjConnPtoP3Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP3Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP4SetSource:  (NbrOlap.intValue <--> TraceRenderOptions1.overlapPercent)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP4SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP4Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP4Aligning = true;
                getNbrOlap().setIntValue(
                    getTraceRenderOptions1().getOverlapPercent());
                // user code begin {2}
                // user code end
                ivjConnPtoP4Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP4Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP4SetTarget:  (NbrOlap.intValue <--> TraceRenderOptions1.overlapPercent)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP4SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP4Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP4Aligning = true;
                getTraceRenderOptions1().setOverlapPercent(
                    getNbrOlap().getIntValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP4Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP4Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP5SetSource:  (TraceRenderOptions1.fillRight <--> ChkFillRight.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP5SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP5Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP5Aligning = true;
                getTraceRenderOptions1().setFillRight(
                    getChkFillRight().isSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP5Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP5Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP5SetTarget:  (TraceRenderOptions1.fillRight <--> ChkFillRight.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP5SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP5Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP5Aligning = true;
                getChkFillRight().setSelected(
                    getTraceRenderOptions1().isFillRight());
                // user code begin {2}
                // user code end
                ivjConnPtoP5Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP5Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP6SetSource:  (TraceRenderOptions1.positiveRight <--> ChkPositiveRight.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP6SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP6Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP6Aligning = true;
                getTraceRenderOptions1().setPositiveRight(
                    getChkPositiveRight().isSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP6Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP6Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP6SetTarget:  (TraceRenderOptions1.positiveRight <--> ChkPositiveRight.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP6SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP6Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP6Aligning = true;
                getChkPositiveRight().setSelected(
                    getTraceRenderOptions1().isPositiveRight());
                // user code begin {2}
                // user code end
                ivjConnPtoP6Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP6Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP7SetSource:  (TraceRenderOptions1.scaleMaxValue <--> NbrScaleMaxValue.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP7SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP7Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP7Aligning = true;
                getTraceRenderOptions1().setScaleMaxValue(
                    getNbrScaleMaxValue().getValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP7Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP7Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP7SetTarget:  (TraceRenderOptions1.scaleMaxValue <--> NbrScaleMaxValue.value)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP7SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP7Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP7Aligning = true;
                getNbrScaleMaxValue().setValue(
                    getTraceRenderOptions1().getScaleMaxValue());
                // user code begin {2}
                // user code end
                ivjConnPtoP7Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP7Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP8SetSource:  (TraceRenderOptions1.scaleType <--> IndexedButtonGroup.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP8SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP8Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP8Aligning = true;
                getTraceRenderOptions1().setScaleType(
                    getIndexedButtonGroup().getSelected());
                // user code begin {2}
                // user code end
                ivjConnPtoP8Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP8Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP8SetTarget:  (TraceRenderOptions1.scaleType <--> IndexedButtonGroup.selected)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP8SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP8Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP8Aligning = true;
                getIndexedButtonGroup().setSelected(
                    getTraceRenderOptions1().getScaleType());
                // user code begin {2}
                // user code end
                ivjConnPtoP8Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP8Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP9SetSource:  (TraceRenderOptions1.colorModel <--> ColorBean.colorModelToDraw)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP9SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP9Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP9Aligning = true;
                getTraceRenderOptions1().setColorModel(
                    (java.awt.image.IndexColorModel) getColorBean()
                        .getColorModelToDraw());
                // user code begin {2}
                // user code end
                ivjConnPtoP9Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP9Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP9SetTarget:  (TraceRenderOptions1.colorModel <--> ColorBean.colorModelToDraw)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP9SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP9Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP9Aligning = true;
                getColorBean().setColorModelToDraw(
                    getTraceRenderOptions1().getColorModel());
                // user code begin {2}
                // user code end
                ivjConnPtoP9Aligning = false;
            }
        } catch (java.lang.Throwable ivjExc) {
            ivjConnPtoP9Aligning = false;
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
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
     * Method to support listener events.
     */
    protected void fireStateChanged(javax.swing.event.ChangeEvent e) {
        if (aChangeListener == null) {
            return;
        };
        int currentSize = aChangeListener.size();
        javax.swing.event.ChangeListener tempListener = null;
        for (int index = 0; index < currentSize; index++) {
            tempListener =
                (javax.swing.event.ChangeListener) aChangeListener.elementAt(
                    index);
            if (tempListener != null) {
                tempListener.stateChanged(e);
            };
        };
    }
    /**
     * Return the BtnApply property value.
     * @return javax.swing.JButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JButton getBtnApply() {
        if (ivjBtnApply == null) {
            try {
                ivjBtnApply = new javax.swing.JButton();
                ivjBtnApply.setName("BtnApply");
                ivjBtnApply.setText("Apply");
                ivjBtnApply.setBounds(296, 198, 85, 25);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjBtnApply;
    }
    /**
     * Return the BtnCancel property value.
     * @return javax.swing.JButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JButton getBtnCancel() {
        if (ivjBtnCancel == null) {
            try {
                ivjBtnCancel = new javax.swing.JButton();
                ivjBtnCancel.setName("BtnCancel");
                ivjBtnCancel.setText("Cancel");
                ivjBtnCancel.setBounds(169, 198, 85, 25);
                ivjBtnCancel.setActionCommand("Cancel");
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjBtnCancel;
    }
    /**
     * Return the JButton1 property value.
     * @return javax.swing.JButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JButton getbtnDEBUG() {
        if (ivjbtnDEBUG == null) {
            try {
                ivjbtnDEBUG = new javax.swing.JButton();
                ivjbtnDEBUG.setName("btnDEBUG");
                ivjbtnDEBUG.setText("D");
                ivjbtnDEBUG.setBounds(11, 200, 27, 30);
                ivjbtnDEBUG.setVisible(false);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjbtnDEBUG;
    }
    /**
     * Return the BtnOK property value.
     * @return javax.swing.JButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JButton getBtnOK() {
        if (ivjBtnOK == null) {
            try {
                ivjBtnOK = new javax.swing.JButton();
                ivjBtnOK.setName("BtnOK");
                ivjBtnOK.setText("OK");
                ivjBtnOK.setBounds(42, 198, 85, 25);
                ivjBtnOK.setActionCommand("OK");
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjBtnOK;
    }
    /**
     * 
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private static void getBuilderData() {
        /*V1.1
        **start of data**
        	D0CB838494G88G88GC226F2A6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E154DBFFD094D71EC7030AABF15DDA76CC5D6995D571D26C46642C8DD7679FD6163D752A5C9CF5316E38BBF64F3D72AC7762D631BBA647E63D0A17EAC6FE99C1B122620FC4B4F8018DC1D00C84C984E610DF83228C020251E126E59AFA2607199EFE28D96F7B7A3DEFCF4FCC4F8CF03BD537D6FD6C6E6F2F77FD5F77FD5F577D6641151EC94E4BB116F2DCCE9E477EDD49613838D7B86E23D7733E033442E6
        	0311537CBB8BB84C9DB16742358CF89B5EB298CB381F159642F3B5BC173EE9B09E077BA35C0E52ED9B60A6C2BB29407B2BA6716B686DBCEC45F68A14675B570A60FA90D08BB4ABE0CDB3E95FFD2D0C51E76079A03BA748812B1696A273DFD3E59A7AF6A6D78E3CFAC026A2337CDA28CC9250D3GE9007D0AE7AF8FB4B0FE661297B847CF4B720BC9BB9ABDC4F9ABED434C2E9C77D69E8942BE6E75AB17605A54B7B17625DDF255786C12DF764D7AEAC6F91B5BF7313631516A355979DB3C5B41FBEFF8E4C1F27B4C
        	02CD14463854D662671969C2458E47BD0167E693212D1EA63159C37870DCE9C2FF2FDB1B18BF6BDEFA115BEA7EA0223F71A66AE70AA9602F7823E3C65A66DFDE43B6F719304DC503244DF2334158G68B3A3FD6B9DC2F742F39C60B9B37A52FE9DFD591D381E2B9DED0C684B86B375A1439C704519FA4CF8C2490337CCE41CCA5AE06CG9DG911088D88FB825645FCB2D3F05EB4B28EC12DCAE495D6271340A8EEF0F6460C538EFEC848E235D626D125741F1B447AA262BF57CC1ECEE8B4EAF825A37C18E7322A2
        	6DFB9C377AECFE1ECE5F526DED79194CC6D6DB20EF8957C95C0E4F12389541BD517B9CC069CD8ABDDDC35F5EC568EB15B1A74F9D6DB077BAB14E3BA750175A346739BD4B4A738BF4FCA97A25B93F221B7A50549D700546B83D0D44588974F8409AC0AAA083105D0DB17ECD6B25D8B16EF44B3C57ED937B7D239E1BD7EE758BA2A4B50BF56A35C831AE31044779209A0FDFABF9D7E12171582F520DC3045E2C2153B8ADD3644973887052GD4FE77DD45CE8F152FD26D948F93FA1C06CE6D7C33125764F99B70AAEF
        	98D8BEDEECA731127B8C46D50094C09AE0BBE0EF9F462A55F4E10E795827099355FD47F48C2E7C0C6C35F53AFD324DED67EF5B3C02EDD464FD9C1349B513180E86696DB7933F6C50C6BB6F663DB6D2C9403A4D45432078284C7B6643C4464BABDC2B606221811707C33BA74DC760AA5AFC720047E113790084651FB31338CE59EE03C5B0G77161BA4D6D7159AF59A6E9BEEE21C6EF4905AAAF8CE3909F1D9EBFE9F2E5D10A43C5858E8966C448D1BF796676387334417CDA0BFF28B72903089D0568F4F00F500AC
        	C03D9572941081289D00DA84C886B45D063AG289DB49853811EA103F1A3003B837385B084C882E4832CF7618A308E63BC7A55904E23264A6FF216034D3A7308A0F51866EB7AF0E09ED17FDB957F3301DEBA82FE822CG991084C885E4G32812577008F3082E4C092A0951081488614FE85FC0095A08312G29008CC0B62074BE7081567B38DEBEBF1D16933916A1C89C156BAD9A8B6BF0705CA3B1A3B1DD579F2013D845329B89A4765178E4FC7468E4CCA36910711DCB5BA4EFC8DE10FCA139C47283F9A4F792
        	59B34925797409648D49CB12E3591A7E113CA5D74C352C7E79470D0E653119390CE5B13B1235270E23EB03167FB1004C45C39A5A65850EA341A7B178D59168272268FCB447368FGBE60C88D21B1BA236111F750336C7E68BC7BF40523EB45F940A58DFD9F3BFE8A38200C497C63C56BCA4AA56D3BC2522EEB3AF5A5F3FBEF3EFC1F66CB627D5075795DCE32962D877A96402E7BD8CFB34D651C324E345AFCBC2EACB73C30A8700EC0F525327F54C672001F625D3219771057CD376CE3F5FDDB9B71152DB98FA58E
        	57039D8A1D2C65A6D894FCAAFDD75BE1CA879B5A958C793B953ECD163D4228DF667BF9D9965CE3817DBD0AAF3E2057849FDBCB7ECEF977649EC05DFF00356D1D419238B6417383C09CA0D965958E919E11CD85E4G32D55E3303C31A9893FDED4C353696B29FE89BAF843531AFC4A60F496DDF007DC09BEF5F6DE3360F0758A47322186567F90E4E8FB28748DCBD4162CD668D19AFE40E1079C66A44472A6DA34344F6298D6AA34081C88424823681F2C78D46EA00957084308E108E48861C369B0CE60088C882EC
        	826C8494B9B07E5B6EB4678462226777C166BB7AFDBC0A5F67195F31EAD1E89D7CE3870D65053B5AD8064691EB7CE1CD9C73224411449B6B7509A8EDFF9C05774788DAFF2E36C72E052D6D7A353023DD3F967636C72FF5375B75EA9D655DEBA76F43F6496D6615E22D32B93AF770ABAB71D9F08B722060986365FE61918F6FEE8ED2A7EFA96F5C75F05F6140F758690FF02D9949F901CB7ECC7F3B54FC2ABDBF59C1EBDE2AA33056D01F3E6AA0EB8DAF72AE880AC9723BE5CAF7A86F730C6E5B2750E69FA541353C
        	322B55AF4B123B2E5A26F42306DE7AF86FC3496B629D156336A9DB0DEDDA2ED1C2DE5322305B48FDD579271FFED99EE98B24FA1C993E5F92E251925964552A5BD5F5543F174EDCD27CE3C62B85375D497B40CABF8FC1F714B71146FB7D2ED15EFBDD60C5C7DD7514CD7473D5759C55F789E41E04FBD7477835853D0A7D087E4BE18C5AE6B83D2EDAF68A3E2A3ABA0E592EF0DD09E03B0E1AA57D68048E31DE0CFA2DFD1D4C7F0B4CC6E6636791ED6847E2545B59574F2CDC6250172287CD0A9DE05F90ED9E5015EF
        	93912A24E7DD1A623DA089666DE4146B291D0D03CD917DF9A80862ADE14CA9D323A66744F524D47BA06D6CB26F283ACC6D2C7F509C510EC7728932B045875B6A53D28376BE23767E7CF0CBC4FBBE3BCD64FBECB31A8EC3987A35D4962F86B5DEEF55AFB0AFF487BBB8AFFA1E121A5189A2B33C03CE0FF62F6477A07F030FCD517BE21D7530FE049B89C4262E01597B30F325E24FB4AA41007055024C3BEA48FF7D32CD66CDCE1BFBACFC06F782FFAE735BCE0D5E6F8C3597BA3FD503E4F6FF0EFDED3B97392FF6C9
        	1468168BCB82725C4A5B5C9A0ED5B2FBED53D5F5354C5EDFD7FFC73157AA13BD9BF17677DE4FC619617956330BF5EAEE159F7DA67AF8237B8F61600D6EF9D7DB2CB75F5A379AFDB3110DAB718F619F35BCEF9FAFB19F4DC30D91F346A1A9D922D60D819F2F90B453229E4761DDD3B4BB034258184826D91749495BA7DA2519BA0D1D4BE8E7757182E5BE4B2D12A4B25A6B3D8DD16BA4AB2BB80B95D5D6142B6AD8CDBBD9DB2358C076A87C87FC35EFADDE5EC6AA2C4627AB6853AB27EEE23D6F310DCBDEE5E3970A
        	5C9C8A3F0B48DB85973C83D984B70F1ABD7DD5978375F17ADE403E601E1FFDA22FEB3F6EF3557E48D57ADE8259E2EEEB9DE87F7F76DED2FC6EE644710D98C0F56D519F92EDFCDF5D9F45FE24G866C6B8E890DAF5D0F3852CD5E91B3605DF1970063F1BFE2FB8761637EAE5B080099A45257DB604D70645DF565EC2966FD340C273F6FB960CA79079EE979E90CFFD0553F9A445F4B78558FD13F090B2E6F0C41CF0A41CF0B414F0A41AF4B094EB74760FBE2705764684527D90D8F1797DD3FBACFEFFC2C2A7ECBB1
        	74FF222B6FD4756F666B71837ACBE3703F1F9F3D7DFF0B41FF2FC0AFBECFD47FFE78DEF47DDF46601FB8901D5F9603BFF9A0FA7F5746507FF1C4BE1D3F17ADE47E2E027E26GB6BE4479FB227308E67EDAA4E9426F3112DF1E70F727AE32576663A77DBC2C4104514D4F325F168EF43D9F42D34A067A1B5511AE32D7A1EAEC52EF5C8DB6C277F885174DBBCBB69359EF78BB02FE1FCFA7E383FD58835722B103116ADAF208CC24AABD37EF38D86F53416B33E50C7856BB04712D006726B16ADBA07E59C35A78A705
        	714B6FE879DB991FF39A0CDB1D04BFB8FC1A71CA61399AE0F1D219C4A7356390085C299114BBADD0FE3DC077C12DF07DD0157B39AA3701713740F5A7A0F7DCAB777DFBA8D7B6CE65EA61EA998F15DBA2201C8874F840BAA63FB1C84EBD0EF2990C1FC5ECCD980C9593DA395B93A857B0C1657A60AA0649B50AA81748645641B5EDA2543F82974A6DE4F2FBA7685EF029C865E81CB3D539CA20B7839E08B40EEBC4ED1C7F4C0DF25BC5EAEF8FDCCBDC909F17561EDBC2B98B509D00F897353759C56DD1390B9E14AB
        	F49B0C656E00DC33DBAB779F2ADC9C501F5348EDF4EB7D7B53C9145B6B267E15CA86E3A520C35246E5119765C6A4AAA743B5A1CC4E6EC33994A617A651FD754CA039FA99653298BF57E3B016F9C26D1D752B636BE1638B5799409A0FD62EF8CA4DD3A637852E3B812513D42EF21248896A19188BAAADCE217DA61F634E6762EFAFBDA55A73BBBB1F2F515D8FD372F81246B3EEB2743797E78F311B8C748D13D8A7D7F6E96BE40B4FA7598565A7F5D66B3E68566E1531FD456E77607AD0707AE42558287B0A5D44D7
        	721BBBA3333A7862A7DFF061E7885A9C02ACF971279E533472E6E9054F96875F81255524EEA55E9678E9502767F97EF6966335F992778AFFF1C3FBD668C152557C8391E23317456434B7901B5D2F9CE3B57869CC4D9C7C8CF50C6A7E625839183A1DF67262C87B61FDC47A211C6DGDFA86D9FF3880D5468A415E64F437E262B3412FC24657A1056D2003ACDBE9C5B2B967D7D4F968BB91FB6212EF7ED96C8B5EE0A2DF134BFA79F17F35A33DEFEF70D72BD601B06376D4646AE3AAE5136CFB6E3DFE49F1E255AE7
        	D2FE6703674D00EDGFA96452F1CF5A13EE7832DDA065AA2AB75FA0878C4EABE9D53D7C49C5321075F65121F7FA262182648F4AC374801B1ADACBD4E46F4D17D27DC54B3EBFA4BA50B41CFE64E455225CBA99B5341BBB8AE1C9F7B9B271C49A1769A00667163FBD95F00F65DCC81FA86E08F002E55EF8CDF046B7CBF7650770B07481E6B82BF6ED84D7916580C7E457D8537664DAF728F690CC15AD72D79C5D3B47675D301B15852D4E64C3DFC124541BC02639E87B29B27301FDB0648BBCB78A6A23E333CBEC272
        	02EC9CD21F9A3A34BE25B83E5475A961CF1A73F7B3DF4A2683BE19411FA1552703770A581CF102CC72B47A643FD70CBE614EB4076FBB4B0A35631689BAC5B330F64E206E2A22BC1CCB9C1E3F7AF7A7765D8CF2CFD4598E01789E32FB4D5AA9BE2457CE6A8C66554B8266559620F13318D75FAE5153EB1845B62B478B15B66917B0258D0C935960FDEE74FD75B836E3819B712A1D2393E4BC541DEEB5BEBF3B25EDFF53ACEDBFCB553BB6C15A470D9A5A465389EC03FB843EBEC2597F1EA06390348B2E3633592A57
        	0E67914647AEE24C630136C935791AC8EC866D04F3F856B677C0D9C86C32C12F6CB1542947E83756250EA5501EBCC63B2BDD7B51AE591566B0FFFF688A6FEF0E9B7B1B8A7AD90FF16C5A4EE97BD471845EFD81B3CF308D271B3CA34CF3579AFFFFEBA367E59634C92D6671E6B776BD91FC5A2C7A7509C45E8782FB51B8C6BFA88F7AB6E57DE9789A75862412A0BD3A074D72CED2738E64633F4698897DFAF5F313EA73DD697FD6B7FB9AC95DDC6066B60B533087FD5F8AFE957E8EFD7F07DEBD5F1BFF075F00EF78
        	6AE95B735E37266D9E1A44F62DE0B3D1ED776CCD3DF6B72B6DCECA8D345D856DC75336FF24361D89F6CB1E62F834F8C9FDE53B51B8F7DBC267AE490B8ED5E75C9BBEE73E67C57BA3A017244AD67A8A957BF4171A5AFF79FD3D5A107E9467F0228F73F8BB504A625056FF7A8E301A06C5107D8EA5672BB5936742BD997D69837D8455463F4A4AF9D63AC34D7AFB66241EBFE9F168CF179F57218C2095ADD257C6BFF9EF0F380B2A562D67AC21F54B8CB61C00A72A2D377D5A3ACF5B7DEC8A5BCD8239F4D5B6F5CAE9
        	B7526E2A5A2E35CB2F5D5C45905345E8EB471436DDF6667C2276DBC6FC33A96237CC6DE27637880BC33FE5F65DA0F69FGDDDE0C6F3BBF3010738B78ADF38B32870A1BC8EAB1653BFA08CF705E4B1EA7FB34EBB5BD1B725AEC34F37421C8D80CE7044FABF3EC8DBCEF84EC856C8294BE033E6D6909F9663CEDA64A197369C721FED5BE93B86B5524396F03FB47B3F8EEA9B3A7D4EFC6A31B2839CFE677D44F19B71FB8242A6D9D4D1F0F5E96D56FFAC1285EB60DEF3BB5773971DABFEFB6933DB220D547071FFDEB
        	8E21D963718C7D3472FD620C27E765C9DED07AA205BE23215339325F04B5A381F8D971687763A152FE5F12391F3B23FA4B95BD67BC74685C795A251DBBE9BF6F49A7BE694D1D67186D14A521F3676F15F734DDC04FDDEAB01E8654832CCB55B37F3D5531F2954F7133A425FD9A39B357311717EA47F069F028DE425260382C8BF926FAC9E1FA9F0666D7089EDD6F1C7B4B39E85F3674230956380D26203F2DDACA4FF296ADB3984B1761377732817C76EED806756002156C7FF860B991308E1086588960928C460A
        	840C75B7FB7576C6026BC2240D1140D9D59A0F2E11D871570F63D0CCBDF3C2309E6D638B83240FA3401B812C822C87EC85E481CA16E39FF77436466AE38B9EBA33CA6A2DCEC7293F25772279DB896D12FEDA1687FC26FA67226A91F8166B654B3B157F43C55D87501C3B423571279D21F913G3657835216E35E3CDA0C7B85194B311E3C61DC58987EBA26DE49B70275288F66C368C365B75007D4E1AE718D7761EF226ABDG7B322E8F2F15607CC9D4FDD8BBBE17B8040F710BB175B6C39B5BB4FE50B1DE5C923C
        	5793DA937060837ADC5ADF48F4F72BBEAF19D8184F5F0E29D739823E93D68474288F6FD851876B8A74C1909716BF53B17592D7846B51BC1F3C931A67645DF69D48EEDC01F95EF4G7D5C3A827787B30A48FADA1888F5945010087EFF66DA187F6618FAFD09FAFA856E052DBDC74374C2579EE722DEAD79EDC10CBC13DC231212E7B43E7927756AC89C58CECA4478BEB90771DD2F467135B07F6696474C18FABBF57BB5DEDF43C52D11A675B39F3A68115C4A9E93757F6DF22CC1FBD57F57CA8B9B17974374C24725
        	7ED93D9A142C4EE74B3368034D33B09F24B03DD09F62F5FD58FF836B609A550723138B736123B03DD09FB2F4FD983A09BEE429BE7CB84C16DEAE055735FF0929D73152E0ECDA99D657DAF0AC7AD6228F9B3C44567F1277ACD0D1DDC9120D1BE1B76C08919515A8AA99B092C503D1B71810C8D6D40C4C8E19B033E4E3D61351899BBBFB18B96CD96658A07291100FC6080B8A89CEF4D689A2F1CC56F59AE888A24A2F79990CB450FC8C82E99AC1033AF5BFF57B3DC73F961DE44F1C339E6BB4376A3E3AD5F52B6E3B
        	7F7760B23CF05F679C218C77F1B23C1D01B2788A991E98FA3818F23F6FF361BF3675DC076561F47E763E4F45CE06FE7FE4254E0D87D167024928F34D704375353E367B9C019EA843C1A283EB6F960D6BEF13764E8572F9CD4676AE388A5B8B7F4978BEB9F2195EA3G69B4679DB1471CD17EF3B79FCE7ECA3B4F9150C1994D4ECA9BBAD522ECFD4EA85B5BF40F1987247DGC21CF10C303511648D07F414B37615F555E4FE9A67B0EA86FAC9B34967AB7E351A4CC38D18FB3BFB7B9177EF9457B1G794DF80679AD
        	3AC61ABC856CB085791E2CD5BFA7D2D4EB7B1C489735364F0968EA6D1F192B28D5BBC742647BB1DD7BBC87323582B01C579841B9C05AD560565DA1B8BFC8878B5CB60A53C0BA6B89446D08C6FE6784AEA3967935895C26D864B7C9606E6DC6DBF9885C09B8442D94382B71D8C610401993318C0D40CD5D03E56C1F0A389E3ABEFA0C24856EA50AEB03742840DDAFC6FECE8277F8894179C0BAE0AA7A741DD232A696AC52BF22E9B2274B52292552F3FC5F8710326471F16CFBAFC3FA5E7090CD7FBC06440DF9385F
        	52FB43C4DD1075B5CC23647C970C9A6B067B591012F86110F2EEC20B635450A6E29F4DD40C05B7EB8B3577DB2BB7180C666A2EAEB1982D9FB4F520FF7F3CCEBD165E28339DCBDB6AEC475276BA7B3174FE1D7DD89A22EB4E49AEBBE272G185D569DC825BC0706CCC3F472C0EF349839CDFFE579C0EB631C56E5638D6B1A556A2F92F91EB24BC0A9592F4F6C7EF5B6B9FB275EF72DB1C223455BC1CDA93ECB4E3AE0BB78C699294FC1C8BB82383B203FBAB558EAEBD73A703B8960F7330B7C7D48EC7339C13D9EF4
        	865B75D0EE206BFF8343668E135256178CD902E61DFCA0CBE144BC7C8C9CFD5EE2B4F71B465555D57ABC2329BD5FE5D02BCFE67BC7DA5176B516011AD30237CF033A2EAB9AEC6B3A3AC1DD5700067B6B3A31C1DD5710067B6B7AC683D9CFE96F6D6CB573DD534C87F36EE50A3229FFD65FB4194D3D1DA66A05AC4F167ECC41FFFC9EE62B0BD72536A2B14D7A90334A25FD088897365E15B78D461953308F11F1817B39B55350BF1F2EA47E6988E9F700155350BF5724586B8B84CF9BBF074B4F9B75CA65BB2D4536
        	73C22ABDFEDBD5793D5BABDD2FE038186B52B20AC4991B52C89911B6F891C81E4E70B9532DF446AFC4466FB3018F3FCE78F6506562FCDE4607753674A862BCAB262B6961770D340CB356323F99DF0656E65B504AF98F2A16615EA7AD032C6932FADF58026D522469D86FE1F40F0E9F24C3G4227E33D97A7592B275899FCFF498C2B8CEC8D21A20570BBB1032DA1C48BFCAD451F1560595A42AF69DC88C96B0166B583574EEE5C106AE0BD93F13EDF5ABE978A5D4EE723CFA73B22EE9F9EA63C7510EE85303822EE
        	0FFC24261B9364F1F7D533EB7400D4264F053F7DC70EBDDB792A728B99106AE20D1127EC7AD6A06793264A4FF5D04A4F9A8FFB2BED7153F0BE31B3F9DD4ED446C35537D2FE1F89FED7EBED71BB411F5771DF43B8FEDA739E097DCE95A0BE4BEC4377CBEC155143F90E4DD433412F64E5087316BBED14716B8CDBE5B8F35E9E2AE52C9B1215D10878D996997EB46217D946177D55C11B6FFDDEE610EA59BF9A1615A14E314D9D16360FACA63614E2CCEC1E09B1310676C332E66D08A9G281805B171DA155D796BD9
        	6365E1F1BD150EBDAD3314716EC6718E331471FE74B2463B9350B433B05E07EE4A7492676A9E3FB9FE1DFACA25BDD98D3355E4ED21FBC2FBE6ABE5ED27F84BEC252C6FDEC4D99D0036F5B6762137B7929C59634B4726B4FDCB0BFDC5D3B1A9133F3F7BBB79C0166DEF0E246353DFGBC930379875A48BE40EE33F1302737E3C8EF9A6AB0778EC2FFDC2B8DF5A34FBCF51B3C53AB606FB1GEF00A0B7659C7E52913AFF43ECA4FB96E8075D77C93A8FE98C7B83B910AE82B0GD8GDC1E44BDB0CBCE135FBEE3BB59
        	3E446D3E790E5AF98B764C65AE327E55EE6C78265BBCB05C5F7965B869196CBB6F107223202C6CB9B02E1BA3171D65090BA1F97A0066819022484374B89E0BFAC44CE13404396C7758DC7421F7E2554E00B05BCF27635D95B0A0CA0DC6DCA99D6FB6GAEB786653144D3FB83DF8B0047DCDB727CCDA24A93G74D000C800ACF768E73923BCCF6F99FFA6741E0E0CC1BACDDD4661BE988E8D8C192A8779B5EF00F7F527FDB89D3E271B852FD09DE90B4D26215E5BFCFC4772EAE8DE62FFE110E632BDD20C32E9G97
        	BB8F7AFFGFA004EF948EFFE8961EF6935D0DE1366113BBCF564DA91AE6719B8E2CB3E5599BA3996BAC66BB7214F07B5117E31684B4B46D0FFCB6F5CA37B0060C1F2771D0549BA1F76BF82212C30F9586EAC52ABE3D9B3CF325FE13EDAAC571653F6ECBE0B59A4013FC671E7A5F8964BDBE83BC7524DC0731B0FF38C8B687AF54E82E88F97A0AE369167A24E895C51A6BAE781E94B820C1B483ABC2D3DB12141585EEE6AA4D6E36D71BF16637C186382EC0FF369BD9D7E108E8550ACC03BE4DED05AA54143EA0BEC
        	8F39DD8ABCF0EFC7GED4B749ECC7FCCE117D00A9F136019DDFCE83F1F24FD01B678946A7B4B943441091FA02EAD95F1B582778EDD3F34C05AD960CE25E3BE8F012B23F34A01108E933802FA343DC66026546333D18217A96AA84793F1238DC2BECF345962F1FBB0EABC2DF66A74D473259A3ABFFB54D3F9B765D50AF771D45ECD79AF344FCC52BEC05B6F05B2B5A721CC2382F7AB19604839A6B7AF1473B2899D7EAEEB127C3DB9797B1ED71282AB635F7F8F4AA84DD656030F17557681DE72FA8875C25F7DBB5A
        	DF8F77D25643AC0ACFD8282C07A307319E7200663890ED6ECA578443A19D7B3470AB9D56CD1640E5640AB897B8BF6113ED82F74800797A846EE8B566F39638472AB11F1B40F956901CBF2443844ED20B4FEE933857EA715988017BED9DBE1B35C844821D934D03F411400D166033BA010B5E0779BA852EEB9F669B94B873C14C67A2F0BFBB08795C97214FEEABD556E940A249FBFC113CCE4397E11D7E113647DAEFE51D6AA9BE5BDBD9276B4A30CE4F824D4D9BE58A2FC219344F20CCB3AFDBE3E73E646F7F3A7C
        	437B387E87AD032F8BD4224EF9C267EBD5D6BDFBA4FF3FFF710757F9CF558FD9866BBB785FBE26A563G49B23A1976BF73ED74C54F64ADA6F6FA73B6F98F67F2C864C0669AAB40EEA1G646F08E7306F7378985983F853585E5D5BB5548AFD3141615B274E64C30A511F9A53EAF14FE16AFF0B33D88E5E5A4034DC557B2FFB963398F0DAEC5DF3987ACEC0B4DFD39D43FEDAG5023285C7B6EC877C61332497DC579G0CDEA623939DCE6E1252C7E47444F14FAF1451C91F25A11A5119EE1FDDC15D5AF678E823EA
        	AE2A6A26DF42F46A613F5EB90BF78735ED0F66F7145CA56508ED11E2CCD0D8446A2768AE291FD39C30FE487A04BB708B72E175926E037513C6F5457A39E9B49796114A91BE129BF3DC69A3FC2BC57E784E7FA9B2474664A80ED173136C25BBE23C16B2BF89DC0AF2C46ED27393D6275531D82711CB31CE6F44AA6BECC10C34CE1644AA6B64DDCEE7E5CE0EBF2C2E9B9DC8900518BE5E71EA7A94AC03BE6EB226CF58B25427B9513EBECB92D11F64E7D11FB79215BEFACA66E329FB147A1E1679E8719E250F4A1F9F
        	5A2334C7134C9ECBF527519E326EF5FED3EFFF6740888EB0067275976AEB2A6B4B2ED5DF3ED6DA85FFF09FBFFAC53AE758F7FB216AFEFB7D334C371B792FFF5A625DCC0678E272CC1731EF48BA3762D90C36F29636FA2DD8E92BDCD95D4717A8EDF5DCE60B4FCB1436EA1059721B92252D70F9266BF459F78E726E7EBE8E67B3143A86F29DC31E3536D5C7282E504F52623F969D53FFD58B3D1B3820A03FC00B6F261775A4DF02AF0C6BFD719D3D28CC7427FC71FD55D4CEE4EE0374A80093008740CAC1B7D1BA59
        	6710434F46137376642E84C65FDE26FC6790DE64F7147319687B45C31157C94890D32EAC8357E3095EC993640FF526FCEFB29BBEFA091E65B40DDA58D8FB95393E134FA57CE7A30E5703C0264DG5A65E08FG5DF20C5DF3CD04574D5E21DEB27AE763697AA674413665284B6B65766646AC4B5546C05368B854F1B96B0F458B7CBC0AF71760D9BF6D138ABCBF3392E8594F218F64DFC03FF090388C510FF19738C20A8B00F468F3E25F9E1D035C8A69C8006495E0830033G86009E00B1GE7G8FG3F95785CBF
        	5367C2A09D8130FFA53B1B025CBBC14EB0127BB12A787D96640E84F22F81FB6E39CA1F89562B014BC14A273E34C2EE4764957777439EC59EE72E83791B68C974C6DA64F36A7C186CEFCFD876946E43F8773572EE6D788970C8D524C9BB11A971F9697E055DF678B0FFFFBF857D3D886A2A822087409140EBA54EE10D24E21EC0400581C481E42F0236E515B8A31B464ED042AB40EC6C6DA727343ACDE6969B8752F12E25F595722CC8C71EFD00F3GF087708758ACF876E6C8671B99AF87BAF7217DFB70ADG963F
        	11E4DBBC57472B9E799E837AB900D600B1GB7113F7518B57F64864C6F8774E0G8DC05A73BBE28A1E4778F825856328C66096DE916337674577F5DA098DDCA06D8D90G30D950BAA8AD8A5259FEA0179F3BE3050F673E42B60FBC272C27G9B3809000B2C7C68D6AC4316CFCC446FEC41AE6EF34C1683625CF2AB68B788608C6083908C406A4F134E41E8A09D3B9AEDF9A59B6D3BDF604E9FC27B96895CBC0AEB06F45FEA54EB6AE1E257D1C8BB81F8G2C94B4F7CA8B06B439D7065CC5C36EEFE134230709BDC8
        	DE5445E375446D6CE4A76F28A87FBCADC37A9EFA90BB5B0B5DDDDAFC17AD79082C55D8677EB1CE5652F9978D4892359AE34ECBA7E2638570C100D600B1G3797B04F71DC918F008B8650G243D887170A2464FCF0EDB6327480079EB005EC972GF8G84087CEF7F411A7F49EA4C3F956811GD97E501E83B47BE35C3FD0C3673369D68D32B54AC854627362F96475427F6EB8E9659BDEAB3EE185FC1CG3C8102G427DD10EE7723542EED97B64FD0070CF2D3CA617A02F6417603D872083E883F0F889F98D1E32
        	663F338F733B835D97A084A082E07F4B18FFC921B57F2F8F0AB6976895GBDG0EGDEAF232F6F246B0501108E9338EDFAB19FABF097E9BFAFE78D44499A743B7FA9A7FE2F0334812087E01220D5D21ABB247D5730FB00C645BBF8936D5F116708EC06B58F576EC8E1926751A34A5FC64B1076697E5CB2B03E6205FDF7DDC27BEE06F2A3G768700FDG8C816867AF0AB3439640B982F8818482EC8B40EF307D6E36837CBE5655857FFB9CBBE6BABB4C1CF940313DA441F1D7E91CE3C7E902E3CCC91CE33BBEC7DB
        	D42ACD685017946ACB92F35A4BC6B23F556B8BBA3E3CB5B4323FA8277D4B1111110C76020E724C11EF6B35F16DA535699F144475F4680FB664811F76C272AF4E51C89CC4FB40918A6BA26561BF6FD7E89F6DBB9CEFA4C01A0CB1DDDEE136E5634F8D5FC9471F58AE9350C03EF37FE02DCBB6BEB912A29D1FE8022A63C8BF4256782415BF6B44FF7DD29673731B2F1FA6B67487FCB040D600A8003435B0E6D80B6B334E9F134622F8302B4E44B6DADDB2769B3B69CDC0DFFC81688BB7A0A5DDE6457DGE38FF2FE57
        	2A576483B80F921133CC9B74F80E6AFDBD95EB39EF725F33290BF713DF261B69B3221BAB50FC81C281B4G3101707E8EC45DDE7F181FCFA5DBB60BAD96E3C78F3D1DCAECG6DB50DD851E4A11879D55D5D9CA210B6BA1D7ECBD37C1DAE7E7D7F78DB458E4C6F175CC53FAF88E4FE6F97A8757B0AFB5279AC295F07C0BE5DBA2B5FB35BDF0B794B096939B128DB5BBA26DB78BA29EEE7F72945F46CFA680B2ED76E05B644BEE84CB01B2C0F7F4B3149CEF10F6860FAE6132875D21B38A62859E47F86F8C7EFD05A44
        	B771C1ED42625F718CFD5782BF378D986F077348B7D29A0D57476F5486E40DF9E050E4365CE2D8F6238F13413B7861E4F814EC9764EB7C1DF9C7554A06162652F853D85DFE5D54E1B1983B35584779051E1C4968B35E9A983640FBA3086ED1504B6EG61765240EF8D253FDC16E5C7AE46772FFECF669BA4CB6A7C8E6662B272BE2737280B3CAE1FA6B29C3B53C5601FBF11407074FE9B1E17FE2788EF18667749B5623C0AEB904E6D8DB4AA67764859F55239E374F90D4A393DA951D27A4F9A15F3FBFF14BD3F3B
        	C9B9371729154E03DEEF124EC132FE58FB6558B78B8E423E4EECBAAF938169640D500F5C08F8CF0AA767D349FDB3642E9206BFD9E1EFCD07BCCFF8A9710477C4FC0A15D1EE378C1CA3D362A75ACFE3BE56F441160F95011CD59B699823727EBEF6014EC9D90C6D8632AD067521F712AE8B2797B593D9AB2B48C6A93CF7D6B3E645617D796F5D3562703E7A3E82E2FF6967B0985E69DE9A434BBEED417793FECD7950238548FB4E9009AF761990142B391A63AE5454A36E2FBF0CE7B872258F0E7B78889937D96F31
        	473CEE2DC9CC863CCC9E6FBF3EA43B7FF6A33F3BE723385F3B5A96BDC450FFDBE30B3EEDA36EC34F5C0BF1963591632CEC2FB24EBE11454948DEE51CFDA823AF5C2B0C33BBB27ABF6DD546D9920FD3A6531329A8D3512BA85306D47BB27DAED5A9D3290C7EE91AFD190CE9EAB2317AB919CE470D66E13E0F28BF9DE56C93B23A255B177155F4250C83B23AB6433E0C0599EAB22A2F9B4C48102E9BB059DF2DC759BD046CD175CA598F494A4EB7A8E53FA423379914322F15511FB0A8E5FFCBD6674B9B449EBAA153
        	16867BB2FDB02E3D6F1651D3DA6C4B742796B519D8FB76DE0B2D76EC7FA69CCB7ADF41766C8460F4GEDG8EG6E1BF0CEA365F3526654F58E504F5C1441180061FFD318A4419777615E44B36DA992BCDDDA93BED8F31234D34ACF6630B81F51AA3B27FC931BF70F58046D4019F8DB7404E0249FCA34C54F8E46F6E2DA9256CFC1B0564F1AA4E57D9C155977B7C94A7AE91251BFC9D6564FF2993DA5D9D9BF9F2B7A3B66CFFC8EA9192E0F023733BAFCB45BD69D768463BB2961905621C3305AFE6F1507463F134E
        	13CF16F07AC75D246D672FA40EFB131E2392DF4A91F96750EFD672AFGF15CE317F85B0F9FC961EDFF48E1E55BCD7A8DAE41B837C4BFA505BCF444A67D26119CF1D99EE5F52C302068840763987FE23F2A17284BA81D32AE65FD237CE2E5DD364868ED4563E2CD5677FA22D8D917CB3452782F4EC519B68B196E64AAE57ACED66612DC25CC73E47437F215B23DA413E95FC7CA19164AE43AE2C01932FE4AE47ADF662EBEB82A6A0A27ADD69820B2ED2C198E0EC191D325B35822D5098E28FFA8C3ABA6FC9B0414G
        	818209B52D4CC01B1704A48B24A172910CC94C02D8D1B1D2E3ACBA98E23249E64D87EB88FEA434E649AE4956E513E61F92A4121E7BF16E5B7B766D466C1036BBF348F24EBD6F7D5E39773DBD775EF34EABD446376BB1D5CA67FCA060B9B9D9BAE7CA40F372AEC97F2533FACC9FE779E3FA64B4E2328BCC4F1C8E0D69E5FBE8CCE76D21B1DDEF57E3BAAB59E9EF9BE29AAFB055340546B450969A5374365018163469B11D11FFCFEA9153DC01E9CDEDE8CC876A7418CAA43935AEE00CCB724BF5FACC284FB05D36CF
        	442A88CC1F96077E0D1BD02C47F4C0124FA98E0DE9F3319E53AA49CE05A562399E07182ACBC2E36AAF51E31263C9EEAD890DE9D1099ED32264EB95994CDF5FB41C3F764661F3BC43A21E63F1411E63676B831F633710A9A4177F26CA1BB360FB8B6FA9B2E9BCBE5F6D5C45FF0725577BF0D9AB4A7CDFAD441E67D79B744FF3B2870C0C9335E59B0D64B1F1789B7CDA8B76D52C682BCFDB74FDA577450496FDDF3DA70F1F96FDDFDDA70F1F96FDDFCD10464F5A0FB0CFA2DDE0AAEB8A0D69F4139E53A5C97E3D2650
        	18FE55948C93DB57EA3E9221481F88E04C259FC519B1E37E7C34B418D5E6EC5BC67EC643E77AF45206FCD87B0C8C2DFD867DA8237E30980D9FDD417C25E37129D94EF82CAF6F9A42F5782E66E94A4C072DC1572B2746737577F8ED9D1EDD6706ABB570775B2D0A72276D70CC611471E706BF0088FF3BC643DB99CE367ED6B004B6CD0EE73995BB96317331B5290955E47D2D94F84701ACC01F8175830D870A821A897458A2DCB35B7EB659ECE7858EB0AF697D776BFAAC2E2F5D5DAE92A248134869C6GFF67D5A5
        	19E3F9C57EF6D225FF9CG4F7B2AA47367813E29E0F3A2BF35125C3BCE0F07E641B0DEFAA571255DDE1F4B4B667524B917ED2BAC14E55417E6577A74A9E20BA43896E5F1EA56912093C04D0B715AA63E435F35E03076DF6F6CF1E1C09C1E4BDB95BCF77E2B2AA2C5644E932DEE9786F10A777DDC2D22FB3DFD2A5AF7119C9F79636873CA6D6B27CC461BD0C5F314488286EB4A79B7D4117B54633AC059EC7CBCFEB5C25146BD0E777F76075DA73B0771BE6985BBC7AF463D388B43DD70F7ABF87C0466425364DA92
        	9E175D83BF9946FBE059E2F68F24AFE677G43F2BF5DC3707F7C6F1EAB5B3250DE79CB60FEDC02767AA43BC639D64F04AB59E80F21A54C9ED1CB7C6DD1EC7A7F31C727896DB18BB0A68BFB5CEB3AF676F84A0476B0AFE576B8391459035DE3135FA55FC5BE9EAF6E4FE4116F92DD727EE93743637E06A69B1E01065E9E164756F3184C1DC59E1B7B7C450A2F3E3ED861B82FD6381CEE15547874F81A39CB24303C35DDB4CF239DB0F80046AD455F163FB660DE680E18BB14E36FB4987E36D8EEBF1CBB15630FDD2A
        	4520364FAE624779460947696D0E2132E03169DB39FE69B26DB864AFDFFB7EE4347BA0ECFDA547AA620A60387DC0D300E681ADDC066BAB4379842B3D476A723A869C5ABE4322F33436C68F1BCFB35E7CEF35355C3FF19B7E5BC6EC188647B3ADCF4DB2AFC79B3EFE4CBFAEFF5603878D6372E7A53E1EFBE2B93B66F34B35EB1F69FAA813756B0C91EA56D047127BD27696742526ACC71F2F61B4729E933CB7BFC61E32827790CA8BC6EBE31E33933296C8F0BD5F736169459B56D598D96F8143BA9C2108752F2903
        	6622021D6CC03DAB50066BBA50170ED801FE6B7ECE3D5FAA7B1D8D1DFA3F7596C9BE582977DBDF11E24F6F6C547B2DCFF0FDB6D6BEE9161E8181E3254D61F47731348A857D6F9F6660D838CFDC5B45BC642589DE7BCE649DFD8A474C4FC2569789EE531BCB09CD3B60B803C0D31E42F3DCA943F344885E6EF2642D96670D2F89EF8C349F8ACF6F0B7670749EB32C59B1325E4136B04738E13D0D1175AA0A4353BBD092DE7FDBADB46FBB816682C00D8958572F54E3DFF7895EBD8D480B923C68C664ADCC40B1D151
        	925EB5EC146AD018D626E6152E8C3DAF4A74A22F04793C9C359E1BD3E453352763004D826484D201A62D94B561BEB0ABC673A51ECCE5F7F8DC2A4A7D7623C3B4E406FF50EFE2FED06B907AC1536158896278B7D593FBDFF2BB55DE85FD122955E41D255745DEEC44F853E8BB181D79351BD1CD7C87DF37436BF1FBDDF6071373E7D6539A8317D57A7AA872128E467FE5B51947B99D2A037D7F5EEAE23BFEF689DCF7CEB539861875F8FD3C781CFB5065E13207F5326E4BAD8E5F17CC366ED470395466D3A34F257E
        	C8E38DDCB087A22FC962F341D3342E65058BBE173003D2D3A8F8B69F5B986E7332B1707CF0F8E327FC54FA2C3FFFB19C3C3F63453CE97F53B0C7FDDA44FDE70707F14F287598469B3303E31C130D9847813ED80151E18A8FE35F28759846BF1802E3AC59099853815F31D518BBFD157A584ED57AFAB55733DA022B7475EA8A6B71B8C3A0DB3D8AEB2DDA685A30E5F5EAD69750A0509420D92B717E3C31066C4F06FCC7C1FBDFFFB38CFC0FDF19C6F66CA83A7639G0E158C141F181AF584688410BDD1BCDFE88EDF
        	309826363EBEDAD9049499F140FDBCD007899DAA77B35E30223F64CCC4FF69F32B5EDF3AAC2D61CF346A7DA56293E972872D817E1214EB17EA557BCBFB38BE6B033554F71F1A286F1BAD149F13286F1BCBB66C1B59A0FB61F758B749B476E9887E9F85948B3488A899C8D90376FB754323A16C47A6E61A5158B8BDEB781B36FF8D2F1933A670F70A69B5997A9DA7F9FBFBD03D378DEB02B9F97BC183BDE62FA16AA3CFDA233763F5149F35C6EF47028E719B83B2D3925E4F1BBA423B1FA79A3E6B47134470C6A485
        	3B5E0100F776900A646DE3026AFDEE989B984B5BAFB450E376F83E0CDCF7D2125ECEAFD2FEDA125ECE3715221D36032CEBAD5AA9224C7F7C0F82FF595A6F623394169B61CE613A4A3AE03867D0FFED7FBABD6EC7A95F3CCE0F3B45A2562CC1B6E59D62FE3D5E7F7C6940B72D7FAE389FB04C07AC653A478D0E41EB70B59A69D9F87B4F8C74F85D8D7A4EE08F482F933CDC4A9B87BC2D26696EDA6A7FB83CCE0FD827A92CA5B51708CF53666A9FF079403D600521187C05DA625B785C5FF05F2134D67FAEF646BFDC
        	CBEC5867EB335656FB5581374B4767B0230EEFE7FA674354DB9E262F32BECC3DF9E17A9DCF0429F7E854F13ECC6F2DB0754655AB627BE43F6FC581B9525712B866B1BD879B374DF5417D6BB3F546F5FEBF2FB32EAD7DC5DD30DA43CC5EC34F6513DEB707671AE6890EA346B2321FFF3745F84F64571640BD13D80B711E894B2F47BD935687472D610D1BCDB6ED2C247BFD7F56B676636627E3FA8EDEA73CBEF8FFED2D9F393FB29B0C7BAB2FA1303F729B0C7BEBEF03FFFF31673E27856BBCC52F475C3904960C59
        	1EA9F867C5AD290502770828A515A0F8B6D1B7CAC9C65E1D22EED4FEB27ED6FE3FC36B6309FE5F77F70CFDFF3FB92667E057FCEB0E2859A76C101DABEACF885E04BCD14BCB70B66609DADE02573FD35472923CA7457B8D268A3B9EAC53ECE9767B7E735231376B43E3FA8EF64DB715216FD2120D3C29E5683BFC10093CD7693A6ADC304BC2E12FC965E23C8AFB4D33E8B61A6F777D0CE56C6D659953F330EB7E30BE50DE8D750176FA12BE9B148D70FD835A6BDDAB5A2BD470E2695AE48D7C5FAEF807EC586E5C86
        	2CBB692039B0FCBF6FD3322C46782503FF51780DFCE90D67AD5FECA590585E5633A2D7B5820E9989B49BE891D07A860C6FCCE8545A2F9079537BB726E69D85EA846A859A3F915B5F751156FE1E480B0E81F9ACD08250F62052CD58FEE313567E45DCECFF9264F620FE20A9C033C47B57DA347619A6EC3F9064C9C0BBD2D2330EGD9D230FDEF2B56BED954EAF502FC90A88A68BE20E5A93817D7DDAE67E65FF1DA533F2D9C7537C27B7C4D29D947001A01BC1BD1BF39C156FF462E6937083D44C950BE9AE8AE50EA
        	A0E58B6A47B74A7A475BB47D93B6D143975A3F83548E2482C5EE41F56D62D6DCA3193D8557C82C2D7AB592329FD821081841D67D9A099C5FF7D72BFE0DE41EA4DF592ADFA311E38E95BBE2CA9118AA6C21B1F585440B1E1264BF8E08973DDB12BF9A90AFAAE3DA7FB1E2BA120A188E84440B4A182C81712297E5BB86440B4E116D9890AFAAE32A49C5CC6784A6EF2E9E534B52B123F3751872A4F9DC2E9E53F312FCC71E9E53BE89532BA64494A9B01DB50546F43DC90F69ADC9FE3FC90F29CADA335BE48A0D29E0
        	97E2DAA0B01D5C959A13B720BE191C87909DD01F6CBD89D3DCC0FDB29953636508E9C79AE2FA2EDC0FC93643EBE6BD26FFC872CE339E531712FC32D90F69100449A756CBCF8ACC538256CB65B19E9F30DEAA67B766B46AB1B9A4BB7D3DD10F29CC4274CF9BE2D28526C93650189E3269B149B9C9E93650188EFF946C3EE3BE42CB2D614D27F26C616925982E110E2CD7BF2A770AEBFA47425C635837ABBC3D5F9A2E910E2CB798663C36BB20C676C84476E23C35A45EFF66E6A5C7D5DE20E5C54D16818789F4B073
        	04EA374B27AA1996D559C3D2A24D975C9E0F194E79D425G93B51111C33309D5A56BF4937FA717659D7BFD59F95667B2F713F0A0D559CD4EE53E646E697138D4A55F52E7F660B9D4A50F479241E1E97410EFC0A91013EAB2EFBF7803429BAA3F4AD2B2EDCA8E8DD09D6C4FD830E0811C2E5DCD2A7F83EAFAD1BEB3DC0A596D6D86B7304086FFB847676A86C4641DC29EC73F7995D5A924B9DDE617233B572C92CDD5A9E2AC354FFC9E0002B5D030D7883AF924697B001AEF912B4A0BB4745C2CD2A0E632E58BGD8
        	9CBA911218F5C3210235B476FA7CEB04FCF6639BC16BB5267F1E3F8760D9AD76096D296C22BE388578DD4F629ECA0705946E89164BFE6622832C6F70FC792157C9725AEB493E3202F37BBD756478BEEC4305CCD6D4CFF07F4BCF67BF83GD0CB8788C3B7CCBC9CB6GG2833GGD0CB818294G94G88G88GC226F2A6C3B7CCBC9CB6GG2833GG8CGGGGGGGGGGGGGGGGGE2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGGD6B6GGGG
        **end of data**/
    }
    /**
     * Return the JComboBox1 property value.
     * @return javax.swing.JComboBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JComboBox getCboFile() {
        if (ivjCboFile == null) {
            try {
                ivjCboFile = new javax.swing.JComboBox();
                ivjCboFile.setName("CboFile");
                ivjCboFile.setBackground(new java.awt.Color(204, 204, 204));
                ivjCboFile.setBounds(87, 44, 227, 27);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjCboFile;
    }
    /**
     * Return the ChkAreaFill property value.
     * @return javax.swing.JCheckBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JCheckBox getChkAreaFill() {
        if (ivjChkAreaFill == null) {
            try {
                ivjChkAreaFill = new javax.swing.JCheckBox();
                ivjChkAreaFill.setName("ChkAreaFill");
                ivjChkAreaFill.setText("Do area fill");
                ivjChkAreaFill.setBounds(240, 24, 99, 14);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjChkAreaFill;
    }
    /**
     * Return the ChkFillRight property value.
     * @return javax.swing.JCheckBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JCheckBox getChkFillRight() {
        if (ivjChkFillRight == null) {
            try {
                ivjChkFillRight = new javax.swing.JCheckBox();
                ivjChkFillRight.setName("ChkFillRight");
                ivjChkFillRight.setText("Area fill right");
                ivjChkFillRight.setBounds(240, 38, 99, 14);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjChkFillRight;
    }
    /**
     * Return the ChkPositiveRight property value.
     * @return javax.swing.JCheckBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JCheckBox getChkPositiveRight() {
        if (ivjChkPositiveRight == null) {
            try {
                ivjChkPositiveRight = new javax.swing.JCheckBox();
                ivjChkPositiveRight.setName("ChkPositiveRight");
                ivjChkPositiveRight.setText("Positive right");
                ivjChkPositiveRight.setBounds(240, 51, 99, 14);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjChkPositiveRight;
    }
    /**
     * Return the ChkUseColor property value.
     * @return javax.swing.JCheckBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JCheckBox getChkUseColor() {
        if (ivjChkUseColor == null) {
            try {
                ivjChkUseColor = new javax.swing.JCheckBox();
                ivjChkUseColor.setName("ChkUseColor");
                ivjChkUseColor.setText("Use color");
                ivjChkUseColor.setBounds(13, 13, 99, 25);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjChkUseColor;
    }
    /**
     * Return the ColorModelComponent property value.
     * @return com.scoutsys.beans20.ColorModelComponent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private ColorModelComponent getColorBean() {
        if (ivjColorBean == null) {
            try {
                ivjColorBean = new com.scoutsys.beans20.ColorModelComponent();
                ivjColorBean.setName("ColorBean");
                ivjColorBean.setBounds(88, 80, 224, 61);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjColorBean;
    }
    /**
     * Return the IndexedButtonGroup property value.
     * @return com.scoutsys.beans20.IndexedButtonGroup
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private IndexedButtonGroup getIndexedButtonGroup() {
        if (ivjIndexedButtonGroup == null) {
            try {
                ivjIndexedButtonGroup =
                    new com.scoutsys.beans20.IndexedButtonGroup();
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjIndexedButtonGroup;
    }
    /**
     * Return the IntBool property value.
     * @return com.scoutsys.beans20.IntBool
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private IntBool getIntBool() {
        if (ivjIntBool == null) {
            try {
                ivjIntBool = new com.scoutsys.beans20.IntBool();
                ivjIntBool.setBoolConstant(100.0);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjIntBool;
    }
    /**
     * Return the JCheckBox1 property value.
     * @return javax.swing.JCheckBox
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JCheckBox getJCheckBox1() {
        if (ivjJCheckBox1 == null) {
            try {
                ivjJCheckBox1 = new javax.swing.JCheckBox();
                ivjJCheckBox1.setName("JCheckBox1");
                ivjJCheckBox1.setText("Draw wiggle");
                ivjJCheckBox1.setBounds(239, 10, 99, 14);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJCheckBox1;
    }
    /**
     * Return the JDialogContentPane property value.
     * @return javax.swing.JPanel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JPanel getJDialogContentPane() {
        if (ivjJDialogContentPane == null) {
            try {
                ivjJDialogContentPane = new javax.swing.JPanel();
                ivjJDialogContentPane.setName("JDialogContentPane");
                ivjJDialogContentPane.setLayout(null);
                getJDialogContentPane().add(
                    getJTabbedPane1(),
                    getJTabbedPane1().getName());
                getJDialogContentPane().add(getBtnOK(), getBtnOK().getName());
                getJDialogContentPane().add(
                    getBtnCancel(),
                    getBtnCancel().getName());
                getJDialogContentPane().add(
                    getBtnApply(),
                    getBtnApply().getName());
                getJDialogContentPane().add(
                    getbtnDEBUG(),
                    getbtnDEBUG().getName());
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJDialogContentPane;
    }
    /**
     * Return the JLabel1 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getJLabel1() {
        if (ivjJLabel1 == null) {
            try {
                ivjJLabel1 = new javax.swing.JLabel();
                ivjJLabel1.setName("JLabel1");
                ivjJLabel1.setText("Traces per inch");
                ivjJLabel1.setBounds(13, 10, 96, 15);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJLabel1;
    }
    /**
     * Return the JLabel2 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getJLabel2() {
        if (ivjJLabel2 == null) {
            try {
                ivjJLabel2 = new javax.swing.JLabel();
                ivjJLabel2.setName("JLabel2");
                ivjJLabel2.setText("Inches per sec");
                ivjJLabel2.setBounds(13, 31, 88, 15);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJLabel2;
    }
    /**
     * Return the JLabel3 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getJLabel3() {
        if (ivjJLabel3 == null) {
            try {
                ivjJLabel3 = new javax.swing.JLabel();
                ivjJLabel3.setName("JLabel3");
                ivjJLabel3.setText("Overlap %");
                ivjJLabel3.setBounds(13, 54, 93, 15);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJLabel3;
    }
    /**
     * Return the JLabel4 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getJLabel4() {
        if (ivjJLabel4 == null) {
            try {
                ivjJLabel4 = new javax.swing.JLabel();
                ivjJLabel4.setName("JLabel4");
                ivjJLabel4.setText("Major timing line interval");
                ivjJLabel4.setBounds(14, 30, 176, 15);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJLabel4;
    }
    /**
     * Return the JLabel41 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getJLabel41() {
        if (ivjJLabel41 == null) {
            try {
                ivjJLabel41 = new javax.swing.JLabel();
                ivjJLabel41.setName("JLabel41");
                ivjJLabel41.setText("Minor timing line interval");
                ivjJLabel41.setBounds(13, 62, 176, 15);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJLabel41;
    }
    /**
     * Return the JPanel1 property value.
     * @return javax.swing.JPanel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JPanel getJPanel1() {
        if (ivjJPanel1 == null) {
            try {
                ivjJPanel1 = new javax.swing.JPanel();
                ivjJPanel1.setName("JPanel1");
                ivjJPanel1.setLayout(null);
                getJPanel1().add(getJLabel4(), getJLabel4().getName());
                getJPanel1().add(getJLabel41(), getJLabel41().getName());
                getJPanel1().add(
                    getNbrMinorInterval(),
                    getNbrMinorInterval().getName());
                getJPanel1().add(
                    getNbrMajorInterval(),
                    getNbrMajorInterval().getName());
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJPanel1;
    }
    /**
     * Return the JPanel2 property value.
     * @return javax.swing.JPanel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JPanel getJPanel2() {
        if (ivjJPanel2 == null) {
            try {
                ivjJPanel2 = new javax.swing.JPanel();
                ivjJPanel2.setName("JPanel2");
                ivjJPanel2.setLayout(null);
                ivjJPanel2.setBounds(103, 79, 274, 66);
                getJPanel2().add(
                    getRdoScaleEach(),
                    getRdoScaleEach().getName());
                getJPanel2().add(getRdoScaleAll(), getRdoScaleAll().getName());
                getJPanel2().add(
                    getRdoScaleConst(),
                    getRdoScaleConst().getName());
                getJPanel2().add(
                    getNbrScaleMaxValue(),
                    getNbrScaleMaxValue().getName());
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJPanel2;
    }
    /**
     * Return the JTabbedPane1 property value.
     * @return javax.swing.JTabbedPane
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JTabbedPane getJTabbedPane1() {
        if (ivjJTabbedPane1 == null) {
            try {
                ivjJTabbedPane1 = new javax.swing.JTabbedPane();
                ivjJTabbedPane1.setName("JTabbedPane1");
                ivjJTabbedPane1.setBounds(7, 4, 402, 188);
                ivjJTabbedPane1.insertTab(
                    "General",
                    null,
                    getPgGeneral(),
                    null,
                    0);
                ivjJTabbedPane1.insertTab("Color", null, getPgColor(), null, 1);
                ivjJTabbedPane1.insertTab(
                    "Timing",
                    null,
                    getJPanel1(),
                    null,
                    2);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJTabbedPane1;
    }
    /**
     * Return the Label1 property value.
     * @return javax.swing.JLabel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JLabel getLabel1() {
        if (ivjLabel1 == null) {
            try {
                ivjLabel1 = new javax.swing.JLabel();
                ivjLabel1.setName("Label1");
                ivjLabel1.setText("Palette");
                ivjLabel1.setBounds(16, 46, 53, 23);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjLabel1;
    }
    /**
     * Return the NumberField1 property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrIPS() {
        if (ivjNbrIPS == null) {
            try {
                ivjNbrIPS = new com.scoutsys.beans20.NumberField();
                ivjNbrIPS.setName("NbrIPS");
                ivjNbrIPS.setBounds(133, 33, 62, 19);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrIPS;
    }
    /**
     * Return the NbrMajorInterval property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrMajorInterval() {
        if (ivjNbrMajorInterval == null) {
            try {
                ivjNbrMajorInterval = new com.scoutsys.beans20.NumberField();
                ivjNbrMajorInterval.setName("NbrMajorInterval");
                ivjNbrMajorInterval.setBounds(196, 28, 66, 24);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrMajorInterval;
    }
    /**
     * Return the NbrMinorInterval property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrMinorInterval() {
        if (ivjNbrMinorInterval == null) {
            try {
                ivjNbrMinorInterval = new com.scoutsys.beans20.NumberField();
                ivjNbrMinorInterval.setName("NbrMinorInterval");
                ivjNbrMinorInterval.setBounds(196, 59, 66, 24);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrMinorInterval;
    }
    /**
     * Return the NbrOlap property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrOlap() {
        if (ivjNbrOlap == null) {
            try {
                ivjNbrOlap = new com.scoutsys.beans20.NumberField();
                ivjNbrOlap.setName("NbrOlap");
                ivjNbrOlap.setConstrainInteger(true);
                ivjNbrOlap.setBounds(133, 55, 62, 19);
                ivjNbrOlap.setValue(100.0);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrOlap;
    }
    /**
     * Return the NbrScaleMaxValue property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrScaleMaxValue() {
        if (ivjNbrScaleMaxValue == null) {
            try {
                ivjNbrScaleMaxValue = new com.scoutsys.beans20.NumberField();
                ivjNbrScaleMaxValue.setName("NbrScaleMaxValue");
                ivjNbrScaleMaxValue.setBounds(145, 43, 90, 18);
                ivjNbrScaleMaxValue.setValue(1.0);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrScaleMaxValue;
    }
    /**
     * Return the NbrTPI property value.
     * @return com.scoutsys.beans20.NumberField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private NumberField getNbrTPI() {
        if (ivjNbrTPI == null) {
            try {
                ivjNbrTPI = new com.scoutsys.beans20.NumberField();
                ivjNbrTPI.setName("NbrTPI");
                ivjNbrTPI.setBounds(133, 12, 62, 19);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjNbrTPI;
    }
    /**
     * Return the JPanel1 property value.
     * @return javax.swing.JPanel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JPanel getPgColor() {
        if (ivjPgColor == null) {
            try {
                ivjPgColor = new javax.swing.JPanel();
                ivjPgColor.setName("PgColor");
                ivjPgColor.setLayout(null);
                getPgColor().add(getLabel1(), getLabel1().getName());
                getPgColor().add(getColorBean(), getColorBean().getName());
                getPgColor().add(getCboFile(), getCboFile().getName());
                getPgColor().add(getChkUseColor(), getChkUseColor().getName());
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjPgColor;
    }
    /**
     * Return the Page property value.
     * @return javax.swing.JPanel
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JPanel getPgGeneral() {
        if (ivjPgGeneral == null) {
            try {
                ivjPgGeneral = new javax.swing.JPanel();
                ivjPgGeneral.setName("PgGeneral");
                ivjPgGeneral.setLayout(null);
                getPgGeneral().add(getJLabel1(), getJLabel1().getName());
                getPgGeneral().add(getJLabel2(), getJLabel2().getName());
                getPgGeneral().add(getJLabel3(), getJLabel3().getName());
                getPgGeneral().add(
                    getChkFillRight(),
                    getChkFillRight().getName());
                getPgGeneral().add(
                    getChkPositiveRight(),
                    getChkPositiveRight().getName());
                getPgGeneral().add(getJPanel2(), getJPanel2().getName());
                getPgGeneral().add(getNbrTPI(), getNbrTPI().getName());
                getPgGeneral().add(getNbrIPS(), getNbrIPS().getName());
                getPgGeneral().add(getNbrOlap(), getNbrOlap().getName());
                getPgGeneral().add(getJCheckBox1(), getJCheckBox1().getName());
                getPgGeneral().add(
                    getChkAreaFill(),
                    getChkAreaFill().getName());
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjPgGeneral;
    }
    /**
     * Accessor for the propertyChange field.
     */
    protected java.beans.PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    /**
     * Return the RdoScaleAll property value.
     * @return javax.swing.JRadioButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JRadioButton getRdoScaleAll() {
        if (ivjRdoScaleAll == null) {
            try {
                ivjRdoScaleAll = new javax.swing.JRadioButton();
                ivjRdoScaleAll.setName("RdoScaleAll");
                ivjRdoScaleAll.setText("Scale to biggest trace");
                ivjRdoScaleAll.setBounds(9, 23, 154, 17);
                // user code begin {1}
                getIndexedButtonGroup().add(ivjRdoScaleAll);
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjRdoScaleAll;
    }
    /**
     * Return the JRadioButton1 property value.
     * @return javax.swing.JRadioButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JRadioButton getRdoScaleConst() {
        if (ivjRdoScaleConst == null) {
            try {
                ivjRdoScaleConst = new javax.swing.JRadioButton();
                ivjRdoScaleConst.setName("RdoScaleConst");
                ivjRdoScaleConst.setText("Scale to constant:");
                ivjRdoScaleConst.setBounds(9, 43, 156, 17);
                // user code begin {1}
                getIndexedButtonGroup().add(ivjRdoScaleConst);
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjRdoScaleConst;
    }
    /**
     * Return the RdoScaleEach property value.
     * @return javax.swing.JRadioButton
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JRadioButton getRdoScaleEach() {
        if (ivjRdoScaleEach == null) {
            try {
                ivjRdoScaleEach = new javax.swing.JRadioButton();
                ivjRdoScaleEach.setName("RdoScaleEach");
                ivjRdoScaleEach.setText("Scale each trace");
                ivjRdoScaleEach.setBounds(9, 3, 123, 17);
                // user code begin {1}
                getIndexedButtonGroup().add(ivjRdoScaleEach);
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjRdoScaleEach;
    }
    /**
     * Gets the traceRenderOptions property (com.scoutsys.render.TraceRenderOptions) value.
     * @return The traceRenderOptions property value.
     * @see #setTraceRenderOptions
     */
    public com.scoutsys.render.TraceRenderOptions getTraceRenderOptions() {
        return fieldTraceRenderOptions;
    }
    /**
     * Return the TraceRenderOptions1 property value.
     * @return com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private com.scoutsys.render.TraceRenderOptions getTraceRenderOptions1() {
        // user code begin {1}
        // user code end
        return ivjTraceRenderOptions1;
    }
    /**
     * Called whenever the part throws an exception.
     * @param exception java.lang.Throwable
     */
    private void handleException(Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        exception.printStackTrace(System.out);
    }
    /**
     * Initializes connections
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initConnections() {
        // user code begin {1}
        // user code end
        getbtnDEBUG().addActionListener(this);
        this.addPropertyChangeListener(this);
        getNbrTPI().addPropertyChangeListener(this);
        getNbrIPS().addPropertyChangeListener(this);
        getNbrOlap().addPropertyChangeListener(this);
        getChkFillRight().addChangeListener(this);
        getChkPositiveRight().addChangeListener(this);
        getNbrScaleMaxValue().addPropertyChangeListener(this);
        getIndexedButtonGroup().addPropertyChangeListener(this);
        getCboFile().addItemListener(this);
        getColorBean().addPropertyChangeListener(this);
        getBtnApply().addActionListener(this);
        getBtnOK().addActionListener(this);
        getBtnCancel().addActionListener(this);
        getChkUseColor().addChangeListener(this);
        getJCheckBox1().addChangeListener(this);
        getIntBool().addPropertyChangeListener(this);
        getChkAreaFill().addChangeListener(this);
        getNbrMajorInterval().addPropertyChangeListener(this);
        getNbrMinorInterval().addPropertyChangeListener(this);
        connPtoP1SetTarget();
        connPtoP2SetTarget();
        connPtoP3SetTarget();
        connPtoP4SetTarget();
        connPtoP5SetTarget();
        connPtoP6SetTarget();
        connPtoP7SetTarget();
        connPtoP8SetTarget();
        connPtoP9SetTarget();
        connPtoP10SetTarget();
        connPtoP11SetTarget();
        connPtoP12SetTarget();
        connPtoP13SetTarget();
        connPtoP14SetTarget();
        connPtoP15SetTarget();
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("TraceRenderOptionsDialog");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(426, 272);
        setTitle("Trace Drawing Properties");
        setContentPane(getJDialogContentPane());
        initConnections();
        // user code begin {2}
        initPaletteFileComboBox();
        // user code end
    }
    /**
     * This method was created in VisualAge.
     */
    private void initPaletteFileComboBox() {
        // update the cboFile
        String fileList[] =
            {
                "blkwhred.plx",
                "blugrred.plx",
                "frequenc.plx",
                "phase.plx",
                "rainbow.plx",
                "stratum.plx" };

        for (int i = 0; i < fileList.length; i++) {
            getCboFile().addItem(fileList[i]);
        }
        getCboFile().setMaximumRowCount(fileList.length);
        getCboFile().setSelectedItem(fileList[0]);
        getCboFile().setVisible(true);

    }
    /**
     * Method to handle events for the ItemListener interface.
     * @param e java.awt.event.ItemEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == getCboFile())) {
            connEtoC2(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Comment
     */
    public void jButton1_ActionPerformed(
        java.awt.event.ActionEvent actionEvent) {
        System.out.println("Options = " + getTraceRenderOptions());
    }
    /**
     * main entrypoint - starts the part when it is run as an application
     * @param args java.lang.String[]
     */
    public static void main(java.lang.String[] args) {
        try {
            TraceRenderOptionsDialog aTraceRenderOptionsDialog;
            aTraceRenderOptionsDialog = new TraceRenderOptionsDialog();
            aTraceRenderOptionsDialog.setModal(true);
            try {
                Class aCloserClass =
                    Class.forName("com.ibm.uvm.abt.edit.WindowCloser");
                Class parmTypes[] = { java.awt.Window.class };
                Object parms[] = { aTraceRenderOptionsDialog };
                java.lang.reflect.Constructor aCtor =
                    aCloserClass.getConstructor(parmTypes);
                aCtor.newInstance(parms);
            } catch (java.lang.Throwable exc) {
            };
            aTraceRenderOptionsDialog.setTraceRenderOptions(
                new com.scoutsys.render.TraceRenderOptions());
            aTraceRenderOptionsDialog.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of javax.swing.JDialog");
            exception.printStackTrace(System.out);
        }
    }
    /**
     * Method to handle events for the PropertyChangeListener interface.
     * @param evt java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        // user code begin {1}
        // user code end
        if ((evt.getSource() == this)
            && (evt.getPropertyName().equals("traceRenderOptions"))) {
            connPtoP1SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("tracesPerInch"))) {
            connPtoP2SetTarget();
        }
        if ((evt.getSource() == getNbrTPI())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP2SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("inchesPerSecond"))) {
            connPtoP3SetTarget();
        }
        if ((evt.getSource() == getNbrIPS())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP3SetSource();
        }
        if ((evt.getSource() == getNbrOlap())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP4SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("overlapPercent"))) {
            connPtoP4SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("fillRight"))) {
            connPtoP5SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("positiveRight"))) {
            connPtoP6SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("scaleMaxValue"))) {
            connPtoP7SetTarget();
        }
        if ((evt.getSource() == getNbrScaleMaxValue())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP7SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("scaleType"))) {
            connPtoP8SetTarget();
        }
        if ((evt.getSource() == getIndexedButtonGroup())
            && (evt.getPropertyName().equals("selected"))) {
            connPtoP8SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("colorModel"))) {
            connPtoP9SetTarget();
        }
        if ((evt.getSource() == getColorBean())
            && (evt.getPropertyName().equals("colorModelToDraw"))) {
            connPtoP9SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("doColor"))) {
            connPtoP10SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("doWiggle"))) {
            connPtoP11SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("fillPercent"))) {
            connPtoP12SetTarget();
        }
        if ((evt.getSource() == getIntBool())
            && (evt.getPropertyName().equals("intVal"))) {
            connPtoP12SetSource();
        }
        if ((evt.getSource() == getIntBool())
            && (evt.getPropertyName().equals("boolVal"))) {
            connPtoP13SetTarget();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("majorTimingLineIntervalMS"))) {
            connPtoP14SetTarget();
        }
        if ((evt.getSource() == getNbrMajorInterval())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP14SetSource();
        }
        if ((evt.getSource() == getTraceRenderOptions1())
            && (evt.getPropertyName().equals("minorTimingLineIntervalMS"))) {
            connPtoP15SetTarget();
        }
        if ((evt.getSource() == getNbrMinorInterval())
            && (evt.getPropertyName().equals("value"))) {
            connPtoP15SetSource();
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Remove a javax.swing.event.ChangeListener.
     */
    public void removeChangeListener(
        javax.swing.event.ChangeListener newListener) {
        if (aChangeListener != null) {
            aChangeListener.removeElement(newListener);
        };
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Sets the traceRenderOptions property (com.scoutsys.render.TraceRenderOptions) value.
     * @param traceRenderOptions The new value for the property.
     * @see #getTraceRenderOptions
     */
    public void setTraceRenderOptions(
        com.scoutsys.render.TraceRenderOptions traceRenderOptions) {
        com.scoutsys.render.TraceRenderOptions oldValue =
            fieldTraceRenderOptions;
        fieldTraceRenderOptions = traceRenderOptions;
        firePropertyChange("traceRenderOptions", oldValue, traceRenderOptions);
    }
    /**
     * Set the TraceRenderOptions1 to a new value.
     * @param newValue com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void setTraceRenderOptions1(
        com.scoutsys.render.TraceRenderOptions newValue) {
        if (ivjTraceRenderOptions1 != newValue) {
            try {
                com.scoutsys.render.TraceRenderOptions oldValue =
                    getTraceRenderOptions1();
                /* Stop listening for events from the current object */
                if (ivjTraceRenderOptions1 != null) {
                    ivjTraceRenderOptions1.removePropertyChangeListener(this);
                }
                ivjTraceRenderOptions1 = newValue;

                /* Listen for events from the new object */
                if (ivjTraceRenderOptions1 != null) {
                    ivjTraceRenderOptions1.addPropertyChangeListener(this);
                }
                connPtoP1SetSource();
                connPtoP2SetTarget();
                connPtoP3SetTarget();
                connPtoP4SetTarget();
                connPtoP5SetTarget();
                connPtoP6SetTarget();
                connPtoP7SetTarget();
                connPtoP8SetTarget();
                connPtoP9SetTarget();
                connPtoP10SetTarget();
                connPtoP11SetTarget();
                connPtoP12SetTarget();
                connPtoP14SetTarget();
                connPtoP15SetTarget();
                firePropertyChange("traceRenderOptions", oldValue, newValue);
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
    }
    /**
     * Method to handle events for the ChangeListener interface.
     * @param e javax.swing.event.ChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void stateChanged(javax.swing.event.ChangeEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == getChkFillRight())) {
            connPtoP5SetSource();
        }
        if ((e.getSource() == getChkPositiveRight())) {
            connPtoP6SetSource();
        }
        if ((e.getSource() == getChkUseColor())) {
            connPtoP10SetSource();
        }
        if ((e.getSource() == getJCheckBox1())) {
            connPtoP11SetSource();
        }
        if ((e.getSource() == getChkAreaFill())) {
            connPtoP13SetSource();
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Comment
     */
    public void traceRenderOptions1_ScaleType(short arg1) {
        switch (arg1) {
            case com.scoutsys.render.Constants.SCALEEACHTRACE :
                getRdoScaleEach().setSelected(true);
                getNbrScaleMaxValue().setEnabled(false);
                break;
            case com.scoutsys.render.Constants.SCALETOMAXTRACE :
                getRdoScaleAll().setSelected(true);
                getNbrScaleMaxValue().setEnabled(false);
                break;
            case com.scoutsys.render.Constants.SCALETOVALUE :
                getRdoScaleConst().setSelected(true);
                getNbrScaleMaxValue().setEnabled(true);
                break;
        }

        return;
    }
}