/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9.cargui;

/**
 *
 * @author 4headk50
 */
public class Week9CarGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainCarScreen gui = new MainCarScreen();
        gui.pack();
        gui.setVisible(true);
        
     //Variables
        
        // Create 2 Car objects
         Car c1 = new Car();
               
         // Set c1's attributes
         c1.setCurrentSpeed(50);
         c1.setMaxSpeed(90);
         c1.setfuelLevel(50);
         c1.setcolour("Red");

         // Printing out details for c1
         System.out.println("Car 1 current speed is: "+c1.getCurrentSpeed());
         System.out.println("Car 1 max speed is: "+c1.getmaxSpeed());
         System.out.println("Car 1 fuel level is: "+c1.getfuelLevel());
         System.out.println("Car 1 colour is: "+c1.getcolour());

    }
    
}
