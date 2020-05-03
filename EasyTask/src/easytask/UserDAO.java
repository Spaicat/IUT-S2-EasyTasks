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
    
    /**
     * Demande la mise à jour de l'utilisateur dans la base
     * @param obj Utilisateur à mettre à jour
     */
    public void update(Utilisateur obj) {
        try {
            Statement state = this.connect.createStatement();

            //On test s'il y a bien qu'une ligne de renvoyée
            state.executeUpdate("UPDATE Utilisateur SET password = " + obj.getPasswordHash() + " WHERE login ='" + obj.getLogin() + "'");
        } catch(Exception e) {
            System.out.println(e.toString());
        }
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
                    ResultSet resultNomPrenom = null;
                    switch(result.getString(3)) {
                        case "technicien":
                            utilisateurRes = new Technicien(login, password);
                            resultNomPrenom = state.executeQuery("SELECT prenom, nom FROM Technicien JOIN Utilisateur ON Technicien.UTILISATEUR_ID = Utilisateur.ID WHERE login='" + login + "' and password='" + password + "'");
                            break;
                        case "commercial":
                            utilisateurRes = new Commercial(login, password);
                            resultNomPrenom = state.executeQuery("SELECT prenom, nom FROM Commercial JOIN Utilisateur ON Commercial.UTILISATEUR_ID = Utilisateur.ID WHERE login='" + login + "' and password='" + password + "'");
                            break;
                        case "client":
                            utilisateurRes = new Client(login, password);
                            resultNomPrenom = state.executeQuery("SELECT prenom, nom FROM Client JOIN Utilisateur ON Client.UTILISATEUR_ID = Utilisateur.ID WHERE login='" + login + "' and password='" + password + "'");
                            break;
                        default:
                            throw new DataBaseError();
                    }
                    if (resultNomPrenom.next()) {
                        utilisateurRes.setName(resultNomPrenom.getString(1) + " " + resultNomPrenom.getString(2));
                    }
                    else {
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
