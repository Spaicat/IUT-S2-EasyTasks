/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author itsia
 */
public abstract class Utilisateur {
    private int ID;
    private String name;
    private String login;
    private String password;
    private String passwordHash;
    private String statut; // Client // Commercial // Technicien
    
    public Utilisateur(String login, String password, String statut){
        this.login = login;
        this.password = password;
        this.statut = statut;
        
        //S'il y a aucun nom
        this.name = login;
        /*Boolean sortie = false;
        while(sortie == true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez vos identifiants :");
        System.out.println("\n" + "Login : ");
        String logSaisi = sc.nextLine();
        System.out.println("\n" + "Mot de passe : ");
        String mdpSaisi = sc.nextLine();
        String sql = ("SELECT * FROM Utilisateur WHERE LOGIN='"+logSaisi+"'and PASSWORD='"+mdpSaisi+"'");
        
        try{
            Statement state = (Statement) conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            ResultSetMetaData resultMeta = result.getMetaData();
            
            if(result.next()){
                this.login = logSaisi;
                this.password = mdpSaisi;
                System.out.println("Vous êtes connecté");
                sortie = true;
                
                // Test de récupération du statut
                sql = ("SELECT TYPE_UTILISATEUR FROM Utilisateur WHERE LOGIN='"+logSaisi+"'");
                result = state.executeQuery(sql);
                resultMeta = result.getMetaData();
                this.statut = result.getString(result.getRow());
                
            }else{
                System.out.println("Identifiants incorrects, recommencez" + "\n");
                logSaisi = null;
                mdpSaisi = null;
            }
        }catch(Exception e){
            System.out.println(e);
        }*/
    }
    
    public int getID() {
        return this.ID;
    }
    public void setId(int id) {
        this.ID = id;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPasswordHash() {
        return this.passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    
    //ATTENTION : Cette fonction doit être supprimé mais l'implémentation des mot de passe haché n'est pas encore effective dans la base de données
    public String getPassword() {
        return this.password;
    }
    
    public String getStatut() {
        return this.statut;
    }
    
    public String toString() {
        return this.login + " / " + this.password + " / " + this.statut;
    }
}
