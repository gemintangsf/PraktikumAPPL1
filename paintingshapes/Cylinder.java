/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintingshapes;

/**
 *
 * @author GemintangSangkajiFurqon
 */
public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder (double rad, double tinggi){
        super("Cylinder");
        radius = rad;
        height = tinggi;
    }
    
     public double area() {
        return Math.PI*radius*radius*height;
    }
}
