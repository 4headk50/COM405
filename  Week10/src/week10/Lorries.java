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
public class Lorries extends Vehicles{

    public Lorries(String regNumberIn, double weightIn) 
    {
        super(regNumberIn, weightIn);
    }

    @Override
    public double calculateFee() 
    {
        
        if(Weight <= 8000)
        {
        return 10.00;  
        }
        return 15.00;
    }
    
}
