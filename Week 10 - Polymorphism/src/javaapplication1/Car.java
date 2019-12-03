/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cunninghad
 */
public class Car extends Vehicle
{
    public Car(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }

    @Override
    public double calcFee() {
        
        if(weight > 1590)
        {
            double extra = ((weight-1590)/100)*0.10;
            return 5.0 + extra;            
        }
        return 5.0;
    }
    
    
}
