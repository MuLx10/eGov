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
public class policeTest {
    
    public policeTest() {
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
     * Test of validate_age method, of class police.
     */
    @Test
    public void testValidate_age() {
        System.out.println("validate_age");
        String age = "";
        police instance = new police();
        boolean expResult = false;
        boolean result = instance.validate_age(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetch method, of class police.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        police instance = new police();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class police.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        police.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
