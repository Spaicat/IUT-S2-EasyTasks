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
 * @author Marion, Thibault, Yaning
 */
public class Activite {
    private int ID;
    private EtatActivite etat;
    private String commentaires;
    private Date dateDébut = null;
    private Date dateFin = null;
    private Date probableDateFin;
    private int durée;
    private String nom;
    private ActiviteType type;
    private ArrayList<Competence> CompetencesNecessaires;
    
    public Activite(int id, /*String name,*/ String summary, EtatActivite state){
        this.ID = id;
        //this.nom = name;
        this.commentaires = summary;
        this.etat = state;
        this.CompetencesNecessaires = new ArrayList<Competence>();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public EtatActivite getEtat() {
        return etat;
    }

    public void setEtat(EtatActivite etat) {
        this.etat = etat;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Date getDateDébut() {
        return dateDébut;
    }

    public void setDateDébut(Date dateDébut) {
        this.dateDébut = dateDébut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getProbableDateFin() {
        return probableDateFin;
    }

    public void setProbableDateFin(Date probableDateFin) {
        this.probableDateFin = probableDateFin;
    }

    public int getDurée() {
        return durée;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ActiviteType getType() {
        return type;
    }

    public void setType(ActiviteType type) {
        this.type = type;
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
