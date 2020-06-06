/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Thibault
 */
public class ConnectionSQL {
    private static String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "root";
    private static Connection connect;
    public static Connection getInstance() {
        if (connect == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver chargé");
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Connecté à la base de données");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        return connect;
    }
}
