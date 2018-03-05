/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarytests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eleves
 */
public class UnitaryTestsTest
{
    
    public UnitaryTestsTest()
    {
    }
    /**
     * Test of main method, of class UnitaryTests.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        UnitaryTests.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class UnitaryTests.
     */
    @Test
    public void testMultiply()
    {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        UnitaryTests instance = new UnitaryTests();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class UnitaryTests.
     */
    @Test
    public void testDivide()
    {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        UnitaryTests instance = new UnitaryTests();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class UnitaryTests.
     */
    @Test
    public void testAdd()
    {
        /**
         * 1- Instance the class to test;
         * 2- Initializer the object;
         * 3- Manage the arguments to test;
         * 4- Manage the results;
         * 5- Test the method with the arguments;
         * 6- Check results;
         * 7- Restart from 3 if it will have the cases to test;
         */
        System.out.println("-------------- add test ---------------");
        //1 and 2
        UnitaryTests addTests = new UnitaryTests();
        
        //3 - Test two positives integers ----------------------------------
        int a, b, result, expResult, count; String msg = "Test fail";
        //4
        a = 5; b = 5; expResult = a + b; count = 0;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a zero and b positive ----------------------------------
        a = 0; b = 5; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a positive and b zero ----------------------------------
        a = 5; b = 0; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a zero and b zero ----------------------------------
        a = 0; b = 0; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a positive and b negative --------------------------------
        a = 5; b = -5; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a negative and b positive --------------------------------
        a = -5; b = 5; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
        
        //3, 4 - Test a negative and b negative --------------------------------
        a = -5; b = -5; expResult = a + b;
        //5
        result = addTests.add(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else { System.out.println("Test " + count + " ok."); }
    }

    /**
     * Test of substract method, of class UnitaryTests.
     */
    @Test
    public void testSubstract()
    {
        System.out.println("substract");
        int a = 0;
        int b = 0;
        UnitaryTests instance = new UnitaryTests();
        int expResult = 0;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
