
package Tugas5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=== LATIHAN PRAKTIKUM PERULANGAN ===");
        System.out.println("1. Bilangan Terbesar dan Terkecil");
        System.out.println("2. Penjumlahan dan Rata-rata");
        System.out.println("3. Floyd's Triangle");
        System.out.println("4. Penjumlahan Bilangan Ganjil");
        System.out.println("5. Half dan Full Triangle");
        System.out.println("6. Menampilkan Angka 11");
        System.out.println("7. Perbedaan i++ dan ++i");
        System.out.println("8. Perulangan Foreach");

        System.out.print("Pilih Nomor: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                Nomor1 soal1 = new Nomor1();
                soal1.jalankan(s);
                break;

            case 2:
                Nomor2 soal2 = new Nomor2();
                soal2.jalankan(s);
                break;

            case 3:
                Nomor3 soal3 = new Nomor3();
                soal3.jalankan(s);
                break;

            case 4:
                Nomor4 soal4 = new Nomor4();
                soal4.jalankan(s);
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

            case 8:
                Nomor8 soal8 = new Nomor8();
                soal8.jalankan();
                break;

            default:
                System.out.println("Pilihan Tidak Tersedia");
        }
    }
}
