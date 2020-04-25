/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easytask;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author itsia
 */
public class Projets {
    private ArrayList projetList;
    
    public Projets(Connection conn){
       /* this.projetList = new ArrayList();
        try{
            Statement state = conn.createStatement();
                String sql ="SELECT * FROM PROJET";
            ResultSet result = state.executeQuery(sql);
            ResultSetMetaData resultMeta = result.getMetaData();
            
            while(result.next()){
                this.projetList.add(result); // test
            }
            
        }catch(Exception e){
            System.out.println(e);
        } */
    }
    
    public void rechercheProjets(Connection conn, Utilisateur actualUser){
        String sql = "";
    }
    
    public String toString(){
        String ch = "";
        for(int i = 1; i<= this.projetList.size(); i++){
            ch += this.projetList.get(i);
            ch += "\n";
        }
        return ch;
    }
}
