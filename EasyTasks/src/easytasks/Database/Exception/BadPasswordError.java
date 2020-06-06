/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Database.Exception;

/**
 *
 * @author Thibault
 */
public class BadPasswordError extends DaoError {
    public BadPasswordError() {
        super("Mot de passe incorrect");
    }
}
