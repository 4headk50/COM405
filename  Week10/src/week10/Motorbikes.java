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
public class Motorbikes extends Vehicles {

    public Motorbikes(String regNumberIn, double weightIn) 
    {
        super(regNumberIn, weightIn);
    }

    @Override
    public double calculateFee() 
    {
        return 3.00;
    }
    
}
