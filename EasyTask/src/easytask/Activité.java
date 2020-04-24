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
public class Activité {
    private EtatActivité état;
    private String commentaires;
    private Date dateDébut;
    private Date dateFin;
    private int Durée;
    private ActivitéType type;
    private ArrayList<Compétence> CompetencesNecessaires;
    
    public Activité(){
        this.CompetencesNecessaires = new ArrayList<Compétence>();
    }
}
