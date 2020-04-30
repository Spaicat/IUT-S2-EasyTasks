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
public class Activite {
    private int ID;
    private EtatActivite etat;
    private String commentaires;
    private Date dateDébut;
    private Date dateFin = null;
    private Date probableDateFin;
    private int durée;
    private String nom;
    private ActiviteType type;
    private ArrayList<Competence> CompetencesNecessaires;
    
    public Activite(int id, String name, String summary, EtatActivite state){
        this.ID = id;
        this.nom = name;
        this.commentaires = summary;
        this.etat = state;
        this.CompetencesNecessaires = new ArrayList<Competence>();
    }
    
    //Demande un démarrage de l'activité (possible uniquement si elle est prévue)
    public void StartActivity() {
    }
    
    //Demande à terminer l'activité (possible uniquement si elle est en cours)
    public void Finish() {
    }
    
    //Demande l'annulation (possible uniquement si elle n'est pas terminée)
    public void Cancel() {
    }
    
    //Annule une annulation pour repasser à l'état PLANNED (possible si l'activité est annulée)
    public void UnCancel() {
    }
}
