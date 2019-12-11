/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg1;

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
        boolean isBirthday = true;
        int drinkAge = 21;
        
        System.out.println("------------\nHello World! \n------------\n\nHi my name is " + name + "\n"
         //      + " and I am " + age + " years old\n"
        );
                
                
        System.out.println("---------\n"
                         + "| O . O |\n"
                         + "| (___) | <---- Hello " + name + ", I am World...\n"
                         + "---------");
        
        if(isBirthday)
        {   age = age+1;
            System.out.println("          and I have been told its your birthday and your now " + age);
        }
        else 
        {
            System.out.println("          and I been told its not your birthday so your still " + age);            
        }
        if(age >= drinkAge)
        {
            System.out.println("          which means you can drink... Yay!!"); 
        }
        else 
        {
            System.out.println("          which means you still not allowed to drink :(");            
        }
        
        
        
        System.out.println("\n\n-------------\n   Driving\n-------------");
    }
    
}
