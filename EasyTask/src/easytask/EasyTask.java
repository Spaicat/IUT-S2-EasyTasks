/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
/**
 *
 * @author itsia
 */
public class EasyTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver chargé");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","root");
            System.out.println("Connecté à la base de données");
            
            Clients listClients = new Clients(conn);
            System.out.println(listClients);
            
        }catch(Exception e){
            System.out.println(e);   
        }
        
        
    }
    
}
