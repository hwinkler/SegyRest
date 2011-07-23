package com.scoutsys.beans20;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.Serializable;

import javax.swing.JComponent;

import com.scoutsys.render.ITopLabelOptions;
import com.scoutsys.render.ITraceRenderSize;
import com.scoutsys.render.LabelRenderer;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;

/**
 * Draws the top annotations for a seismic plot.
 */
public class TopLabel
    extends JComponent
    implements ITopLabelOptions, java.beans.PropertyChangeListener, Serializable {
    private transient Image m_img;
    private com.scoutsys.trace.IHeader[] fieldHeaders;
    protected transient java.beans.PropertyChangeSupport propertyChange;
    private String fieldMajorFieldName = new String();
    private String fieldFieldName = new String();
    private int fieldFirstValue = 0;
    private int fieldValueInterval = 0;
    private java.awt.Font fieldFont =
        new java.awt.Font("SansSerif", Font.PLAIN, 12);
    private TraceRenderOptions fieldTraceRenderOptions =
        new TraceRenderOptions();
    private Font fieldMajorFont = new Font("", 0, 0);
    private Font fieldMinorFont = new Font("", 0, 0);
    private String fieldMajorHeaderField = new String();
    private String fieldMinorHeaderField = new String();
    private boolean ivjConnPtoP1Aligning = false;
    private TraceRenderOptions ivjtraceRenderOptions1 = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public TopLabel() {
        super();
        initialize();
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void addPropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * connEtoM1:  (traceRenderOptions1.tracesPerInch --> TopLabel.refresh()V)
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
     * connEtoM2:  (traceRenderOptions1.this --> TopLabel.refresh()V)
     * @param value com.scoutsys.render.TraceRenderOptions
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoM2(TraceRenderOptions value) {
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
     * connPtoP1SetSource:  (TopLabel.traceRenderOptions <--> traceRenderOptions1.this)
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
     * connPtoP1SetTarget:  (TopLabel.traceRenderOptions <--> traceRenderOptions1.this)
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
     * Gets the backColor property (java.awt.Color) value.
     * @return The backColor property value.
     * @see #setBackColor
     */
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
        	D0CB838494G88G88GF322F2A6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E164DAFDF0D457F5D793E22BAD2919469FF20B2758A61458B2F5E2BAF6B2345554A4C3DDEAB331EC13D4135256E9F1ABDB0A47E9C9CC4C55A22DC5ACE1A1E4A0892E178FE189D65AE57501AC8468E305BE90A023C512051074F6772D744CEAF73D6F89C9845BBD67FE3CFD3B5A078C1369BF5D5119776E39675EFB4E393FFB6E397709143D3724A04FD2C6C8DE81613FE3F904ECF29132657B03E1410B38F2
        	AC44705B8734031CA94D07E78A54AD7267D8CA481B9F95C279CEA8C7FCB9165D703E1374EEDD67049713F116C35D13571D0BEEBC4E18CD0C73A6ADBFA09741F3BBD09A70D681655760785F1177F07E8660ED676FC8F9506BD2AAD3FEE90F015FD94364E660399048D90BB24F4909B259C0846A76GED231A2D3858406B57FFE599717FF00F359847B13493B4D34B46D84C1F043CDA00CE58CA3E326BGBC1BFA2F0C1F7405A72BD5DFF8CAD3E755EA2FAC05D417333151930E74C8DEB9C80A6AD02FB3178AE9BBC2
        	B2212FB44AFB72927A22975EA700D26A04FE27BDCDFC7C250FBCCC56395FB555AF2B0E6BD59F53AF7864AE8B9B73F5D90C59DCAF469C3A08E34EC0F99150F21D7FF77D484F0072FA205CFA21CB47E921CB6E42F46274B61A6AD2F80C69E0BF9653E5E265AE4B2F683CE76F43F919003A05C0CB00D6833D88145F10E3798D455B1F5B8E4333452B3505A7A7432116C824B5680F1E8D7B65A03CB7B6C28D67DD10FD61281F9006295ECB76A47A885A5B900FA7A4E65BG91B8B8187190A1776C3396A431ED2D2F5D6A
        	64FD389BE23625B4205F0E8D235F7C701E477BE5FCB7652FB67017FFC07DCC679C4B9B204E7D0170F36E95210BB363C13269F61B754DA43A943D6C36E6FF40F448EF0C6942FC7C3D8368E3A770FB007CC0570196832DEA94BE7E092DE6BE9FF705B4B99A1202FDD35E089455DA271420DF0EF2DF1300192F57B74E7573F65D9FCFD35CE5B7B2FF94687C9FD0BEB99E63B3BF0DD1BE164B20EE8608491F98C0FE9617FFD36F270B72DFB370D9BF4FD0DCE3392889E29B9073153D9CFD158965DC204293B9969BD0B3
        	507089612B26FD0EAF0847DE031FD85B1F6E5B85CFF9C60BCADDA1D513C2BE39DF0AAA12B7A82B044B3C318F757246355B3A9F757241989DF2C80ECA1A928EC16F52248C1322B219227DBBD0A6AA53DA0FB2A943G1391A27AAD5B3F931EC1C955AEC67C12A647A4D87D5E7D08392BD2BF74889D40FB7A897455B80DD15761BD6D0470D35FA16465C2397024704BBD7BCB61F986C0A2879B9B5D0A8F55102233E2BD1E98AE41F58772CDC029C019A7854EDF9994B8EF2A788669595E1C9467C8E527F8BCB99543B9
        	6B3F1B766F813E86F4A7504AD3E2FFF9665220218F9CB731DF54E9AF574BACE618919BE3E35C985B124831BD02495F6C984CCF4BEB0C31694E0D27127AE97D06F356CC6E1F6CD30971E0537B087D22669CCB85D0E733183F6F6F37B1DC37CA2AAC10FCBE8AA0147D3159E4324F9CF89BF1FCD58EE9EEB9A2077C7022F29CBDFFE0DB8C6301300E3FAC4A47585186A0D4F57E3F9C5841785007F145087A7F20751226C5956F14A677491A260446E36DDF253A28F1E1C965585D9DC01C0E010DB34D828B1997111786
        	65F41D77CF1407B2EBF5DE6022F1BE4D887B18CFA6AD098C9B6373AFB4C641971059EA0A4BB69A837338CC014EBFCF795920DBD98B2C4996E177F37D038972B70B5579574AABF48C23BE3F4BB198AE6A4A4DB15AD41E9C232D6549B15AD9FEE38C7616A743A02B9BA84738688B07C2B2DDC4FAB50F872FF8D0E7A524E8830AFFDC567A14EBB2A18BDB903F1F51586B0777199691AB278F0898B01C370CAC29CF1E1F38FF53E1DD5742F077E2CBAC86B01D868F615C4BC1F9921C52961E8AE90CBFC263BA672BDB19
        	ED1F623E811E724997500B517391B4C3BDCAD8FD7F35937034D5085456BED75456D4D5F55216248B3BB6212815CE0E051D6437B656D7D2D164293DF234AB641B30E1077A08D1B9901555090A4A7E4A23FADFD947EB4D7B02E1CD3BF031B8F93492FD145F8AE784A0E72B0813BFBC0475E21F638132AD9C8C3269053A052DF46E064B8C7351594A4EB5B370E475393231BE1357EF575B6F8D986BCB5A926BBBCD6B197E0E43749C817C892019B6217F4E77F79A746F89072FCCC5BC1801087C63FD5CC7D57913A999
        	52932CB8A34F729C232022B4212EDF8ACE45F217620A376099B47449B07E28047CC8D41904AD8403BC3721BA4E86BC1761B9EFA1684A5A49AA62D1CC52FCF8DC5306FD9E6897FDAE017293ED2CCFAC8F3A317ECB83FB054F5CECDF28F033385F894F7F81FEAE156B9994F2CBF97DAAAE3F5E4D7AE3F213C3C22E291D49F95A63657C6DA8F717FE56F3683CF44A7BEFABA16579E20FBFDBE2BC073E78E0F552750D343C1D753F2ABDF10F779E41FE33001F5DAE66BD3542B86FAD2A9A76A9B4D564F3F72C523876F9
        	1C2C7CA5BC83CAD4057C5FAF4F68F13292F545DC123379BC3F34EBBF191B9B377B95AD9C558F92BEDCA46CAC7A1743B8A6357B3408EFAF1DB71EF3476EBCEEFD4B447E0653FCDECF476C4FFDEC97474E67B355736A52B65D264765FEC51E96F674F6A4BB8FA536ED3FCA23E7DC87FC6FB91CBC3E9EBF0C779ED77475F46AB0CCBD645CEC8DB11F48B4E74173F49A58454EAB5D743C0258598C3C5A0E9CCB3083793777E3FF08DF663B470242F70301EF10A58F1EB0755D239D4CE76BBAE23EABAC5B4D47FBF8C00C
        	D75889679FA036766E6BAFCD3A76C44C2D9FC4FDB03AB2FD9A3A1B85D6D33ECE167BCFDA5FCE22CF6A5D4D5619CE2647124E18BE6E3ADFDB860118CED303C227DC10296892BA358E958B1D446E2063F161E544EFAC360BB5D6FF5C28D71663D4D23DBC8FD7D9473A18BE29DDB13DCADE3B4DF2900869F5771050EB9D4894F68B3DFEB1946F0B8117F1DD87FF52E43A2E1B3B59D81E6E44F53D218A3191817E02EE312E3FFDF807E1DDDFGACCA21F1083CE22D0E9F594AB0474BD70E94884C91110F8DDDCEBC3F27
        	F547F256F443FB863CE7F60BF3603B8E0C359B211CFF864ECFC035C01EB3C237D70F4CFB2F50BEF303FB054501E47931867D2782ADBEB3B72FFEB4898FE9B57057A75471FB22FE34BD5B241DF98EBBC25B6577FC71F68C871FCE9AF110716333562DA6B82865FD3BFB665C69B8516F8B003F84688920F5C039BD7A9D055DBE1F5F453D83F7B833691B83B73AB323FB6659E4BE7C1BF95B55A634E3F66CF5615E5983F593C0A9C00B01B200320048B9E14F9F58DB673327C5A4671E307E5A1618F48BFDFFBBF8EBF6
        	7E7E3C6D761CCBE667629A345389F5BDC0FE20942025C099C0AF6AF6E6590F4F3BDEF053819B29D9F38D646BE668566CFBE85EF67967135917D50BF1E9AF54594F8BDB9A2AB0AE0B38549BD6C29A91B16947D5386F05234A3892524F7914678B03FCD45CBDDD3F0C7DB6C11F43C00CF777A872D2201C26739E9FC35EAAA82F53F94FD3DEAE1477748A1D4A9D66E7C23BA379195065C8FEA6ECF05C785E2259E1F6E6E47A7DB55D671BC0B7CF2F507968B164CDC0B9C56725D650EFB0D856F9EF54A1AF834A6BF5DE
        	DB1170CB364E7B75F66415FC887BA5503B84772967AD38DFC5A1A7D1A6E5EA924F35E776B16CDD188AB17821D5EAE23C5067FCDD9D6EEFCD9F8A5F3E60F0A541EEFC4E6411256879C0C0DF20FD9159A77C753453FCEE1EF3A61F1BFFF4A61F1BFFF65EF8EEDEF21A4D8D73513FEB6F10A4E776F35224CCC42E33F1E09B176955423DC7753E8F394C6D28F2A537234605EBC58DCFC5FDF2222E0D2EBDFADDEC3DF7E972A42A43E45AE8FBCD0A0E4BF3EC6D266DD91DD97BBE976609DE452FC479A91659782DC1E1E3
        	3B96BE9B33F1D90D390D0F54A43771319AF39B3FD3B33F0DCF56185B78D44D7CB6BEDBE3B6674C56E7070C363AE2D82A453DF9A6963BE8F916089CB3BC06B971F8D40ACCA8BE55AD2B3E2892814CC3DE74A12E412FDDC65D8661FDA150AA202C8FE3B11475714DE974FFA0AACD02CAF4D12C3E00ED9F99955FAD1DD0F683790196GAD3DA04E48FFD1034FA07D2AA8ECF9FA4C6C0C4C5A1C8B60FE6415FCD74623F0BA71F74C511E697E72980EDF5487F19DE838AFDEF7B656F381745B2474F1B8FABACCE37C2ABE
        	5A1646376B701E5AA7F2624EE3A89B88C7E1160368A2AEBBC6639E7164D80ABCC2764FAA36F19D63E59F2771508EF28D3A6CBB75D487A51420C3D5BD4A8E021C9F0879F428C878B48DF869C0EB0132F16C0B223F235B5FE27DA913D31374C20E7557C563299D649AAE0A3817D9D7EC44D5DC0CD8F13902E24A70A9B8CA67235AB3F7EE6A1B7BF10CFF38FC10306F64C85BB8A1F67DB0E6AE903E17748BDDE7C7B1973CAAF9471500BA6C17831129EBC76B2B21446A3FB6CA0848BD5FBE2E1F8FD352491A12FD265F
        	ED977433F9DE5E9F4BBDFB5FD81D474E284F52BD985BED007ABD83484B9BB35E656058ADC055C02C3EA62E9EEDF8B92EDE0E2B5FB6277DBDF1750863EDF92C1E59D6B7A4EC9B4BF914EC6EBDE3EA5B58G33E981FF265BD6942C9DFBA90F792BD042F17474D8DFA32EDAB6BF7BA51C1F231C447C601E388A7A5BB848662570A3B1BF2B659D067939AAC5DD35B8B940EB78887FB7E2A5EEB99CAF870F1543B3A4CF5BBE162ECA555234D60DF82E582FCAA1D51523CAE03F5D66345B0E3AAAF53B4B070C670915AF39
        	CC4F1557BFE276AE624F0C129585CC074C77E2BA24D4207D7A78F471D5FB036087A67B403E186CFF55A5111D1ED0B41949AEF8BFA6DBDF7485EDF322ED8CE7754582E7EBBE92B87397A7626CD49CCE6EAECE44D9E5DC7D1A62C41C7D1545D87F7362C41C09764C263F2F0C59F46262FB09B639A12B8A6187540A23CE3026363E12307F1B794F4BA9703CAD90003F09D45F3D0BD26E3DF7D72A3735B0F5EB1BB55557D618EAE93526FA5DB6D25BC68AFD6ED6173BF51B4D5BBE3D7B93375B696B18D5274BEAED5E0E
        	696969D22F53F7FA7774A7FD446AED7DF047BB2D56891F3B7C62C168476B421FB5D5225858158A0385F0BC71DBBA04B65AC6040D844AB8218B0798A698463FBDE20CC1DB8DB85F88F23517E2FBG4360FB45C68C662EBDEF5DE902C18FEF3B00BFD7952F60E75A0D07B1AEBF817CB5C0D9C02F81958E67D88E8E0BD8BBD40F4EEF0984AE48ACD9B8AB0524F1FA4B8679E5A450B589A563964C4FB56BC767BB57A492336B0EDDA2263CE67B96D97B07B6537B3466E1E64F98FFB63C3D22A0F6BE3AEAC75B96C1DDBA
        	50BA200DC01B014AAE8B5B6E2F67E7F6CC19A1C316FC9374A6D6CF4095F9BA4646A401612AD93221C2A4EF877D15A43C6F50FF7FBF5ECD7C40F0FF1FA4F0DFF11961FE65E5A36E6B3D4658EE447DDA10EB98C9447D5DF17FB3F67033C356BC93FC8C72367E11443B1C9F51BB3DB4602F9C91D878593BC7886EC19F4FBDC58133B79A0E48D1ED16F16997980E736345B70BF30621461194927FCB81C6867D9132EC59D3CF65669232E54B6B2F63F3897C16AEC5997CB179ADDBE272DB680F5C740F5D27DE9F915F2B
        	B3419FC52362EEDB3EAEFCBD56F3BFC97F5B8E5335689E653E9E0D4598E6678BA34D707CF493A13F58CC48A6CEDB5EE07A4FA164EF0E51671B181E8CCB1B75983AE81465626923466FEF879C08255540DB8F148D840909E58F109328994883949993F3DEFC98F3C5F6F89679F8E3E35B38DB3E2A78E47C4E428FDAB448717F5B225F93C27A996727070DF73B0C7773436C8E1C854CAE3F6013A30899FFB0C8B3D67EFD6F8866CCCAC845ADCCD32ED2F1DED7F424A43E0E820F59FA055EC7AE84DB16832D855AG74
        	1AEE5B62A37C3BD01238566E9F47B39F7EB714A6467A5CEEFE3E3C4DBE7F7FD05DE1C71B3DE1CD8BCFE27F02FF179DED5642914AE43CBF31A33E224A780446C4B9FF099D57E5D08ED0B6434F63D28A0961DE607D7F7A4756494FA431CECA249CCB27A47EBF57639D0367A6729E258C08E23FCB927D32B570FBDE3186D2A4368696CB46B5100AE1147B53D90579DF521886A868067C693C77E3B838FB24F13D4D3FD6E1DF7A590A05BA7D3E9047467F1BD02420F20DFE4A6C834150B80B05DF9A3959D8485AAD3A69
        	F64C563BDC284FCA30FF8D50C620CDC0A5DE3186262BEDA4597A26DFD0E5FF2F9414B50D63EC57E809E13EC5BCE5735EB4AA663D827A9E537BF7B8507F530ADF1B507DD76B40BB55899941ADF89FD0B908A68639138E0C252ACF8A8515105CAB79B95F6D40313C339A7D345683F57CCE4901F147AFE992AB1FF3206FA24C845E364F01B640AA8D297CA2CE191103BC0FCB28734D1E1554AB2CCE3D41BD60B5677CEB7F4BCE7A9D9B562CE7B64275CDF5527B66C0C015F5BFFC55D922733A545EB08635F008E1E00B
        	F4EB58A9765E5A7EAB496673FD3BAC66BB8D66FA1DBE5F7739685CCAA1FFD0DF938F38CA79FCDD10A3907241F56C93BF2FFF48057326AA5738DFD638927FDF0371D73AF04C30FA212335BD84EBCAD619FD2DB71DC773EFEC37586E2B722D357B531BEE4766613BA52560687417C9019AA545F167546F5EDF77EFEBFF542FEEA579DD64D7816074411995A30F6CF743C2607FB65BC572513DDD5003B69B14FBC8BE6E4E9AA96D415E9CC1A9B46EE0D16A78CC044FAB7DDFE70DEC538F42B3B07A7678D3F55E57F7FF
        	39640E1AA98B49033E698EBF93419CCB7D04FCC67291B0740D70BEFF192C4F5239275416BF7A418B69236EB28B31F491AB0B94B0G8DA3D441EAA03F48F7CB0346FCF7702EA326F78D19FE368FEC74A7663B2DBBF1FD9E14A1871285167F38340A186F8DFD13D2B028C941ABADA1BF6E932D980F0840F447CE6CDF95B23C1247251D28774706B67FBBGD0CB878874BF11A4A093GGA0B3GGD0CB818294G94G88G88GF322F2A674BF11A4A093GGA0B3GG8CGGGGGGGGGGGGGGGGG
        	E2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGGDA93GGGG
        **end of data**/
    }
    /**
     * Gets the firstValue property (int) value.
     * @return The firstValue property value.
     * @see #setFirstValue
     */
    public int getFirstValue() {
        return fieldFirstValue;
    }
    /**
     * Gets the foreColor property (java.awt.Color) value.
     * @return The foreColor property value.
     * @see #setForeColor
     */
    public Color getForeColor() {
        return getForeground();
    }
    /**
     * No documentation for this method.
     * @return com.scoutsys.trace.ITrace[]
     */
    public com.scoutsys.trace.IHeader[] getHeaders() {
        return fieldHeaders;
    }
    public Dimension getImageSize() {

        try {
            int numTraces = 120;
            if (getHeaders() != null)
                numTraces = getHeaders().length;
            return LabelRenderer.getImageSize(
                this,
                this,
                (ITraceRenderSize) getTraceRenderOptions(),
                numTraces);
        } catch (RenderException x) {
            return getSize();
        }
    }
    /**
     * Gets the majorFont property (java.awt.Font) value.
     * @return The majorFont property value.
     * @see #setMajorFont
     */
    public Font getMajorFont() {
        return fieldMajorFont;
    }
    /**
     * Gets the majorHeaderField property (java.lang.String) value.
     * @return The majorHeaderField property value.
     * @see #setMajorHeaderField
     */
    public String getMajorHeaderField() {
        return fieldMajorHeaderField;
    }
    /**
     * Gets the minorFont property (java.awt.Font) value.
     * @return The minorFont property value.
     * @see #setMinorFont
     */
    public Font getMinorFont() {
        return fieldMinorFont;
    }
    /**
     * Gets the minorHeaderField property (java.lang.String) value.
     * @return The minorHeaderField property value.
     * @see #setMinorHeaderField
     */
    public String getMinorHeaderField() {
        return fieldMinorHeaderField;
    }
    /**
     * This method was created in VisualAge.
     * @return java.awt.Dimension
     */
    public Dimension getPreferredSize() {
        return getImageSize();
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
     * Gets the valueInterval property (int) value.
     * @return The valueInterval property value.
     * @see #setValueInterval
     */
    public int getValueInterval() {
        return fieldValueInterval;
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
        setName("TopLabel");
        setMajorFont(new java.awt.Font("sansserif", 0, 12));
        setForeColor(java.awt.Color.black);
        setBackColor(java.awt.Color.white);
        setMinorFont(new java.awt.Font("sansserif", 0, 10));
        setSize(350, 31);
        setMinimumSize(new java.awt.Dimension(100, 46));
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
            TopLabel aTopLabel;
            aTopLabel = new TopLabel();
            frame.add("Center", aTopLabel);
            frame.setSize(aTopLabel.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of com.scoutsys.beans20.TopLabel");
            exception.printStackTrace(System.out);
        }
    }
    private Image makeImage() {

        try {
            Image img =
                LabelRenderer.renderTopLabel(
                    this,
                    this,
                    fieldTraceRenderOptions,
                    fieldHeaders);
            return img;
        } catch (RenderException x) {
            return null;
        }
    }
    public void paint(Graphics g) {
        if (m_img == null && getHeaders() != null)
            m_img = makeImage();

        if (m_img != null)
            g.drawImage(m_img, 0, 0, this);
        else {
            Rectangle r = g.getClipBounds();
            g.clearRect(
                r.getLocation().x,
                r.getLocation().y,
                r.width,
                r.height);
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
        if ((evt.getSource() == gettraceRenderOptions1())
            && (evt.getPropertyName().equals("tracesPerInch"))) {
            connEtoM1(evt);
        }
        // user code begin {2}
        // user code end
    }
    public void refresh() {
        m_img = makeImage();
        this.repaint();
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Comments for the setBackColor method.
     * @param arg class java.awt.Color
     */
    public void setBackColor(java.awt.Color arg) {
        setBackground(arg);
    }
    /**
     * Sets the firstValue property (int) value.
     * @param firstValue The new value for the property.
     * @see #getFirstValue
     */
    public void setFirstValue(int firstValue) {
        int oldValue = fieldFirstValue;
        fieldFirstValue = firstValue;
        firePropertyChange(
            "firstValue",
            new Integer(oldValue),
            new Integer(firstValue));
    }
    /**
     * Sets the foreColor property (java.awt.Color) value.
     * @param foreColor The new value for the property.
     * @see #getForeColor
     */
    public void setForeColor(Color foreColor) {
        setForeground(foreColor);
    }
    /**
     * No documentation for this method.
     * @param newValue com.scoutsys.trace.ITrace[]
     */
    public void setHeaders(com.scoutsys.trace.IHeader[] newValue) {
        this.fieldHeaders = newValue;
    }
    /**
     * Sets the majorFont property (java.awt.Font) value.
     * @param majorFont The new value for the property.
     * @see #getMajorFont
     */
    public void setMajorFont(Font majorFont) {
        Font oldValue = fieldMajorFont;
        fieldMajorFont = majorFont;
        firePropertyChange("majorFont", oldValue, majorFont);
    }
    /**
     * Sets the majorHeaderField property (java.lang.String) value.
     * @param majorHeaderField The new value for the property.
     * @see #getMajorHeaderField
     */
    public void setMajorHeaderField(String majorHeaderField) {
        String oldValue = fieldMajorHeaderField;
        fieldMajorHeaderField = majorHeaderField;
        firePropertyChange("majorHeaderField", oldValue, majorHeaderField);
    }
    /**
     * Sets the minorFont property (java.awt.Font) value.
     * @param minorFont The new value for the property.
     * @see #getMinorFont
     */
    public void setMinorFont(Font minorFont) {
        Font oldValue = fieldMinorFont;
        fieldMinorFont = minorFont;
        firePropertyChange("minorFont", oldValue, minorFont);
    }
    /**
     * Sets the minorHeaderField property (java.lang.String) value.
     * @param minorHeaderField The new value for the property.
     * @see #getMinorHeaderField
     */
    public void setMinorHeaderField(String minorHeaderField) {
        String oldValue = fieldMinorHeaderField;
        fieldMinorHeaderField = minorHeaderField;
        firePropertyChange("minorHeaderField", oldValue, minorHeaderField);
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
                connEtoM2(ivjtraceRenderOptions1);
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
     * Sets the valueInterval property (int) value.
     * @param valueInterval The new value for the property.
     * @see #getValueInterval
     */
    public void setValueInterval(int valueInterval) {
        int oldValue = fieldValueInterval;
        fieldValueInterval = valueInterval;
        firePropertyChange(
            "valueInterval",
            new Integer(oldValue),
            new Integer(valueInterval));
    }
}