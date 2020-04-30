/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.Connection;

/**
 *
 * @author Thibault
 */
public class ActivityDAO {
    private Connection connect;
    
    public ActivityDAO(Connection conn) {
        this.connect = conn;
    }
    
    public boolean create(Activite obj) {
        return false;
    }

    public boolean delete(Activite obj) {
        return false;
    }

    public Activite update(Activite obj) {
        throw new UnsupportedOperationException("ActivityDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Activite[] ReadActivities(Projet p, Utilisateur user) {
        throw new UnsupportedOperationException("ActivityDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
