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
public class LorryTest {
    Lorry l;
    public LorryTest() {
    }
    
    @Before
    public void setUp() {
        
        l = new Lorry("123L1",8000);  
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcFee method, of class Lorry.
     */
    @Test
    public void testCalcFee() {
        assertEquals (15.0, l.calcFee(), 0);
        l = new Lorry("456L",7999);
        assertEquals (10.0, l.calcFee(), 0);
    }
    
}
