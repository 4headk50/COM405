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
    private String reg;
    private String colour;
    private double ticketFare;
    private String model;
    
    //constructor
    public Car(String numberPlateIn, String colourIn, String modelIn)
    {
        reg = numberPlateIn;
        colour = colourIn;
      //  ticketFare = ticketFareIn;
        model = modelIn;
    }
    
    //getters
    public String GetRegNo()
  {
     return reg;
  }
    public String GetColour ()
    {
      return colour;
    }
    
   /* public double GetTicketFare ()
    {
      return ticketFare;
    }
    */
    public String GetModel ()
    {
    return model;
    }
}