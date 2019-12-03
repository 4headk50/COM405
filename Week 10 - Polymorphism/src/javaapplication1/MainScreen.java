/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author cunninghad
 */
public class MainScreen extends JFrame implements ActionListener{
    private JLabel lblTitle,
                    lblLoadTile,
                    lblLoad,
                    lblReg,
                    lblWeight,
                    lblStatus,
                    lblFeeTitle,
                    lblFee;
    
    private JTextField txtReg,
                        txtWeight;
    
    private JButton btnAdd,
                    btnRemove;
    
    private Bridge br;
    
    public MainScreen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        br = new Bridge(20, 30000);
        initComponents();
        
        layoutComps();
        
    }

    private void initComponents() 
    {
        lblTitle = new JLabel("Bridge");
        lblLoadTile = new JLabel("Current Load: ");
        lblLoad = new JLabel("0KG");
        lblReg = new JLabel("Reg: ");
        lblWeight = new JLabel("Weight: ");
        lblStatus = new JLabel(" - ");
        lblFeeTitle = new JLabel("Fee: ");
        lblFee = new JLabel(" - ");
        
        txtReg = new JTextField();
        txtWeight = new JTextField();
        
        btnAdd = new JButton("Add");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove");
    }

    private void layoutComps() {
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        this.add(lblLoadTile, constraints);
        
        constraints.gridx = 1;
        this.add(lblLoad, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        this.add(lblReg, constraints);
        
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtReg, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblWeight, constraints);
        
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtWeight, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.fill = GridBagConstraints.NONE;
        this.add(btnAdd, constraints);
        
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        this.add(lblStatus, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        this.add(lblFeeTitle, constraints);
        
        constraints.gridx = 1;
        this.add(lblFee, constraints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnAdd))
        {
            String reg = txtReg.getText();
            int weight = Integer.parseInt(txtWeight.getText());
            
            Vehicle veh = null;
            
            if(weight < 1000)
            {
                veh = new Motorbike(reg, weight);
            }
            else if(weight < 5000)
            {
                veh = new Car(reg, weight);
            }
            else
            {
                veh = new Lorry(reg, weight);
            }
            
            if(br.addVehicle(veh) >=1)
            {
                lblStatus.setText("Entry Granted");
                lblLoad.setText(br.calcTotalWeight() + "kg");
                lblFee.setText("£" + veh.calcFee());
            }
            else
            {
                lblStatus.setText("Denied");
            }
        }
    }
                            
}
