/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author itsia
 */
public class Panneau extends JPanel{
    
    public void paintComponent(Graphics g){
        System.out.println("paintComponent exécuté");  
    }
}
