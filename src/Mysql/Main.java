/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kmis
 */
public class Main {
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (UnsupportedLookAndFeelException ex) {}
        frmLogin l = new frmLogin();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }

}
