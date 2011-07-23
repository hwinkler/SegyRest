/*
 * Created on May 29, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class PathParser {
    private ArrayList parsedPathInfo;
    /**
     * 
     */
    public PathParser(String pathInfo) {
        parsedPathInfo = parsePath(pathInfo);
    }

    public int length() {
        return parsedPathInfo.size();
    }

    //	public String getPathElement (int i) {
    //		return (String)parsedPathInfo.get(i);
    //	}
    //	
    //	/**
    //	 * 
    //	 */
    //	public void removeFrontPathElement() {
    //		parsedPathInfo.remove(0);	
    //	}
    //	
    //	
    public String popPathElement() {
        String thePathElement = (String) parsedPathInfo.get(0);
        parsedPathInfo.remove(0);
        return thePathElement;
    }
    /**
     * Test whether this object starts with the specified
     * path root fragment, ignoring any beginning &quot;/&quot;.
     * @param somePathFragment 
     * @return true if this object begins with the fragment
     */
    public boolean startsWith(String somePathFragment) {
        boolean startsWith = false;
        ArrayList path = parsePath(somePathFragment);
        if (path.size() < parsedPathInfo.size()) {
            for (int i = 0; i < parsedPathInfo.size() && !startsWith; i++) {
                if (path.get(i).equals(parsedPathInfo.get(i))) {
                    startsWith = true;
                }
            }
        }
        return startsWith;

    }

    /**
     * Parse a path string like &quot;a/b/c&quot; into array [a,b,c].
     * @param pathInfo the string to parse
     * @return String array of path elements
     */
    private static ArrayList parsePath(String pathInfo) {
        ArrayList pathList = new ArrayList();
        if (pathInfo != null) {
            for (StringTokenizer tokenizer = new StringTokenizer(pathInfo, "/");
                tokenizer.hasMoreTokens();
                ) {
                String token = tokenizer.nextToken();
                pathList.add(token);
            }
        }
        return pathList;
    }

}
