/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.*;
import java.sql.*;
/**
 *
 * @author mt397430
 */
public class ChargerBDD {
    
    public List ChargerBDD(){
        try{
            Connection conn = ConnectBDD.ConnectBDD();
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery("SELECT ID, nom, duréeEstimée,duréeFinale,statut FROM Projet");
            while(result.next()){
                int idTask = result.getInt("ID");
                String nameTask = result.getString("nom");
                int tpsPrevu = result.getInt("duréeEstimée");
                int tpsFinal = result.getInt("duréeFinale");
                String statut = result.getString("statut");
                System.out.println(idTask);
                System.out.println(nameTask);
                System.out.println(tpsPrevu);
                System.out.println(tpsFinal);
                System.out.println(statut);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
