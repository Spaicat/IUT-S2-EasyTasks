/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author itsia
 */
public class ConnectBDD {

    private Connection conn = null;
    
    public static Connection ConnectBDD(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","root");
            System.out.println("Connecté à la base de données");
            return conn;
 
        }catch(Exception e){
            System.out.println(e);   
            return null;
        }
    }
}
