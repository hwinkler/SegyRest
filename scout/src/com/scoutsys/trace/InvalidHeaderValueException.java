package com.scoutsys.trace;

/**
 * No documentation for this type.
 */
public class InvalidHeaderValueException
    extends Exception
    implements java.io.Serializable {
    private String name = "";
    private Object value;
    private String reason = "";
    /**
     * InvalidHeaderValueException constructor comment.
     */
    public InvalidHeaderValueException() {
        super();
    }
    /**
     * InvalidHeaderValueException constructor comment.
     * @param s java.lang.String
     */
    public InvalidHeaderValueException(String s) {
        super(s);
    }
    /**
     * No documentation for this method.
     * @param name java.lang.String
     * @param value java.lang.Object
     * @param reason java.lang.String
     */
    public InvalidHeaderValueException(
        String name,
        Object value,
        String reason) {
        this.name = name;
        this.value = value;
        this.reason = reason;
    }
    /**
     * No documentation for this method.
     * @return java.lang.String
     */
    public String getName() {
        return name;
    }
    /**
     * No documentation for this method.
     * @return java.lang.String
     */
    public String getReason() {
        return reason;
    }
    /**
     * No documentation for this method.
     * @return java.lang.Object
     */
    public Object getValue() {
        return value;
    }
    /**
     * No documentation for this method.
     * @param newValue java.lang.String
     */
    public void setName(String newValue) {
        this.name = newValue;
    }
    /**
     * No documentation for this method.
     * @param newValue java.lang.String
     */
    public void setReason(String newValue) {
        this.reason = newValue;
    }
    /**
     * No documentation for this method.
     * @param newValue java.lang.Object
     */
    public void setValue(Object newValue) {
        this.value = newValue;
    }
    /**
     * No documentation for this method.
     * @return java.lang.String
     */
    public String toString() {
        String s = super.toString();
        s =
            s
                + " Name: "
                + this.name
                + " Value: "
                + this.value
                + " Reason: "
                + this.reason;
        return s;
    }
}