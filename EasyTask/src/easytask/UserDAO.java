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
 * Classe gérant le stockage dans le SGBD des objets User
 * @author Thibault
 */
public class UserDAO {
    private Connection connect;
    
    public UserDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(Utilisateur obj) {
        return false;
    }

    public boolean delete(Utilisateur obj) {
        return false;
    }

    public Utilisateur update(Utilisateur obj) {
        throw new UnsupportedOperationException("UserDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Utilisateur Read(String login, String password) throws DaoError {
        Utilisateur utilisateurRes = null;
        try {
            Statement state = this.connect.createStatement();

            //On test s'il y a bien qu'une ligne de renvoyée
            ResultSet resultCount = state.executeQuery("SELECT COUNT(1) FROM Utilisateur WHERE login='" + login + "'");
            resultCount.next();
            if (resultCount.getString(1).equals(1 + "")) {
                resultCount = state.executeQuery("SELECT COUNT(1) FROM Utilisateur WHERE login='" + login+ "' and password='" + password + "'");
                resultCount.next();
                
                if (resultCount.getString(1).equals(1 + "")) {
                    ResultSet result = state.executeQuery("SELECT login, password, type_utilisateur FROM Utilisateur WHERE login='" + login + "' and password='" + password + "'");
                    result.next();
                    switch(result.getString(3)) {
                        case "technicien":
                            utilisateurRes = new Technicien(login, password);
                            break;
                        case "commercial":
                            utilisateurRes = new Commercial(login, password);
                            break;
                        case "client":
                            utilisateurRes = new Client(login, password);
                            break;
                        default:
                            throw new DataBaseError();
                    }
                }
                else {
                    throw new BadPasswordError();
                }
            }
            else {
                throw new BadUserError();
            }
        } catch(DataBaseError | BadUserError | BadPasswordError e) {
            throw e;
        } catch(Exception e) {
            throw new DaoError(e.getMessage());
        }
        return utilisateurRes;
    }
}
