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
public class pensionTest {
    
    public pensionTest() {
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
     * Test of validate_date method, of class pension.
     */
    @Test
    public void testValidate_date1() {
        System.out.println("validate_date");
        
        String dob = "12-04-1997";
        pension instance = new pension();
        boolean expResult = true;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        
    }
    public void testValidate_date2() {
        System.out.println("validate_date");
        
        String dob = "1a-04-1997";
        pension instance = new pension();
        boolean expResult = false; 
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidate_date3() {
        System.out.println("validate_date");
        
        String dob = "1a-04-1997";
        pension instance = new pension();
        boolean expResult = false;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testValidate_date4() {
        System.out.println("validate_date");
        
        String dob = "1a-u4-1j97";
        pension instance = new pension();
        boolean expResult = false;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validate_name method, of class pension.
     */
    @Test
    public void testValidate_name() {
        System.out.println("validate_name");
        String name = "meecat";
        pension instance = new pension();
        boolean expResult = true;
        boolean result = instance.validate_name(name);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidate_name1() {
        System.out.println("validate_name");
        String name = "";
        pension instance = new pension();
        boolean expResult = false;
        boolean result = instance.validate_name(name);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testValidate_name2() {
        System.out.println("validate_name");
        String name = "meeca3t";
        pension instance = new pension();
        boolean expResult = false;
        boolean result = instance.validate_name(name);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void testValidate_name3() {
        System.out.println("validate_name");
        String name = "mee@a3t";
        pension instance = new pension();
        boolean expResult = false;
        boolean result = instance.validate_name(name);
        //System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of fetch method, of class pension.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        pension instance = new pension();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class pension.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        pension.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
