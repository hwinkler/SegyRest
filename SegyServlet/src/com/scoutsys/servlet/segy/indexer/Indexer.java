/*
 * Created on May 11, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.indexer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.naming.NamingException;

import com.scoutsys.servlet.segy.config.DatabaseConnectionPool;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Indexer {

    private static Logger log = Logger.getLogger(Indexer.class.getName());

    String dropStatementStrings[] =
        {
            "DROP TABLE dataset",
            "DROP TABLE trace",
            "DROP TABLE source",
            "DROP TABLE receiver",
            "DROP TABLE inline",
            "DROP TABLE crossline" };
    String createStatementStrings[] =
        {
            "CREATE TABLE dataset ("
                + "id     INTEGER PRIMARY KEY,"
                + "name   VARCHAR(255),"
                + "file	VARCHAR(255),"
                + "format INTEGER )",
            "CREATE TABLE trace ("
                + "id INTEGER PRIMARY KEY,"
                + "dataset_id INTEGER, "
                + "position_high INTEGER, "
                + "position_low INTEGER, "
                + "data_offset INTEGER )",
            };

    public Indexer() {

    }

    public void createTables() throws SQLException, NamingException {
        log.entering(this.getClass().getName(), "createTables");
        Connection conn = DatabaseConnectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            try {
                executeStatements(conn, dropStatementStrings);
                conn.commit();
            } catch (SQLException x) {
            }
        } finally {
            conn.close();
        }
        conn = DatabaseConnectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            try {
                executeStatements(conn, createStatementStrings);
                conn.commit();
            } catch (SQLException x) {
            }
        } finally {
            conn.close();
        }
        log.exiting(this.getClass().getName(), "createTables");
    }

    private static void executeStatements(Connection conn, String[] statements)
        throws SQLException {
        for (int i = 0; i < statements.length; i++) {
            log.fine("executing: " + statements[i]);
            Statement statement = conn.createStatement();
            statement.execute(statements[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        new Indexer().createTables();
    }

}
