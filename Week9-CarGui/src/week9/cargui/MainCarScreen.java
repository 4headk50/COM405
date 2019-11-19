/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.cargui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author 4headk50
 */
public class MainCarScreen extends JFrame implements ActionListener {
    private JLabel lblSpeed;
    private JLabel lblFuel;
  
    private JButton btnAcc;
    private JButton btnBreak;
    private JButton btnFuel;

    private GridBagConstraints constraints;
    
     //Construstor
    
    public MainCarScreen(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        initComponents();
        layoutComponents();
    }
    
    public void initComponents(){
    lblSpeed = new JLabel ("Speed: "+"");
    lblFuel = new JLabel ("Fuel: "+"");
 
    
    btnAcc = new JButton("Accelerate");
    btnAcc.addActionListener(this);
    
    btnBreak = new JButton("Break");  
    btnBreak.removeActionListener(this);
    
    btnFuel = new JButton("Add Fuel");  
    btnFuel.removeActionListener(this);
    }
    
    
    public void layoutComponents(){
        
        //Label
      constraints.gridy = 0; // Set the row
      constraints.gridx = 0; // Set the column
      constraints.gridwidth = 1;
      this.add(lblSpeed, constraints); // Add the component
      
      constraints.gridy = 1; // Set the row
      constraints.gridx = 0; // Set the column
     this.add(lblFuel, constraints); // Add the component
    
      //Button
      
      constraints.gridy = 2; // Set the row
      constraints.gridx = 0; // Set the column
      this.add(btnAcc, constraints); // Add the component 
      
      constraints.gridy = 2; // Set the row
      constraints.gridx = 1; // Set the column
    
      this.add(btnBreak, constraints); // Add the component 
      
      constraints.gridy = 2; // Set the row
      constraints.gridx = 3; // Set the column
    
      this.add(btnFuel, constraints); // Add the component 
    }
    
    
        public void actionPerformed(ActionEvent ev){

       
  }
}
