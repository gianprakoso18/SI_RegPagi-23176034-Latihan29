/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan29;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;

public class Latihan29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan warna
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        // Input warna favorit
        System.out.print("Pilih Warna Favoritmu: ");
        String warnaFavorit = scanner.nextLine();

        // Input nama pengguna
        System.out.print("Nama Kamu: ");
        String nama = scanner.nextLine();

        // Menampilkan hasil kepribadian
        System.out.println("\n==== HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + " ====");
        switch (warnaFavorit.toUpperCase()) {
            case "MERAH":
                System.out.println("Warna Favoritmu adalah MERAH");
                System.out.println("1. Berani,");
                System.out.println("2. Penuh energi,");
                System.out.println("3. Ekspresif.");
                break;
            case "HIJAU":
                System.out.println("Warna Favoritmu adalah HIJAU");
                System.out.println("1. Seimbang,");
                System.out.println("2. Menyegarkan,");
                System.out.println("3. Ramah.");
                break;
            case "KUNING":
                System.out.println("Warna Favoritmu adalah KUNING");
                System.out.println("1. Ceria,");
                System.out.println("2. Optimis,");
                System.out.println("3. Kreatif.");
                break;
            case "BIRU":
                System.out.println("Warna Favoritmu adalah BIRU");
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Dinamis.");
                break;
            case "UNGU":
                System.out.println("Warna Favoritmu adalah UNGU");
                System.out.println("1. Kreatif,");
                System.out.println("2. Penuh imajinasi,");
                System.out.println("3. Memikat.");
                break;
            default:
                System.out.println("Warna tidak dikenali.");
                break;
        }

        scanner.close();
    }
}