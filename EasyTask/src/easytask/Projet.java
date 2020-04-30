/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author itsia
 */

public class Projet {
    private int ID;
    private String nom;
    private boolean faisable;
    private float coût;
    private float rentabilité;
    private EtatProjet statut;
    
    private Utilisateur Commercial;
    private ArrayList<Materiel> MaterielList;
    private ArrayList<Activite> ActivitéList;
    private ArrayList<Technicien> TechnicienList;
    
    public Projet(int id) {
        this.ID = id;
        
        this.MaterielList = new ArrayList<Materiel>();
        this.ActivitéList = new ArrayList<Activite>();
        this.TechnicienList = new ArrayList<Technicien>();
    }
    
    public void faisabilité(String requete, Connection conn){
        
    }
    
    public void cout(String requete, Connection conn){
        
    }
    
    public void rentabilisation(String requete, Connection conn){
        
    }
    
    public void statutActuel(String requete, Connection conn){
        
    }
    
    public void ajoutMateriel(String requete, Connection conn){
        
    }
    
    public void ajoutActivite(String requete, Connection conn){
        
    }
    
    public void assimilationCommercial(String requete, Connection conn){
        try{
            Statement state = (Statement) conn.createStatement();
            ResultSet result = state.executeQuery(requete);
            ResultSetMetaData resultMeta = result.getMetaData();
            
            //this.Commercial.login = result.getString(0);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void ajoutTechnicien(String requete, Connection conn){
        
    }
}
