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
public class Technicien extends Utilisateur{
    private ArrayList<Compétence> competences;
    private ArrayList<Travail> Horaires;
    private String login;
    private String password;
    
    public Technicien(String log, String psw){
        super(log, psw);
        this.competences = new ArrayList<Compétence>();
        this.Horaires = new ArrayList<Travail>();
    }
}
