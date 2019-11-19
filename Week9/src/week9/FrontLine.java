/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author 4headk50
 */
public class FrontLine extends Employees{
     public FrontLine (String nameIn,double payIn, int holidayIn, int hoursIn) {
        
         super(nameIn, payIn, holidayIn, hoursIn);
     }
     
     @Override
     public double getYearlySalary(){
         return (pay * hours)*52;
     }

    @Override
    public String room() {
        return "Shop floor";
    }
     
     
}
