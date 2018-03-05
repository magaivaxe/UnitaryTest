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
         * 6- 
         */
        
        
        System.out.println("add");
        int a = 0;
        int b = 0;
        UnitaryTests instance = new UnitaryTests();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
