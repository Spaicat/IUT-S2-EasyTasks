/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import Class.ConnectBDD;
import Class.ConnectPage;
import java.sql.*;




/**
 *
 * @author itsia
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        try{
            
        Connection conn = ConnectBDD.ConnectBDD();
        Statement state = (Statement) conn.createStatement();
        ResultSet result = state.executeQuery("SELECT * FROM utilisateur");
        ResultSetMetaData resultMeta = result.getMetaData();
        
        System.out.println("\n**********************************");
        //On affiche le nom des colonnes
        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
            System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
         
        System.out.println("\n**********************************");
         
        while(result.next()){         
        for(int i = 1; i <= resultMeta.getColumnCount(); i++)
            System.out.print("\t" + result.getObject(i).toString() + "\t |");
            
        System.out.println("\n---------------------------------");
        }
        }catch(Exception e){
            System.out.println(e);
        }
        ConnectPage ConnPage = new ConnectPage();
    }
    
}
