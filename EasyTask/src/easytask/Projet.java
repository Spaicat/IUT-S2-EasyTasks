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
    private boolean faisable;
    private float coût;
    private float rentabilité;
    private EtatProjet statut;
    private ArrayList<Matériel> MaterielList;
    private ArrayList<Activité> ActivitéList;
    private Utilisateur Commercial;
    private ArrayList<Technicien> TechnicienList;
    
    public Projet(){
        this.MaterielList = new ArrayList<Matériel>();
        this.ActivitéList = new ArrayList<Activité>();
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
            
            this.Commercial.login = result.getString(0);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void ajoutTechnicien(String requete, Connection conn){
        
    }
}
