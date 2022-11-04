/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kmis
 */
public class Global {

    /**
     * Global variable to save currently logged in userID
     */
    public static Integer gb_userId;
    /**
     * globally accessed MYSQL (session) connection
     */
    public static java.sql.Connection conn;

    /**
     * Creating new database connection after confirming no connection being
     * open.
     *
     * @param className Class name which is used as logger named subsystem
     */
    public static void connOpen(String className) {
        try {
            if (conn != null) {
                conn.close();
            }

            if (conn == null || conn.isClosed()) {
                conn = new cls_koneksi().getConnection("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(className).log(Level.SEVERE, null, ex);
        }
    }
}
