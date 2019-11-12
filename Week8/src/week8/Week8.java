/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

//import java.util.Scanner;

/**
 *
 * @author 4headk50
 */
public class Week8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        MainScreen gui = new MainScreen();
        gui.pack();
        gui.setVisible(true);
        
        
        /*
        int state =1;
        
      CarPark cp = new CarPark();
        Scanner scanIn = new Scanner(System.in);
      
        while(state == 1)
{
// Print menu
    
  System.out.println ("Please select one of the following options:");
  System.out.println ("A – Add a car");
  System.out.println ("B – Remove a car");
  System.out.println ("C – View number of free spaces/number of cars in the car park");
  System.out.println ("X – Quit");
        
// Get user input
 String input = scanIn.nextLine();
// Perform actions based on user selection
if(input.equals("a"))
{   
    System.out.println ("You have chosen to add a car \n Please enter a reg number");
    
    String reg = scanIn.nextLine();
    System.out.println ("Please add the colour of your car");
    String colour = scanIn.nextLine();
    System.out.println ("Please add your Car make");
    String make = scanIn.nextLine();
    System.out.println ("Please add your Car model");
    String model = scanIn.nextLine();
    
  if(  cp.carsParked(new Car (reg, colour, make, model)))
  {
      System.out.println ("Car has been added");
  }
  else {
      System.out.println ("Carpark is full");
  }
    
}

else if (input.equals("b"))
{
   System.out.println ("You have chosen to remove a car \n Please enter a reg number");
   
   String reg = scanIn.nextLine();
   
   if (cp.removeCar(reg)){
        System.out.println ("Car Removed");
   }
   
   else{
        System.out.println ("Car does not there");
   }
}

else if (input.equals("c"))
{
   System.out.println ("Empty spaces: " + cp.getEmptySpaces());
}

else if (input.equals("x"))
{
   state = 0;
}

else {
    System.out.println ("Please enter a vailed input");
}



}

        
        scanIn.close();
*/
    }
 }
    


