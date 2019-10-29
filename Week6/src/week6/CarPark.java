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
public class CarPark {
    private Car[] cars;
    
    public CarPark()
    {
        cars = new Car[15];
    }
    
      public boolean carsParked (Car CarsIn)
    {
        for(int i=0; i< cars.length; i+=1)
        {
            if(cars[i] == null)
            {
                cars[i] = CarsIn;
                return true;
            }
        }
        return false;
    }
    
}
