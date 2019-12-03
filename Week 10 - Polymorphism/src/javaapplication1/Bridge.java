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
public class Bridge 
{
    private int vehicleLimit;
    private int weightLimit;
    private Vehicle[] onBridge;
    
    public Bridge(int limit, int maxWeight)
    {
        vehicleLimit = limit;
        weightLimit = maxWeight;
        onBridge = new Vehicle[vehicleLimit];
    }
    
    public int calcTotalWeight()
    {
        int tally = 0;
        
        for(int i=0; i<onBridge.length;i++)
        {
            if(onBridge[i] != null)
            {
                tally += onBridge[i].getWeight();
            }
        }
        
        return tally;
    }
    
    public int addVehicle(Vehicle veh)
    {
        if(calcTotalWeight() + veh.getWeight() < weightLimit)
        {
            for(int i=0; i<onBridge.length;i++)
            {
                if(onBridge[i] == null)
                {
                    onBridge[i] = veh;
                    return 1;
                }
            }
            return -1;
        }
        return 0;
    }
    
    public boolean removeVehicle(String reg)
    {
        for(int i=0; i<onBridge.length;i++)
        {
            if(onBridge[i] != null)
            {
                if(onBridge[i].getReg().equals(reg))
                {
                    onBridge[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
