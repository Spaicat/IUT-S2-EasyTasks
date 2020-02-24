/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JFrame;
import javax.swing.JPanel;
import Class.Panneau;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

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
        this.setVisible(true);
    }
}
