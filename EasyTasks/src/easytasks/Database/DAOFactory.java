/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Database;
import java.sql.Connection;

/**
 *
 * @author Thibault
 */
public class DAOFactory {
    private static Connection connect = ConnectionSQL.getInstance();
    
    public static UserDAO getUtilisateurDAO() {
        return new UserDAO(connect);
    }
    
    public static ProjectDAO getProjectDAO() {
        return new ProjectDAO(connect);
    }
    
    public static ActivityDAO getActiviteDAO() {
        return new ActivityDAO(connect);
    }
}
