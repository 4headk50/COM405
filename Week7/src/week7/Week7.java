/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author 4headk50
 */
public class Week7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Managers m1 = new Managers("David", 70000, 30, 40, 25);
        Admin a1 = new Admin("Brent", 20000, 25, 40);
        a1.setManager(m1);
        
        System.out.println(m1.getDetails());  
        System.out.println(a1.getDetails());
    }
    
}
