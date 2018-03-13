/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarytests;

/**
 * The override methods come from the interface that I build.
 * @author eleves
 */
public class UnitaryTests implements Calculator
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    /**
     * 
     * @param a integer to multiply
     * @param b integer to multuply
     * @return the number multiplyed
     */
    @Override
    public int multiply(int a, int b)
    {
        return a * b;
    }
    /**
     * Function that returns the divisiont between a/b
     * @param a is the numerator
     * @param b is the denominator 
     * @return the an integer result 
     */
    @Override
    public int divide(int a, int b)
    {
        //Exception to deminator value
        if(b == 0){throw new ArithmeticException("It is impossible by zero");}
        //variables
        int res = 0; boolean resEstNegatif = false;
        //Negativities conditions
        if (a < 0)
        {
            resEstNegatif = !resEstNegatif;
            a = -a;
        }
        if (b < 0)
        {
            resEstNegatif = !resEstNegatif;
            b = -b;
        }
        //Division by substraction and count
        while (a > 0)
        {            
            a = substract(a, b);
            res++;
        }
        //Negative result condition
        if (resEstNegatif) {res = -res;}
        return res;
    }
    /**
     * To according the exemple I haven't the right to use the fast methods
     * Also I will use the loop to add, substract, divise and multiply
     * @param a value to add to b
     * @param b value to add to a 
     * @return the value res
     */
    @Override
    public int add(int a, int b)
    {
        int res = a;
        //Incremantation of b value on a
        if (b > 0)
        {
            while (b-- != 0) { res++; }
        }
        //Decremantaion of a value on b
        else if (b < 0)
        {
            while (b++ != 0){ res--; }
        }
        return res;
    }
    /**
     * Programm this function yet!!!
     * @param a
     * @param b
     * @return 
     */
    @Override
    public int substract(int a, int b)
    {
        return a - b;
    }
    
}
