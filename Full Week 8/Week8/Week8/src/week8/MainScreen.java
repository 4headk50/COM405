
package week8;

/*
For each new item we use in the Construction of the GUI we basically:
    (i)     Import the class
    (ii)    Add the thing as an attribute
    (iii)   Initialise the item in the constructor
    (iv)    Use the item in a Method

We can add the attribute first and NetBeans will prompt us to import the class
*/

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements ActionListener
{
    //ATTRIBUTES
    private JLabel lblTitle;
    private JLabel lblRegistration;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;
    private JTextField txtRegistration
            ,txtColour
            ,txtMake
            ,txtModel; //Alter
    private JButton btnAdd;
    private JButton btnRemove;
    private GridBagConstraints constraints;
    private CarPark carpark;
    
   
    
    //CONSTRUCTOR - and methods used in the constructor
    MainScreen()
    {
        carpark = new CarPark(15);
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
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("The car park is empty");
        
        txtRegistration = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();
        
        btnAdd = new JButton("Add car");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
        btnRemove = new JButton("Remove car");
        btnAdd.addActionListener(this);//THIS IS IMPORTANT IT MARKS THE BUTTON AS AN ACTION!!
    }
    public void layoutComponents() //needs the contrainsts object added as an attribute first
    {
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        this.add(lblTitle, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblRegistration, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblColour, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblMake, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(lblModel, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; //Make the text box fill the width of the column
        this.add(txtRegistration, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtColour, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtMake, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(txtModel, constraints);
        
        constraints.fill = GridBagConstraints.NONE; //Remove the 'fill the width of the column' constraint
        constraints.gridx = 1;
        constraints.gridy = 11;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        this.add(lblStatus, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 13;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnAdd, constraints);
        
        constraints.gridx = 4;
        constraints.gridy = 13;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        this.add(btnRemove, constraints);
    }
    
     //OVERRIDE THE ACTION PERFORMED METHOD FORM actionListner
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource().equals(btnAdd))
        {
            String reg = txtRegistration.getText();
            String colour = txtColour.getText();
            String make = txtMake.getText();
            String model = txtModel.getText();
            if(carpark.addCar(new Car(reg,colour,make,model)))
            {
                JOptionPane.showMessageDialog(null, "Car has been added");
                lblStatus.setText("There are "+ carpark.countSpaces() + " spaces");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Car park is full");
            }
        }
        else if(ev.getSource().equals(btnRemove))
        {
            String reg = txtRegistration.getText();
            if(carpark.removeCar(reg))
            {
                JOptionPane.showMessageDialog(null, "Car has been removed");
                lblStatus.setText("There are "+ carpark.countSpaces() + " spaces");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Car does not exist");
            }
        }
    }
}
