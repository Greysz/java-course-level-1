/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wolf.javacourse.calculator;

/**
 *
 * @author nazman
 */
public class Addition implements BinaryOperation{

    @Override
    public double resultFor(double left, double right) {
        return left + right;
       
    }
    
}
