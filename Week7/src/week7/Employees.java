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
public class Employees {
    
    String name;
    Double payRate;
    float salary;
    int hoursPerWeek;
    int holidayEntitlement;
    
    public Employees (String nameIn,Double payRateIn, float salaryIn, int hoursPerWeekIn, int holidayEntitlementIn) {
      
        name = nameIn;
        payRate = payRateIn;
        salary = salaryIn;
        hoursPerWeek = hoursPerWeekIn;
        holidayEntitlement = holidayEntitlementIn;        
    }
    
     public String GetName(){
     return name;
    }
     
       public double GetPayRate(){
       return payRate;
    }
     
       public float GetSalary(){
       return salary;
    }
     
       public int GetHoursPerWeek(){
       return hoursPerWeek;
    }
       
       public int GetolidayEntitlement(){
       return holidayEntitlement;
    }
     
    
}
