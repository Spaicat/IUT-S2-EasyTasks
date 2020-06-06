/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytasks.Metier;

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
    private ArrayList ClientsList;
    
    public Clients(Connection conn){
        this.ClientsList = new ArrayList();
        try{
            Statement state = conn.createStatement();
            String sql ="SELECT * FROM CLIENT";
            ResultSet result = state.executeQuery(sql);
            ResultSetMetaData resultMeta = result.getMetaData();
            
            while(result.next()){
                this.ClientsList.add(result); // test
            }
            
        }catch(Exception e){
            System.out.println(e); 
        } 
    }
    
    public String toString(){
        String ch = "";
        for(int i = 1; i<= this.ClientsList.size(); i++){
            ch += this.ClientsList.get(i);
            ch += "\n";
        }
        return ch;
    }
}
