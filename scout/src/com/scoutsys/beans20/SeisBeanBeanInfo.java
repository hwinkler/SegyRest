package com.scoutsys.beans20;

/**
 * The bean information class for com.scoutsys.beans.SeisBean.
 */
public class SeisBeanBeanInfo extends java.beans.SimpleBeanInfo {
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
        return com.scoutsys.beans.SeisBean.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static java.lang.String getBeanClassName() {
        return "com.scoutsys.beans.SeisBean";
    }
    public java.beans.BeanDescriptor getBeanDescriptor() {
        java.beans.BeanDescriptor aDescriptor = null;
        try {
            /* Create and return the SeisBeanBeanInfo bean descriptor. */
            aDescriptor =
                new java.beans.BeanDescriptor(
                    com.scoutsys.beans.SeisBean.class);
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
            java.beans.EventSetDescriptor aDescriptorList[] =
                { propertyChangeEventSetDescriptor()};
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
            java.beans.MethodDescriptor aDescriptorList[] =
                {
                    addPropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor(),
                    firePropertyChange_javalangString_javalangObject_javalangObjectMethodDescriptor(),
                    getOptionsMethodDescriptor(),
                    getPreferredScrollableViewportSizeMethodDescriptor(),
                    getScrollableBlockIncrement_javaawtRectangle_int_intMethodDescriptor(),
                    getScrollableTracksViewportHeightMethodDescriptor(),
                    getScrollableTracksViewportWidthMethodDescriptor(),
                    getScrollableUnitIncrement_javaawtRectangle_int_intMethodDescriptor(),
                    getTracesMethodDescriptor(),
                    main_javalangString__MethodDescriptor(),
                    refreshMethodDescriptor(),
                    removePropertyChangeListener_javabeansPropertyChangeListenerMethodDescriptor(),
                    setOptions_comscoutsysrenderTraceRenderOptionsMethodDescriptor(),
                    setTraces_comscoutsystraceITrace__MethodDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getOptions() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getOptionsMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getOptions() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getOptions", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getOptions", 0);
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
            /* aDescriptor.setDisplayName("getOptions()"); */
            /* aDescriptor.setShortDescription("getOptions()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getPreferredScrollableViewportSize() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor getPreferredScrollableViewportSizeMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getPreferredScrollableViewportSize() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getPreferredScrollableViewportSize",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        getBeanClass(),
                        "getPreferredScrollableViewportSize",
                        0);
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
            /* aDescriptor.setDisplayName("getPreferredScrollableViewportSize()"); */
            /* aDescriptor.setShortDescription("getPreferredScrollableViewportSize()"); */
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
                    optionsPropertyDescriptor(),
                    preferredScrollableViewportSizePropertyDescriptor(),
                    preferredSizePropertyDescriptor(),
                    scrollableTracksViewportHeightPropertyDescriptor(),
                    scrollableTracksViewportWidthPropertyDescriptor(),
                    tracesPropertyDescriptor()};
            return aDescriptorList;
        } catch (Throwable exception) {
            handleException(exception);
        };
        return null;
    }
    /**
     * Gets the getScrollableBlockIncrement(java.awt.Rectangle, int, int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor getScrollableBlockIncrement_javaawtRectangle_int_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getScrollableBlockIncrement(java.awt.Rectangle, int, int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.awt.Rectangle.class, int.class, int.class };
                aMethod =
                    getBeanClass().getMethod(
                        "getScrollableBlockIncrement",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        getBeanClass(),
                        "getScrollableBlockIncrement",
                        3);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("visibleRect");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("orientation");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("direction");
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
            /* aDescriptor.setDisplayName("getScrollableBlockIncrement(java.awt.Rectangle, int, int)"); */
            /* aDescriptor.setShortDescription("getScrollableBlockIncrement(java.awt.Rectangle, int, int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getScrollableTracksViewportHeight() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor getScrollableTracksViewportHeightMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getScrollableTracksViewportHeight() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getScrollableTracksViewportHeight",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        getBeanClass(),
                        "getScrollableTracksViewportHeight",
                        0);
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
            /* aDescriptor.setDisplayName("getScrollableTracksViewportHeight()"); */
            /* aDescriptor.setShortDescription("getScrollableTracksViewportHeight()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getScrollableTracksViewportWidth() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor getScrollableTracksViewportWidthMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getScrollableTracksViewportWidth() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod(
                        "getScrollableTracksViewportWidth",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        getBeanClass(),
                        "getScrollableTracksViewportWidth",
                        0);
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
            /* aDescriptor.setDisplayName("getScrollableTracksViewportWidth()"); */
            /* aDescriptor.setShortDescription("getScrollableTracksViewportWidth()"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getScrollableUnitIncrement(java.awt.Rectangle, int, int) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor getScrollableUnitIncrement_javaawtRectangle_int_intMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getScrollableUnitIncrement(java.awt.Rectangle, int, int) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.awt.Rectangle.class, int.class, int.class };
                aMethod =
                    getBeanClass().getMethod(
                        "getScrollableUnitIncrement",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(getBeanClass(), "getScrollableUnitIncrement", 3);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("visibleRect");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("orientation");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("direction");
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
            /* aDescriptor.setDisplayName("getScrollableUnitIncrement(java.awt.Rectangle, int, int)"); */
            /* aDescriptor.setShortDescription("getScrollableUnitIncrement(java.awt.Rectangle, int, int)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the getTraces() method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java.beans.MethodDescriptor getTracesMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the getTraces() method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] = {
                };
                aMethod =
                    getBeanClass().getMethod("getTraces", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "getTraces", 0);
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
            /* aDescriptor.setDisplayName("getTraces()"); */
            /* aDescriptor.setShortDescription("getTraces()"); */
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
     * Gets the options property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor optionsPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the options property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getOptions",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getOptions", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { com.scoutsys.render.TraceRenderOptions.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setOptions",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setOptions", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "options",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "options",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("options"); */
            aDescriptor.setShortDescription("Trace rendering options");
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
     * Gets the preferredScrollableViewportSize property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java
        .beans
        .PropertyDescriptor preferredScrollableViewportSizePropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the preferredScrollableViewportSize property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getPreferredScrollableViewportSize",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getPreferredScrollableViewportSize",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "preferredScrollableViewportSize",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "preferredScrollableViewportSize",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("preferredScrollableViewportSize"); */
            /* aDescriptor.setShortDescription("preferredScrollableViewportSize"); */
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
     * Gets the propertyChange event set descriptor.
     * @return java.beans.EventSetDescriptor
     */
    public java.beans.EventSetDescriptor propertyChangeEventSetDescriptor() {
        java.beans.EventSetDescriptor aDescriptor = null;
        try {
            try {
                /* Try using method descriptors to create the propertyChange event set descriptor. */
                java.beans.MethodDescriptor eventMethodDescriptors[] =
                    {
                         propertyChangepropertyChange_javabeansPropertyChangeEventMethodEventDescriptor()};
                java.lang.reflect.Method anAddMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class anAddMethodParameterTypes[] =
                        { java.beans.PropertyChangeListener.class };
                    anAddMethod =
                        getBeanClass().getMethod(
                            "addPropertyChangeListener",
                            anAddMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    anAddMethod =
                        findMethod(
                            getBeanClass(),
                            "addPropertyChangeListener",
                            1);
                };
                java.lang.reflect.Method aRemoveMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aRemoveMethodParameterTypes[] =
                        { java.beans.PropertyChangeListener.class };
                    aRemoveMethod =
                        getBeanClass().getMethod(
                            "removePropertyChangeListener",
                            aRemoveMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aRemoveMethod =
                        findMethod(
                            getBeanClass(),
                            "removePropertyChangeListener",
                            1);
                };
                aDescriptor =
                    new java.beans.EventSetDescriptor(
                        "propertyChange",
                        java.beans.PropertyChangeListener.class,
                        eventMethodDescriptors,
                        anAddMethod,
                        aRemoveMethod);
            } catch (Throwable exception) {
                /* Using method descriptors failed, try using the methods names. */
                handleException(exception);
                java.lang.String eventMethodNames[] = { "propertyChange" };
                aDescriptor =
                    new java.beans.EventSetDescriptor(
                        getBeanClass(),
                        "propertyChange",
                        java.beans.PropertyChangeListener.class,
                        eventMethodNames,
                        "addPropertyChangeListener",
                        "removePropertyChangeListener");
            };
            /* aDescriptor.setUnicast(false); */
            /* aDescriptor.setDisplayName("propertyChange"); */
            /* aDescriptor.setShortDescription("propertyChange"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the propertyChange.propertyChange(java.beans.PropertyChangeEvent) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor propertyChangepropertyChange_javabeansPropertyChangeEventMethodEventDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the propertyChange.propertyChange(java.beans.PropertyChangeEvent) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { java.beans.PropertyChangeEvent.class };
                aMethod =
                    (java.beans.PropertyChangeListener.class).getMethod(
                        "propertyChange",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        (java.beans.PropertyChangeListener.class),
                        "propertyChange",
                        1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("evt");
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
            aDescriptor.setDisplayName(
                "propertyChange.propertyChange(java.beans.PropertyChangeEvent)");
            aDescriptor.setShortDescription(
                "propertyChange.propertyChange (java.beans.PropertyChangeEvent)");
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
     * Gets the scrollableTracksViewportHeight property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java
        .beans
        .PropertyDescriptor scrollableTracksViewportHeightPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the scrollableTracksViewportHeight property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getScrollableTracksViewportHeight",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getScrollableTracksViewportHeight",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "scrollableTracksViewportHeight",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "scrollableTracksViewportHeight",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("scrollableTracksViewportHeight"); */
            /* aDescriptor.setShortDescription("scrollableTracksViewportHeight"); */
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
     * Gets the scrollableTracksViewportWidth property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java
        .beans
        .PropertyDescriptor scrollableTracksViewportWidthPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the scrollableTracksViewportWidth property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getScrollableTracksViewportWidth",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(
                            getBeanClass(),
                            "getScrollableTracksViewportWidth",
                            0);
                };
                java.lang.reflect.Method aSetMethod = null;
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "scrollableTracksViewportWidth",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "scrollableTracksViewportWidth",
                        getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("scrollableTracksViewportWidth"); */
            /* aDescriptor.setShortDescription("scrollableTracksViewportWidth"); */
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
     * Gets the seisMouse.handleMove(com.scoutsys.beans.SeisMouseEvent) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor seisMousehandleMove_comscoutsysbeansSeisMouseEventMethodEventDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the seisMouse.handleMove(com.scoutsys.beans.SeisMouseEvent) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.beans.SeisMouseEvent.class };
                aMethod =
                    (com.scoutsys.beans.SeisMouseListener.class).getMethod(
                        "handleMove",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        (com.scoutsys.beans.SeisMouseListener.class),
                        "handleMove",
                        1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("evt");
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
            aDescriptor.setDisplayName(
                "seisMouse.handleMove(com.scoutsys.beans20.SeisMouseEvent)");
            /* aDescriptor.setShortDescription("seisMouse.handleMove(com.scoutsys.beans20.SeisMouseEvent)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setOptions(com.scoutsys.render.TraceRenderOptions) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor setOptions_comscoutsysrenderTraceRenderOptionsMethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setOptions(com.scoutsys.render.TraceRenderOptions) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.render.TraceRenderOptions.class };
                aMethod =
                    getBeanClass().getMethod("setOptions", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setOptions", 1);
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
                    new java.beans.MethodDescriptor(
                        aMethod,
                        aParameterDescriptors);
            } catch (Throwable exception) {
                /* Try creating the method descriptor without parameter descriptors. */
                handleException(exception);
                aDescriptor = new java.beans.MethodDescriptor(aMethod);
            };
            /* aDescriptor.setDisplayName("setOptions(com.scoutsys.render.TraceRenderOptions)"); */
            /* aDescriptor.setShortDescription("setOptions(com.scoutsys.render.TraceRenderOptions)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the setTraces(com.scoutsys.trace.ITrace[]) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor setTraces_comscoutsystraceITrace__MethodDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the setTraces(com.scoutsys.trace.ITrace[]) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { com.scoutsys.trace.ITrace[].class };
                aMethod =
                    getBeanClass().getMethod("setTraces", aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod = findMethod(getBeanClass(), "setTraces", 1);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("traces");
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
            /* aDescriptor.setDisplayName("setTraces(com.scoutsys.trace.ITrace[])"); */
            /* aDescriptor.setShortDescription("setTraces(com.scoutsys.trace.ITrace[])"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the traces property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor tracesPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the traces property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getTraces",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getTraces", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { com.scoutsys.trace.ITrace[].class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setTraces",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setTraces", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "traces",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor("traces", getBeanClass());
            };
            aDescriptor.setBound(true);
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("traces"); */
            aDescriptor.setShortDescription("seismic traces to draw");
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