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
public class Admin extends Employees{
    
    private Managers assignedManager;
    
    public Admin (String nameIn,double payIn, int holidayIn, int hoursIn) {
        
        super(nameIn, payIn, holidayIn, hoursIn);
    }
    
    public Managers getManager(){
        return assignedManager;
    }
    
    public void setManager(Managers managerIn){
        assignedManager = managerIn;
    }
    
    @Override
    public String getDetails(){
        String ret = super.getDetails();
        if(assignedManager !=null){
            ret +=" " + assignedManager.getName();
        }
        
        else {
            ret += " No Manager assigned ";
        }
       
        
        return ret;
    }
}
