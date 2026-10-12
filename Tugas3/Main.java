
package Tugas3;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== LATIHAN PRAKTIKUM ===");
            System.out.println("1. Gaji Bersih");
            System.out.println("2. Pembelanjaan");
            System.out.println("3. Scanner dan BufferedReader");
            System.out.println("4. Gaya Sentripetal");
            System.out.println("5. Pembelian Buah");
            System.out.println("6. Selisih Waktu");
            System.out.println("7. Waktu Cetak Novel");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1:
                    Nomor1 soal1 = new Nomor1();
                    soal1.jalankan();
                    break;
                case 2:
                    Nomor2 soal2 = new Nomor2();
                    soal2.jalankan();
                    break;
                case 3:
                    Nomor3 soal3 = new Nomor3();
                    soal3.jalankan();
                    break;
                case 4:
                    Nomor4 soal4 = new Nomor4();
                    soal4.jalankan();
                    break;
                case 5:
                    Nomor5 soal5 = new Nomor5();
                    soal5.jalankan();
                    break;
                case 6:
                    Nomor6 soal6 = new Nomor6();
                    soal6.jalankan();
                    break;
                case 7:
                    Nomor7 soal7 = new Nomor7();
                    soal7.jalankan();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 0);
    }
}
