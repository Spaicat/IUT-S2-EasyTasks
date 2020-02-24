/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.BorderLayout;
import java.awt.MenuBar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author itsia
 */
public class Fenetre extends JFrame{
 
    public Fenetre(String titre, int x, int y, String Ln){
        this.setTitle(titre);
        this.setSize(x,y);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setResizable(true);
        Panneau pan = new Panneau();
        this.setContentPane(pan);
        
        pan.setLayout(null);
        
        JLabel welcome = new JLabel("Bienvenue "+Ln+" ");
        welcome.setBounds(10, -40, 1000, 100);
        pan.add(welcome);
        
        JLabel TaskList = new JLabel("Liste des tâches");
        TaskList.setBounds(349, -10, 100, 100);
        pan.add(TaskList);
        
        this.setVisible(true);
    }
}
