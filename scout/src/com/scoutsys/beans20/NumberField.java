package com.scoutsys.beans20;

/**
 * This type was created in VisualAge.
 */
public class NumberField
    extends javax.swing.JPanel
    implements
        javax.swing.event.DocumentListener,
        java.awt.event.FocusListener,
        java.beans.PropertyChangeListener {
    private javax.swing.JTextField ivjJTextField1 = null;
    protected transient java.beans.PropertyChangeSupport propertyChange;
    private double fieldValue = 0;
    private boolean ivjConnPtoP1Aligning = false;
    private javax.swing.text.Document ivjDocument = null;
    private boolean fieldConstrainInteger = false;
    /**
     * Constructor
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public NumberField() {
        super();
        initialize();
    }
    /**
     * NumberField2 constructor comment.
     * @param layout java.awt.LayoutManager
     */
    public NumberField(java.awt.LayoutManager layout) {
        super(layout);
    }
    /**
     * NumberField2 constructor comment.
     * @param layout java.awt.LayoutManager
     * @param isDoubleBuffered boolean
     */
    public NumberField(
        java.awt.LayoutManager layout,
        boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }
    /**
     * NumberField2 constructor comment.
     * @param isDoubleBuffered boolean
     */
    public NumberField(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }
    /**
     * The addPropertyChangeListener method was generated to support the propertyChange field.
     * @param listener java.beans.PropertyChangeListener
     */
    public synchronized void addPropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().addPropertyChangeListener(listener);
    }
    /**
     * Method to handle events for the DocumentListener interface.
     * @param e javax.swing.event.DocumentEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void changedUpdate(javax.swing.event.DocumentEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * connEtoC1:  (Document.document.insertUpdate(javax.swing.event.DocumentEvent) --> NumberField2.document_InsertUpdate(Ljavax.swing.event.DocumentEvent;)V)
     * @param evt javax.swing.event.DocumentEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC1(javax.swing.event.DocumentEvent evt) {
        try {
            // user code begin {1}
            // user code end
            this.document_InsertUpdate(evt);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connEtoC2:  (JTextField1.focus.focusLost(java.awt.event.FocusEvent) --> NumberField.jTextField1_FocusLost(Ljava.awt.event.FocusEvent;)V)
     * @param arg1 java.awt.event.FocusEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connEtoC2(java.awt.event.FocusEvent arg1) {
        try {
            // user code begin {1}
            // user code end
            this.jTextField1_FocusLost(arg1);
            // user code begin {2}
            // user code end
        } catch (java.lang.Throwable ivjExc) {
            // user code begin {3}
            // user code end
            handleException(ivjExc);
        }
    }
    /**
     * connPtoP1SetSource:  (JTextField1.document <--> Document.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetSource() {
        /* Set the source from the target */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                getJTextField1().setDocument(getDocument());
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
     * connPtoP1SetTarget:  (JTextField1.document <--> Document.this)
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void connPtoP1SetTarget() {
        /* Set the target from the source */
        try {
            if (ivjConnPtoP1Aligning == false) {
                // user code begin {1}
                // user code end
                ivjConnPtoP1Aligning = true;
                setDocument(getJTextField1().getDocument());
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
     * Comment
     */
    public void document_InsertUpdate(javax.swing.event.DocumentEvent arg1) {

        return;
    }
    /**
     * The firePropertyChange method was generated to support the propertyChange field.
     * @param propertyName java.lang.String
     * @param oldValue java.lang.Object
     * @param newValue java.lang.Object
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
     * Method to handle events for the FocusListener interface.
     * @param e java.awt.event.FocusEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void focusGained(java.awt.event.FocusEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the FocusListener interface.
     * @param e java.awt.event.FocusEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void focusLost(java.awt.event.FocusEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getSource() == getJTextField1())) {
            connEtoC2(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Method generated to support the promotion of the actions attribute.
     * @return javax.swing.Action[]
     */
    public javax.swing.Action[] getActions() {
        return getJTextField1().getActions();
    }
    /**
     * 
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private static void getBuilderData() {
        /*V1.1
        **start of data**
        	D0CB838494G88G88GA703F0A6GGGGGGGGGGGG8CGGGE2F5E9ECE4E5F2A0E4E1F4E164DBFFF09477F5D79D285542A4B825295CB28D9DE4AC575841317FE0A62443E45C163AB4D1D33B03D3CDC226A441ADF1C806B61A1A1885C90728B18890D836C9B8ECEA8BDB1105D0B0150510F4F77AF908C388A1EC9934F737F737525E6EE9F7CFF7923F7A5E77475E6AF4A7A14649BF3D71075D6F7B7EFA6FFD5F77FD5F77E9ADD49EDDDA36E3E725A06CA893586F439D02F064C3C1F8467D5DD31C56F2
        	CEAD91EC3FE3007D427CD8A9BCFDD0370B14AB43FB60399790815AC24033008A21A6DC4568AB213C173DA3F66C9404E48B3611462AEC742A965A4E8B4FE14019D6EC53913637D983742D00F228F382F6934E9E3FFC06552F1F3FDC88FE274A71AA4EE36B471153CA6748E7CFC178D999AA21C4B8D87DAEBC1BFC23616600962DB582DA5CB4A60CDA3FA42AC6FDDDE3E3EFBC6A1774F6D9D20275C2E59B7236E02C1C749504A298EFA9211568280FC1F80F81F25BB80F6D7DCD0C077C479E958A5D3F4C4A6346B64A
        	DB39AB456360E034147279F275BBF74D2740780C06B91F1DAE4EE70D02FC66C0B98F305222DFD5113E964A9BG45AE4EFFC7BB67FF4B4295C21D3FB1AB7F95EE4AF703BB45FFFFD73474F5E2AF7BF5DC4F9854AD8694G5681B68376F85412B7216E2030AE769EBCDB7D26CB0BC6B535B596EBD3027AF9ADA8A9705E5888B50C56A785B49D64243638E82CA683BF9C47BDD36D90C1E53BA2F07BB93E66AF8561CF0EB94AB24836AE60F11CE1E3F8BDA95996F9D0EF5FB7D0EF8A3CE3BF548D25EFA174E7ED7442F6
        	246FA6F60265E2288B36F3BDEF99653C542DD9A6945F6FF46C4A404B1E9F3B9D159D14071A0E94AFD4477FEE200E8701EE8296827281CF83B6F6F09D9F9EBBB51B0E3BD4D352D5D139947747C45DEC0B4BCAD052192E75F0B6DD8B1D53753C575247D2E2F7151DD49FE5967DD1C22F3651291E6A899D4BCDD03794C05B7F83315352AE5AFE17B54E7304FE44C62763DCA7F4ACB7C0DD9E006AEAA80E3A5A86652AEE35248E508908G66F5F3DD09E39F5C25BD7AECFA22FD5F508F43D3CA1A3A58259A2628862481
        	D117C53FA29982EB73360EFC7927742BA67BA4GF3F4C82A240B262C29B03A9815E0D18C5A66243E9F5B6892296D172392CC900D89FC5C7F558F22CD0A06F9B99694CDA9550256376AE8F36362G0C8883201DF6232E9EA6FEAD9F5E57F4F3BDFDEE9CE9D5BD20239E2E17557A81F8760011C8CAE323DB8EA09B22BE4177630F089D3A217DA0E091600C977CA2206ABC37779787393DB7D5BFA2F87736E434F762B74FD33BDAFDBEE56FF41E7FA473EC84FAE92FDAF29C6086848173FA79B935CF9F360D057CA0DF
        	59FC85827934172B583CA84322ACFD69DC6FCD190B7A6D6C73A0DEC9AB3FAA247C532EACFD287E8ACE59FD5762CD67B26AEF7D06DEC7FEAF53DFEF3A3FE8CE625EA882FAB1206A82DF5F1F6BCEEA77ED22A1F1CB3F200311CA4154EA5336DB0DFDE8676312EA3A251824866145E0F6761231BB3587C21AE51FBBCC2423EFF101119A96FD17391F52E18C7B0E62757BC83DE81A3A6C0F1B52A549B4E5B51C6A7F1A093C98D35C1641EC7B8F48D9D887B2F6DE603631DCC11A8265F9966D89C243B6F9966D0CB2B84B
        	BA26834744673C8BB35BDA4AF6AE4EF98EEEDBE5F751164E71CF44976EE0FD4BAC7A7788FD95703A81D06E63F2CB6AE0DA7B3970F7F7BC5DA6F3587979AC6720F6A145335B28924FEC23FABC330DA663B35BE0CEBC138D523A7B6368B7831A2ACAE493D9554CD73C580FBC4B2AECDE1103E1493CA4CFCA6033FCE83FFFC5FCF39D3C3BFD5C07A65E66BEE0E847F2E169694C710B7B4D8E47929F3543153E148F20BC650E635ACB0A948525383438EAD27A67095FE7F4230450FEA6A34D2D8562C8243495AD988FB8
        	2B3B7BC107A47ABCD993E4AD1CCD3F7EF5331317CE56189159B8D1C77BFD737A92520F0FE6F52A15D5C3525949D5CDE25D38DABBA20E0B35C682D4DDCB5631167773E0690493A732C76A56F0573B6C43F96FEE3C0FCE8C1CB8C979FC50737EAC72D992D071845AAF697F335F22FC1F01F80C4F4D97EFCF13AF840D0DDA722FD7B34CEAB21A18B059D86DD811052F1154B0575B2D813CD9C7C0D66A85011EC709893445C230510D00EDBEFE9E9DCAE0BD0FB758C164529405EEA3289B3CC86EB6E6254D6EABAF52FB
        	299B1E343EF042DE3F14556F357AEF1BD2DF446A2B7BF87FDB13B377FFE4B2D37FD47DF3D96B297C71C9143F89666B87847B387C3D0903B6793D1AB69A0F75E3A4497C0ABBD901BEC79A0BCB90E6E2C50FB441E2451E6401343A81D10927E250CBC90CC1945B1854972D94119E5365A89C75F898333B7B52A97772A47008777CFCF82E82503EC6954AE15F0E197CC7F19F0E779F8A57C9A114B73171303C6492569F500E307A96A88F82121768593C901E3F82FADEBF36AB325AEDE275C2BF9D4B5BCF47236D1645
        	F83B0D7DF43CED2CDD43E55A4E3CCC564A3A63FFE051B6935A4F9D02F02B1447E167AB6CB9080D4BEAB37AE044AAB67E3A4B69F1D8418D9CF7B35037DD66EB7E4D24FD4DDB8DC38B48A45CE76BF6EB426E1FA96D3E097F06E7C8568D38438525A4DF635C8964956F830C4C56780543EF89536FB71E20ECEA3AF5998C60862379040009F362D895837C8CFA6102BD3FB13C78A347ABD9646F9C20F2C786D27297F5727C461DE46D2C3C3892AE6B6C9C102584176351774F5EC5DF62EF7AB597DC2DBA415C5307E2B2
        	1E1A646BDEB040576246E466B37277A6B1A7B6EA6D357913E09AF02F227B0B72F66D48D1411E3719621C9B9B3BFDA2ACB01BFBBD09D1315F06811E17F9FE84672E3A8277AFC0A7005EEB3F9D5D43789C86DA9E522FA0FD1F0ABC619E216B73244257E7B0740830F459592C6BD3B94872B703297559DA90AD2573FD24717994284F9F64BE717323D3FC5AA00D2F77DCD5CB681E2FD3D12660141861EFB464910FCB4A63196E96563FA067A121A0586C581701475CAF35B81CD7A9EF1DD7EDB932FF0C15AAG4AE7D9
        	0C678D7220CD21450792BBEB63631E8EE1EB5FCC8E3758463A57A3184A7E00E217FD49CF4FE614FD4D35B6C77947D4663A0FD33217BF2716D6D9322F33E43F89ED1E7A184BFEEA8C73EAF7FF2AF3B9FF52033922FBB852F9FE2D5E6E9B151FB6E5750D1B39CC1F247B46D33751FE0EG3D6E933E9F37CFE28C4EFDE39F6CE2D18D4349457D5DE3B7CA683EE465A7EE1471FDA970FBC744CC4FE339BFC95D5586ED6F8A3C67FC4273A131BBE86F0B213C9230963081A08CF15E4E5C1CB53F66C94E10DFBBB3B9D3AE
        	B39D4EA1AB4F91C96F57B0141221F3E87ABD14664D4E0F224D8C8D513CD909C53FC2680A0DCEED6CFBA35C8F5C043A8D567C6B23B83F7B53596F3B9C345F8FC93F21B9742336F5ABEA372DB5BFB86FA849E2DB8B5958CBBE1D167FE84635AC82FAB120629A44FA004EEBFCAD6F3BD9B35BDA721C9EDBC4AAD32BB65B9AC62ECD1517763BB0EB3F05E97D68BE7DC55D5B42CCE70C350159B97357237C0C4B3F466DFA71B90C0B0A20DC8C28382E1654GFCG853068BA57C9614D3659F4524AAF477D1A756ACA3F74
        	F219DF09254BDCF0FD2A0C19F5757A34FE3FCAABBF1DB68E15F3F7AB11936A0A819543A0A74087D0G0B06391CEF5F4A94D3CC5D4759820AD45E0A727A6DFB14F1432CB22E9C4EA4E3D79B2E6FDA28DBEF493360966696394F74E932EA8A5CDF1E390DF10B264BE1D9653433049650203D4E7343F7C87C378946AC975592CA4BA3F9029AA83BAD5A658452A2D03EE9514688ED9114D7091C27641D6CF919BBF7B267E5665F491C17D9F0E7665C619F5D491637217CDDA0F1DF9170D6EC717CCE84E9FB7CEA09534F
        	E91DB21737454FFD5F25D10CE702D679D3D2463B85AD7FE0A4BD3707ED6F565F5D1D9FFDF95A9C33651E6702DF12717EF9A77AFE9D62DFB9AA9175D37FA3A50F513D5297D769F64195B052FD24E51FE7DD281F1BFEEE87974E56E758EBD36377FEC954AF04C216C339941382FCED5B1B335B5179664CF6F429B9339DDDED1E590E4466ECF6C4F574A3731010A14757ABC6A536A6E0775AEE5646E7EA3E13569ABEB3BA137F4F4BE0B31427BFBF17DD7E074EE5167F51F3688F8CAD2E8724F4993FFA2E4A2ACBF935
        	AED30A2298344D57C8FFD3544352B49DFD037427F5597A7F7DB93C077865202C33AC8E555F5F9D5EC774EF98928DA75D22A9B23D3545385EBC2666BAE94DF730B53B7CEF34E6165F591ADD7EF7DBE7173F2EB53B7C9F364EAEFFCBEBB6BB22326E9E334BDAEF0D5D5B06B1CE52AA7711720440E381ED9873BDE1DD0CC5640061160C00AE47E09F41ADAB007E6BCBA6723682EC29883087E8B50114DD51B11EC8605A04F4B18AAC110D76AC697B15F11E7B49E1FD963367D3811E7B794AA9FCAA229FEE35DC96A5E1
        	4F7B50F63DA1BC077DE2E0B42C430DBA58B10DE34AEFEE8267BC92D4CB1AGCAB0933FD26BDECB5F9EB5488EB71A3389913F7E40CEC1385F6267EC44C1F81C506250EEC3905B75C76C775805C0FB8A3096C0E53FAEF3592BA56085B0843889D8A271FB565E9E541BAD134A7F5E6AFA553E564C975073647B237CBCD9ED0D73047996D97BE997C993C6366E11A7CFC30C9342B13EE59E9768F7BA085D8CE8DF1BE0CC935A607B62909F7F46B84ABAAE7A43F248988ACA21D8FC726469DAA8517ABF9E97849EE76F7B
        	484A9F642C9056D69C4B7A7DC7F918FD1790CE4559B9177FEDA70DB91FA3F182768BC27D12B079E6A6E157B97208F76CDAG2D7F4D14FADC6B87F650FA4A5BEFBE663C8D7FE425304D57137D5B9A46D3F904BED7B89FAF4B3BFD2E144A3B0C4CE3057216CD56B7D07DFEBD017ABD4940750BE7D98B0C2748D42F8BE52E5F7C097DB67D0E0BFAFD83AA5732579F5622DD10F81D5F229B9B5BB44CEBFB29D1D21DCDC4384ED64BBC9F74F0844F602DD05EB322169C9F61F91EF72C6FF4CA8B9E96EA9A5AB366F95C8F
        	3D65E89A21BA989AC92DD3CBD734144EB9DF66F3660D70F55ABFE2DF8714715414F5F20D4C3C0E71A975486F58147A07C7525719775FB8027545234E8CEB4AD14864F80D687E47E68EBCFFBF94027FA23901879765BC786061DCFFDBF9EE094B119BF015676EECF3647A5DCE2141A514875CED756E365DCE3FA7715A185BDD976818B092158DCEFFC7A211B8602F8B343F16983BA4B87CED97779FEAF3C4826E7F39FC9C467157634F11AB927D9D4E0549C2B89F7F950EA25FEF4539DCB5D0463D39EA1472CA6D6A
        	EBF17B3EAD3159D62522168CABA9BFC75778682B76BB6F16F5979C873358FB8E6B3B12BDD73F7AB83B735E67A15FCCGFDAB20BC8A31AD2081600B72F86CEFDD287F56D828CF220760F9D19543A47B8931D8AC549505127DE8E1714BF74667123BC8497505435CF637BA3FAA2CDB604C1A23D422D41E056CF9E65F63E5FB859ED7D6F420EC2B21EEBDE09B20D205BBBD20C565326DF533BBBD061790CD0A01884920DB412AACA5D2E4BC7C28DD7DCB42098C89BB7613DFC55A7BFE6B777F63BD0B9E285D3B125C6E
        	7BD5EA779BD43B5D97A56D7E54EE774550AE28256C1EFDA3B0AD37B59BE88E6BCD99FD65BC0D6630F6D87463043E48C627392D47A27C7B08A5D0A744F8EEA452097284211C8348832C84944638CDDDF1578933648A7A35189782D445F6252032ED1267AA9BBDE38EA9984338A47CD60F6F231E9A3E0FA20182417C62E9477EAC7BE8F30C6A38EAACF58624FCE8D3BCC7187A4B81429A729304654B1FF9E64B96C1583E7D2517703994FE79795886FF347D766D29765B49CF18730F2E496DB8DF93AF70BAEF0C1FF7
        	52CD6E8B073DFFA12C78C6C7D61F311A49D8B4167205D44E6763AD703CD5AC883F58863647307DE54A7FB4A0FDDB8AF70A991F4466DF36FCFD39CEE361633A7DEF3B073A51661B0066838481C940A2C081E095E09DE0134EEDEA093B9A571798940F0D9B9BDDE137B4AE87A47CBB9E3B6890E74CF2A09E3CD72B569D638B9EFB5E1B5296FB70EF04BAF36CDDC1CE7FD38F5AE3D0D1C8F4CAE9DF76E0BC05FFAAD18D591447C9F3D6375CD3B1350E7CD9196D179E54C52981E78B408D9884A886176DF4BB7B3BE386
        	7F6B8906714E05DFCC1AFC2E57BB325F6F1C9D33FFE7F92283E576EB2629C5F1FCCE7F2083E5B63598A1D2DAC3875A17AE07A3A6ED4A680D9D64DBB1A9C44854FEBECD6688A93B67767E3B7E51FD7265A45FA7392067B5G4A63FFA50761D9AC9CA5D8835E6333849F176E01F72D6FA70A8D3A87AACD3A87282FBBA68B567BFB3677A7A3F37D76EDAE20F32C7B2D4EC1EDA456195DCE931D19739037BAB36721BE57B973F7E68BBAB3FDE7C6775F573DCEF856006EBB818AE09EA08F309270B4204864FB313A8B7D
        	4C00B8B2BD6B86C4FAA9A17BD19761D6CDF5B9AFBE57B30B767B621C7BD1F98E7422DD95834FFB62F07F87B4817A63DC86398B651D6EAB49578ED250A7AA20BD36E72B46ABECFB071FCDF48FB50F73BD244058795678473A511693F2500CD87AFF279B4F5F08040E02535EA76D40B35B5A55F56339E484C4956E0912CF8CB27A69EE1C4BBFE1CA068F2EFDD0C769CD5DA417AC1AA24B93F56FA276C1C4E0FDBD5DA8832C08EA30C4251C1494DA67CD2B8BCC1C970DD1E61FBDB358E74F6CFEB42707FCF3827E2FFF
        	A246781D5FC37EF6908A99122507BF6C2930E8DD06CF4383C2D3298DBC143CB75BF9F24E7D68FA37CEE4DF6F7084DF6FA2D86B4AF13E5EEB3D597574AD6F6CFADA6F4DFC5EFC57BB7D3C79D7EF667366852F7D3C21349759383A15D0E65FE0FB711C2679ACFAD5CB65A25F68A5F6AA2AC145EAFF3477G333DBEA98621G08C7BFAD62794FDE34C1C31EE4733E5F1B7E0D987B7F90FAD1FF1A51575166D141D1C986DDAB771C6F0134DF5FBD760BCE5CDB3F9BF36E77FF83GD0CB8788CB97DAFECF93GGC4B7G
        	GD0CB818294G94G88G88GA703F0A6CB97DAFECF93GGC4B7GG8CGGGGGGGGGGGGGGGGGE2F5E9ECE4E5F2A0E4E1F4E1D0CB8586GGGG81G81GBAGGG0993GGGG
        **end of data**/
    }
    /**
     * Return the Document property value.
     * @return javax.swing.text.Document
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.text.Document getDocument() {
        // user code begin {1}
        // user code end
        return ivjDocument;
    }
    /**
     * Method generated to support the promotion of the editable attribute.
     * @return boolean
     */
    public boolean getEditable() {
        return getJTextField1().isEditable();
    }
    /**
     * Gets the floatValue property (float) value.
     * @return The floatValue property value.
     * @see #setFloatValue
     */
    public float getFloatValue() {
        return (float) getValue();
    }
    /**
     * Method generated to support the promotion of the horizontalAlignment attribute.
     * @return int
     */
    public int getHorizontalAlignment() {
        return getJTextField1().getHorizontalAlignment();
    }
    /**
     * Gets the intValue property (int) value.
     * @return The intValue property value.
     */
    public int getIntValue() {
        return (int) getValue();
    }
    /**
     * Return the JTextField1 property value.
     * @return javax.swing.JTextField
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private javax.swing.JTextField getJTextField1() {
        if (ivjJTextField1 == null) {
            try {
                ivjJTextField1 = new javax.swing.JTextField();
                ivjJTextField1.setName("JTextField1");
                // user code begin {1}
                // user code end
            } catch (java.lang.Throwable ivjExc) {
                // user code begin {2}
                // user code end
                handleException(ivjExc);
            }
        };
        return ivjJTextField1;
    }
    /**
     * Accessor for the propertyChange field.
     * @return java.beans.PropertyChangeSupport
     */
    protected java.beans.PropertyChangeSupport getPropertyChange() {
        if (propertyChange == null) {
            propertyChange = new java.beans.PropertyChangeSupport(this);
        };
        return propertyChange;
    }
    /**
     * Gets the shortValue property (short) value.
     * @return The shortValue property value.
     * @see #setShortValue
     */
    public short getShortValue() {
        return (short) getValue();
    }
    /**
     * Gets the value property (double) value.
     * @return The value property value.
     * @see #setValue
     */
    public double getValue() {
        String s = getJTextField1().getText();
        try {
            setValue(Double.valueOf(s).doubleValue());
        } catch (NumberFormatException x) {
            fieldValue = Double.NaN;
        } catch (java.beans.PropertyVetoException x) {
            fieldValue = Double.NaN;
        }
        return fieldValue;
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
        getJTextField1().addPropertyChangeListener(this);
        getJTextField1().addFocusListener(this);
        connPtoP1SetTarget();
    }
    /**
     * Initialize the class.
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void initialize() {
        // user code begin {1}
        // user code end
        setName("NumberField2");
        setLayout(new java.awt.BorderLayout());
        setSize(56, 25);
        add(getJTextField1(), "Center");
        initConnections();
        // user code begin {2}
        // user code end
    }
    /**
     * Method to handle events for the DocumentListener interface.
     * @param e javax.swing.event.DocumentEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void insertUpdate(javax.swing.event.DocumentEvent e) {
        // user code begin {1}
        // user code end
        if ((e.getDocument() == getDocument())) {
            connEtoC1(e);
        }
        // user code begin {2}
        // user code end
    }
    /**
     * Gets the constrainInteger property (boolean) value.
     * @return The constrainInteger property value.
     * @see #setConstrainInteger
     */
    public boolean isConstrainInteger() {
        return fieldConstrainInteger;
    }
    /**
     * Comment
     */
    public void jTextField1_FocusLost(java.awt.event.FocusEvent focusEvent) {
        getValue(); // this will force update of fieldValue from text
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
            NumberField aNumberField;
            aNumberField = new NumberField();
            frame.add("Center", aNumberField);
            frame.setSize(aNumberField.getSize());
            frame.setVisible(true);
        } catch (Throwable exception) {
            System.err.println(
                "Exception occurred in main() of javax.swing.JPanel");
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
        if ((evt.getSource() == getJTextField1())
            && (evt.getPropertyName().equals("document"))) {
            connPtoP1SetTarget();
        }
        // user code begin {2}
        // user code end
    }
    /**
     * The removePropertyChangeListener method was generated to support the propertyChange field.
     * @param listener java.beans.PropertyChangeListener
     */
    public synchronized void removePropertyChangeListener(
        java.beans.PropertyChangeListener listener) {
        getPropertyChange().removePropertyChangeListener(listener);
    }
    /**
     * Method to handle events for the DocumentListener interface.
     * @param e javax.swing.event.DocumentEvent
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    public void removeUpdate(javax.swing.event.DocumentEvent e) {
        // user code begin {1}
        // user code end
        // user code begin {2}
        // user code end
    }
    /**
     * Method generated to support the promotion of the actionCommand attribute.
     * @param arg1 java.lang.String
     */
    public void setActionCommand(String arg1) {
        getJTextField1().setActionCommand(arg1);
    }
    /**
     * Sets the constrainInteger property (boolean) value.
     * @param constrainInteger The new value for the property.
     * @see #getConstrainInteger
     */
    public void setConstrainInteger(boolean constrainInteger) {
        boolean oldValue = fieldConstrainInteger;
        fieldConstrainInteger = constrainInteger;
        firePropertyChange(
            "constrainInteger",
            new Boolean(oldValue),
            new Boolean(constrainInteger));
    }
    /**
     * Set the Document to a new value.
     * @param newValue javax.swing.text.Document
     */
    /* WARNING: THIS METHOD WILL BE REGENERATED. */
    private void setDocument(javax.swing.text.Document newValue) {
        if (ivjDocument != newValue) {
            try {
                /* Stop listening for events from the current object */
                if (ivjDocument != null) {
                    ivjDocument.removeDocumentListener(this);
                }
                ivjDocument = newValue;

                /* Listen for events from the new object */
                if (ivjDocument != null) {
                    ivjDocument.addDocumentListener(this);
                }
                connPtoP1SetSource();
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
     * Method generated to support the promotion of the editable attribute.
     * @param arg1 boolean
     */
    public void setEditable(boolean arg1) {
        getJTextField1().setEditable(arg1);
    }
    /**
     * Sets the floatValue property (float) value.
     * @param floatValue The new value for the property.
     * @exception java.beans.PropertyVetoException The exception description.
     * @see #getFloatValue
     */
    public void setFloatValue(float newVal)
        throws java.beans.PropertyVetoException {
        setValue((double) newVal);
    }
    /**
     * Method generated to support the promotion of the horizontalAlignment attribute.
     * @param arg1 int
     */
    public void setHorizontalAlignment(int arg1) {
        getJTextField1().setHorizontalAlignment(arg1);
    }
    /**
     * Perform the setIntValue method.
     * @param newVal int
     */
    public void setIntValue(int newVal)
        throws java.beans.PropertyVetoException {
        setValue((double) newVal);
        return;
    }
    /**
     * Sets the shortValue property (short) value.
     * @param shortValue The new value for the property.
     * @exception java.beans.PropertyVetoException The exception description.
     * @see #getShortValue
     */
    public void setShortValue(short newVal)
        throws java.beans.PropertyVetoException {
        setValue((double) newVal);
    }
    /**
     * Sets the value property (double) value.
     * @param value The new value for the property.
     * @exception java.beans.PropertyVetoException The exception description.
     * @see #getValue
     */
    public void setValue(double value)
        throws java.beans.PropertyVetoException {
        double oldValue = fieldValue;
        fireVetoableChange("value", new Double(oldValue), new Double(value));
        fireVetoableChange(
            "intValue",
            new Integer((int) oldValue),
            new Integer((int) value));
        fireVetoableChange(
            "shortValue",
            new Short((short) oldValue),
            new Short((short) value));
        fireVetoableChange(
            "floatValue",
            new Float((float) oldValue),
            new Float((float) value));
        fieldValue = value;
        firePropertyChange("value", new Double(oldValue), new Double(value));
        firePropertyChange(
            "intValue",
            new Integer((int) oldValue),
            new Integer((int) value));
        firePropertyChange(
            "shortValue",
            new Short((short) oldValue),
            new Short((short) value));
        firePropertyChange(
            "floatValue",
            new Float((float) oldValue),
            new Float((float) value));
        if (isConstrainInteger())
            getJTextField1().setText(Integer.toString((int) value));
        else
            getJTextField1().setText(Double.toString(value));
    }
    /**
     * This method was created in VisualAge.
     * @return java.lang.String
     */
    public String toString() {
        return "[fieldValue="
            + fieldValue
            + ",fieldConstrainInteger="
            + fieldConstrainInteger
            + ",ivjJTextField1="
            + ivjJTextField1
            + "]";
    }

}