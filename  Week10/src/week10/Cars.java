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
public class Cars extends Vehicles{

   

    public Cars(String regNumberIn, double weightIn) 
    {
        super(regNumberIn, weightIn);
    }

    @Override
    public double calculateFee() 
    {
     
       if(Weight > 1590)
       {
           double extra = ((Weight - 1590)/100)*0.10;
           return extra + 5.00;
       }
        return 5.00;
       
  
    }
    
}
