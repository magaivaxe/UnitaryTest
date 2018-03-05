/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarytests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eleves
 */
public class CalculatorTest
{
    
    public CalculatorTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply()
    {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide()
    {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Calculator.
     */
    @Test
    public void testSubstract()
    {
        System.out.println("substract");
        int a = 0;
        int b = 0;
        Calculator instance = new CalculatorImpl();
        int expResult = 0;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CalculatorImpl implements Calculator
    {

        public int multiply(int a, int b)
        {
            return 0;
        }

        public int divide(int a, int b)
        {
            return 0;
        }

        public int add(int a, int b)
        {
            return 0;
        }

        public int substract(int a, int b)
        {
            return 0;
        }
    }
    
}
