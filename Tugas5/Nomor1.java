
package Tugas5;

import java.util.Scanner;

public class Nomor1 {

    public void jalankan(Scanner s) {

        int angka;
        int terbesar = 0;
        int terkecil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Bilangan ke-" + i + ": ");
            angka = s.nextInt();

            if (i == 1) {
                terbesar = angka;
                terkecil = angka;
            } else {
                if (angka > terbesar) {
                    terbesar = angka;
                }

                if (angka < terkecil) {
                    terkecil = angka;
                }
            }
        }

        System.out.println("Bilangan Terbesar: " + terbesar);
        System.out.println("Bilangan Terkecil: " + terkecil);
    }
}
