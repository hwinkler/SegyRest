package com.scoutsys.beans20;

/**
 * This type was created in VisualAge.
 */
public class TraceRenderOptionsCustomizer
    extends javax.swing.JPanel
    implements java.beans.Customizer {
    private javax.swing.JCheckBox ivjChkFillRight = null;
    private javax.swing.JCheckBox ivjChkPositiveRight = null;
    private javax.swing.JLabel ivjJLabel1 = null;
    private javax.swing.JLabel ivjJLabel2 = null;
    private javax.swing.JLabel ivjJLabel3 = null;
    private javax.swing.JPanel ivjJPanel1 = null;
    private javax.swing.JPanel ivjJPanel2 = null;
    private javax.swing.JTabbedPane ivjJTabbedPane1 = null;
    private NumberField ivjNbrIPS = null;
    private NumberField ivjNbrOlap = null;
    private NumberField ivjNbrScaleMaxValue = null;
    private NumberField ivjNbrTPI = null;
    private javax.swing.JPanel ivjPgGeneral = null;
    private javax.swing.JRadioButton ivjRdoScaleAll = null;
    private javax.swing.JRadioButton ivjRdoScaleConst = null;
    private javax.swing.JRadioButton ivjRdoScaleEach = null;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public TraceRenderOptionsCustomizer() {
        super();
        initialize();
    }
    /**
     * TraceRenderOptionsEditor constructor comment.
     * @param layout java.awt.LayoutManager
     */
    public TraceRenderOptionsCustomizer(java.awt.LayoutManager layout) {
        super(layout);
    }
    /**
     * TraceRenderOptionsEditor constructor comment.
     * @param layout java.awt.LayoutManager
     * @param isDoubleBuffered boolean
     */
    public TraceRenderOptionsCustomizer(
        java.awt.LayoutManager layout,
        boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }
    /**
     * TraceRenderOptionsEditor constructor comment.
     * @param isDoubleBuffered boolean
     */
    public TraceRenderOptionsCustomizer(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }
    /**
     * Comments for the addPropertyChangeListener method.
     * @param arg interface java.beans.PropertyChangeListener
     */
    public void addPropertyChangeListener(
        java.beans.PropertyChangeListener arg) {

    }
    /**
     * 
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private static void getBuilderData() {
        /*V1.1
        **start of data**
        	D0CB838494G88G88GAA0DEBA6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E134BB8BD49CD516F1B69E33ABBA2C071DE5BC59B50EF1B6BA2C621AB913B3465D0C4691E7F04DEAD4F413B3E4A6BA51E114B9E6B56B30CEA18451FCA4A6AAA23322791104E013108411CFF7534D273B893F869AC288555D85B4945D3D5DC5C29C46597B5E2BDBDDDDD4B79A8F1CF3CF553B773E776E3D6F3E7B6EFDDDF07BBEDA36BD7775FD9C173B1D137F4E64F25CFA93477D474BFBBEC7DCE1D9C99E27
        	7A7B98E08FD77B27FCF89683AD1FAF49AB62EE9FAF04F685341DA3A5F96F437BDE6E4E71D2A33C4418E7EBA3472D5AF8613678733C5C0A733CC15BF79BF742F3B700014C8530340C4C7FF3E3310C1F0176EE791DC06E6B9CD77DB1616971972B7019B2DF59476C390272BCEB54724C82BED166F913CAF6C7EF0DCC4F387AF14E7BF4CB41AEB20F2A9FC2365CEF5FA76C89DA9590A364F1576FB9894F3A4E493186CFE02AB26C89CCCB614B61CA37407B43A78C35354E906F913A853FD788F584A5DF409F36FAFDD2
        	A044AD7E0448F959DFC84761B8873419DC4D4EBAF95E657F7CB4374E6208A9D71AACCF16CA2E212063F5B676CE930EDD313FA4AFE5BF41A5CC913BFB61FD96A0E9BF4E59520CF3E6A77CA7E7F07BE25BE23FEC0B8311B9DD3C63758F683AFE4BC66C5E89B489E089C08AC0BAC0964007541F6A5B0E425364161A82D3D3813FA998B40B5ED0FB40AB0870DEDB8B949957ADF882A1AF47B11F7952DF21A38FC27E41E8FF092CF3BF076BFCE04DD39C77771DF46D343A25FB2402E2F90C0A03915D18DEE575C4AF8760
        	47819681A4832C8248B808FADD53F6F2BE3D5A7C12907273E24F34BB4807A47334CF844710755BE30A255FD69D5D88949FA2EB4A79491A9642FB2E3C5E8C7F96458F29705507897E866A8324AD82ED5DA174016CC93413E14D235C36EBBA8A5E5031534E5F068BE68EB3F9928FEB6D34360158E9B560B3G32818A4BCB724A81AC65E827C75BBE7D0A6B5F2932916BFB2D6DBDF88AB3D208EF7307A55E6F917A78100FF70BC21813F912ECC4EEF7D43F6FD23F74409CAD02DF8871E4A742687C14G8B92E6BC5F33
        	6DA1BCA101D21D3EA981A6188AF2B86E6D363D44E6FCD86A8DFAF9C908F0B07A3F58089DAF72FDB0A28CG6FC965445EFFC77738975E9781B0BB7D261160B2201D2D5865387D9DF85A41C184313656627390B17850E51C7FC87D5BC4770B02DF3288C192D27CD2D826996A5F0C58E5B42048FC1A62092FB50160E185DFD73F0761E18C351511EE21F4DE12C2BE7734A474881264730FC57ABB28AC61A8B78E4B7A16533813FF24A42F7488467B82BF097F46A368EBAF3850576A4AB3B8476E002E2F91709EE1BEB6
        	FBA462EBEC4CA2BAE6E40E64A9D71C7800E0BC223F176683B647DDDFE90E3CAB98BF922FD61CD4472B24ADFEDD5BE4E47E39E0392C4B6AA35AFD18E8A2FBFC83603781949FC59FFB2A3E0C6DBDB39F96F037F504E07584EF4463986F438D317DEDFD033E3FBD5D206FEF198D717DE9CB031EBFB15A0B8DE4DFF882FE3FC085D4489CBB03DFF0925DFDFE1F546F730E89D20F6F8B0163DCC709AF26503DE700F74BD1743DCB7B513EC3390FF34BCE6B1F87168FAF96ACBD4A6C1AFAB4E2DFA6D3F6A3312FA08AD3E0
        	14264034DFE27817693E1671E1A6DFAA3F0358A4641B8253124DA667B10DA6F50E328E66A0B9CF8E117BD8C99E6B7BE8AB610915C43035FE48CCE4A907BEF5G4EE33856A1A321E3BC119739A9A00A4C0CC0E37D9FECA27DC5683798A0C9697F8363DED5FFC7A0B0B99DF412C8AB2F4BF7CCC5E44D047F1B96A08C9302DD38AC4752FFB03D2321757162F4A4C65FEAA2B691D5E32EB8C6ECF23F128F11B302611E2638698248B773F10F349729F3374D371C57DDC31A9B9D13572EC23BC7DE3510F14BGEF28C01D
        	4B4CEA1DCD61F040632347016CEB43259FF16AFCEF5ADFB941DF64AB4317401DEBEBED1DBCF414F33BCBB48E12FE168A4C3F7E4AC2ECBD8B6DA402D366FD442C769BF90F195F026728AF94063C41AB4CA8FB4CCCECC04EA199AD639FEE527749471AC81C1CD4566649A6B0A51CD3ECBD649C69045A1E626FA6E35AF32DEC470CB976B4B6939D36823E70B86A55E5592332A764F3F0E40F41EA234CFF3064B15964F61EF5BB4A46E14C3DE3CEDED4FABC92438D476746F3167F3CC2EDEDB92E4D0BF22D846FBC2E4D
        	0B7E5A02F91197E8E947712CB635501A289276D7A56A15EC5D25522BB36073CB0ACE56E6E25FC048B76673A34EC6F1104D7A49A14B4E498728FFB8E04C91G067BB57503C550CE2E44F36DFFACE47DD6AB6DB72C243DDEE9FF5B22BD13886F151CBF314F3D95F3663852B3CE8F180D1ADB48FAC47C59C65B17653976F29BCC85546FAFC30D85F67B14586BA553BE55B85BC06FB240D7FF0A71732ECBA44E0CC222877B33A7A8F838F28369771A99E3EF92702EGC8835882D088F4B65F4DFB08BF58A0BC3985AF59
        	58D5ACEE57D855F1BBE8E0F94EB2F82EB4603C4FD6929DE81C2071013FA455561A83A486BB1882ACC6945375A6FA269BB0C6B453F81EDF856382D4D76139F5C8295172D7BC41D5D4CF976C60F44E2DDB3B8A9CD5EC7D452A489E3570D8979EE842B9D7GBD330A60D21B54F6A47AEF07FA3B921E0C7E5BA8BA5953C7B8B57DA30B1ACE647DD11E1A5E95C55F2E6A4FF4BBB5083A0D3C788BAE27730B1875E779892613C3FE2614ED5CEEACAEFD1D59FDDB7781AEDEFC0EACA633C5500A674D6293E87FA7E9FCD88D
        	6D75GD9A7F01F7D519C2F7E548396EFFE4C5673A40BB7398A7EFE0AAFD261D99CF2D0BCE91782ED51C90CC33FEFA5B65C8CED2E9AF2BAG83C0E735F206349838F96AAAE7A0680004CED4257CCC37EB1A3E2EEEEC5D3E7D9E2E5B5632CDDC7A359D3ABEC9FD311A2DD7027C2CF9FB63F672E43AAD217559EA20E5G64G6CBB85F5A30071946A77FEEB85530FA4BFA6C962BD637434C4657AFC4225881AECF6265B34B51EEE4ED3314E8FFBB3D90771D3ECFD36AB78BE0A1FD561593AED24FEC35A09C05BFA8A7D
        	E60D19D80A3DBF24FA6FB6FF15DA621B456D49851DC3BE335BE25789EF35695789C5ED7AF542FBED716B047FED532B93188F7D3B1D6C8F576912BC89A099A085E04DE9741FBB5ABEE17E2363BBD6A89C1A8274C6C142397E5696DB2F642FF08FF1330D64EF6E00A485264878087FA7FABFA185029449F0A9746EGD206F10931AAF78AA4BE0942A8C5339CA1410AB942065368E3DDB477AABC83675F99448DD1DCB534DD8A6ED756F87EC07A12B13E194F65441D034569EF6AF3CF58E32F4DC67B7CEB732C1D665B
        	E0D367652040F03F31533CEDF4B4ACA8BE10EDAFD2F0ED614EC058C70A0144B3E49DEE31164511F3D636A34BA57E32132CEF67983BFD92957C5597094DD859D0A5570557B7EB6BC2126BE540F8D9G0C27E2D20FA73F864E059A4CDF56D809BECD8239F344F8ED2F40F8BD6EF91213EE908A48FE530B57069AA67FD0CDA407A0CFF6EE4E521C18481ED803676687EDA47E25C1BB93E09BG6375CEE29DD4749972BEA5925ED6E80FG4CFC06E7DC381D58B41170812C8358821083302F964E83GE3AD6E676B9C65
        	706C63A764130E5544F4C78312A5DBF4CF07F8C84F19EFDE5522BD8B06EAA37E9E2C0D767D4550E6B17F07D43764DA9673C90D48708FB21DD5F8F696FCC471243D8DE8C91F637E73CDEA67B754C566345445BA0B5A691D2D2BCE1BC374317B7CBAED8E718B91F308A0505657214D3EEC0F3DEF2EEE1FFF5FDC5F2E9F53125A6746346F366B47341B5A55B10D61164B6312B5BB4BCFA9635E5ECE72C016733773FEFE0C5ED132B818CCFD30263EA44FD10F7553D52D989BC585F7B345A5C2FBF9BD2E43BDEDA4CFCC
        	0576DA008C00AC007C86081FG55G2DGC38D487FB0658FC2BB91A095E09DC0B6C0D1A37083B88124C664BF581628DAC3B2CF3C18C666D137DBB56DFCD5FB2DE6ACA2FB350A1E25211729E8CCB6C714EC7345623D1A769ECDFB076AFD3B06C666FBDB55FED3C35F25FAE7EB35E89257B42991574FAB621A2ED46C5BB345A97A8C295E1F9197BE27FAEDC167E0317B4E1639356ECFDB54B5D4C6A3DB571D46123C83C63A9FDA0B679DF7955D8B926FF67AA4D1900D64375A17FAB905DE6D22671103F71373086132
        	E7A33893B26E05AFA33813B2CEB4101853B4BE596C9345EE326D99BE61AFC58C4F0E4F0B020AF663F0647C43317FB1CCF4BF6B8EB9BB5BD0AED7070CEB6B6CD14E4E8F5EE0388E118FF259548685B6350DD281C7721F8D70E4745F597568B5A624FF5C2DC7F7A874C2271ABEE2E274C4057EE22F9EFD39894F6DA77A3567B6212F82FA3AB2462B02FA0C4D729845E624AF9A5323D7A874821F9E5D88F466C737CD6A7911530CFE74A791E5944DF363964B5F46BEB948296AEC1FFB2AF27A62D4A56F16AA85B806EB
        	EB4FCE0B22FC5381B5BABD73B3DB08FFAC02B11381D24DF82FF134C2DD7B275E5B2CDB7B27EE9AA8C8136549B2C767A4EC1C6FC47D1EFF604B5E02DC1DF1E8CCEC12FF67ED527E1E7F7DF96EF729434BB9D03D8D731A11A65465398E75EF77A3C993B16B61E4F96ED5AA99B2C7700EE6C7870E3D2D8973A8D7B7628C963CE77A1669133872B60D8B1EC9F3E0867336C6A70EB1EE41F18F75A1EE19025B6DC2DC0685F3B653A03D2F30C29E86E034228C2F159F6262FE83F1F6FA4AAD041AFD0268C5B92AC6715E45
        	E545B9FFB40638C485D76F43BCB34D0AF25CBFC964601AE1CFG981A1177E691E5EEED463C4D59CAFD2ED91BB71D277804E6ED5E74EC8B66CD49C04BE9463C74963AEFC7DACA72E68116812C82C887585C023955193EF879A85B8C11FC140D7BD3F21448394EEC5F41D87D21C2354132F638A7840F646447B8BC0B4CB63D3B0DEDAD725950BAF77F32F9DF99A0B1208C68F5GCEG91A02195F5F920EF5EEF992CB3F13EE5A86A5013ABC516E70D0EDC2C5F79EE3DFE6BE57EADB17BD91CFA7DF2E47E2236D87D0E
        	756975BBA07357446C3757256D67D0710E6874136B883A0724B666F7EFAA787BA8BED105E77E58C271241D8234A29B66BF27C7635DE9C936D8F22F9E0B57EFC94CFEE69F6937D407CEE3330CDF2B22B33D4E50BAA443265DFFC60A5FEC536E3F07A6F17FE5834DE9C7FD3FAF2A65DE8578F4FB7C1C1A759BEC6514F70F6ABD2BE56173446D2D8BFF7716529F3B1E3B3BFF7EFAEEF53FFEBDF7DF7F5CFA6E41FE7DFA6E617E39F7D48374EC4C04B54A36E39E7F2FB64C63F36C98E77EB090DB7E02C17D3B431D037A
        	F7076F8C467F2625E4B0565DA2136FF0874ADC66C01917F4204C958ACE6AC63ECE8577F8B7728DA938F3CE64DB2460D6BB11AFC141197B10AFD5415D5207FC2B955CD19756C6198AEE77G72F16DCAEDBBC8726D83502E83F0828495DA9A25A5C0BB85A09DA0CB21358F223F12FEDAFFF36A603E8A9C081AFFD419C3DBAB623E3912B9C84E7026320E6D23E8132233E827474690D72D6086E8EE6102362460167B10EF0902FBE00260D2203D66AC6AD1CF2E7064FD5E2CFAFFE4F261634A16851D0369FCAF4D2556
        	033E9F66A16EBE0A4B82DCFDAE56E0C19B79ADDA02CD4AEA49956708AD58EF2C0F5B300EA86CA849AB85288398821885E07CB9C3917E1BBA10FFA950D3815681E48394F5A27F6743917E2CEE64B7G5D826085D88C30DC613F7DC2047FB1A7722F85FA8640B60062AE287F3A107F3911887F0F7B105FC568G89GA9G69DDD8CB753874EA29AC2033B18E8E6098795DB097C08D008BE0269B6FE9F7FDC64E3CEEEF2047430B0215770CB37CFF1D5821421BC4D13679E977AE951EE6149C2EC767F1323F21A62634
        	F6FE06FEF6436A421CC1352C495D6C6EAA3D9B6B465BAE6851B395FAA22FC75F5A0D356DA50F3A36A5F5A7219776405A7720BD3C2348D38D38D600F100A5GAB941E674710A78DF09BGF24898CE709FA75AAC68A3FAFAB01BA65F550E89A151C93F6370E19DB16444B16F7161182900DB8B3099A03F97EA5EDE9CF343047A5B93B656CBF46FDB0047550B758EFF082C97795E4C470B7DBE2FB44E7025B33BA278D6011C139C56BB3F3761EF6EE2AF7E66FE442E7D4D1D541E159C7EE6FE4E2E7D4D7D5DA87AF5F6
        	6DEF6EBF09227F1BDD7B1B7B07B21D49F42C8BE5DA2E48B45095DF26EB3B34B2B5C6516F6D524AF4D7947D452E78B23D5303B2EDD0E4B2764417A9542315E9AA0A3E3CC7AB53BDD174A7FA624B745FCE14E9DF9F4AF438D7AB534928B187FA35B27DB15A0E3DDA199E0C36E32FD62647F255B2E57621CC8EC5265D7D71E5B276EBE56A0A36E3FFFC1916774712095565D3AE32AF9603BCCB81D676E1DDEE9FD03EF1D1E43DBC2015756A2839FEB020157526A87A46812D2C87233ED7F9FBD0AB6BA3F2FF36D77B9C
        	D177D7F36ECD3AF92FAFE01E0634589F710373F83F105F0F3AE5DEC0DC1D02FB10C71C24606E74A0AE259F6FB1DA84DA83C1BB87E01F8BF97FE6946DD561C2FB2D9A555A6BF014BD1E9F555A6B03A8FA691856DEFF0E221F9D535AEBC7143F950D23CCDEC526067178B2854735B2B5C5513FB79EDF26756331E4E271FA190F669E21E9015D3D9D9CD45F7F2DFC0E0F798D63D2177CDD2F7CDCD334F1BB53F3138F755C22687976C4FCBDCD93DABD83D17470C4FCBDEF1D082567C79C7B7D2510433F81A3537D2DC9
        	42D7E5B0D412EFFED8DE48593F6EB7BC2C1F216B4A7A3D5FF3E57DDE533D2B193F5FB33AF7B571005DB5EC22F129ECC0FB8771BC45D78CE86FA042AE3C0328815A52814C79BB872ED05F73FA7D38C1797F2886E35D39BCF3C12FDF394CDF9733DFBA2F572FD36677466C375293CF3F9939DF4220760E679E9A47168DEA6D3B1662D3863576ED97503E2B00D6FACE790EB56E1DD6EC7B3EBB7EF57B31BB500DB4CEAF0279171E437B08CA7E98977B8E37B394888AA169B2435254DA1661D95F15497EEBFA7F4B5E33
        	D56F17DD8BDFC75E3020F3301A715DE13C5BD8FD8E6B690B43D8E327A9381C8B481725604E0FA05FB68577AB9E79CA0790E7F1A3DF39027B3987F18E851765A538A034978F214F7DC408587CE72A779EE1616DAFAE689C4C1FFF4913F7654E0B392CCCFB0E56F3F23D627B027E1BC38FB07A47D8ADBC61A176E07553F543D8BFA5036DD2G528132GF61E475A7985EF04DF9AC17E8A209B81C6G9681ACD3780F0FC6784F3911FF8D505783EC8558B78C3565B056F03FD46ACBA760468116G2CGC89B469AAECF
        	18DB431588E45D37GCF4EB066D8F78F63B93F73821E731B0635677CFECEFDCE6F3D20BD675F0822DBAFE84F79D7226817AEE84F793D1CBA473AF184E532A8B2250D44176955912DCC1FC651ABF82DCC27F25574E1BE3ECCD739D126D9C526BB5D71E55A64564A549FEDC70FD6264F22E432FA624BD468C519D6AAB21D76EAE5BA98B56738B73ECCB7FA35B27DB00A1E6E554A34BFE60E165D48FC31CAA04FAA485058FEDFB5FCE5E744CDA3717A7D3FF06BE3FBC41E3E5EA7246A031C939070D391C86B64B634FE
        	E9E807AEF47C52508F5E3C76F9813062DC70725D6397DF9A7ACE82A9284867270F3FB4F41E7F7674531B079F96AC85AABF78696943854FDE3EF933GBC53GD48EDBB6829318G9E5BDA70746163978B3E008C7F52B08DA274657D02C7AF1FBFFF7A798BCCE292DC62B1F4F56F2E8658FA01C9EF107B8BB7C4EF616CAF1CF888DD8B7990FD4F5346BF20F817G0A1BBC0435A198FF2FED40BD0FFB796D43B7EF3EBCFC737A603BA720B95DC3BF3FBCC54CE1EC7B83B27FB3CC8DD4923AEF7E8F485D2F1074G8498
        	GD0CB8788E5FFCFBE3795GG7CC1GGD0CB818294G94G88G88GAA0DEBA6E5FFCFBE3795GG7CC1GG8CGGGGGGGGGGGGGGGGGE2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGG7195GGGG
        **end of data**/
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
                ivjChkFillRight.setBounds(233, 14, 99, 25);
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
                ivjChkPositiveRight.setBounds(233, 40, 99, 25);
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
                ivjJTabbedPane1.insertTab(
                    "General",
                    null,
                    getPgGeneral(),
                    null,
                    0);
                ivjJTabbedPane1.insertTab(
                    "JPanel1",
                    null,
                    getJPanel1(),
                    null,
                    1);
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
     * Return the NbrIPS property value.
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
     * Return the PgGeneral property value.
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
     * Return the RdoScaleConst property value.
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
     * Called whenever the part throws an exception.
     * @param exception java.lang.Throwable
     */
    private void handleException(Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        // System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        // exception.printStackTrace(System.out);
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("TraceRenderOptionsEditor");
        setLayout(new java.awt.BorderLayout());
        setSize(475, 258);
        add(getJTabbedPane1(), "Center");
        // user code begin {2}
        // user code end
    }
    /**
     * main entrypoint - starts the part when it is run as an application
     * @param args java.lang.String[]
     */
    public static void main(java.lang.String[] args) {
        try {
            java.awt.Frame frame;
            try {
                Class aFrameClass =
                    Class.forName("com.ibm.uvm.abt.edit.TestFrame");
                frame = (java.awt.Frame) aFrameClass.newInstance();
            } catch (java.lang.Throwable ivjExc) {
                frame = new java.awt.Frame();
            }
            TraceRenderOptionsCustomizer aTraceRenderOptionsCustomizer;
            aTraceRenderOptionsCustomizer = new TraceRenderOptionsCustomizer();
            frame.add("Center", aTraceRenderOptionsCustomizer);
            frame.setSize(aTraceRenderOptionsCustomizer.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of javax.swing.JPanel");
            exception.printStackTrace(System.out);
        }
    }
    /**
     * Comments for the removePropertyChangeListener method.
     * @param arg interface java.beans.PropertyChangeListener
     */
    public void removePropertyChangeListener(
        java.beans.PropertyChangeListener arg) {

    }
    /**
     * Comments for the setObject method.
     * @param arg class java.lang.Object
     */
    public void setObject(Object arg) {

    }
}