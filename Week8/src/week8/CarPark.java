/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author 4headk50
 */
public class CarPark {
    private Car[] cars;
    
    public CarPark()
    {
        cars = new Car[15];
    }
    
    
    //Add Car
      public boolean carsParked (Car CarIn)
    {
        for(int i=0; i< cars.length; i++)
        {
            if(cars[i] == null)
            {
                cars[i] = CarIn;
                return true;
            }
        }
        return false;
    }
      
    //Remove Car
      public boolean removeCar(String reg)
        {
        for(int i=0; i< cars.length; i++)
            {   if(cars[i] != null) 
                {
                    if(cars[i].GetRegNo().equals(reg)) 
                    {
                    cars[i] = null;
                    return true;
                    }
                }
            }  
            return false;
        }
      
    //Count cars in carpark
     
      
      
    
    //Count free spaces in carpark  
      
      public int getEmptySpaces()
      {    
          int tally = 0; 
          
           for(int i=0; i< cars.length; i++)
           {
           if(cars[i] == null)
             {
            tally++;
             }
           }
           
           return tally;
      }
      
}
