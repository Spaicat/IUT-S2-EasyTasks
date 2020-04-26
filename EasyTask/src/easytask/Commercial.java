/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author itsia
 */
public class Commercial extends Utilisateur{
    private int ID;
    
    public Commercial(String login, String password) {
        super(login, password, "commercial");
        /*Boolean sortie = false;
        
        while(sortie == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez vos identifiants :");
            System.out.println("\n" + "Login : ");
            String logSaisi = sc.nextLine();
            System.out.println("\n" + "Mot de passe : ");
            String mdpSaisi = sc.nextLine();
            String sql = ("SELECT * FROM Commercial WHERE LOGIN='"+logSaisi+"'and PASSWORD='"+mdpSaisi+"'");
        
            try{
                Statement state = (Statement) conn.createStatement();
                ResultSet result = state.executeQuery(sql);
                ResultSetMetaData resultMeta = result.getMetaData();
            
                if(result.next()){
                    this.login = logSaisi;
                    this.password = mdpSaisi;
                    System.out.println("Vous êtes connecté");
                    sortie = true;
                    this.statut = "commercial";
                    
                    sql = ("SELECT ID FROM Commercial WHERE LOGIN='"+logSaisi+"'");
                    result = state.executeQuery(sql);
                    resultMeta = result.getMetaData();
                    this.ID = result.getInt(result.getRow());
                
                }else{
                    System.out.println("Identifiants incorrects, recommencez" + "\n");
                    logSaisi = null;
                    mdpSaisi = null;
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
        }*/
    }
}
