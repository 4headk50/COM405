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
public class Car 
{
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    private String colour;
    
    public Car()
    {
    currentSpeed = 50;
    maxSpeed = 100;
    fuelLevel = 60;
    colour = "Green";
    }
    
 public Car (int currentSpeedIn, int maxSpeedIn, String ColourIn)
{
currentSpeed = currentSpeedIn;
maxSpeed = maxSpeedIn;
fuelLevel = 100;
colour = ColourIn;
}
   
    
    //Getter
  public int getCurrentSpeed()
   {
     return currentSpeed;
   }
  public int getmaxSpeed()
   {
     return maxSpeed;
   }
   public int getfuelLevel()
   {
     return fuelLevel;
   }
   public String getcolour()
   {
     return colour;
   }
 
   //Setter
   public void setCurrentSpeed(int currentSpeedIn)
   {
       currentSpeed = currentSpeedIn;
   }
   public void setMaxSpeed(int maxSpeedIn)
   {
       maxSpeed = maxSpeedIn;
   }
   public void setfuelLevel(int fuelLevelIn)
   {
       fuelLevel = fuelLevelIn;
   }
   public void setcolour(String colourIn)
   {
       colour = colourIn;
   }
     
    //Methods
   public void accelerate(int increase)
   {
       
       //currentSpeed++;
      
      // fuelLevel--; 
       
       if(fuelLevel <= 0)
       {
           currentSpeed = 0;
       }
       
       else if (currentSpeed+increase > maxSpeed)
           
      {
      currentSpeed = maxSpeed;
      }
      else
      {
           currentSpeed += increase;
      }
   }
   public void brake(int change)
   {
       if(currentSpeed - change < 0)
       {
           currentSpeed = 0;
       }
       
       else
       {
          currentSpeed -= change; 
       }
       //currentSpeed -= change;
   }
   public void refuel(int fuelIn)
   {
       if(fuelLevel + fuelIn <=100)
       {
            fuelLevel += fuelIn;
       }
       else
       {
           fuelLevel = 100;
       }
      
   }
}
    
  
