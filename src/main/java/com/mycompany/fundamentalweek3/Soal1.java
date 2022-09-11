/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fundamentalweek3;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Soal1 {
    public static void main(String[] args) {
        String s, ss[];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word: ");
        s = scanner.nextLine();
        scanner.close();
        
        ss = s.split("[!,?._'@ ]");
        
        System.out.println(ss.length);
        for (String data: ss) {
            System.out.println(data);
        }
    }
}
