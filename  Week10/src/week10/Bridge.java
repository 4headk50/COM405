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
        
    private int vehicleLimit;
    private int weightLimit;
    private Vehicles[] onBridge;
            
    Vehicles[] vehiclesArray = new Vehicles[20];
    
    
    public Bridge (int limit, int maxWeight)
    {
        vehicleLimit = limit;
        weightLimit = maxWeight;
        onBridge = new Vehicles [vehicleLimit];
    }
    
    
public double calcTotalWeight() 
    {

        int tally = 0; 
          
           for(int i=0; i< onBridge.length; i++)
           {
           if(onBridge[i] != null)
             {
            tally += onBridge[i].getWeight();
             }
           }
           
           return tally;
    }


      public int addVehicle (Vehicles VehiclesIn)
    {
            if(calcTotalWeight() + VehiclesIn.getWeight()< weightLimit)
            {
                
            }
            
        for(int i=0; i< onBridge.length; i++)
           {
           if(onBridge[i] == null)
             {
             onBridge[i] = VehiclesIn;
             return 1; 
             }
           }
            
            return -1;
           
    }


        
        

      public boolean removeCar(String reg)
        {
        for(int i=0; i< onBridge.length; i++)
            {   if(onBridge[i] != null) 
                {
                    if(onBridge[i].getRegNumber().equals(reg)) 
                    {
                    onBridge[i] = null;
                    return true;
                    }
                }
            }  
            return false;
        }
      

      


}
