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
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String nomor, array[], gabungan;
        
        while (true) {
            System.out.println("\n4 Mobil:");
            nomor = scanner.nextLine();
            array = nomor.split(" ");
            gabungan = array[0] + array[1] + array[2] + array[3];

            double hasil = (Double.parseDouble(gabungan) - 999999) % 5;
            if (hasil == 0) {
                System.out.println("Jalan");
            } else {
                System.out.println("Berhenti");
            }
        }
    }
}
