/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DatabaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBaseConnection {

    //Connection conn = null;
    public static Connection connectTODB()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:hotel.sqlite");
          //  JOptionPane.showMessageDialog(null, "Connection Establishment");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
        
    }
    
}
