/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thibault, Marion, Yaning
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

    public void update(Projet obj) {
        throw new UnsupportedOperationException("ProjectDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Projet[] ReadProjects(Utilisateur user) throws DaoError {
        ArrayList<Projet> projetArrayListe = new ArrayList<Projet>();
        try {
            Statement state = this.connect.createStatement();
            ResultSet result = null;
            switch (user.getStatut()) {
                case "Technicien":
                    result = state.executeQuery("SELECT Projet.ID, Projet.nom, Projet.duréeEstimée"
                        + " FROM Projet JOIN Compose ON Projet.ID = Compose.projetID"
                        + " JOIN Activité ON Compose.projetID = Activité.ID"
                        + " JOIN Affecté ON Activité.ID = Affecté.activitéID"
                        + " JOIN Technicien ON Affecté.technicienid = Technicien.id"
                        + " JOIN Utilisateur ON Technicien.UTILISATEUR_ID = Utilisateur.ID"
                        + " WHERE login='" + user.getLogin() + "' and password='" + user.getPassword() + "'"
                        + " GROUP BY Projet.ID");
                    break;
                case "Commercial":
                    result = state.executeQuery("SELECT Projet.ID, Projet.nom, Projet.duréeEstimée"
                        + " FROM Projet JOIN Commercial ON Projet.commercialID = Commercial.ID"
                        + " JOIN Utilisateur ON Commercial.UTILISATEUR_ID = Utilisateur.ID"
                        + " WHERE login='" + user.getLogin() + "' and password='" + user.getPassword() + "'"
                        + " GROUP BY Projet.ID");
                    break;
                case "Client":
                    result = state.executeQuery("SELECT Projet.ID, Projet.nom, Projet.duréeEstimée"
                        + " FROM Projet JOIN Devis ON Projet.ID = Devis.projetID"
                        + " JOIN Client ON Devis.ClientID = Client.id"
                        + " JOIN Utilisateur ON Client.UTILISATEUR_ID = Utilisateur.ID"
                        + " WHERE login='" + user.getLogin() + "' and password='" + user.getPassword() + "'"
                        + " GROUP BY Projet.ID");
                    break;
            }
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();

            System.out.println("\n**********************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************");

            while(result.next()){
              projetArrayListe.add(new Projet(Integer.parseInt(result.getObject(1).toString()), result.getObject(2).toString()));
              for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                  System.out.print("\t" + result.getObject(i).toString() + "\t |");
              }

              System.out.println("\n---------------------------------");

            }
            result.close();
        } catch(Exception e) {
            throw new DaoError(e.getMessage());
        }
        Projet[] projetTableau = projetArrayListe.toArray(new Projet[projetArrayListe.size()]);
        return projetTableau;
    }
}
