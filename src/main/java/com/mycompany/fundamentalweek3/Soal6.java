/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.fundamentalweek3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BigInteger nomorA, nomorB, add, multiply;
        
        while (true) {
            System.out.println("\nInput:");
            nomorA = scanner.nextBigInteger();
            nomorB = scanner.nextBigInteger();

            add = nomorA.add(nomorB);
            multiply = nomorA.multiply(nomorB);

            System.out.println("\nHasil:");
            System.out.println(add);
            System.out.println(multiply);
        }
    }
}
