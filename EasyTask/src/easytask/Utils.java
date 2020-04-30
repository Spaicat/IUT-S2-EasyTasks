/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

/**
 * Contient divers utilitaires pour l'ensemble de la couche métier
 *
 * @author Thibault
 */
public class Utils {
    /**
     * Fournit un hachage du mot de passe. L'algorithme est basique : on fait du HEX : on prend chaque caractère de la chaîne d'entrée, et c'est le code hexa qui est stocké.
     * Exemple : si le password est "AB1", alors le hach est "414231". le retour est bien une chaîne
     *
     * @return la valeur de hachage du mot de passe
     */
    public static String HashPassword(String pass) {
        return Integer.parseInt(pass, 16) + "";
    }
    
    /**
     * Indique si le mot de passe respecte les consignes de sécurité (taille, etc.)
     *
     * @return true si le mot de passe prévu est suffisament sécurisé
     */
    public static boolean IsPasswordSafe(String pass) {
        boolean contientLettre = false;
        boolean contientChiffre = false;
        int i = pass.length();
        while (i > 0 && !(contientLettre && contientChiffre)) {
            if (Character.isDigit(pass.charAt(i)))
                contientChiffre = true;
            else if (Character.isLetter(pass.charAt(i))) {
                contientLettre = true;
            }
            i--;
        }
        return pass.length() >= 8 && contientChiffre && contientLettre;
    }
    
    /**
     * Indique le nombre de travail par jour pour une personne (8 par exemple).
     */
    public static int GetWorkHoursByDay() {
        return 0; //TODO
    }
}
