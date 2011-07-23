package com.scoutsys.beans20;

/**
 * The bean information class for com.scoutsys.beans20.TopLabel.
 */
public class TopLabelBeanInfo extends java.beans.SimpleBeanInfo {
    /**
     * Gets the addPropertyChangeListener(java.beans.PropertyChangeListener) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor addPropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the addPropertyChangeListener(java.beans.PropertyChangeListener) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.beans.PropertyChangeListener.class };
                aMethod =
                    getBeanClass().getMethod(
                        "addPropertyChangeListener",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "addPropertyChangeListener", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("listener");
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
            /* aDescriptor.setDisplayName("addPropertyChangeListener(java.beans.PropertyChangeListener)"); */
            /* aDescriptor.setShortDescription("addPropertyChangeListener(java.beans.PropertyChangeListener)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
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
     * Gets the firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor firePropertyChange_javalangString_javalangObject_javalangObjectMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    {
                        java.lang.String.class,
                        java.lang.Object.class,
                        java.lang.Object.class };
                aMethod =
                    getBeanClass().getMethod(
                        "firePropertyChange",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "firePropertyChange", 3);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("propertyName");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("oldValue");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("newValue");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3 };
                aDescriptor =
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object)"); */
            /* aDescriptor.setShortDescription("firePropertyChange(java.lang.String, java.lang.Object, java.lang.Object)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the firstValue property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor firstValuePropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the firstValue property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getFirstValue",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getFirstValue", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setFirstValue",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setFirstValue", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "firstValue",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "firstValue",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("firstValue"); */
            /* aDescriptor.setShortDescription("firstValue"); */
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
        return com.scoutsys.beans20.TopLabel.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static java.lang.String getBeanClassName() {
        return "com.scoutsys.beans20.TopLabel";
    }
    public java.beans.BeanDescriptor getBeanDescriptor() {
        java.beans.BeanDescriptor aDescriptor = null;
        try {
            /* Create and return the TopLabelBeanInfo bean descriptor. */
            aDescriptor =
                new java.beans.BeanDescriptor(
                    com.scoutsys.beans20.TopLabel.class);
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
     * Gets the getFirstValue() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getFirstValueMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getFirstValue() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getFirstValue", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getFirstValue", 0);
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
            /* aDescriptor.setDisplayName("getFirstValue()"); */
            /* aDescriptor.setShortDescription("getFirstValue()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getHeaders() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getHeadersMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getHeaders() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getHeaders", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getHeaders", 0);
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
            /* aDescriptor.setDisplayName("getHeaders()"); */
            /* aDescriptor.setShortDescription("getHeaders()"); */
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
                    addPropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor(),
                    firePropertyChange_javalangString_javalangObject_javalangObjectMethodDescriptor(),
                    getFirstValueMethodDescriptor(),
                    getHeadersMethodDescriptor(),
                    getValueIntervalMethodDescriptor(),
                    main_javalangString__MethodDescriptor(),
                    refreshMethodDescriptor(),
                    removePropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor(),
                    setFirstValue_intMethodDescriptor(),
                    setHeaders_comscoutsystraceIHeader__MethodDescriptor(),
                    setValueInterval_intMethodDescriptor()};
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
            java.beans.PropertyDescriptor aDescriptorList[] =
                {
                    backgroundPropertyDescriptor(),
                    firstValuePropertyDescriptor(),
                    foregroundPropertyDescriptor(),
                    headersPropertyDescriptor(),
                    majorFontPropertyDescriptor(),
                    majorHeaderFieldPropertyDescriptor(),
                    minorFontPropertyDescriptor(),
                    minorHeaderFieldPropertyDescriptor(),
                    traceRenderOptionsPropertyDescriptor(),
                    valueIntervalPropertyDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getValueInterval() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getValueIntervalMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getValueInterval() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getValueInterval",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getValueInterval", 0);
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
            /* aDescriptor.setDisplayName("getValueInterval()"); */
            /* aDescriptor.setShortDescription("getValueInterval()"); */
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
     * Gets the headers property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor headersPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the headers property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getHeaders",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getHeaders", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { com.scoutsys.trace.IHeader[].class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setHeaders",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setHeaders", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "headers",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "headers",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("headers"); */
            /* aDescriptor.setShortDescription("headers"); */
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
     * Gets the majorFont property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor majorFontPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the majorFont property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMajorFont",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getMajorFont", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Font.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMajorFont",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setMajorFont", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "majorFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "majorFont",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("majorFont"); */
            /* aDescriptor.setShortDescription("majorFont"); */
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
     * Gets the majorHeaderField property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor majorHeaderFieldPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the majorHeaderField property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMajorHeaderField",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getMajorHeaderField", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.lang.String.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMajorHeaderField",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setMajorHeaderField", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "majorHeaderField",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "majorHeaderField",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("majorHeaderField"); */
            /* aDescriptor.setShortDescription("majorHeaderField"); */
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
     * Gets the minorFont property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor minorFontPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the minorFont property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMinorFont",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getMinorFont", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Font.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMinorFont",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setMinorFont", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "minorFont",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "minorFont",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("minorFont"); */
            /* aDescriptor.setShortDescription("minorFont"); */
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
     * Gets the minorHeaderField property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor minorHeaderFieldPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the minorHeaderField property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getMinorHeaderField",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getMinorHeaderField", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.lang.String.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setMinorHeaderField",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setMinorHeaderField", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "minorHeaderField",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "minorHeaderField",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("minorHeaderField"); */
            /* aDescriptor.setShortDescription("minorHeaderField"); */
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
     * Gets the removePropertyChangeListener(java.beans.PropertyChangeListener) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor removePropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the removePropertyChangeListener(java.beans.PropertyChangeListener) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.beans.PropertyChangeListener.class };
                aMethod =
                    getBeanClass().getMethod(
                        "removePropertyChangeListener",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        getBeanClass(),
                        "removePropertyChangeListener",
                        1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("listener");
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
            /* aDescriptor.setDisplayName("removePropertyChangeListener(java.beans.PropertyChangeListener)"); */
            /* aDescriptor.setShortDescription("removePropertyChangeListener(java.beans.PropertyChangeListener)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setFirstValue(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor setFirstValue_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setFirstValue(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod("setFirstValue", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setFirstValue", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("firstValue");
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
            /* aDescriptor.setDisplayName("setFirstValue(int)"); */
            /* aDescriptor.setShortDescription("setFirstValue(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setHeaders(com.scoutsys.trace.IHeader[]) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor setHeaders_comscoutsystraceIHeader__MethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setHeaders(com.scoutsys.trace.IHeader[]) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.trace.IHeader[].class };
                aMethod =
                    getBeanClass().getMethod("setHeaders", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setHeaders", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("newValue");
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
            /* aDescriptor.setDisplayName("setHeaders(com.scoutsys.trace.IHeader[])"); */
            /* aDescriptor.setShortDescription("setHeaders(com.scoutsys.trace.IHeader[])"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setValueInterval(int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor setValueInterval_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setValueInterval(int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = { int.class };
                aMethod =
                    getBeanClass().getMethod(
                        "setValueInterval",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setValueInterval", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("valueInterval");
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
            /* aDescriptor.setDisplayName("setValueInterval(int)"); */
            /* aDescriptor.setShortDescription("setValueInterval(int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
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
    /**
     * Gets the valueInterval property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor valueIntervalPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the valueInterval property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getValueInterval",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getValueInterval", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] = { int.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setValueInterval",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setValueInterval", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "valueInterval",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "valueInterval",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("valueInterval"); */
            /* aDescriptor.setShortDescription("valueInterval"); */
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