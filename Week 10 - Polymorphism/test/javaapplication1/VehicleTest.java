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
public class VehicleTest {
    
    public VehicleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getReg method, of class Vehicle.
     */
    @Test
    public void testGetReg() {
        System.out.println("getReg");
        Vehicle instance = null;
        String expResult = "";
        String result = instance.getReg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Vehicle.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Vehicle instance = null;
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcFee method, of class Vehicle.
     */
    @Test
    public void testCalcFee() {
        System.out.println("calcFee");
        Vehicle instance = null;
        double expResult = 0.0;
        double result = instance.calcFee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehicleImpl extends Vehicle {

        public VehicleImpl() {
            super("", 0);
        }

        public double calcFee() {
            return 0.0;
        }
    }
    
}
