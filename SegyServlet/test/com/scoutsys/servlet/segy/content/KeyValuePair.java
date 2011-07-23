/*
 * Created on Jun 3, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

/**
 * @author Hugh
 */
class KeyValuePair {
    private String key;
    private String value;
    private boolean isValid;
    /**
     * 
     */
    public KeyValuePair(String key, String value, boolean isValid) {
        super();
        this.key = key;
        this.value = value;
        this.isValid = isValid;
    }

    /**
     * @return
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * @return
     */
    public String getValue() {
        return value;
    }

}
