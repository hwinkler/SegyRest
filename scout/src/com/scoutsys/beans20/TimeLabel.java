package com.scoutsys.beans20;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

import javax.swing.JComponent;

import com.scoutsys.render.ITimeLabelOptions;
import com.scoutsys.render.LabelRenderer;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;

public class TimeLabel
    extends JComponent
    implements ITimeLabelOptions, java.beans.PropertyChangeListener, Serializable {
    private Font m_majorTimingLineFont = new Font("SansSerif", Font.PLAIN, 12);
    private Font m_minorTimingLineFont = new Font("SansSerif", Font.PLAIN, 9);
    private int m_startTimeMS = 0;
    private int m_lengthMS = 1000;
    private transient Image m_img;
    private TraceRenderOptions fieldTraceRenderOptions =
        new TraceRenderOptions();
    private boolean ivjConnPtoP1Aligning = false;
    private TraceRenderOptions ivjtraceRenderOptions1 = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public TimeLabel() {
        super();
        initialize();
    }
    /**
     * connEtoM1:  (traceRenderOptions1.inchesPerSecond --> TimeLabel.refresh()V)
     * @param arg1 java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM1(java.beans.PropertyChangeEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.refresh();
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoM2:  (traceRenderOptions1.majorTimingLineIntervalMS --> TimeLabel.refresh()V)
     * @param arg1 java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM2(java.beans.PropertyChangeEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.refresh();
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoM3:  (traceRenderOptions1.minorTimingLineIntervalMS --> TimeLabel.refresh()V)
     * @param arg1 java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM3(java.beans.PropertyChangeEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.refresh();
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoM4:  (traceRenderOptions1.tertiaryTimingLineIntervalMS --> TimeLabel.refresh()V)
     * @param arg1 java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM4(java.beans.PropertyChangeEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.refresh();
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoM5:  (traceRenderOptions1.this --> TimeLabel.refresh()V)
     * @param value com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM5(TraceRenderOptions value) {
        try {
            // user code begin {1}
            // user code end
            this.refresh();
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP1SetSource:  (TimeLabel.traceRenderOptions <--> traceRenderOptions1.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                this.setTraceRenderOptions(gettraceRenderOptions1());
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
     * connPtoP1SetTarget:  (TimeLabel.traceRenderOptions <--> traceRenderOptions1.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                settraceRenderOptions1(this.getTraceRenderOptions());
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
    public Color getBackColor() {
        return getBackground();
    }
    /**
     * 
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private static void getBuilderData() {
        /*V1.1
        **start of data**
        	D0CB838494G88G88G020EF0A6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E164DAFDECD4D7F6F7AA5AF5D52AD8955A12B66A320A03C862255EEE5A22AD2ADCC43AB46BEA5DA81B2216CAF4CB37ECCB325EAAD52D06148BE39B3361430017388AA9C3166D420690E388310C83589EE3707762815C44005F4C3C71BC7C664D73FBEF3E7C01FB4E7DF873BC4C7344E855FF7649BF5D774E39675EF34EBD775C0FB1E9B83622E6672E86C2F656907EFC3C1310023304B424AE0E88DA55206E
        	A10E67B860A0F9E0D5C3D9B724FBF6536F2FABFB215C8F70824D87D88A28A7AFA90D1C9E016F7D7C9D31F397A127FF0EF57E5CECF450ABF8BD823C8640D6DA67D545D94782DAB1E08D20823007EA367AE68B67EF7C5515A474B70D357B309F071CC0538D56071F17047CEB8DBA41C3FE7C537720EC9B1A983F940CC54F1841D85CB253661900ACE9E6EB2BDF094AFDD2C0D689D9FF83755AE656D1B9C216427750B052DE0C23AF6A605D8BE899967ADD7537717E0B3F729C29703D6B2A5F32E126571A610CFE1B7E
        	CA2DE6BAEE731CF05731394921A5537170FD21E3553050F1D4C59D1B7C3A679AE04CAF682FC4111E026FA240AA3F503D7B2A503DF2E989E98A343A6ADE66E7BAEF71E7F45F38CE2D7EAF9AA7BFCC60B8FAEFC20CGC6GB300A781EB816FG6FB0F9417A99146D812BB3960D4634F6DD6FD0C3C6FFACA42B705E5A8A9CCE3BA187E3C608909603BFB0CF6750C760651B73638F41EC3BCDC45C1CA8FB16105FBEDEDB13433672E0D76DD65E46761B995BFC3750EF8389745BD1F8C73983GC63FCB69058E7A2A5BC8
        	2F20B1025F2540BBFDDB7839F2C26852D47694297A0237F6F78EDD763E6A2B5DF61B69D0BD12510579F8CB92FD5C8474BEC088B083F89230F6C47878C07CDCBE9FDF57AC5950A4F5B89E50A5436A08ABEAC8B6382F9B6F3B79FA634843FE5EEF7B2302465D3691660F9A1B7E3714CE7EB7C3E7FE8AD0BAFEB7GAF85607E56103E09575FE737F30752492799BAEBE7930DEB7CBE813CA2G73554DB47AEABBFCB7FE26FB1AG57G9140124F042FBE0DFF78B963F14861A7A6FBB8F184CAB9E59952F54D34A4ADA8
        	5F128CC58A2832C9F81D238974E9E01E5CF1BACF0250C7372C4906E4A9B18DDA1722B28C0A496A7CACF1906B98B2656224078E22BA916DB6A78EC329CA26F5D38FC9161C2941782D890C3904F48BDA0486F00EFC063E2A33B0DF9443FB59E742CFB3D3C8EB9C859F0D8A3F7CE16290143D90A4325A5A6AD3022806E42445FC74A70E6238C07D902094309D603F23FBCAGF5F7C54C3FB6A2E23E6D64B324EF7F151CB10F683B4BE2ABF4B793732C2F906DEBA950CBG6500ED003D77E0EE817A6E09F56A15383EC0
        	0E30E3F5F4FE8C234E623D043F23ADF5F7F347FA084B177212757DEF1F2BEFCF5677DB0E77FDA413378E38485770F23723AE4C02F34E9C37EC6B651CBE5E38F920D63D47F4DEF2AFBB2F9C1F41B9D48C74B24066FBA28EAA93DEB6BFBAA4D396B3E25000E016C31928E0F5DFCD225EF2C256AC1F2C4BDA88DECC9E0F2FA777E466CAB8E64771FFD0BA6620CE88E653261354C1C607B61CB3CF706BA8DF32ACC38944ADF9D836ACC59B4F485727D097F3DEFAB3799C78102E19D5E0E37D189DBBAA521A607B1ACD7B
        	FBCA43BA911B96D1C7327C0AB25963F4AD876D7300757158C3FDE4470DB3969E2D8F3F5648E344435B5A4D6369AD3BCE1056A984DBCA819B81C452BDA781C3127047F722E38B3473A87A396B7CA66DABD7BF7BFE01FD3178391BF60FE5B91DBB16A75239E3F9B23DF02C265339E215718A52180703B1CD1369E43359046D97DF73234E0A26D837155038EC8DABD3B2A1ABA40C73E3B4572760FD29A472F17247A2D70C6EDCC9D6DC483D9F723D53DD3BC5E2B1DCA5E5F285536931A94C9532AAC741A91D3138E6B1
        	7A9768BA4269260752F685F01D82CF85659B68C5E3D0C7B34C33047137A5AEC169BDE9EFEBCFBFDC575B764187173CB95AB8EDC59473D49361ED9DBCF40536152B262285A332B9A49B43302D54C2DEECB15327A1078D590C1CBCF56B54D95656770F75383695156E478C9006C16CD3B4196E2592125ABF6C5EEA3350710D09855AD5344536FBCE347BF751FE57F62199CB01AC3D38264F93517617529F39378DA3605E864A3175C51F4518E98C401A8D7085447A6219C63E58E7700525B3262AAC5C0137A200317C
        	3B0986C7FC0E8678B994CA46EF19F17237F27EFEDBBEB40FFFA2184DAF4A43DF1B073FB58F3FE1560D4F7C23BDC07F0400BE83D89A947EE91BBE6C70CFDFACB691577D384364796127B37518BB6449388C5BCFE4744AE93E07BCB3F3A80BF7CBD263193D6905994C1D2A23CD16D3CAA5246B069205204145175BF0753E5386BC276339FF85684A64FE3D95F30C6398CD726500CDC1EC37A9AA5AFD9E3E4B032CDD7CD6C348FFC2BBAA7C96E2EBF6DB082D4923D07EB7502BE52C970C09FAEBB83F02575F966267A9
        	DA6FE5DD549B12D93D081C2B5EEFCD0AFAC53C5E2A1C75068CD12F02575B1A335EFED3542B8F33FAA743736B3560B7F9B2AE4E749F5A342FD15A65DAC2E62B453E2F3F5EF9A7326529B3B9F3B9E2A64C5AAF8AE76F7B3EBC076D16823DACACE26E9BB34E18EBB74DD8D02147909EB709D9E71EE73469599FC299D68C934E16A1B9A5E26C31D954954FA91C4CE36CFBC770AEA67B5C5595D22C18E19FD20318G58BD47CB896C935BFAB9AC56326F8DBA6FDC4616DD2CFD4B457E3D634C6E5363997B475609BB1739
        	54193C3AF4A6BB6DB57816A2A7059DC35D394E5A5932DD893AD24EEB007947FA10FBAD1DFA00F7F09376DCFE70G069E4EF3EC7EB21F4C5AF7BFAA58454E423769D998E945C05B84E808A0FDD9945B43F943FC77B5D578EEA47C8CD97154A72E3E9B09B01F25A2995F255E0BD6337E56E9223FD260EF8530B97FEC74D04EB9AFF2C2FF8C75415503695352F30577372A60E932AAF42976C08EFD8A3FF825562BB0BD2EA999FD8A3B756AA781CC278EDD68349C6AD4A8C227E7F4ECB3EBA74047F1699D0C5F4C52A5
        	6658050BCE3DB6FDF8B927DE7E67BE282D3B4F74E93A1F512B6D1B5F5DB984E0FA3DE96B1502BA257705DE21C91C0B2E3B8AA26EB97EE4D248EF85D96F0410FF4F2072EE3B87DBBEED88799110AD3265B7537C3550AE0149FFEC8A798DA0CBD4A17FFB667C313C5D6C4CCB6A8F5ADC73D20B4AFC5527E66725E3D7B036A3C01FD1C5DE2AFA007BE81117EE40DC1234F1D835C42ED9B967E1F306FFBFBBD7A3668C91E7083FCEE45FED95291933DA3163FD8D3C172B620EE4349D57284D703D9D509005FD8C20AFAA
        	F4BBFBA96F1DDBD7EA01BB3767DD6F5C68BA98FD78BC49646EC4D12EA0875F8DCCEE024AADDF049C9B5B5928F3EC4B7E313F5663B2369BF85B9B2359E3DB5F093EEC54F44FF9C09FA084D82289DFCEDFBA1D4F17621E0DBB115934C1DB4807F4FC3579767233FFDE398DD9F24C0EC99F4E1B4D405B8EE808691EA6009F2083164504BDFFF129A31FBD6D62F0680F592F1D5907BE216FB57D516C3C15D72EA4164B4E6FF6211D6B013799D085E850F5CF8B408FC869424EF7AEDF4CBB87F0A1849B29D98F9B487474
        	CCBE1AFD87734AAD57F3497D59A376772D3CF225B97B1BB39E2D3F5F4CAB37A1E7FF1FAC785B09FBFF3DF965B66B396265ECB73DDF83DE5D24080D64E53C239139FBA826E89691F97B44955C5B448CE5DC51846D942585E3D05F90F7572F51BDE0A3345982607759E9240D4237E553DE20346570DDE25336D0DAB9FC3FEE6B94EAF73F6319E84FFD47B3591E7B0EA7593E70FD65DC3B5B9D90536F1B77059D0D066EF91760BA7B4AAEDCEF8D589342110AF64776AAF26AB81BE7B7629A1BEA5823191D9B6D71E83A
        	C677FE06307BF8C7B34937E7754B12B1988E5B49E8D81703421646CEF73F9D6B4C6D371FF466765B7B1D8B7B6DDC271B5F180F7E497A9149F1BFB6A0C5E5A2761ABB34BD3C4E10959BBAEB37BD6DF33763D7FC396DA874E19C1B3138911433F5FD5C57E873B2396D3AA5C7D19DD6E7B91537A4E3DCFE4856AFD1F946F313DF6543FDFAC089A9863FA1E1B64E694246AEAB561F3131324B5D46FF6F4AED631BDD6EB6D6DF4DEF633E2B6EB6B6DC4DEF633BD75D461C595ABA6934355926D74D231F3369FFE4B86919
        	FBAD4BF452BF32F53C500D7B19147D5DCA3F53C41C79E2E3F83699B7A4BD2284CD1FEC868DC50739837BF28367F28D7D0DF6845E17825682B69919BC495A78EA9247B1ECC838592613EB09C96FEC5362FFA11ACCA66363E5489477AC3FFF8ECBF55E9D4B26345B9D8B139988639A9E10029363861CB2C35D8FE94FF4FF0376DF8EFDED839C35666B4EF47C4EFD21E39B7007GBA2088D0EA099CF37E5ABE67984E1B0F5E64C96AF7473FB798D467B37E07753FD09247BEAFA7717FA20EF36C6140B82900BEC7218E
        	3E4F44451964DFD23847CCC801F1A5EC0E0664309E1FBAFB618CFCB1FE8D8EA75F539E38E81F058BCA48067A632E7F7FD099E73EE8C8E47634C7FD7F3C0B1D473B689A03F2FD40DF12C01A19F65E19210E27GE75017147F74BCBE0E55531C4FF47B68D3215B5877CB497621DED75D4A39CE153CAC712E2EA98FDE2EE6769E1942FE6CED339D874D6719FF1B26503FE7B904FFF17DB81904FDDE0A7955CA897F6E1DB96870EFC2B21A4F23F309381B281B903EA8CE89DFDC18F05A0A6D0C6FF27AA2B231302FFEE7
        	9E9F753BB90FDFBE116DCBA17FB65579CE32G4ADF8B0761AFD298FC22286009A70E9486BA6A8ABD1D3505414E3A42DD9D3505811F171C6FA4F5C1DFC7332FE30FB75015FCFB5267EB8AF6274DE443F9EF20BB19CC9E8AB4852F3E1D1C9CA635010E1F9F7CD1C7EDA4687B494D9350CE20991F5AC2090E5F11C268AC0C7D0927A0CD6F9613C257CD609F0C69C81A0F9B9D0F77D34EF877B846E4BD4ACFE566A40B13E37B1C67324A72415A43AEF15244E547F839F65FEAFEAE7376603CDE8674E2409AC085E08B00
        	CC0BF97D75EB6853F6BDFCC3E60BC03F24C96374768A768DFA78FA943E1CA9116FA5FB5279761259E0F6BDFEC4447F6B5EBFA0653F61F53D27BABA4D6CE963E54B0155B519BD696ADE34CD85DEA12084309E3091D0E95B3673BABFF762D688F6BED2B0C2EFB86D0D15A2A7B3E4CC5AAC2E86263C289059F910BE75D96F876D6717635D458FAC6E1F1B92F1DFBD43623EE84699773EE9E79EF2467DAA2857B01B09FB96D77BA6969BD7EC4CCAE8AEF0BE85C0A8238FA1ABD73E78E2E5A5A1BBF63C718616AB60A9AE
        	46BA78307ABBF6E46A6F208FD974436E55DECB6E65B1FD9E6CD3E7459D2DBCA36674D85F17C9493AEE5758AF66FED9BF1B19534C4E6B29ABD04ED6917266F6B813F16C78CF267FC3C07A768C662A38EF6858E9A9B1F61533ECAF32770173B72C7AFE9C3B93C0EB81748146GA9C091E08560F9C04583B15F3A2E63BE009DC244FE243535F35CA7A714200C3F97708DABCDAA7CDC5803E7994D5EABFE50633C63637F9B55436EF2D9023A9E9274169E0C19102A525D8823FD52036B29221932E6AA16122055B94F57
        	D3BF1FC7FFBEE3360E8C20AF3601ADF5F33A67B4608A40BFA7ECFB39077F3E11A30FF40546F16F0C7FB1E6093E7E3857FD1F7E273D797F4F6C9B3DE8F3A0E6D931A836AF68FF590BB6DBB11D92996D25DE0CAFB8EEC7ACD61553B776621A2D4AE1CAE6717342D48149443D08777F6F074D135D53E21E686067D5G26E3E0FA8C4AAAF20C228C3246AF9222DDB6879E1F96F3E0739C1B835B671C7F8776FAF2317908496DCAADD60E456172C1542721C0771C84DC830CG74827B0E234FCBF24DB17AEB1C9C9A12D4
        	B8DD7131AECC55BBFCAEF29A737D6A1470FDA134DDE637FF349FFD10D4C2D60408B8BA5E0FF7B7919983CC507E075603996D2877FEBF66B3B3A8E92A2249C3D208534F76E3DF0134C5FF2641DFA2987D63FE1C7BA14912587745FE741D4ECC6032D77A518618A91A49AF9514142CB2DEF796AF186E174C89469B9BF01FFF638379671FBEC0FF9305F963CF6BDC5F78G3D578A07CD59764354C03DCD3BEE8E45B03144B43E16CDBFDA6C3C33E8B9B65E4FCC3B0F77376C39D685E35D7418986F9503F4ECA5AD245A
        	B9666941C3FC3CEE48BA24DDF09D7B3918733FB20863E6AAD35CAFDF9D4C7E3F831E8387314F18F9233B23CB030323EC725FC696BDB7185C3AC7147B76A30E43BFACDA6E7F86GD0CB878810937B75CD91GG28B1GGD0CB818294G94G88G88G020EF0A610937B75CD91GG28B1GG8CGGGGGGGGGGGGGGGGGE2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGG0791GGGG
        **end of data**/
    }
    public Color getForeColor() {
        return getForeground();
    }
    public Dimension getImageSize() {

        try {
            return LabelRenderer.getImageSize(
                this,
                this,
                getTraceRenderOptions(),
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
    /**
     * Gets the traceRenderOptions property (com.scoutsys.render.TraceRenderOptions) value.
     * @return The traceRenderOptions property value.
     * @see #setTraceRenderOptions
     */
    public TraceRenderOptions getTraceRenderOptions() {
        return fieldTraceRenderOptions;
    }
    /**
     * Return the traceRenderOptions1 property value.
     * @return com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private TraceRenderOptions gettraceRenderOptions1() {
        // user code begin {1}
        // user code end
        return ivjtraceRenderOptions1;
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
        this.addPropertyChangeListener(this);
        connPtoP1SetTarget();
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("TimeLabel");
        setSize(42, 307);
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

        try {
            Image img =
                LabelRenderer.renderTimeLabel(
                    this,
                    this,
                    getTraceRenderOptions(),
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
        if ((evt.getSource() == gettraceRenderOptions1())
            && (evt.getPropertyName().equals("inchesPerSecond"))) {
            connEtoM1(evt);
        }
        if ((evt.getSource() == gettraceRenderOptions1())
            && (evt.getPropertyName().equals("majorTimingLineIntervalMS"))) {
            connEtoM2(evt);
        }
        if ((evt.getSource() == gettraceRenderOptions1())
            && (evt.getPropertyName().equals("minorTimingLineIntervalMS"))) {
            connEtoM3(evt);
        }
        if ((evt.getSource() == gettraceRenderOptions1())
            && (evt.getPropertyName().equals("tertiaryTimingLineIntervalMS"))) {
            connEtoM4(evt);
        }
        // user code begin {2}
        // user code end
    }
    public void refresh() {
        m_img = makeImage();
        this.repaint();
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
    /**
     * Sets the traceRenderOptions property (com.scoutsys.render.TraceRenderOptions) value.
     * @param traceRenderOptions The new value for the property.
     * @see #getTraceRenderOptions
     */
    public void setTraceRenderOptions(TraceRenderOptions traceRenderOptions) {
        TraceRenderOptions oldValue = fieldTraceRenderOptions;
        fieldTraceRenderOptions = traceRenderOptions;
        firePropertyChange("traceRenderOptions", oldValue, traceRenderOptions);
    }
    /**
     * Set the traceRenderOptions1 to a new value.
     * @param newValue com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void settraceRenderOptions1(TraceRenderOptions newValue) {
        if (ivjtraceRenderOptions1 != newValue) {
            try {
                com.scoutsys.render.TraceRenderOptions oldValue =
                    gettraceRenderOptions1();
                /* Stop listening for events from the current object */
                if (ivjtraceRenderOptions1 != null) {
                    ivjtraceRenderOptions1.removePropertyChangeListener(this);
                }
                ivjtraceRenderOptions1 = newValue;

                /* Listen for events from the new object */
                if (ivjtraceRenderOptions1 != null) {
                    ivjtraceRenderOptions1.addPropertyChangeListener(this);
                }
                connPtoP1SetSource();
                connEtoM5(ivjtraceRenderOptions1);
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
}