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
public abstract class Employees {
    
    protected String name;
    protected double pay;
    protected int holiday;
    protected int hours;
    public abstract String room(); 
    
    public Employees (String nameIn,double payIn, int holidayIn, int hoursIn) {
      
        name = nameIn;
        pay = payIn;
        holiday = holidayIn;
        hours = hoursIn;
        
    
    
    }

    public void setPay (double payIn){
        pay = payIn;
    }
      
    public boolean setHours (int hoursIn){
        if (hoursIn <=40){
            hours = hoursIn;
            return true;
        }
        return false;
    }
   
   public double getYearlySalary(){
       return pay;
   }
   
   public boolean bookHoliday(int reduceBy){
       if(holiday - reduceBy >= 0){
           holiday -= reduceBy;
           return true;
       }
       return false;
   }
   
   public String getDetails(){
       return name + " " + holiday + " " + getYearlySalary();
   } 
   
   public String getName(){
       return name;
   }
}
