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
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String s, array[];
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nInput");
            s = scanner.nextLine();
            
            array = s.split(" ");
            
            int value1 = Integer.parseInt(array[0]);
            int value2 = Integer.parseInt(array[2]);
            int result = 0;
            
            if (value1 > 1000 || value2 > 1000 || value1 < 1 || value2 < 1) {
                System.out.println("Nilai 1 <= A, B <= 1000");
                continue;
            }
            
            switch(array[1]) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                case "/":
                    result = value1 / value2;
                    break;
                case "%":
                    result = value1 % value2;
                    break;
                default:
                    System.out.println("Operator salah");
            }
            
            System.out.println(result);
        }
    }
}
