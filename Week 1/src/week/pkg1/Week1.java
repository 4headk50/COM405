/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg1;

import java.util.Date;

/**
 *
 * @author Kevin
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "Kevin";
        int age = 38;
        boolean isBirthday = false;
        int drinkAge = 21;
        String club = "";
        int speed = 33;
        int speedLimit = 30;
        int speedDiff = speed - speedLimit;
        Date today = new Date();
        int speedLeniency = 10;
        String SpeedResponse = "";
        boolean isStudent = true;
        int busTicketPrice = 4;
        int pensionersAge = 65;
        int extraCostOver = 30;
        double deliveryMiles = 31.6;
        double extraMiles = (Math.round (deliveryMiles) - extraCostOver);
        double extraDriveryCost = extraMiles * 0.5;
        double totalCost = (30 + extraDriveryCost);
        
        System.out.println("------------\nHello World! \n------------\n\nHi my name is " + name + "\n"
        
        );
                
                
        System.out.println("---------\n"
                         + "| O . O |\n"
                         + "| (___) | <---- Hello " + name + ", I am World...\n"
                         + "---------");
        
        if(isBirthday)
        {   age = age+1;
            System.out.println("          I have been told its your birthday and your now " + age);
        }
        
        else 
        {
            System.out.println("          I have been told its not your birthday so your still " + age);            
        }
        
        if(age >= 20 && age < 30)
        {  
            club = "and your in the 20s club";
        }
        
        else if(age >= 30 && age < 40)
        {   
            club = "and your in the 30s club";
        }
        
        else if (age >= drinkAge)
        {
            club = "but you have no club :(";
        }
        
        else
        {
            club = "and you have no club :(";
        }
        
        if(age >= drinkAge)
        {
            System.out.println("          which means you can drink... Yay!! " + club); 
        }
        
        else 
        {
            System.out.println("          which means you still not allowed to drink " + club);            
        }
        
        
       
        System.out.println("\n\n-------------\n   Driving\n-------------\n");
        
         if(speed <= speedLimit)
        {
            SpeedResponse = ("You were going " + speed + "mph, thank you for not speeding... Move along move along");
        }
        
        else if(speedDiff <= speedLeniency)
        {
            SpeedResponse = ("You were going " + speed + "mph that is "
                    + speedDiff + "mph over the limit, you will be getting a ticket");
        }
        
        else
        {
            SpeedResponse = ("You were going " + speed + "mph that is " 
                    + speedDiff + "mph over the limit, kiss your ass goodby as your getting a ticket and going to court");
        }
        
        System.out.println("Hello "+ name + ", you just went through a speed check zone on " + today 
                +" \nThe speed limit is: " + speedLimit +" mph"
                + "\n" + SpeedResponse); 
        
        System.out.println("\n\n--------------\n  Bus Ticket\n--------------\n");
    
        System.out.println("So you want to travel on this bus " + name);

        if(age <= 3)
        {
           System.out.println("How are you out on your own, well you can for Freeee!!");
        }
        
        else if(isStudent && age <= 19)
        {
           busTicketPrice = (busTicketPrice / 2);
           System.out.println("Ahh a student card you can travel for: £" + busTicketPrice); 
        }
        
        else if(age >= pensionersAge)
        {
           System.out.println("Well, You look old! you can travel for Freeee!!"); 
        }
        
        else
        {
            System.out.println("Well it's £" + busTicketPrice); 
        }
        
        System.out.println("\n\n------------\n  Delivery\n------------\n");
        System.out.println("a.");
        System.out.println("Hello " + name + " I see you want to deliver a parcel " + deliveryMiles + " miles");
        
        if(deliveryMiles <= 10)
        {
           System.out.println("That will be freee!");
        }
        
        else
        {
           System.out.println("That will be £20");  
        }
        
         System.out.println("\nb.");
         System.out.println("Hello " + name + " I see you want to deliver a parcel " + deliveryMiles + " miles");
         
         if(deliveryMiles <= 10)
         {
            System.out.println("That will be freee!"); 
         }
         
         else if(deliveryMiles <= 20)
         {
            System.out.println("That will be £15!"); 
         }
         
         else
         {
            System.out.println("That will be £30!"); 
         }
         
         System.out.println("\nc.");
         System.out.println("Hello " + name + " I see you want to deliver a parcel " + deliveryMiles + " miles");
         
          if(deliveryMiles <= 10)
         {
            System.out.println("That will be freee!"); 
         }
         
         else if(deliveryMiles <= 20)
         {
            System.out.println("That will be £15"); 
         }
         
         else
         {  
            System.out.println("That will be £" + totalCost); 
         }
         
         System.out.println("\nd.");
         System.out.println("Hello " + name + " I see you want to deliver a parcel " + deliveryMiles + " miles");
    }
    
}
