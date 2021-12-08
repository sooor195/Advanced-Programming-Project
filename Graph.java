/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A.P.P;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Reem ALonazi
 */
public class Graph extends JPanel{
    Graph(){
   setBackground(Color.WHITE)   ;  
    }
     public void paintComponent(Graphics g){
     super.paintComponent(g);
     g.setColor(Color.black);
     g.drawLine(100, 100, 200,100);
     g.drawLine(120, 190, 160,190);
     g.drawLine(120, 230, 160,230);
     g.drawLine(120, 270, 160,270);
     g.fillRect(135, 100, 30, 65);
     g.drawLine(85, 165, 220,165);
     g.drawRect(120, 165, 60, 150);
     g.fillRect(140, 315, 20, 30);
     g.drawLine(150, 330, 150,430);
     g.setColor(Color.blue);
     g.fillRoundRect(115, 435, 70, 20,20,20);
     g.setColor(Color.black);
     g.drawRoundRect(110, 455, 80, 120,20,20);
     g.setColor(Color.blue);
     g.fillRect(160, 485, 30, 65);}
    
}
