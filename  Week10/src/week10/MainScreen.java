/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 4headk50
 */
public class MainScreen {
    
     private JLabel lblTitle,
                    lblRegistration,
                    lblWeight,
                    lblAccess,
                    lblFee;
     
     private JTextField txtRegistration,
                        txtColour;
     
      private JButton btnAdd,
                      btnRemove;
      
      
   MainScreen()
    {
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        //SET UP COMPONENTS
        initComponents();
        //Create the layout
        layoutComponents();
    }    

    public void initComponents()
    {
        lblTitle = new JLabel("Car park console");
        lblRegistration = new JLabel("Reg no.");
        lblWeight = new JLabel("Weight:");
        lblAccess = new JLabel("Make");
        lblFee = new JLabel("Fee");
      
        
        txtRegistration = new JTextField();
        txtColour = new JTextField();
      
        
        btnAdd = new JButton("Add car");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
        btnRemove = new JButton("Remove car");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
    }
   
   
   
    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLayout(GridBagLayout gridBagLayout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
