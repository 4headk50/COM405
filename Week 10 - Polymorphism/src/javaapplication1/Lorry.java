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
public class Lorry extends Vehicle 
{
    public Lorry(String regIn, int weightIn)
    {
        super(regIn, weightIn);
    }

    @Override
    public double calcFee() 
    {
        if(weight < 8000)
        {
            return 10;
        }
        return 15;
    }
    
}
