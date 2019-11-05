/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author 4headk50
 */
public class Managers extends Employees{
    
    private int bonus;
    
    public Managers (String nameIn,double payIn, int holidayIn, int hoursIn, int bonusIn) {
      
        super(nameIn, payIn, holidayIn, hoursIn);
        bonus = bonusIn;
    }
    
    public boolean setBonus(int bonusIn){
         if(bonusIn >= 0 && bonusIn <=100){
             bonus = bonusIn;
             return true;
         }
         return false;
    }
   
    @Override
    public double getYearlySalary(){
         return (bonus*(pay/100)) + pay;
     }

    
}