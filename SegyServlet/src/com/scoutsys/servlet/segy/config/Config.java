/*
 * Created on May 11, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.config;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Config {
    public static final String PROPERTIES_FILE = "/segyservlet.properties";
    public static final String MOUNT = "mount.";
    private HashMap relativeUriToDirectoryMap = new HashMap();
    private static Config config = new Config();

    /**
     * 
     */
    public static Config getConfig() {
        return config;
    }

    public Config() {
        super();

        Properties p = new Properties();
        try {
            p.load(this.getClass().getResourceAsStream(PROPERTIES_FILE));

            for (Iterator it = p.keySet().iterator(); it.hasNext();) {
                String key = (String) it.next();

                if (key.startsWith(MOUNT)) {
                    relativeUriToDirectoryMap.put(
                        key.substring(MOUNT.length()),
                        new File(p.getProperty(key)));
                    Logger.getLogger(this.getClass().getName()).info(
                        "Mounted "
                            + p.getProperty(key)
                            + " at "
                            + key.substring(MOUNT.length()));
                }
            }

        } catch (Exception x) {
            Logger.getLogger(this.getClass().getName()).severe(
                "failed mounting directories: " + x);
               throw new RuntimeException(x);
        }
        //        relativeUriToDirectoryMap.put(
        //            "stratton",
        //            new File("C:\\Program Files\\SeisZip\\"));
    }

    public File directoryForRelativeUri(String relativeUri) {
 
 
 
        return (File) relativeUriToDirectoryMap.get(relativeUri);
    }

    public Iterator enumerateUris() {
        return relativeUriToDirectoryMap.keySet().iterator();
    }

    public String getJDBCConnectionString() {
        return "jdbc:mysql://localhost/segy?autoReconnect=true";
    }

    public String getJDBCUser() {
        return "root";
    }

    public String getJDBCPassword() {
        return "";
    }

}
