
package Tugas5;

import java.util.Scanner;

public class Nomor3 {

    public void jalankan(Scanner s) {

        System.out.print("Masukkan Banyak Baris: ");
        int baris = s.nextInt();

        int angka = 1;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }

            System.out.println();
        }
    }
}
