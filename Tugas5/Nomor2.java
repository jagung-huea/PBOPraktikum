
package Tugas5;

import java.util.Scanner;

public class Nomor2 {

    public void jalankan(Scanner s) {

        System.out.print("Masukkan Banyak Bilangan: ");
        int banyak = s.nextInt();

        int angka;
        int total = 0;

        if (banyak > 0) {
            for (int i = 1; i <= banyak; i++) {
                System.out.print("Masukkan Bilangan ke-" + i + ": ");
                angka = s.nextInt();

                total = total + angka;
            }

            double rataRata = (double) total / banyak;

            System.out.println("Total Penjumlahan: " + total);
            System.out.println("Rata-rata: " + rataRata);
        } else {
            System.out.println("Banyak Bilangan Harus Lebih dari 0");
        }
    }
}
