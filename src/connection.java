/**
 *
 * @author sparshbohra
 */

import java.sql.*;
import javax.swing.JOptionPane;


public class connection {
    Connection conn;
    
    public static Connection ConnecrDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/sparshbohra/NetBeansProjects/Library Management System/LibraryNew.sqlite");
            return conn;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}
