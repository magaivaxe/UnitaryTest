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

    @Override
    public int multiply(int a, int b)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Template
    }

    @Override
    public int divide(int a, int b)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public int substract(int a, int b)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
