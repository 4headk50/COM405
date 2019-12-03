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
public class MotorbikeTest {
    
    Motorbike m;
    
    public MotorbikeTest() {
    }
        
    @Before
    public void setUp() {
        m = new Motorbike("123M1",500);  
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcFee method, of class Motorbike.
     */
    @Test
    public void testCalcFee() {
        assertEquals(3.0,m.calcFee(), 0.01);
    }
    
}
