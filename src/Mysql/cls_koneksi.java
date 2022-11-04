/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kmis
 */
public class cls_koneksi {

    /**
     *
     * @param   hostname  server IP address or server name
     * @return            a connection with specified database
     */
    public Connection getConnection(String hostname) {
    
        Connection conn = null;
        //String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/tes";
        //String url = "jdbc:mysql://" + ("".equals(hostname.toString()) ? "localhost" : hostname.toString()) + ":3306/db_agenda_220914";
        String user = "root";
        String pass = "";                
        
        //String url = "jdbc:mysql://192.168.99.109:3306/primapack_ppc";                
        //String pass = "monsterinc";

        try {
            conn = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
        return conn;
    }    
}
