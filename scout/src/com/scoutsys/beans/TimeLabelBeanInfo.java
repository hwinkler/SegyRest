package com.scoutsys.beans;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class TimeLabelBeanInfo extends SimpleBeanInfo {
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
     * Gets the getBackColor() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getBackColorMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getBackColor() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getBackColor", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getBackColor", 0);
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
            /* aDescriptor.setDisplayName("getBackColor()"); */
            /* aDescriptor.setShortDescription("getBackColor()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the bean class.
     * @return java.lang.Class
     */
    public static Class getBeanClass() {
        return com.scoutsys.beans.TimeLabel.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static String getBeanClassName() {
        return "com.scoutsys.beans.TimeLabel";
    }
    public BeanDescriptor getBeanDescriptor() {
        java.beans.BeanDescriptor aDescriptor = null;
        try {
            /* Create and return the TimeLabelBeanInfo bean descriptor. */
            aDescriptor =
                new java.beans.BeanDescriptor(
                    com.scoutsys.beans.TimeLabel.class);
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("hidden-state", Boolean.FALSE); */
        } catch (Throwable exception) {
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
     * Gets the getForeColor() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getForeColorMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getForeColor() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getForeColor", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getForeColor", 0);
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
            /* aDescriptor.setDisplayName("getForeColor()"); */
            /* aDescriptor.setShortDescription("getForeColor()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    public java.awt.Image getIcon(int iconKind) {
        if (iconKind == BeanInfo.ICON_MONO_16x16
            || iconKind == BeanInfo.ICON_COLOR_16x16) {
            java.awt.Image img = loadImage("tlb16.gif");
            return img;
        }
        return null;
    }
    /**
     * Gets the getImageSize() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getImageSizeMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getImageSize() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getImageSize", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getImageSize", 0);
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
            /* aDescriptor.setDisplayName("getImageSize()"); */
            /* aDescriptor.setShortDescription("getImageSize()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getLengthMS() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getLengthMSMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getLengthMS() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getLengthMS", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getLengthMS", 0);
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
            /* aDescriptor.setDisplayName("getLengthMS()"); */
            /* aDescriptor.setShortDescription("getLengthMS()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getMajorTimingLineFont() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getMajorTimingLineFontMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getMajorTimingLineFont() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getMajorTimingLineFont",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "getMajorTimingLineFont", 0);
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
            /* aDescriptor.setDisplayName("getMajorTimingLineFont()"); */
            /* aDescriptor.setShortDescription("getMajorTimingLineFont()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Return the method descriptors for this bean.
     * @return java.beans.MethodDescriptor[]
     */
    public java.beans.MethodDescriptor[] getMethodDescriptors() {
        try {
            MethodDescriptor aDescriptorList[] =
                {
                    getBackColorMethodDescriptor(),
                    getForeColorMethodDescriptor(),
                    getImageSizeMethodDescriptor(),
                    getLengthMSMethodDescriptor(),
                    getMajorTimingLineFontMethodDescriptor(),
                    getMinorTimingLineFontMethodDescriptor(),
                    getStartTimeMSMethodDescriptor(),
                    getTraceRenderOptionsMethodDescriptor(),
                    paint_javaawtGraphicsMethodDescriptor(),
                    refreshMethodDescriptor(),
                    setBackColor_javaawtColorMethodDescriptor(),
                    setForeColor_javaawtColorMethodDescriptor(),
                    setLengthMS_intMethodDescriptor(),
                    setMajorTimingLineFont_javaawtFontMethodDescriptor(),
                    setMinorTimingLineFont_javaawtFontMethodDescriptor(),
                    setStartTimeMS_intMethodDescriptor(),
                    setTraceRenderOptions_comscoutsysrenderITraceRenderOptionsMethodDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getMinorTimingLineFont() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getMinorTimingLineFontMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getMinorTimingLineFont() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getMinorTimingLineFont",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "getMinorTimingLineFont", 0);
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
            /* aDescriptor.setDisplayName("getMinorTimingLineFont()"); */
            /* aDescriptor.setShortDescription("getMinorTimingLineFont()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Return the property descriptors for this bean.
     * @return java.beans.PropertyDescriptor[]
     */
    public java.beans.PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor aDescriptorList[] =
                {
                    imageSizePropertyDescriptor(),
                    lengthMSPropertyDescriptor(),
                    majorTimingLineFontPropertyDescriptor(),
                    minorTimingLineFontPropertyDescriptor(),
                    startTimeMSPropertyDescriptor(),
                    traceRenderOptionsPropertyDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getStartTimeMS() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getStartTimeMSMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getStartTimeMS() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getStartTimeMS", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getStartTimeMS", 0);
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
            /* aDescriptor.setDisplayName("getStartTimeMS()"); */
            /* aDescriptor.setShortDescription("getStartTimeMS()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getTraceRenderOptions() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor getTraceRenderOptionsMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getTraceRenderOptions() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getTraceRenderOptions",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "getTraceRenderOptions", 0);
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
            /* aDescriptor.setDisplayName("getTraceRenderOptions()"); */
            /* aDescriptor.setShortDescription("getTraceRenderOptions()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
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
     * Gets the imageSize property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor imageSizePropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the imageSize property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getImageSize",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getImageSize", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                aDescriptor =
                    new PropertyDescriptor("imageSize", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("imageSize", getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("imageSize"); */
            /* aDescriptor.setShortDescription("imageSize"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(false));
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the lengthMS property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor lengthMSPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the lengthMS property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getLengthMS",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getLengthMS", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setLengthMS",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setLengthMS", 1);
                };
                aDescriptor =
                    new PropertyDescriptor("lengthMS", aGetMethod, aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("lengthMS", getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("lengthMS"); */
            /* aDescriptor.setShortDescription("lengthMS"); */
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
     * Gets the majorTimingLineFont property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor majorTimingLineFontPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the majorTimingLineFont property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMajorTimingLineFont",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getMajorTimingLineFont", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Font.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMajorTimingLineFont",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setMajorTimingLineFont", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "majorTimingLineFont",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("majorTimingLineFont"); */
            /* aDescriptor.setShortDescription("majorTimingLineFont"); */
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
     * Gets the minorTimingLineFont property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor minorTimingLineFontPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the minorTimingLineFont property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMinorTimingLineFont",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getMinorTimingLineFont", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Font.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMinorTimingLineFont",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setMinorTimingLineFont", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "minorTimingLineFont",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("minorTimingLineFont"); */
            /* aDescriptor.setShortDescription("minorTimingLineFont"); */
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
     * Gets the paint(java.awt.Graphics) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor paint_javaawtGraphicsMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the paint(java.awt.Graphics) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.awt.Graphics.class };
                aMethod = getBeanClass().getMethod("paint", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "paint", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("g");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("paint(java.awt.Graphics)"); */
            /* aDescriptor.setShortDescription("paint(java.awt.Graphics)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the refresh() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor refreshMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the refresh() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod = getBeanClass().getMethod("refresh", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "refresh", 0);
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
            /* aDescriptor.setDisplayName("refresh()"); */
            /* aDescriptor.setShortDescription("refresh()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setBackColor(java.awt.Color) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setBackColor_javaawtColorMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setBackColor(java.awt.Color) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.awt.Color.class };
                aMethod =
                    getBeanClass().getMethod("setBackColor", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setBackColor", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("newVal");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setBackColor(java.awt.Color)"); */
            /* aDescriptor.setShortDescription("setBackColor(java.awt.Color)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setForeColor(java.awt.Color) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setForeColor_javaawtColorMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setForeColor(java.awt.Color) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.awt.Color.class };
                aMethod =
                    getBeanClass().getMethod("setForeColor", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setForeColor", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("newVal");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setForeColor(java.awt.Color)"); */
            /* aDescriptor.setShortDescription("setForeColor(java.awt.Color)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setLengthMS(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setLengthMS_intMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setLengthMS(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod("setLengthMS", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setLengthMS", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("lengthMS");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setLengthMS(int)"); */
            /* aDescriptor.setShortDescription("setLengthMS(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setMajorTimingLineFont(java.awt.Font) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setMajorTimingLineFont_javaawtFontMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setMajorTimingLineFont(java.awt.Font) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.awt.Font.class };
                aMethod =
                    getBeanClass().getMethod(
                        "setMajorTimingLineFont",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "setMajorTimingLineFont", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("newVal");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setMajorTimingLineFont(java.awt.Font)"); */
            /* aDescriptor.setShortDescription("setMajorTimingLineFont(java.awt.Font)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setMinorTimingLineFont(java.awt.Font) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setMinorTimingLineFont_javaawtFontMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setMinorTimingLineFont(java.awt.Font) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { java.awt.Font.class };
                aMethod =
                    getBeanClass().getMethod(
                        "setMinorTimingLineFont",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "setMinorTimingLineFont", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("newVal");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setMinorTimingLineFont(java.awt.Font)"); */
            /* aDescriptor.setShortDescription("setMinorTimingLineFont(java.awt.Font)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setStartTimeMS(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setStartTimeMS_intMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setStartTimeMS(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod("setStartTimeMS", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setStartTimeMS", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("startTimeMS");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setStartTimeMS(int)"); */
            /* aDescriptor.setShortDescription("setStartTimeMS(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setTraceRenderOptions(com.scoutsys.render.ITraceRenderOptions) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public MethodDescriptor setTraceRenderOptions_comscoutsysrenderITraceRenderOptionsMethodDescriptor() {
        MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setTraceRenderOptions(com.scoutsys.render.ITraceRenderOptions) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.render.ITraceRenderOptions.class };
                aMethod =
                    getBeanClass().getMethod(
                        "setTraceRenderOptions",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "setTraceRenderOptions", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("options");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new MethodDescriptor(aMethod, aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setTraceRenderOptions(com.scoutsys.render.ITraceRenderOptions)"); */
            /* aDescriptor.setShortDescription("setTraceRenderOptions(com.scoutsys.render.ITraceRenderOptions)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the startTimeMS property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor startTimeMSPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the startTimeMS property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getStartTimeMS",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getStartTimeMS", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setStartTimeMS",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setStartTimeMS", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "startTimeMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor("startTimeMS", getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("startTimeMS"); */
            /* aDescriptor.setShortDescription("startTimeMS"); */
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
     * Gets the traceRenderOptions property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public PropertyDescriptor traceRenderOptionsPropertyDescriptor() {
        PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the traceRenderOptions property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getTraceRenderOptions",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getTraceRenderOptions", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { com.scoutsys.render.ITraceRenderOptions.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setTraceRenderOptions",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setTraceRenderOptions", 1);
                };
                aDescriptor =
                    new PropertyDescriptor(
                        "traceRenderOptions",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new PropertyDescriptor(
                        "traceRenderOptions",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("traceRenderOptions"); */
            /* aDescriptor.setShortDescription("traceRenderOptions"); */
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