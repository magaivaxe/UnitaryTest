/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarytests;

/**
 * The interfaces create un supertype comme mouseListenner or others abstracts
 * classes. After implements the methods will be add automaticaly as overrides
 * @author eleves
 */
public interface Calculator
{
    int multiply(int a, int b);
    int divide(int a, int b);
    int add(int a, int b);
    int substract(int a, int b);
}
