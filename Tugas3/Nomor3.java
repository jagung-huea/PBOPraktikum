
package Tugas3;

import java.util.Scanner;
import java.io.*;

//Scanner bisa  membaca dan langsung mengonversi teks ke berbagai tipe data 
//secara otomatis (misalnya nextInt(), nextDouble(), nextBoolean())

//BufferedReader hanya bisa membaca data String dari readLine(). 
//Jika menggunakan tipe data lain, harus konversi terlebih dahulu secara manual (misalnya Integer.parseInt()
public class Nomor3 {
    public void jalankan() throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SCANNER ===");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Umur: ");
        int umur = Integer.parseInt(input.nextLine());

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("\n=== BUFFEREDREADER ===");
        System.out.print("Nama: ");
        String nama2 = br.readLine();
        System.out.print("Umur: ");
        int umur2 = Integer.parseInt(br.readLine());

        System.out.println("Nama: " + nama2);
        System.out.println("Umur: " + umur2);
    }
}
