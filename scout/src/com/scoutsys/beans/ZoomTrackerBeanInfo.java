package com.scoutsys.beans;

/**
 * The bean information class for com.scoutsys.beans.ZoomTracker.
 */
public class ZoomTrackerBeanInfo extends java.beans.SimpleBeanInfo {
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
        return com.scoutsys.beans.ZoomTracker.class;
    }
    /**
     * Gets the bean class name.
     * @return java.lang.String
     */
    public static java.lang.String getBeanClassName() {
        return "com.scoutsys.beans.ZoomTracker";
    }
    public java.beans.BeanDescriptor getBeanDescriptor() {
        java.beans.BeanDescriptor aDescriptor = null;
        try {
            /* Create and return the ZoomTrackerBeanInfo bean descriptor. */
            aDescriptor =
                new java.beans.BeanDescriptor(
                    com.scoutsys.beans.ZoomTracker.class);
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
                { zoomEventSetDescriptor()};
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
            java.beans.MethodDescriptor aDescriptorList[] = {
            };
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
                    seisBeanPropertyDescriptor(),
                    selectionColorPropertyDescriptor()};
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
    private void handleException(java.lang.Throwable exception) {

        /* Uncomment the following lines to print uncaught exceptions to stdout */
        // System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        // exception.printStackTrace(System.out);
    }
    /**
     * Gets the seisBean property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor seisBeanPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the seisBean property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getSeisBean",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod = findMethod(getBeanClass(), "getSeisBean", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { com.scoutsys.beans.SeisBean.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setSeisBean",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod = findMethod(getBeanClass(), "setSeisBean", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "seisBean",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "seisBean",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            /* aDescriptor.setDisplayName("seisBean"); */
            aDescriptor.setShortDescription(
                "underlying SeisBean that holds the source data to be selected");
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
     * Gets the selectionColor property descriptor.
     * @return java.beans.PropertyDescriptor
     */
    public java.beans.PropertyDescriptor selectionColorPropertyDescriptor() {
        java.beans.PropertyDescriptor aDescriptor = null;
        try {
            try {
                /* Using methods via getMethod is the faster way to create the selectionColor property descriptor. */
                java.lang.reflect.Method aGetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aGetMethodParameterTypes[] = {
                    };
                    aGetMethod =
                        getBeanClass().getMethod(
                            "getSelectionColor",
                            aGetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aGetMethod =
                        findMethod(getBeanClass(), "getSelectionColor", 0);
                };
                java.lang.reflect.Method aSetMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aSetMethodParameterTypes[] =
                        { java.awt.Color.class };
                    aSetMethod =
                        getBeanClass().getMethod(
                            "setSelectionColor",
                            aSetMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aSetMethod =
                        findMethod(getBeanClass(), "setSelectionColor", 1);
                };
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "selectionColor",
                        aGetMethod,
                        aSetMethod);
            } catch (Throwable exception) {
                /* Since we failed using methods, try creating a default property descriptor. */
                handleException(exception);
                aDescriptor =
                    new java.beans.PropertyDescriptor(
                        "selectionColor",
                        getBeanClass());
            };
            /* aDescriptor.setBound(false); */
            /* aDescriptor.setConstrained(false); */
            aDescriptor.setDisplayName("selection color");
            aDescriptor.setShortDescription(
                "Color to draw rectangle while tracking");
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
     * Gets the zoom event set descriptor.
     * @return java.beans.EventSetDescriptor
     */
    public java.beans.EventSetDescriptor zoomEventSetDescriptor() {
        java.beans.EventSetDescriptor aDescriptor = null;
        try {
            try {
                /* Try using method descriptors to create the zoom event set descriptor. */
                java.beans.MethodDescriptor eventMethodDescriptors[] =
                    {
                         zoomhandleZoom_float_float_float_floatMethodEventDescriptor()};
                java.lang.reflect.Method anAddMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class anAddMethodParameterTypes[] =
                        { com.scoutsys.beans.ZoomListener.class };
                    anAddMethod =
                        getBeanClass().getMethod(
                            "addZoomListener",
                            anAddMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    anAddMethod =
                        findMethod(getBeanClass(), "addZoomListener", 1);
                };
                java.lang.reflect.Method aRemoveMethod = null;
                try {
                    /* Attempt to find the method using getMethod with parameter types. */
                    java.lang.Class aRemoveMethodParameterTypes[] =
                        { com.scoutsys.beans.ZoomListener.class };
                    aRemoveMethod =
                        getBeanClass().getMethod(
                            "removeZoomListener",
                            aRemoveMethodParameterTypes);
                } catch (Throwable exception) {
                    /* Since getMethod failed, call findMethod. */
                    handleException(exception);
                    aRemoveMethod =
                        findMethod(getBeanClass(), "removeZoomListener", 1);
                };
                aDescriptor =
                    new java.beans.EventSetDescriptor(
                        "zoom",
                        com.scoutsys.beans.ZoomListener.class,
                        eventMethodDescriptors,
                        anAddMethod,
                        aRemoveMethod);
            } catch (Throwable exception) {
                /* Using method descriptors failed, try using the methods names. */
                handleException(exception);
                java.lang.String eventMethodNames[] = { "handleZoom" };
                aDescriptor =
                    new java.beans.EventSetDescriptor(
                        getBeanClass(),
                        "zoom",
                        com.scoutsys.beans.ZoomListener.class,
                        eventMethodNames,
                        "addZoomListener",
                        "removeZoomListener");
            };
            /* aDescriptor.setUnicast(false); */
            aDescriptor.setDisplayName("ZoomListener");
            aDescriptor.setShortDescription("Fired when user zooms ");
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
    /**
     * Gets the zoom.handleZoom(float, float, float, float) method descriptor.
     * @return java.beans.MethodDescriptor
     */
    public java
        .beans
        .MethodDescriptor zoomhandleZoom_float_float_float_floatMethodEventDescriptor() {
        java.beans.MethodDescriptor aDescriptor = null;
        try {
            /* Create and return the zoom.handleZoom(float, float, float, float) method descriptor. */
            java.lang.reflect.Method aMethod = null;
            try {
                /* Attempt to find the method using getMethod with parameter types. */
                java.lang.Class aParameterTypes[] =
                    { float.class, float.class, float.class, float.class };
                aMethod =
                    (com.scoutsys.beans.ZoomListener.class).getMethod(
                        "handleZoom",
                        aParameterTypes);
            } catch (Throwable exception) {
                /* Since getMethod failed, call findMethod. */
                handleException(exception);
                aMethod =
                    findMethod(
                        (com.scoutsys.beans.ZoomListener.class),
                        "handleZoom",
                        4);
            };
            try {
                /* Try creating the method descriptor with parameter descriptors. */
                java.beans.ParameterDescriptor aParameterDescriptor1 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor1.setName("arg1");
                aParameterDescriptor1.setDisplayName("trace1");
                java.beans.ParameterDescriptor aParameterDescriptor2 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor2.setName("arg2");
                aParameterDescriptor2.setDisplayName("timeMS1");
                java.beans.ParameterDescriptor aParameterDescriptor3 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor3.setName("arg3");
                aParameterDescriptor3.setDisplayName("trace2");
                java.beans.ParameterDescriptor aParameterDescriptor4 =
                    new java.beans.ParameterDescriptor();
                aParameterDescriptor4.setName("arg4");
                aParameterDescriptor4.setDisplayName("timeMS2");
                java.beans.ParameterDescriptor aParameterDescriptors[] =
                    {
                        aParameterDescriptor1,
                        aParameterDescriptor2,
                        aParameterDescriptor3,
                        aParameterDescriptor4 };
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
                "zoom.handleZoom(float, float, float, float)");
            /* aDescriptor.setShortDescription("zoom.handleZoom(float, float, float, float)"); */
            /* aDescriptor.setExpert(false); */
            /* aDescriptor.setHidden(false); */
            /* aDescriptor.setValue("preferred", new Boolean(false)); */
        } catch (Throwable exception) {
            handleException(exception);
        };
        return aDescriptor;
    }
}