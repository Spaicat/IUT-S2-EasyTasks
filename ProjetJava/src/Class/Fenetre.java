/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;




/**
 *
 * @author itsia
 */
public class Fenetre extends JFrame{
 
    public Fenetre(String titre, int x, int y){
        this.setTitle(titre);
        this.setSize(x,y);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(true);
        Panneau pan = new Panneau();
        this.setContentPane(pan);
        
        pan.setLayout(null);
        
        this.setVisible(true);
    }
}