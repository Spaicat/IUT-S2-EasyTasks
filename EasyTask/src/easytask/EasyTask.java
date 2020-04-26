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
import java.util.Scanner;
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
            // Etablissement de la connexion à la BDD
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver chargé");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","root");
            System.out.println("Connecté à la base de données");
            
            //Création de la liste des clients
            Clients listClients = new Clients(conn);
            //Création de la liste des projets
            Projets listProjet = new Projets(conn);
            
            //Connexion de l'utilisateur
            // Test possible :
            //               commercial = log : gflayol | mdp :746F746F
            //               technicien = log : pmartin | mdp : 746F746F
            //               client = log : abandoni | mdp : 746F746F
            
            /*System.out.println("Choississez votre statut : "+"\n");
            System.out.println("1 - Commercial" + "\n");
            System.out.println("2 - Technicien" + "\n");
            System.out.println("3 - Client" + "\n");
            Scanner sc = new Scanner(System.in);
            int choixStatut = sc.nextInt();
            
            Utilisateur currentUser = null;
            if (choixStatut == 1){
                currentUser = new Commercial(conn);
            }else if(choixStatut == 2){
                currentUser = new Technicien(conn);
            }else{
                currentUser = new Client(conn);
            }*/
            
            LoginWindow logWin = new LoginWindow(conn);
            
        }catch(Exception e){
            System.out.println(e);   
        }
        
        
    }
    
}
