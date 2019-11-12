/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author 4headk50
 */
public class MainScreen extends JFrame implements ActionListener {
    private JLabel lblReg;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblSpaces;
    
    private JTextField txtReg;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;
    
    private JButton btnAdd;
    private JButton btnRemove;

    private GridBagConstraints constraints;

    private CarPark cp;
    
    //Construstor
    
    public MainScreen(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        cp = new CarPark();
        initComponents();
        layoutComponents();
        
    }
    
    public void initComponents(){
    lblReg = new JLabel ("Reg no");
    lblColour = new JLabel ("Colour");
    lblMake = new JLabel ("Make");
    lblModel = new JLabel ("Model");
    lblSpaces = new JLabel ("Space 15"  );
    
    txtReg = new JTextField();
    txtColour = new JTextField();
    txtMake = new JTextField();
    txtModel = new JTextField();
    
    btnAdd = new JButton("Add Car");
    btnAdd.addActionListener(this);
    
    btnRemove = new JButton("Remove Car");  
    btnRemove.removeActionListener(this);
    }

    public void layoutComponents(){
        
        //Label
      constraints.gridy = 0; // Set the row
      constraints.gridx = 0; // Set the column
      constraints.gridwidth = 1;
      this.add(lblReg, constraints); // Add the component
      
      constraints.gridy = 1; // Set the row
      constraints.gridx = 0; // Set the column
    
      this.add(lblColour, constraints); // Add the component
      
      constraints.gridy = 2; // Set the row
      constraints.gridx = 0; // Set the column
    
      this.add(lblMake, constraints); // Add the component 
      
      constraints.gridy = 3; // Set the row
      constraints.gridx = 0; // Set the column
    
      this.add(lblModel, constraints); // Add the component 
      
      constraints.gridy = 4; // Set the row
      constraints.gridx = 0; // Set the column
      constraints.gridwidth = 2;
      this.add(lblSpaces, constraints); // Add the component 
      
      // Text
      constraints.gridy = 0; // Set the row
      constraints.gridx = 1; // Set the column
      constraints.gridwidth = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL; 
      this.add(txtReg, constraints); // Add the component
      
      constraints.gridy = 1; // Set the row
      constraints.gridx = 1; // Set the column
      
      this.add(txtColour, constraints); // Add the component
      
      constraints.gridy = 2; // Set the row
      constraints.gridx = 1; // Set the column
    
      this.add(txtMake, constraints); // Add the component 
      
      constraints.gridy = 3; // Set the row
      constraints.gridx = 1; // Set the column
    
      this.add(txtModel, constraints); // Add the component 
      
      //Button
      
      constraints.gridy = 5; // Set the row
      constraints.gridx = 0; // Set the column
      constraints.fill = GridBagConstraints.NONE;
      this.add(btnAdd, constraints); // Add the component 
      
      constraints.gridy = 5; // Set the row
      constraints.gridx = 1; // Set the column
    
      this.add(btnRemove, constraints); // Add the component 
            
    }
    
    public void actionPerformed(ActionEvent ev){

        if (ev.getSource().equals(btnAdd))
        {
            String reg = txtReg.getText();
            String colour = txtColour.getText();
            String make = txtColour.getText();
            String model = txtColour.getText();
           // lblSpaces.setText(cp.getEmptySpaces);
            if(cp.carsParked(new Car(reg,colour,make,model)))
            {
                
            }
        }
        else if(ev.getSource().equals(btnRemove)){
            
        }
}

    
}

