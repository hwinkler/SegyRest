package com.scoutsys.trace;

/**
 * No documentation for this type.
 */
public interface IHeader {
    /**
     * No documentation for this method.
     * @return java.util.Vector
     */
    String[] getAllNames();
    /**
     * No documentation for this method.
     * @return java.lang.Object[]
     */
    Object[] getAllValues();
    /**
     * No documentation for this method.
     * @return java.lang.Object
     * @param name java.lang.String
     */
    Object getValue(final String name);
    /**
     * No documentation for this method.
     * @param name java.lang.String
     * @param value java.lang.Object
     * @exception com.scoutsys.trace.InvalidHeaderValueException The exception description.
     */
    void setValue(String name, Object value)
        throws InvalidHeaderValueException;
}