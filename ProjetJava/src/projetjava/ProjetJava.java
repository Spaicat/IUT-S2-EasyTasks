/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import Class.ConnectPage;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author itsia
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","root");
            System.out.println("Connecté à la base de données");
            
        }catch(Exception e){
            System.out.println(e);    
        }
        
        ConnectPage ConnPage = new ConnectPage();
    }
    
}
