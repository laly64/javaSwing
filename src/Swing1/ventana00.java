/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Swing1;

import javax.swing.*; 
import java.awt.*;
/**
 *
 * @author LAB02
 */


public class ventana00 extends JFrame 
  
{
    JPanel mipanel; 
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    JRadioButton radio;
    JCheckBox caja;
    
    public ventana00() 
    {       
      mipanel = new JPanel();
      milabel = new JLabel();
      mitexto = new JTextField(10);
      miboton = new JButton();  
      radio = new JRadioButton();
       caja = new JCheckBox();
       
        this.add(mipanel); 
      mipanel.add(milabel);
      mipanel.add(mitexto);
      mipanel.add(miboton);
      mipanel.add(caja);
      mipanel.add(radio);
      
      
     milabel.setText("nombre");
     miboton.setText("Enviar");
     mipanel.setBackground(Color.green);
     
         
     }
}
