/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.util.ArrayList;

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
    private ArrayList<Commercial> CommercialList;
    private ArrayList<Technicien> TechnicienList;
    
    public Projet(){
        this.MaterielList = new ArrayList<Matériel>();
        this.ActivitéList = new ArrayList<Activité>();
        this.CommercialList = new ArrayList<Commercial>();
        this.TechnicienList = new ArrayList<Technicien>();
    }
}
