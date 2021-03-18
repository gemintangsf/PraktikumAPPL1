/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintingshapes;

/**
 *
 * @author asus
 */
//******************************************************
// Paint.java
//
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
//******************************************************
public class Paint {

    private double coverage; //number of square feet per gallon
//-----------------------------------------
// Constructor: Sets up the paint object.
//-----------------------------------------

    public Paint(double c) {
        coverage = c;
    }
//---------------------------------------------------
// Returns the amount of paint (number of gallons)
// needed to paint the shape given as the parameter.
//---------------------------------------------------

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area()/coverage;
    }
}
