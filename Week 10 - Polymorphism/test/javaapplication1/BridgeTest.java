/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4headk50
 */
public class BridgeTest {
    Bridge br;
    
    public BridgeTest() {
  
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     br = new Bridge(20,10000); 
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTotalWeight method, of class Bridge.
     */
    @Test
    public void testCalcTotalWeight() {
        
         Car c1 = new Car("123A",20);
         Car c2 = new Car("123B",40);
         Car c3 = new Car ("123C",80);
         br.addVehicle(c1);     
         br.addVehicle(c2);
         br.addVehicle(c3);
         assertEquals(140, br.calcTotalWeight());
        
      
    }

    /**
     * Test of addVehicle method, of class Bridge.
     */
    @Test
    public void testAddVehicle() {
       
    }

    /**
     * Test of removeVehicle method, of class Bridge.
     */
    @Test
    public void testRemoveVehicle() {
       
    }
    
}
