/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

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

    public void update(Activite obj) {
        throw new UnsupportedOperationException("ActivityDAO : Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Activite[] ReadActivities(Projet p, Utilisateur user) throws DaoError {
        ArrayList<Activite> activiteArrayListe = new ArrayList<Activite>();
        try {
            Statement state = this.connect.createStatement();
            ResultSet result = null;
            switch (user.getStatut()) {
                case "Technicien":
                    result = state.executeQuery("SELECT Activité.ID, Activité.résumé, Activité.détail, Activité.statut"
                        + " FROM Activité JOIN Affecté ON Activité.ID = Affecté.activitéID"
                        + " JOIN Technicien ON Affecté.technicienid = Technicien.id"
                        + " JOIN Utilisateur ON Technicien.UTILISATEUR_ID = Utilisateur.ID"
                        + " WHERE login='" + user.getLogin() + "' and password='" + user.getPassword() + "'"
                        + " GROUP BY Activité.ID");
                    break;
                case "Client":
                    result = state.executeQuery("SELECT Activité.ID, Activité.résumé, Activité.détail, Activité.statut"
                        + " FROM Activité JOIN Compose ON Activité.ID = Compose.activitéID"
                        + " JOIN Projet ON Compose.projetID = Projet.ID"
                        + " JOIN Devis ON Projet.ID = Devis.projetID"
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
                String etatActiviteDB = result.getObject(4).toString();
                switch (etatActiviteDB) {
                    case "prévue":
                        etatActiviteDB = "PREVUE";
                        break;
                    case "en cours":
                        etatActiviteDB = "ENCOURS";
                        break;
                    case "terminée":
                        etatActiviteDB = "TERMINEE";
                        break;
                    case "annulée":
                        etatActiviteDB = "ANNULEE";
                        break;
                }
                activiteArrayListe.add(new Activite(Integer.parseInt(result.getObject(1).toString()), result.getObject(2).toString(), EtatActivite.valueOf(etatActiviteDB)));
                for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    System.out.print("\t" + result.getObject(i).toString() + "\t |");
                }

                System.out.println("\n---------------------------------");
            }
            result.close();
        } catch(Exception e) {
            throw new DaoError(e.getMessage());
        }
        Activite[] activiteTableau = activiteArrayListe.toArray(new Activite[activiteArrayListe.size()]);
        return activiteTableau;
    }
}
