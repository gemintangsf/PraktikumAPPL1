/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alistofprimenumbers;

/**
 *
 * @author asus
 */
// *****************************************************************
// Primes.java
//
// Generates a list of primes less than or equal to the integer
// input by the user.
// *****************************************************************
import java.awt.*;
import javax.swing.*;

public class Primes {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Primes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PrimePanel primePanel = new PrimePanel();
        frame.getContentPane().add(primePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
