/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author itsia
 */
public class Clients {
    private ArrayList<Client> ClientsList;
    
    public Clients(Connection conn){
        this.ClientsList = new ArrayList<Client>();
        try{
            Statement state = conn.createStatement();
            String sql ="SELECT * FROM CLIENT";
            ResultSet result = state.executeQuery(sql);
            ResultSetMetaData resultMeta = result.getMetaData();
            
            while(result.next()){
                for(int i = 1; i<= resultMeta.getColumnCount(); i++)
                    System.out.print(result.getObject(i).toString()+" | ");
                System.out.println();
            }
        }catch(Exception e){
            System.out.println(e); 
        } 
    }
}
