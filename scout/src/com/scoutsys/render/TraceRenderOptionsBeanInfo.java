package com.scoutsys.render;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class TraceRenderOptionsBeanInfo extends SimpleBeanInfo {
    /*	public EventSetDescriptor[] getEventSetDescriptors()
    	{
    		EventSetDescriptor [] v = new 	EventSetDescriptor[1];
    		try
    		{
    
    			v[0] = new EventSetDescriptor(
    				beanClass,
    				"seis",
    				SeisListener.class,
    				"handleMove");
    		}
    		catch (IntrospectionException e)
    		{
    			throw new Error(e.toString());
    		}
    		return v;
    	}
    
    	public java.awt.Image getIcon(int iconKind)
    	{
    		if (iconKind == BeanInfo.ICON_MONO_16x16 ||
    		    iconKind == BeanInfo.ICON_COLOR_16x16 )
    		{
    		    java.awt.Image img = loadImage("syv16.gif");
    		    return img;
    		}
    		if (iconKind == BeanInfo.ICON_MONO_32x32 ||
    		    iconKind == BeanInfo.ICON_COLOR_32x32 )
    		{
    		    java.awt.Image img = loadImage("syv32.gif");
    		    return img;
    		}
    		return null;
    	}
    */
    private final static Class beanClass = TraceRenderOptions.class;

    public TraceRenderOptionsBeanInfo() {
    }
    /**
     * Gets the calculateSizeCM(int, int, double, double, double, double, double) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor calculateSizeCM_int_int_double_double_double_double_doubleMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the calculateSizeCM(int, int, double, double, double, double, double) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    {
                        int.class,
                        int.class,
                        double.class,
                        double.class,
                        double.class,
                        double.class,
                        double.class };
                aMethod =
                    getBeanClass().getMethod(
                        "calculateSizeCM",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "calculateSizeCM", 7);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("numTraces");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("numSamples");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("sampleIntervalUS");
                java.beans.ParameterDescriptor aParameterDescriptor4 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor4.setName("arg4");
                aParameterDescriptor4.setDisplayName("cmPerPixel");
                java.beans.ParameterDescriptor aParameterDescriptor5 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor5.setName("arg5");
                aParameterDescriptor5.setDisplayName("tracesPerCm");
                java.beans.ParameterDescriptor aParameterDescriptor6 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor6.setName("arg6");
                aParameterDescriptor6.setDisplayName("cmPerSecond");
                java.beans.ParameterDescriptor aParameterDescriptor7 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor7.setName("arg7");
                aParameterDescriptor7.setDisplayName("wiggleThrowInTraces");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3,
                        aParameterDescriptor4,
                        aParameterDescriptor5,
                        aParameterDescriptor6,
                        aParameterDescriptor7 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("calculateSizeCM(int, int, double, double, double, double, double)"); */
            /* aDescriptor.setShortDescription("calculateSizeCM(int, int, double, double, double, double, double)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the calculateSizeCM(int, int, double) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor calculateSizeCM_int_int_doubleMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the calculateSizeCM(int, int, double) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { int.class, int.class, double.class };
                aMethod =
                    getBeanClass().getMethod(
                        "calculateSizeCM",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "calculateSizeCM", 3);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("numTraces");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("numSamples");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("sampleIntervalUS");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("calculateSizeCM(int, int, double)"); */
            /* aDescriptor.setShortDescription("calculateSizeCM(int, int, double)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the calculateSizePixels(int, int, double, double, double, double, int, int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor calculateSizePixels_int_int_double_double_double_double_int_intMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the calculateSizePixels(int, int, double, double, double, double, int, int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    {
                        int.class,
                        int.class,
                        double.class,
                        double.class,
                        double.class,
                        double.class,
                        int.class,
                        int.class };
                aMethod =
                    getBeanClass().getMethod(
                        "calculateSizePixels",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "calculateSizePixels", 8);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("numTraces");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("numSamples");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("sampleIntervalUS");
                java.beans.ParameterDescriptor aParameterDescriptor4 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor4.setName("arg4");
                aParameterDescriptor4.setDisplayName("tracesPerCM");
                java.beans.ParameterDescriptor aParameterDescriptor5 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor5.setName("arg5");
                aParameterDescriptor5.setDisplayName("cmPerSecond");
                java.beans.ParameterDescriptor aParameterDescriptor6 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor6.setName("arg6");
                aParameterDescriptor6.setDisplayName("wiggleThrowInTraces");
                java.beans.ParameterDescriptor aParameterDescriptor7 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor7.setName("arg7");
                aParameterDescriptor7.setDisplayName("hPixPerInch");
                java.beans.ParameterDescriptor aParameterDescriptor8 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor8.setName("arg8");
                aParameterDescriptor8.setDisplayName("vPixPerInch");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3,
                        aParameterDescriptor4,
                        aParameterDescriptor5,
                        aParameterDescriptor6,
                        aParameterDescriptor7,
                        aParameterDescriptor8 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("calculateSizePixels(int, int, double, double, double, double, int, int)"); */
            /* aDescriptor.setShortDescription("calculateSizePixels(int, int, double, double, double, double, int, int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the calculateSizePixels(int, int, double) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor calculateSizePixels_int_int_doubleMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the calculateSizePixels(int, int, double) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { int.class, int.class, double.class };
                aMethod =
                    getBeanClass().getMethod(
                        "calculateSizePixels",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "calculateSizePixels", 3);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("numTraces");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("numSamples");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("sampleIntervalUS");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("calculateSizePixels(int, int, double)"); */
            /* aDescriptor.setShortDescription("calculateSizePixels(int, int, double)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the clipPercent property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor clipPercentPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the clipPercent property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getClipPercent",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getClipPercent", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setClipPercent",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setClipPercent", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "clipPercent",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("clipPercent", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("clipPercent"); */
            /* aDescriptor.setShortDescription("clipPercent"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the clone() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor cloneMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the clone() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod = getBeanClass().getMethod("clone", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "clone", 0);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptors[] = {
                };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("clone()"); */
            /* aDescriptor.setShortDescription("clone()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the colorModel property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor colorModelPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the colorModel property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getColorModel",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getColorModel", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.image.IndexColorModel.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setColorModel",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setColorModel", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "colorModel",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("colorModel", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            aDescriptor.setDisplayName("Color Model");
            /* aDescriptor.setShortDescription("Color Model"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the doColor property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor doColorPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the doColor property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "isDoColor",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "isDoColor", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { boolean.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setDoColor",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setDoColor", 1);
                };
                aDescriptor =
                    new PropertyDescriptor("doColor", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor = new PropertyDescriptor("doColor", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("doColor"); */
            /* aDescriptor.setShortDescription("doColor"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the doWiggle property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor doWigglePropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the doWiggle property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "isDoWiggle",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "isDoWiggle", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { boolean.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setDoWiggle",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setDoWiggle", 1);
                };
                aDescriptor =
                    new PropertyDescriptor("doWiggle", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("doWiggle", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("doWiggle"); */
            /* aDescriptor.setShortDescription("doWiggle"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the fillPercent property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor fillPercentPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the fillPercent property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getFillPercent",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getFillPercent", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setFillPercent",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setFillPercent", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "fillPercent",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("fillPercent", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("fillPercent"); */
            /* aDescriptor.setShortDescription("fillPercent"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the fillRight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor fillRightPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the fillRight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "isFillRight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "isFillRight", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { boolean.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setFillRight",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setFillRight", 1);
                };
                aDescriptor =
                    new PropertyDescriptor("fillRight", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("fillRight", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("fillRight"); */
            /* aDescriptor.setShortDescription("fillRight"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Find the method by comparing (name & parameter size) against the methods in the class.
     * @return java.lang.reflect.Method
     * @param aClass java.lang.Class
     * @param methodName java.lang.String
     * @param parameterCount int
     */
    public static java.lang.reflect.Method findMethod(
        Class aClass,
        String methodName,
        int parameterCount) {
        try {
            /* Since this method attempts to find a method by getting all methods from the class,
            this method should only be called if getMethod cannot find the method. */
            java.lang.reflect.Method methods[] = aClass.getMethods();
            for (int index = 0; index < methods.length; index++) {
                java.lang.reflect.Method method = methods[index];
                if ((method.getParameterTypes().length == parameterCount)
                    && (method.getName().equals(methodName))) {
                    return method;
                }
            }
        } catch (Throwable exception) {
            return null;
        }
        return null;
    }
    /**
     * Returns the BeanInfo of the superclass of this bean to inherit its features.
     * @return java.beans.BeanInfo[]
     */
    public java.beans.BeanInfo[] getAdditionalBeanInfo() {
        Class superClass;
        BeanInfo superBeanInfo = null;

        try {
            superClass = getBeanDescriptor().getBeanClass().getSuperclass();
        } catch (Throwable exception) {
            return null;
        }

        try {
            superBeanInfo = Introspector.getBeanInfo(superClass);
        } catch (java.beans.IntrospectionException ie) {
        }

        if (superBeanInfo != null) {
            java.beans.BeanInfo[] ret = new java.beans.BeanInfo[1];
            ret[0] = superBeanInfo;
            return ret;
        }
        return null;
    }
    /**
     * Gets the bean class.
     * @return java.lang.Class
     */
    public static Class getBeanClass() {
        return com.scoutsys.render.TraceRenderOptions.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static String getBeanClassName() {
        return "com.scoutsys.render.TraceRenderOptions";
    }
    /**
    * Gets a BeanInfo for the superclass of this bean.
    * @return BeanInfo[] containing this bean's superclass BeanInfo
    */

    public BeanDescriptor getBeanDescriptor() {
        BeanDescriptor bd = new BeanDescriptor(beanClass);
        return bd;
    }
    /**
     * Gets the getColorPalette() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getColorPaletteMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getColorPalette() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getColorPalette",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getColorPalette", 0);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptors[] = {
                };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("getColorPalette()"); */
            /* aDescriptor.setShortDescription("getColorPalette()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Return the event set descriptors for this bean.
     * @return java.beans.EventSetDescriptor[]
     */
    public java.beans.EventSetDescriptor[] getEventSetDescriptors() {
        try {
            EventSetDescriptor aDescriptorList[] = {
            };
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Return the method descriptors for this bean.
     * @return java.beans.MethodDescriptor[]
     */
    public java.beans.MethodDescriptor[] getMethodDescriptors() {
        try {
            MethodDescriptor aDescriptorList[] =
                {
                    calculateSizeCM_int_int_double_double_double_double_doubleMethodDescriptor(),
                    calculateSizeCM_int_int_doubleMethodDescriptor(),
                    calculateSizePixels_int_int_double_double_double_double_int_intMethodDescriptor(),
                    calculateSizePixels_int_int_doubleMethodDescriptor(),
                    cloneMethodDescriptor(),
                    loadColors_javanetURL_javalangStringMethodDescriptor(),
                    loadColors_javanetURLMethodDescriptor(),
                    pixelToTimeMS_intMethodDescriptor(),
                    pixelToTrace_intMethodDescriptor(),
                    timeMSToPixel_floatMethodDescriptor(),
                    traceToPixel_floatMethodDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Return the property descriptors for this bean.
     * @return java.beans.PropertyDescriptor[]
     */
    public java.beans.PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor aDescriptorList[] =
                {
                    clipPercentPropertyDescriptor(),
                    colorModelPropertyDescriptor(),
                    doColorPropertyDescriptor(),
                    doWigglePropertyDescriptor(),
                    fillPercentPropertyDescriptor(),
                    fillRightPropertyDescriptor(),
                    HPixelsPerInchPropertyDescriptor(),
                    inchesPerSecondPropertyDescriptor(),
                    majorTimingLineIntervalMSPropertyDescriptor(),
                    majorTimingLineWeightPropertyDescriptor(),
                    minorTimingLineIntervalMSPropertyDescriptor(),
                    minorTimingLineWeightPropertyDescriptor(),
                    overlapPercentPropertyDescriptor(),
                    positiveRightPropertyDescriptor(),
                    scaleMaxValuePropertyDescriptor(),
                    scaleTypePropertyDescriptor(),
                    tertiaryTimingLineIntervalMSPropertyDescriptor(),
                    tertiaryTimingLineWeightPropertyDescriptor(),
                    tracesPerInchPropertyDescriptor(),
                    VPixelsPerInchPropertyDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Called whenever the bean information class throws an exception.
     * @param exception java.lang.Throwable
     */
    private void handleException(Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        // System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        // exception.printStackTrace(System.out);
    }
    /**
     * Gets the HPixelsPerInch property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor HPixelsPerInchPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the HPixelsPerInch property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getHPixelsPerInch",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getHPixelsPerInch", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setHPixelsPerInch",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setHPixelsPerInch", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "HPixelsPerInch",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("HPixelsPerInch", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("HPixelsPerInch"); */
            /* aDescriptor.setShortDescription("HPixelsPerInch"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the inchesPerSecond property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor inchesPerSecondPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the inchesPerSecond property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getInchesPerSecond",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getInchesPerSecond", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { double.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setInchesPerSecond",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setInchesPerSecond", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "inchesPerSecond",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("inchesPerSecond", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("inchesPerSecond"); */
            /* aDescriptor.setShortDescription("inchesPerSecond"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the loadColors(java.net.URL, java.lang.String) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor loadColors_javanetURL_javalangStringMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the loadColors(java.net.URL, java.lang.String) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.net.URL.class, java.lang.String.class };
                aMethod =
                    getBeanClass().getMethod("loadColors", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "loadColors", 2);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("context");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("colorPalette");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1, aParameterDescriptor2 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("loadColors(java.net.URL, java.lang.String)"); */
            /* aDescriptor.setShortDescription("loadColors(java.net.URL, java.lang.String)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the loadColors(java.net.URL) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor loadColors_javanetURLMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the loadColors(java.net.URL) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.net.URL.class };
                aMethod =
                    getBeanClass().getMethod("loadColors", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "loadColors", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("url");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("loadColors(java.net.URL)"); */
            /* aDescriptor.setShortDescription("loadColors(java.net.URL)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the majorTimingLineIntervalMS property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor majorTimingLineIntervalMSPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the majorTimingLineIntervalMS property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMajorTimingLineIntervalMS",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getMajorTimingLineIntervalMS",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMajorTimingLineIntervalMS",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setMajorTimingLineIntervalMS",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineIntervalMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineIntervalMS",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("majorTimingLineIntervalMS"); */
            /* aDescriptor.setShortDescription("majorTimingLineIntervalMS"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the majorTimingLineWeight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor majorTimingLineWeightPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the majorTimingLineWeight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMajorTimingLineWeight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getMajorTimingLineWeight",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { short.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMajorTimingLineWeight",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setMajorTimingLineWeight",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineWeight",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineWeight",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("majorTimingLineWeight"); */
            /* aDescriptor.setShortDescription("majorTimingLineWeight"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the minorTimingLineIntervalMS property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor minorTimingLineIntervalMSPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the minorTimingLineIntervalMS property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMinorTimingLineIntervalMS",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getMinorTimingLineIntervalMS",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMinorTimingLineIntervalMS",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setMinorTimingLineIntervalMS",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineIntervalMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineIntervalMS",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("minorTimingLineIntervalMS"); */
            /* aDescriptor.setShortDescription("minorTimingLineIntervalMS"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the minorTimingLineWeight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor minorTimingLineWeightPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the minorTimingLineWeight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMinorTimingLineWeight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getMinorTimingLineWeight",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { short.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMinorTimingLineWeight",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setMinorTimingLineWeight",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineWeight",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineWeight",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("minorTimingLineWeight"); */
            /* aDescriptor.setShortDescription("minorTimingLineWeight"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the overlapPercent property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor overlapPercentPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the overlapPercent property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getOverlapPercent",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getOverlapPercent", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setOverlapPercent",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setOverlapPercent", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "overlapPercent",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("overlapPercent", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("overlapPercent"); */
            /* aDescriptor.setShortDescription("overlapPercent"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the pixelToTimeMS(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor pixelToTimeMS_intMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the pixelToTimeMS(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod("pixelToTimeMS", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "pixelToTimeMS", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("vPixel");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("pixelToTimeMS(int)"); */
            /* aDescriptor.setShortDescription("pixelToTimeMS(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the pixelToTrace(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor pixelToTrace_intMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the pixelToTrace(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod("pixelToTrace", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "pixelToTrace", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("hPixel");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("pixelToTrace(int)"); */
            /* aDescriptor.setShortDescription("pixelToTrace(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the positiveRight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor positiveRightPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the positiveRight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "isPositiveRight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "isPositiveRight", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { boolean.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setPositiveRight",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setPositiveRight", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "positiveRight",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("positiveRight", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("positiveRight"); */
            /* aDescriptor.setShortDescription("positiveRight"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the scaleMaxValue property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor scaleMaxValuePropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the scaleMaxValue property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getScaleMaxValue",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getScaleMaxValue", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { double.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setScaleMaxValue",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setScaleMaxValue", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "scaleMaxValue",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("scaleMaxValue", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("scaleMaxValue"); */
            /* aDescriptor.setShortDescription("scaleMaxValue"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the scaleType property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor scaleTypePropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the scaleType property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getScaleType",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getScaleType", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { short.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setScaleType",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setScaleType", 1);
                };
                aDescriptor =
                    new PropertyDescriptor("scaleType", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("scaleType", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("scaleType"); */
            /* aDescriptor.setShortDescription("scaleType"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setColorPalette(java.lang.String) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setColorPalette_javalangStringMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setColorPalette(java.lang.String) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.lang.String.class };
                aMethod =
                    getBeanClass().getMethod(
                        "setColorPalette",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setColorPalette", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("colorPalette");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setColorPalette(java.lang.String)"); */
            /* aDescriptor.setShortDescription("setColorPalette(java.lang.String)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the tertiaryTimingLineIntervalMS property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor tertiaryTimingLineIntervalMSPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the tertiaryTimingLineIntervalMS property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getTertiaryTimingLineIntervalMS",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getTertiaryTimingLineIntervalMS",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setTertiaryTimingLineIntervalMS",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setTertiaryTimingLineIntervalMS",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "tertiaryTimingLineIntervalMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "tertiaryTimingLineIntervalMS",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("tertiaryTimingLineIntervalMS"); */
            /* aDescriptor.setShortDescription("tertiaryTimingLineIntervalMS"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the tertiaryTimingLineWeight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor tertiaryTimingLineWeightPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the tertiaryTimingLineWeight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getTertiaryTimingLineWeight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getTertiaryTimingLineWeight",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { short.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setTertiaryTimingLineWeight",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(
                            getBeanClass(),
                            "setTertiaryTimingLineWeight",
                            1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "tertiaryTimingLineWeight",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "tertiaryTimingLineWeight",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("tertiaryTimingLineWeight"); */
            /* aDescriptor.setShortDescription("tertiaryTimingLineWeight"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the timeMSToPixel(float) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor timeMSToPixel_floatMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the timeMSToPixel(float) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { float.class };
                aMethod =
                    getBeanClass().getMethod("timeMSToPixel", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "timeMSToPixel", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("fTimeMS");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("timeMSToPixel(float)"); */
            /* aDescriptor.setShortDescription("timeMSToPixel(float)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the tracesPerInch property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor tracesPerInchPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the tracesPerInch property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getTracesPerInch",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getTracesPerInch", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { double.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setTracesPerInch",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setTracesPerInch", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "tracesPerInch",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("tracesPerInch", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("tracesPerInch"); */
            /* aDescriptor.setShortDescription("tracesPerInch"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the traceToPixel(float) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor traceToPixel_floatMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the traceToPixel(float) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { float.class };
                aMethod =
                    getBeanClass().getMethod("traceToPixel", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "traceToPixel", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("fTrace");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("traceToPixel(float)"); */
            /* aDescriptor.setShortDescription("traceToPixel(float)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the VPixelsPerInch property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor VPixelsPerInchPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the VPixelsPerInch property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getVPixelsPerInch",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getVPixelsPerInch", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setVPixelsPerInch",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setVPixelsPerInch", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "VPixelsPerInch",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("VPixelsPerInch", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("VPixelsPerInch"); */
            /* aDescriptor.setShortDescription("VPixelsPerInch"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
}