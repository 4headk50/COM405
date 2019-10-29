/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4headk50
 */
public class Car {
    private String numberPlate;
    private String colour;

    //constructor
    public Car(String numberPlateIn, String colourIn)
    {
        numberPlate = numberPlateIn;
        colour = colourIn;
    }
    
    //getter
    public String GetNumberPlate ()
  {
     return numberPlate;
  }
    public String GetColour ()
    {
      return colour;
    }
    
}