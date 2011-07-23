package com.scoutsys.beans20;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Vector;

import javax.swing.JComponent;

import com.scoutsys.render.ITraceRenderSize;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;
import com.scoutsys.render.TraceRenderer;
import com.scoutsys.segy.SegyTrace;
import com.scoutsys.trace.ITrace;

/**
 * Seismic drawing component
 */

public class SeisBean
    extends JComponent
    implements PropertyChangeListener, Serializable {
    private transient Image m_img;
    protected transient PropertyChangeSupport propertyChange;
    protected transient Vector aSeisMouseListener = null;
    private TraceRenderOptions fieldOptions = new TraceRenderOptions();
    private com.scoutsys.trace.ITrace[] fieldTraces = new SegyTrace[0];
    protected transient ComponentListener aComponentListener = null;
    private boolean ivjConnPtoP1Aligning = false;
    private TraceRenderOptions ivjTraceRenderOptions = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public SeisBean() {
        super();
        initialize();
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * connEtoM1:  (TraceRenderOptions.this --> SeisBean.refresh()V)
     * @param value com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM1(TraceRenderOptions value) {
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
     * connPtoP1SetSource:  (SeisBean.options <--> TraceRenderOptions.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                this.setOptions(getTraceRenderOptions());
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
     * connPtoP1SetTarget:  (SeisBean.options <--> TraceRenderOptions.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                setTraceRenderOptions(this.getOptions());
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
     * 
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private static void getBuilderData() {
        /*V1.1
        **start of data**
        	D0CB838494G88G88GAA00F8A6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E164DAFDD09C67F92799A53DCE54D8CDB42A5C1193DCE38F0E1584271A297FD047CC2ACEE9CADBE72236EAC719500CBC31472E0BBBCCCCEB45FA5109B3CA7481B216D5DB0E304091D8FC9C472760B85D9D07G8BD99789ABB4D5E634F73787AB76F6CF3B4B1784D61F67FD775DDB0EBB08B4EE7E698D3F595D67F9BF1E2F775967FD97D2FBAA3732E2FFADA19515447C75D490D2F816100F9F3A7DCF1CD6D5
        	27B8096D779E2006EC3EF9G2EA70077BAFD5E51FA882EC7GEE200D8336G2A496E5693A6FD9E1E0F1877080A7D04F85F43B65F6DBAE12317186D2A0157GA827EDDEE93537D98734ED00A2C08960A0156C6B9F771A7CDD1FFD0C447E79ED57E11C47560F43FF1A4D91B32F0414D522911C64F0G75730627A7FDD1B5512AC75599C3DF50DBA3222068FDFDD7C5C98F42AD3459F99A657A0F2EAA5A0F10AD70FC239EE9373A5196A7605E8D98296772DD98771A7367FD6D8972CC68D4D679726A19DCC575A9794A
        	C7B7D5B0997F72E8FDF699BDEE1B14CC46F75B380CD58D160C6DA8239F1EA7GC90B7E1C87698EF84E85BC5540E59F3E40E5AFDD3F1538A35E2C32BF5340E4AEEBC849DE563729623FE81CB44868C7777B90A300A940FA40D6C0B1609D603DC13EFF73833886A246201AC828CAA0198C4AB16D129A93E5386F6B830EC93BA2C6D5ADC6880B41573A1AB3484331677D657107E03A7D127038E9A87CAAA1FFD86F2A4C20DBF1F458D5EE0EF16867A95DC6FE0EF6FB167A3C996EAB4CF1997D5FA9FD3D0D1EBC0374B9
        	CA4767FC609DBA436DDCBA4DE5F197BEC24AFF77346B758C329C7A578B2EEDE7188C45E7D232B09B3F16C09B17833D36D1F1B683C20098E0DDA337F153F447DAB69ED58CD1D384796ACCA4A9E8C6F0C612E322E65A7AF4DBB6DB67B62E3473914B9E4F52385B56486CD1E951CBA93D48C6B76DC469783C9BF87EA6D8CF347D758E2467B5250FB3C969CFB5250F7312070FD38CBC77870A1359AA26222DB642F3812088D082A0E7956749335CD646F45BEF980FE11B1DD85F9679B8DC45F9C393C6955D901428F8CD
        	50A4A1A20BBAB15BF44BE8534832FE7DF41DC4E10EE1D191B54110D485C69792A2B8C5E7EDC2F28D3651C44A9D1792A2CC10C892BE6E187C86DCE5C1B7BECE4684C3CC35E07CF199E3EED63886A342G5876AC5A6A4DEE4C97DE381FB84B6D7479A4528A603948324B5F494760FA9102C4147B7AC2D294459034853E9EDF682EC63F61184DE0F3C032194779CB93BC4E3D0D0F1331A3410CF10EA8E8B6F3E1F3AA4E597865F47CD220D737407800F08BFF9FADF5CF2C128B32014B18CEC79D78BD6A426658F4DFF3
        	3CEE2E7BF43A53F6DFC9F8EE4A6F3067260D4F85B25AE9D7C95815ECE1B2BADA527301DB43584F877A8E401E966E3F1FA46AD8DC8785DD6411FCD903A094E3A9EF32362FABC7B10EE7C5458809C9D109410DEE46519165E0AA46632A95FF35140E39E39002D03768EFABB50C8EE358D78C671F26FC41B0B4A9B2E308D7C543101449D47F8F28AC7A3234241B31FB0E3E6B76020E352D5CCFAF34A32D331545A1237D0852304D0855EE295D6ECFECFF2F3E4D86DB4CAC1B4379A90D4FE3064D916928B2E344E95192
        	14B685BAED3074AD73CC585AFDDAF258633C069C6E18B0472F7CBF180345C3C24D9E1B061AB9B6EF2B19E3B3C7DDBD769CEA2658E33C87D44C07D1D5D1C43AF8ACB6E1F55BCB63A83324C846AF255824E8DC15EE0BD06FE2DC12E61AF31F027B62D61EA3676A795A3FDE7198496D4EDC17045E99F5B53431D86DEDCB2DFDA65306A42EFDD19693E014C1F5C6B198FD934D67A6DDF7D25A1FC54E40352E11170F4DEA9255506B3CADAD3EBA73213D59181274A6B7E1FD72C3287338A6C445ABE8F96DB2EBC6CC7E2F
        	9B5BD799F3E5BFBEBA6F9FF82F03764F52328EC73146564438A66AD30DCD571A5A894BFD120E7ACF00DDE4403AB61E7B0E5DC2BEFFF719C9EFD015E566BA606DEA23FE69293559FACB9B5B5B9C3178934B78F5EE468F4315711F762D5E7F05E57C18BB45E772EB862DF3003E9DD06C6672DF3C7506CD7EB1D51D1EC90EE3D541EB8A8D5F0D3AF8EBC60412839997458533EE98500E25712E8972CC2A9E9952FE8AD759B6A60B5F828169C9CDCA40EB81933729437F3459F5403D996E75CAC0D6566F87F7B1563817
        	CE36E31FBE8F6FD3866D8E3533BE781CCB79DF69B849ED524EF279E2BB4B559B607AB3201F74E0BB291337FB5146477687BCEC3CA95AEE301B6F015AAC5A2FA86D9597A1CB87787B76D235FD8F396791F746B50758EA0EDF68C9FF5FBEBA036316G3D54437DD528597D9550F5B5AA51324D34392A5B5723193B741F40B5AEE9BA5462B1F15E4ADDBA4A0AF51DC9B67DF3F73E152C2CD307E21221EA7C75BEB8B7E86527EB12B84775FE7E32FDEFFAE363006B27D974BE504174ED68C8693D584777264F9FBF3D26
        	8C23D1DCE0ECEF7AC08F6A0DB244BAF83C0407B36DCD5275981A2599ED19B24CBE73C6661C770901E7965356BA780C812E077A1745BE13670B56DEF98B4843768EB25DBBA0EDA7508EF542FE2A93690FFBF0BC0CCBE643BF11398DA7620F135CC74EE73521231359AE3FB3E5433C4D1BAA58FCC59DFC3E92601F68D21CAC97BE6D41F72A19C04D7CF83593E540D448E4687D50EF4E111F73A8490F79DDC7B348605894F4053B585C73DDA9991E79720395FBGCC0E11AEAEC79134A15D5CBF6BFF0DF119CA36BC06
        	3A7B6DF36FEE8BE41CFB7C09B6D7EFB71B73C6F7EA6E501F9F58BF81B077649E7BBA14DF76E5DD077966985B3B5357E17DBC7AF29750DF6C666BF02FD1E3DB07D7A0F684E592B29CDFDBDF1DF13298B11F3FBED349E304701CBC3D00390B74409E915089988348BDFC0E2E59B57756C3732B6C2DB776246F2D577724EA51DC5B7DB638AF6A61755CDFE55D13A3F6772C2CE7D9BF4D037DCAB370D72F6DF2E83F2A5E5F3C9F736DD2426E5B42E7AF3B1CD9FC5BEB0EBD521B6E5B5ABB6883875073G5B81BB81E53D
        	5C87F7E71B5772815F071B46E7BA7DED47EAB6C4541EDB2EAF6B37FB4DFE3DE97D189EB797717D95861E8CD88748856CG14G8E74F1FD7EE6B63816BE81DE340E2B566DE0FAB14A657DE85533326CFADEDF335F493ECCFAFEFF89756C84DE98B085D88748876CGBCE769F9EA2EFF4D3503099FF424EA2DD4104D77812DB92A7AA1FF7673316F4C6119A5DF7BE1D5D28C4257FD63BC3E8BD4CD1A1494CEEB2134288A6DB5CE5397326FB5EEAFE45EEB64ACE45EEBFCEEE175FD709796326DC558DE77897A6EEC84
        	7DC6G0CF6369FE9B2BC2F33E8E3DE24654373F60BB6CDE93B6179001753CA5AF85FC6203DCBB0577F43FEFC87E8708E1592A2951F3D83447977181F2E4CA84CD528011E3E36AC7FBF6445775418177B627D5B1E8CFEDE7E0E9F97856DF2BCEE85735524986536B9F9A73B9F6A6FE476C3531D4CFEE83B333A9FFA6EE4738333518F0DB7C906FD5FC7C2C2A4FC9FD359F950EC93B654F03BB5363118DD0FBB0B1975781DC50CE3DD1D5122E23A2C0E459396AF35B6C68DB1016230B6FFC07B9B0286FB50747E1BE9
        	FF464B567F61C52CEBA2D2CC524C5D92537133DDDC47A1C33D14527179256CBA16AEE55671C7CB59F57C71525ABA3ABE492E6361CF56567178A72B1F83345D4577553C755CC11F97882F45559B38471A540464149455C3229E5524A444B6A165DEDCEB5F6AC1992660FE8B20987022B715B75998CF4E211D631A100029E9706F9C403E41FE7EAD4C8F4F63G83309130ED0057E85F68402BACC4C4590A4128B75BDE1D7579A80EB9BAA2C427A7B5281AE343AB24E732FF460B731F74A9CEAFC076AD171D4978CA9B
        	17F1BD70F381050092GB94FF340435E43F69BAFDBAF5F6BE92431E47B3C25D119DBD74A5F5E3D77BC4E39372701306F130803A6500FF5405F8A407B62733C1EBE520FB5442C901914627A751898CF4E5CEE6FEE05A746EF44D711D9339C6D37EA7B1C2D24283ABE7B37C53F79ED511F2AD9B6BBDE5D4F7697D37D7CECEE8B70F77A1136295F3EFF46398300D634A56597AD63238E7F3D0C7F1F4B7887D774EF765A79686B17AB981F695675AB2E5B0DFFABA0FB4317326AF6B240F4721B572DF5851505211B954C
        	DE8F51F92C324A0AA3CFA7734F1FFA51BF6DA638FF707DB08F63658519DFF68439FF3E642B3179E7D650BC1D689C4277EA6F3A39AD4B025C16975D6936FCF919AD165C6936ECDA467F06FB05ADAB6C7CFFF1275B1277FF0B4A7CF6EF8EDCBF970F435F14A37A60061C879FBC6E08842B9C4EC117A3BAD865589FF4B9A221BA52B9C82A222120A794BCD897991AFB6BD6A8640E8EAF68F3351DF51161393939E391F77442DBF3372E92D7A4780B1AB7032E29E8687D0F9BE01C0887FFAE07C07DF75C811345F1BE7E
        	FBE690E53D5C4BE5ED06E7DC93CF8DB23FB1FFBC57EBDFAFCE1BCFEAC30A73C6A83526D91C1CBAEC2F5BCB0BFF61FAA3CB1C6418FD8B4C6B764385E65D7E7BBE4C8BFB00DE86289AD21CF500CEC0F8086705B383E853C0B2FEC5E4C97E12208813F4B78FF5C1B2BE1A00A7FBCA65E75C7DEB55261977A38F9C6771DFD677CDD27C7953D9776D729053E73DF96DBDDAD0192AF15F7123EE5B01378B3097D0FB81EAA9007F8257CD99B077A5D86AC0E5A3C42768090FD5B8C962DC0A0CC91F45555FFB6BD0A0D2D1C3
        	FF55E977B5566F7F47FD96BB3038778C70389F3F40623E6402BD6E7FFA401E076CF1DF8E6DE2432938B73FF53B6FB52E184FA41A8B6C3F9CA094529FA10FBD766DEF17169232EF5F2B2F62B597FEF9F95886FF2C7D3EFD29767B680F5C730F1D65BC51FB480C69F5205F76E1FEE6A5AE72B5FDE36CE13275DB23D9E33F4C34CB6DC8EACDB3BDDD677CF0DDAAA76447FB4106A6763D4664DF81246FCD61EEB91313796E6CB96EBB7F882BE52E0F584F43178268BB83E88E4096C0812088D082A8859C98051CB24A57
        	5BB787300EE01B8CDE4F74758DCE0644D9A9AA627929D9105224E2FE9B7161DEC531EA41BF72594F00986DABBEF686469254E80C539F75E14C44E419D6B36619128F5F2712220B0AAE9952ACEDEE721E74D5AF675123F8266BDF845196DE50E582308858G4833F48B1CB74FDAB364112158A45646789F87861F2B411F3D8EBF6BDF7B7F94BA7D28F3C4B58CB50163F3FA1F9FF5B654A4A5B25AF9BF4697EC27278C5614FFDB7053BD269827E496BFE383B9A49577BC5EFF5BBF36CE3EB04057C9A158399C40E4FC
        	FE6086DC4B49A90AC2489A1FA67838EC8D9C373E8939BFE4EBE06CC33686D8BEFA3277DE73916B7774BD77E3F1D899C2F9E2A043BCE0B3A09FD078A10F436F786BC826B5C63FCE083130A0436E4974755039EA1B4DF9CEE3367FCE9F377DAE983B7AA29F7F7782E803B9A9E6CC916BECA400E7B3D3A2869827FD09360395EDEB37B90079CC0F8A0AACA9E2D8081974AF87F02E4802A16AE1D19B839E236785F06D4784C3E04F798134DD1229E0767DDAGF500152268662101B4AF4A0C37AD0D97DD38A468536699
        	DEB07B7A5B99DCFB7DFDAFC83F91413A99DFC81A727EA0C84F2D62F1DD346C7043E035C59B5543AAA696D5B14F16876EAFF67E781E7BB1FF3BFD597DFD4D477DBD823E4E317CFDB8C4FDABA8B1594AB14768F7E6745795B189E997CC47BE1F717FA989215FF46936E9171F05523FE11AB9B004F32A7A15616010829BCFD1E77A7DE35F7D5965597B6CF75DF7FF7DEE5EF33F7F9DGD0CB878856041D118B90GG68ABGGD0CB818294G94G88G88GAA00F8A656041D118B90GG68ABGG8CGGGGGG
        	GGGGGGGGGGGE2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGGC590GGGG
        **end of data**/
    }
    /**
     * Gets the options property (com.scoutsys.render.TraceRenderOptions) value.
     * @return The options property value.
     * @see #setOptions
     */
    public TraceRenderOptions getOptions() {
        return fieldOptions;
    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredScrollableViewportSize() {
        Dimension d = null;
        if (fieldTraces != null) {
            d = new Dimension();
            int numTraces = fieldTraces.length;
            if (numTraces > 0) {
                int numSamples = fieldTraces[0].getSamples().length;
                double si = fieldTraces[0].getSampleInterval();
                d =
                    ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                        numTraces,
                        numSamples,
                        si);
            }
        }
        return d;

    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredSize() {
        Dimension d = new Dimension(1, 1); //= super.getPreferredSize();
        if (/* d == null &&*/
            fieldTraces != null) {
            //d = new Dimension();
            int numTraces = fieldTraces.length;
            if (numTraces > 0) {
                int numSamples = fieldTraces[0].getSamples().length;
                double si = fieldTraces[0].getSampleInterval();
                d =
                    ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                        numTraces,
                        numSamples,
                        si);
            }
        }
        return d;

    }
    /**
     * Accessor for the propertyChange field.
     */
    protected PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    private float[][] getSamplesFromTraces(ITrace[] traces) {
        int numTraces = traces.length;

        float[][] samples = new float[numTraces][];

        for (int i = 0; i < numTraces; i++) {
            samples[i] = fieldTraces[i].getSamples();
        }
        return samples;
    }
    /**
     * This method was created in VisualAge.
     * @return int
     * @param visibleRect java.awt.Rectangle
     * @param orientation int
     * @param direction int
     */
    public int getScrollableBlockIncrement(
        Rectangle visibleRect,
        int orientation,
        int direction) {
        return 100;
    }
    /**
     * This method was created in VisualAge.
     * @return boolean
     */
    public boolean getScrollableTracksViewportHeight() {
        return false;
    }
    /**
     * This method was created in VisualAge.
     * @return boolean
     */
    public boolean getScrollableTracksViewportWidth() {
        return false;
    }
    /**
     * This method was created in VisualAge.
     * @return int
     * @param visibleRect java.awt.Rectangle
     * @param orientation int
     * @param direction int
     */
    public int getScrollableUnitIncrement(
        Rectangle visibleRect,
        int orientation,
        int direction) {
        return 10;
    }
    /**
     * Return the TraceRenderOptions property value.
     * @return com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private TraceRenderOptions getTraceRenderOptions() {
        // user code begin {1}
        // user code end
        return ivjTraceRenderOptions;
    }
    /**
     * Gets the traces property (com.scoutsys.trace.ITrace[]) value.
     * @return The traces property value.
     * @see #setTraces
     */
    public com.scoutsys.trace.ITrace[] getTraces() {
        return fieldTraces;
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
        setName("SeisBean");
        setSize(160, 120);
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
            Frame frame;
            try {
                Class aFrameClass =
                    Class.forName("com.ibm.uvm.abt.edit.TestFrame");
                frame = (Frame) aFrameClass.newInstance();
            } catch (java.lang.Throwable ivjExc) {
                frame = new Frame();
            }
            SeisBean aSeisBean;
            aSeisBean = new SeisBean();
            aSeisBean.setTraces(makeDummyTraces());
            frame.add("Center", aSeisBean);
            frame.setSize(aSeisBean.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of com.scoutsys.beans.SeisBean");
            exception.printStackTrace(System.out);
        }
    }
    /**
     * No documentation for this method.
     * @return com.scoutsys.trace.ITrace[]
     */
    static com.scoutsys.trace.ITrace[] makeDummyTraces() {

        int numTraces = 120;
        int numSamples = 1501;
        int gap = 3;
        float dt = (float) .002;
        float dx = (float) 110;
        double t0[] = { .5, 1.0, 1.5, 2.0, 2.5 };
        float v = (float) 6000;
        float x0 = (float) ((numTraces + gap) * dx / 2.0);

        int numWaveletSamples = 40;
        float wavelet[] = new float[numWaveletSamples];
        double omega = 3.141592654 / numWaveletSamples;
        // build a wavelet
        for (int i = 0; i < numWaveletSamples; i++) {
            double c = Math.sin(2 * i * omega);
            wavelet[i] = (float) c;

        }

        // Headers
        String[] headerNames = { "CHAN", "TX", "RX", "FFID" };
        java.util.Hashtable headerIndices =
            new java.util.Hashtable(10, (float) .5);
        for (int i = 0; i < headerNames.length; i++) {
            headerIndices.put(headerNames[i], new Integer(i));
        }

        com.scoutsys.trace.ITrace[] tcs =
            new com.scoutsys.trace.ITrace[numTraces];

        for (int i = 0; i < numTraces; i++) {
            float x = 0;
            if (i < numTraces / 2) {
                x = x0 - i * dx;
            } else {
                x = x0 - (i + gap) * dx;
            }

            float[] samples = new float[numSamples];

            for (int j = 0; j < t0.length; j++) {
                double t = Math.sqrt(t0[j] * t0[j] + x * x / (v * v));
                int it = (int) Math.round(t / dt);
                int j1 = Math.max(0, it - numWaveletSamples / 2);
                int j2 = Math.min(numSamples, it + numWaveletSamples / 2);
                for (int k = j1; k < j2; k++) {
                    samples[k] = wavelet[k - j1];
                }
            }
            com.scoutsys.segy.SegyTrace tr = new com.scoutsys.segy.SegyTrace();
            tr.setSamples(samples);
            tr.setSampleInterval(dt * 1000000);

            tcs[i] = tr;

        }
        return tcs;
    }
    public void paint(Graphics g) {
        if (m_img != null)
            g.drawImage(m_img, 0, 0, this);
    }
    /**
     * Method to handle events for the PropertyChangeListener interface.
     * @param evt java.beans.PropertyChangeEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void propertyChange(PropertyChangeEvent evt) {
        // user code begin {1}
        // user code end
        if ((evt.getSource() == this)
            && (evt.getPropertyName().equals("options"))) {
            connPtoP1SetTarget();
        }
        // user code begin {2}
        if ((evt.getSource() == getTraceRenderOptions())) {
            this.refresh();
        }
        // user code end
    }
    public void refresh() {
        int numTraces = fieldTraces.length;
        int numSamples = 0;
        double sampleIntervalUS = 1000;
        int delayMS = 0;
        if (numTraces > 0) {
            numSamples = fieldTraces[0].getSamples().length;
            sampleIntervalUS = fieldTraces[0].getSampleInterval();
            delayMS = fieldTraces[0].getDelayMS();
        }

        try {
            TraceRenderer rndr = new TraceRenderer();
            m_img =
                rndr.render(
                    this,
                    getSamplesFromTraces(fieldTraces),
                    delayMS,
                    sampleIntervalUS,
                    fieldOptions);
            Dimension size =
                ((ITraceRenderSize) fieldOptions).calculateSizePixels(
                    numTraces,
                    numSamples,
                    sampleIntervalUS);
            this.setSize(size);
            this.repaint();
            // need to figure how to handle this
            //this.fireComponentResized(new ComponentEvent (this, 0));
        } catch (RenderException x) {
            System.err.print(x);
        } catch (Exception x) {
            System.err.print(x);
        }
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Sets the options property (com.scoutsys.render.TraceRenderOptions) value.
     * @param options The new value for the property.
     * @see #getOptions
     */
    public void setOptions(TraceRenderOptions options) {
        TraceRenderOptions oldValue = fieldOptions;
        fieldOptions = options;
        refresh();
        firePropertyChange("options", oldValue, options);
    }
    /**
     * Set the TraceRenderOptions to a new value.
     * @param newValue com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void setTraceRenderOptions(TraceRenderOptions newValue) {
        if (ivjTraceRenderOptions != newValue) {
            try {
                com.scoutsys.render.TraceRenderOptions oldValue =
                    getTraceRenderOptions();
                ivjTraceRenderOptions = newValue;
                connPtoP1SetSource();
                connEtoM1(ivjTraceRenderOptions);
                firePropertyChange("options", oldValue, newValue);
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
     * Sets the traces property (com.scoutsys.trace.ITrace[]) value.
     * @param traces The new value for the property.
     * @see #getTraces
     */
    public void setTraces(com.scoutsys.trace.ITrace[] traces) {
        com.scoutsys.trace.ITrace[] oldValue = fieldTraces;
        fieldTraces = traces;
        refresh();
        firePropertyChange("traces", oldValue, traces);
    }
}