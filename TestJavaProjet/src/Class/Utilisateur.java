package Class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author itsia
 */
public class Utilisateur {
    private String fname=""; // nom de famille
    private String lName=""; //prénom
    private String mdp=""; // mot de passe
   // private  birth=""  // à créer une fois la classe date ajoutée
   
    
    // Constructeur
    
    public Utilisateur(String fn, String ln, String mdp){
        this.fname=fn;
        this.lName=ln;
        this.mdp=mdp;
        //RAJOUTER LES EXCEPTIONS PAR LA SUITE
    }
    
    //ACCESSEURS
    
    //nom de famille
    public void setFname(String n){
        this.fname= n;
    }
    
    public String getFname(){
        return this.fname;
    }
    
    //prénom
    public void setLname(String n){
        this.lName=n;
    }
    
    public String getLname(){
        return this.lName;
    }
    
    //mot de passe
    
    public void setMDP(String mdp){
        this.mdp= mdp;
    }
    
    public String getMDP(){
        return this.mdp;
    }
}