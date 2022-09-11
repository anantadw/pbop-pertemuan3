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
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int gaji_pokok = 500000, 
                penjualan, 
                harga_item = 50000, 
                total_jual,
                bonus_jual, 
                total_gaji;
        
        while (true) {
            total_jual = 0;
            total_gaji = 0;
            
            System.out.print("\nJumlah penjualan bulan ini: ");
            penjualan = scanner.nextInt();
            
            total_jual = penjualan * harga_item;
            bonus_jual = total_jual * 10 / 100;
            total_gaji = gaji_pokok + bonus_jual;
            
            if (penjualan > 80) {
                int bonus = total_jual * 35 / 100;
                total_gaji += bonus;
            } else if (penjualan >= 40) {
                int bonus = total_jual * 25 / 100;
                total_gaji += bonus;
            } else if (penjualan < 15) {
                total_gaji = gaji_pokok;
                int denda = (15 * harga_item) - total_jual;
                total_gaji -= denda * 15 / 100;
            }
            
            System.out.println("Total gaji: " + total_gaji);
        }
    }
}
