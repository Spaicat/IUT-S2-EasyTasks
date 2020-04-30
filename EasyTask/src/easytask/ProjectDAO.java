/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Thibault
 */
public class ProjectDAO {
    private Connection connect;
    
    public ProjectDAO(Connection conn) {
        this.connect = conn;
    }
    
    public boolean create(Projet obj) {
        return false;
    }

    public boolean delete(Projet obj) {
        return false;
    }

    public Projet update(Projet obj) {
        throw new UnsupportedOperationException("ProjectDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Projet[] ReadProjects(Utilisateur user) throws DaoError {
        Projet[] projetListe = null;
        try {
            Statement state = this.connect.createStatement();
            ResultSet result = state.executeQuery("SELECT * FROM Projet WHERE login='" + user.getLogin() + "' and password='" + user.getPassword() + "'");
        } catch(Exception e) {
            throw new DaoError(e.getMessage());
        }
        return projetListe;
    }
}
