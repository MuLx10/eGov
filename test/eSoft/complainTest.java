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
public class complainTest {
    
    public complainTest() {
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
     * Test of validate_email method, of class complain.
     */
    @Test
    public void testValidate_email() {
        System.out.println("validate_email");
        String email = "kjhbjkhg";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testValidate_email2() {
        System.out.println("validate_email");
        String email = "kjhbjkhg@cat";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testValidate_email3() {
        System.out.println("validate_email");
        String email = "kjhbjkhg@cat.com";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of validate_date method, of class complain.
     */
    @Test
    public void testValidate_date() {
        System.out.println("validate_date");
        String dob = "12-99-1999";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidate_date1() {
        System.out.println("validate_date");
        String dob = "12-99-19a9";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testValidate_date2() {
        System.out.println("validate_date");
        String dob = "12-09-1999";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_date(dob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    

    /**
     * Test of validate_time method, of class complain.
     */
    @Test
    public void testValidate_time() {
        System.out.println("validate_time");
        String time = "a2:99:999";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_time(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testValidate_time1() {
        System.out.println("validate_time1");
        String time = "0q:01:01";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_time(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testValidate_time2() {
        System.out.println("validate_time2");
        String time = "01:01:01";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_time(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testValidate_time3() {
        System.out.println("validate_time3");
        String time = "12:05:02";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_time(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of validate_datetime method, of class complain.
     */
    @Test
    public void testValidate_datetime() {
        System.out.println("validate_datetime");
        String datetime = "12-01-1997 20:12:10";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_datetime(datetime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testValidate_datetime1() {
        System.out.println("validate_datetime");
        String datetime = "";
        complain instance = new complain();
        boolean expResult = false;
        boolean result = instance.validate_datetime(datetime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testValidate_datetime2() {
        System.out.println("validate_datetime");
        String datetime = "12-01-1997 20:12:10";
        complain instance = new complain();
        boolean expResult = true;
        boolean result = instance.validate_datetime(datetime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    

    /**
     * Test of fetch method, of class complain.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        complain instance = new complain();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of main method, of class complain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        complain.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
