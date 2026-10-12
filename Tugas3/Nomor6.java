
package Tugas3;

import java.util.Scanner;

public class Nomor6 {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== WAKTU PERTAMA ===");
        System.out.print("Jam: ");
        int jam1 = input.nextInt();
        System.out.print("Menit: ");
        int menit1 = input.nextInt();
        System.out.print("Detik: ");
        int detik1 = input.nextInt();

        System.out.println("\n=== WAKTU KEDUA ===");
        System.out.print("Jam: ");
        int jam2 = input.nextInt();
        System.out.print("Menit: ");
        int menit2 = input.nextInt();
        System.out.print("Detik: ");
        int detik2 = input.nextInt();

        int waktu1 = jam1 * 3600 + menit1 * 60 + detik1;
        int waktu2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(waktu2 - waktu1);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println("\n=== SELISIH WAKTU ===");
        System.out.println(jam + " Jam "
                + menit + " Menit "
                + detik + " Detik");
    }
}
