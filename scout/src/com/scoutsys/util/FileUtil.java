package com.scoutsys.util;

// cribbed from http://www.sun.com/suntest/100percent/cpd/doc/cookbook/cookbook.doc4.html

import java.io.File;
import java.util.StringTokenizer;

/** A utility class to make it easier to use
 *	 java.io.File in a portable way.
*/

public class FileUtil {
    /** Create a new pathname by gluing together
    	* a series of names. 
    	* If initial base is null, works from 
    	* current directory. 
    	*/
    public static File fromDir(File bse, String[] path) {
        File val = bse;
        int i = 0;

        if (val == null && path.length > 0) {
            val = new File(path[i++]);
        }

        for (; i < path.length; i++) {
            val = new File(val, path[i]);
        }

        return val;
    }
    public static File fromHere(String[] path) {
        return fromDir(null, path);
    }
    private static File fromProp(String propName) {
        String pd = System.getProperty(propName);
        return new File(pd);
    }
    /** A File for system property "java.home".
     */
    public static File javaHome() {
        return fromProp("java.home");
    }
    /** Split first argument, using second arg
     *  as separator char. 
     *  Convenient for creating a portable pathname.
    */
    public static String[] split(String p, String sep) {
        StringTokenizer st = new StringTokenizer(p, sep);
        String[] val = new String[st.countTokens()];

        for (int i = 0; i < val.length; i++) {
            val[i] = st.nextToken();
        }

        return val;
    }
    /** A File for system property "user.dir".
     */
    public static File userDir() {
        return fromProp("user.dir");
    }
    /** A File for system property "user.home".
     */
    public static File userHome() {
        return fromProp("user.home");
    }
}