/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author itsia
 */
public class ConnectBDD {

    private Connection conn = null;
   // private String nom = null;    // nom utilisateur actuellement connecté
   // private String prenom = null; // prénom utilisateur actuellement connecté
    private String login = null; // login utilisateur actuellement connecté
   // private String mdp = null; // mdp utilisateur actuellement connecté
   //private String statut = null; //technicien ou commercial
    
    public ConnectBDD(){
        
    }
    
    public Connection Connect(){
        
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
    
    
    public void disconnect(){
        try{
            this.conn.close();
            
        }catch(Exception e){
            System.out.println(e);   
        }
    }
    
    
    public boolean connectUser(String log, String mdp){
        try {
            Statement state = (Statement) this.conn.createStatement();
            ResultSet result = state.executeQuery("SELECT login FROM Utilisateur WHERE LOGIN='"+log+"'and PASSWORD='"+mdp+"'");
            ResultSetMetaData resultMeta = result.getMetaData();
            
            if (result.next()){
                this.login = result.toString();   //recuperation du login, toString() non sur
                JOptionPane.showMessageDialog(null,"Connexion réussie");
                /*ResultSet nom = state.executeQuery("SELECT nom FROM Utilisateur JOIN technicien ON Utilisateur.ID=technicien.UTILISATEUR_ID JOIN commercial ON Utilisateur.ID=commercial.UTILISATEUR_ID"
                                                    + " WHERE LOGIN ='"+log+"'");
                resultMeta = nom.getMetaData();
                this.nom = nom.toString();*/         //TEST POUR RECUP LE NOM
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"incorrect");
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public String getLogin(){
        return this.login;
    }
}
