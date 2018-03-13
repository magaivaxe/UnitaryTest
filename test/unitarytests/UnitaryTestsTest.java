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
   
    @Test
    public void testMultiply()
    {
        System.out.println("-------------- multiply test --------------");
        //Steps 1 and 2
        UnitaryTests multTests = new UnitaryTests();
        //3- Test two positives -----------------------------------------
        int a , b, result, expResult, count; String msg = "Test Fail";
        //4
        a = 5; b = 5; expResult = a * b; count = 0;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test a < 0 and b > 0 -----------------------------------------
        a = -5; b = 5; expResult = a * b;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test a > 0 and b < 0 -----------------------------------------
        a = 5; b = -5; expResult = a * b;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test a < 0 and b < 0 -----------------------------------------
        a = -5; b = -5; expResult = a * b;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test a = 0 and b > 0 -----------------------------------------
        a = 0; b = 5; expResult = a * b;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test a > 0 and b = 0 -----------------------------------------
        a = 5; b = 0; expResult = a * b;
        //5
        result = multTests.multiply(a, b); count++;
        //6
        if (result != expResult) { fail(msg + count); }
        else {System.out.println("Teste " + count + " OK");}
    }

    /**
     * Test of divide method, of class UnitaryTests.
     */
    @Test
    public void testDivide()
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
        System.out.println("-------------- divide test ---------------");
        //Steps 1 and 2
        UnitaryTests diviTests = new UnitaryTests();
        //3- Test two positives ----------------------------------
        int a, b, result, expResult, count; String msg = "Test fail";
        //4
        a= 5; b = 5; expResult = a / b; count = 0;
        //5
        result = diviTests.divide(a, b); count++;
        //6
        if (expResult != result){fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test one zero and other positive ------------------------------
        a = 0; b = 5; expResult = a / b;
        //5
        result = diviTests.divide(a, b); count++;
        //6
        if (expResult != result){fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test one negative and other positive --------------------------
        a = -5; b = 5; expResult = a / b;
        //5
        result = diviTests.divide(a, b); count++;
        //6
        if (expResult != result){fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test one positive and other negative --------------------------
        a = 5; b = -5; expResult = a / b;
        //5
        result = diviTests.divide(a, b); count++;
        //6
        if (expResult != result){fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
        //3, 4- Test one negative and other negative --------------------------
        a = -5; b = -5; expResult = a / b;
        //5
        result = diviTests.divide(a, b); count++;
        //6
        if (expResult != result){fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
    }
    //Test for exception b = 0
    @Test (expected = ArithmeticException.class)
    public void testDivideZero()
    {
        //1 and 2
        UnitaryTests divByZero = new UnitaryTests();
        //3- a > 0 and b = 0 ----------------------------------------------
        int a, b, result, expResult, count; String msg = "Test Fail";
        //The result is zero because don't exists division by zero
        a = 5; b = 0; count = 0;
        //4
        expResult = 0;
        //5
        result = divByZero.divide(a, b); count++;
        //6
        if(result != expResult) {fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
        //3- a = 0 and b = 0 --------------------------------------------
        a = 0; b = 0;
        //4
        expResult = 0;
        if(expResult != result) {fail(msg + count);}
        else {System.out.println("Teste " + count + " OK");}
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
        System.out.println("-------------- Substract test ---------------");
        //1,2
        UnitaryTests testSubs = new UnitaryTests();
        //3
        int a, b, expResult, result; String msg;
        //TEST 1 - a > 0 and b > 0 -------------------------------------------
        //4
        a = 5; b = 5; expResult = a - b; msg = "a, b positives";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        //TEST 2 - a < 0 and b > 0 -------------------------------------------
        //4
        a = -5; b = 5; expResult = a - b; msg = "a negative, b positive";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        //TEST 3 - a > 0 and b < 0 -------------------------------------------
        //4
        a = 5; b = -5; expResult = a - b; msg = "a positive, b negative";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        //TEST 4 - a < 0 and b < 0 -------------------------------------------
        //4
        a = -5; b = -5; expResult = a - b; msg = "a, b negatives";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        //TEST 5 - a = 0 and b < 0 -------------------------------------------
        //4
        a = 0; b = 5; expResult = a - b; msg = "a zero, b positive";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        //TEST 6 - a > 0 and b = 0 -------------------------------------------
        //4
        a = 5; b = 0; expResult = a - b; msg = "a positive, b zero";
        //5
        result = testSubs.substract(a, b);
        //6
        if(expResult != result) {fail(msg);}
        else {System.out.println("Teste " + msg + " OK");}
        
    }
    
}
