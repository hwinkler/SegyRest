/*
 * Created on May 12, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class DatabaseConnectionPool {

    static String dataSourceName = "java:comp/env/segy-db";
    static DataSource dataSource;

    public static Connection getConnection()
        throws SQLException, NamingException {
        Connection conn = null;
        initDataSource();
        conn = dataSource.getConnection();
        return conn;
    }

    private static void initDataSource() throws NamingException {
        if (dataSource == null) {

            Context ctx = new InitialContext();
            if (ctx == null)
                throw new RuntimeException("No Context");

            dataSource = (DataSource) ctx.lookup(dataSourceName);
        }
    }

}
