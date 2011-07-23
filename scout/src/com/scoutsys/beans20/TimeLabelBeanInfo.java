package com.scoutsys.beans20;

/**
 * The bean information class for com.scoutsys.beans20.TimeLabel.
 */
public class TimeLabelBeanInfo extends java.beans.SimpleBeanInfo {
    /**
     * Gets the background property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor backgroundPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the background property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getBackground",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getBackground", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Color.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setBackground",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setBackground", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "background",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "background",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("background"); */
            aDescriptor.setShortDescription("Background color");
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
        java.lang.Class aClass,
        java.lang.String methodName,
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
        } catch (java.lang.Throwable exception) {
            return null;
        }
        return null;
    }
    /**
     * Gets the foreground property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor foregroundPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the foreground property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getForeground",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getForeground", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Color.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setForeground",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setForeground", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "foreground",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "foreground",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("foreground"); */
            aDescriptor.setShortDescription("Foreground color");
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
     * Returns the BeanInfo of the superclass of this bean to inherit its features.
     * @return java.beans.BeanInfo[]
     */
    public java.beans.BeanInfo[] getAdditionalBeanInfo() {
        java.lang.Class superClass;
        java.beans.BeanInfo superBeanInfo = null;

        try {
            superClass = getBeanDescriptor().getBeanClass().getSuperclass();
        } catch (java.lang.Throwable exception) {
            return null;
        }

        try {
            superBeanInfo = java.beans.Introspector.getBeanInfo(superClass);
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
    public static java.lang.Class getBeanClass() {
        return com.scoutsys.beans20.TimeLabel.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static java.lang.String getBeanClassName() {
        return "com.scoutsys.beans20.TimeLabel";
    }
    public java.beans.BeanDescriptor getBeanDescriptor() {
        java.beans.BeanDescriptor aDescriptor = null;
        try {
            /* Create and return the TimeLabelBeanInfo bean descriptor. */
            aDescriptor =
                new java.beans.BeanDescriptor(
                    com.scoutsys.beans20.TimeLabel.class);
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
            java.beans.EventSetDescriptor aDescriptorList[] = {
            };
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getImageSize() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getImageSizeMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java.beans.MethodDescriptor getLengthMSMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java
        .beans
        .MethodDescriptor getMajorTimingLineFontMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
            java.beans.MethodDescriptor aDescriptorList[] =
                {
                    getImageSizeMethodDescriptor(),
                    getLengthMSMethodDescriptor(),
                    getMajorTimingLineFontMethodDescriptor(),
                    getMinorTimingLineFontMethodDescriptor(),
                    getStartTimeMSMethodDescriptor(),
                    getTraceRenderOptionsMethodDescriptor(),
                    main_javalangString__MethodDescriptor(),
                    refreshMethodDescriptor(),
                    setLengthMS_intMethodDescriptor(),
                    setMajorTimingLineFont_javaawtFontMethodDescriptor(),
                    setMinorTimingLineFont_javaawtFontMethodDescriptor(),
                    setStartTimeMS_intMethodDescriptor(),
                    setTraceRenderOptions_comscoutsysrenderTraceRenderOptionsMethodDescriptor()};
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
    public java
        .beans
        .MethodDescriptor getMinorTimingLineFontMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
            java.beans.PropertyDescriptor aDescriptorList[] =
                {
                    backgroundPropertyDescriptor(),
                    foregroundPropertyDescriptor(),
                    imageSizePropertyDescriptor(),
                    lengthMSPropertyDescriptor(),
                    majorTimingLineFontPropertyDescriptor(),
                    minorTimingLineFontPropertyDescriptor(),
                    preferredSizePropertyDescriptor(),
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
    public java.beans.MethodDescriptor getStartTimeMSMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java
        .beans
        .MethodDescriptor getTraceRenderOptionsMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    private void handleException(java.lang.Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        // System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        // exception.printStackTrace(System.out);
    }
    /**
     * Gets the imageSize property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor imageSizePropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                    new java.beans.PropertyDescriptor(
                        "imageSize",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "imageSize",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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
    public java.beans.PropertyDescriptor lengthMSPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                    new java.beans.PropertyDescriptor(
                        "lengthMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "lengthMS",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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
     * Gets the main(java.lang.String[]) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor main_javalangString__MethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the main(java.lang.String[]) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.lang.String[].class };
                aMethod = getBeanClass().getMethod("main", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "main", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("args");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("main(java.lang.String[])"); */
            /* aDescriptor.setShortDescription("main(java.lang.String[])"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the majorTimingLineFont property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java
        .beans
        .PropertyDescriptor majorTimingLineFontPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                    new java.beans.PropertyDescriptor(
                        "majorTimingLineFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "majorTimingLineFont",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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
    public java
        .beans
        .PropertyDescriptor minorTimingLineFontPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                    new java.beans.PropertyDescriptor(
                        "minorTimingLineFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "minorTimingLineFont",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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
     * Gets the preferredSize property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor preferredSizePropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the preferredSize property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getPreferredSize",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getPreferredSize", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Dimension.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setPreferredSize",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setPreferredSize", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "preferredSize",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "preferredSize",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("preferredSize"); */
            /* aDescriptor.setShortDescription("preferredSize"); */
            aDescriptor.setExpert(true);
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
            /* aDescriptor.setValue("ivjDesignTimeProperty", new Boolean(true)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the refresh() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor refreshMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
     * Gets the setLengthMS(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor setLengthMS_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java
        .beans
        .MethodDescriptor setMajorTimingLineFont_javaawtFontMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java
        .beans
        .MethodDescriptor setMinorTimingLineFont_javaawtFontMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
    public java.beans.MethodDescriptor setStartTimeMS_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
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
     * Gets the setTraceRenderOptions(com.scoutsys.render.TraceRenderOptions) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor setTraceRenderOptions_comscoutsysrenderTraceRenderOptionsMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setTraceRenderOptions(com.scoutsys.render.TraceRenderOptions) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.render.TraceRenderOptions.class };
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
                aParameterDescriptor1.setDisplayName("traceRenderOptions");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    { aParameterDescriptor1 };
                aDescriptor =
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setTraceRenderOptions(com.scoutsys.render.TraceRenderOptions)"); */
            /* aDescriptor.setShortDescription("setTraceRenderOptions(com.scoutsys.render.TraceRenderOptions)"); */
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
    public java.beans.PropertyDescriptor startTimeMSPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                    new java.beans.PropertyDescriptor(
                        "startTimeMS",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "startTimeMS",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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
    public java
        .beans
        .PropertyDescriptor traceRenderOptionsPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
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
                        { com.scoutsys.render.TraceRenderOptions.class };
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
                    new java.beans.PropertyDescriptor(
                        "traceRenderOptions",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "traceRenderOptions",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
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