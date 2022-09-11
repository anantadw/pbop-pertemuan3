/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.fundamentalweek3;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s[] = new String[3];
        int x[] = new int[3];
        
        System.out.println("Input:");
        for (int i = 0; i < 3; i++) {
            s[i] = scanner.next();
            x[i] = scanner.nextInt();
        }
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", s[i], x[i]);
        }
        System.out.println("================================");
    }
}
