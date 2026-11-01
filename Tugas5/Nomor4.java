
package Tugas5;

import java.util.Scanner;

public class Nomor4 {

    public void jalankan(Scanner s) {

        System.out.print("Masukkan Banyak Angka: ");
        int banyak = s.nextInt();

        int angka = 1;
        int total = 0;

        for (int i = 1; i <= banyak; i++) {
            System.out.print(angka + " ");

            total = total + angka;
            angka = angka + 2;
        }

        System.out.println();
        System.out.println("Total Penjumlahan: " + total);
    }
}
