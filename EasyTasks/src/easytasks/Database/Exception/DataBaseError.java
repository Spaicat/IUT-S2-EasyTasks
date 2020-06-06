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
public class DataBaseError extends DaoError {
    public DataBaseError() {
        super("Erreur de base de données");
    }
}
