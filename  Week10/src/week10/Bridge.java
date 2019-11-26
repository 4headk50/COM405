/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author 4headk50
 */
public class Bridge {
        
    Vehicles[] vehiclesArray = new Vehicles[20];
    
public double calcTotalWeight() 
    {

        int tally = 0; 
          
           for(int i=0; i< vehiclesArray.length; i++)
           {
           if(vehiclesArray[i] == null)
             {
            tally = tally + (int) vehiclesArray[i].getWeight();
             }
           }
           
           return tally;
    }


      public boolean vehicleEntered (Vehicles VehiclesIn)
    {
        for(int i=0; i< vehiclesArray.length; i++)
        {
           
            if(calcTotalWeight() >= 30000)
            {
             return false;
            }
            else if(vehiclesArray[i] == null)
            {
                vehiclesArray[i] = VehiclesIn;
                return true;
            }
        }
        return false;
    }



      public boolean removeCar(String reg)
        {
        for(int i=0; i< vehiclesArray.length; i++)
            {   if(vehiclesArray[i] != null) 
                {
                    if(vehiclesArray[i].getRegNumber().equals(reg)) 
                    {
                    vehiclesArray[i] = null;
                    return true;
                    }
                }
            }  
            return false;
        }
      

      


}
