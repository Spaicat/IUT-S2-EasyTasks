/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author itsia
 */
public class Commande {
    private EtatCommande statut;
    private Date dateCommande;
    private Date dateLivraison;
    private ArrayList<MaterielCommande> materielCommandList;
    
    public Commande(){
        
    }
}
