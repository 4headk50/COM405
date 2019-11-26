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
public abstract class Vehicles {
    
    protected String regNumber;
    protected double Weight;
    public abstract double calculateFee();
    
    public Vehicles (String regNumberIn, double weightIn)
    {
        regNumber = regNumberIn;
        Weight = weightIn;
    }
    
    public String getRegNumber()
    {
        return regNumber;
    }
    
    public double getWeight()
    {
        return Weight;
    }    
    
}
