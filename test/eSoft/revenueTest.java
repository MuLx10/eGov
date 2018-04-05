/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eSoft;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nirala
 */
public class revenueTest {
    
    public revenueTest() {
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
     * Test of validate_total method, of class revenue.
     */
    @Test
    public void testValidate_total() {
        System.out.println("validate_total");
        double total = 74.52000000000001;
        double amt = 69.0;
        double tax = 8.0;
        revenue instance = new revenue();
        boolean expResult = true;
        double tot = amt*(1+0.01*tax);
        System.out.println(tot);
        boolean result = instance.validate_total(total, amt, tax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testValidate_total1() {
        System.out.println("validate_total");
        double total = 74.52;
        double amt = 69.0;
        double tax = 8.0;
        revenue instance = new revenue();
        boolean expResult = false;
        double tot = amt*(1+0.01*tax);
        System.out.println(tot);
        boolean result = instance.validate_total(total, amt, tax);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fetch method, of class revenue.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        revenue instance = new revenue();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class revenue.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        revenue.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
