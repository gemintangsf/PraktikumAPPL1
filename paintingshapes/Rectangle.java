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
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle (double panjang, double tinggi){
        super("Rectangle");
        length = panjang;
        width = tinggi;
    }
    
    public double area() {
        return width * length;
    }
}
