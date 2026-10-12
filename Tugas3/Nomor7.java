
package Tugas3;

import java.util.Scanner;

public class Nomor7 {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PERCETAKAN NOVEL ===");

        System.out.print("Jumlah Novel: ");
        long novel = input.nextLong();

        System.out.print("Jumlah Lembar per Novel: ");
        long lembar = input.nextLong();

        // Mesin mencetak 1 lembar per detik
        long totalLembar = novel * lembar;
        long totalDetik = totalLembar;

        long hari = totalDetik / 86400;
        long jam = (totalDetik % 86400) / 3600;
        long menit = (totalDetik % 3600) / 60;
        long detik = totalDetik % 60;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah Novel: " + novel);
        System.out.println("Lembar per Novel: " + lembar);
        System.out.println("Total Lembar: " + totalLembar);
        System.out.println("Total Detik: " + totalDetik);

        System.out.println("Waktu Percetakan: ");
        System.out.println(hari + " Hari "
                + jam + " Jam "
                + menit + " Menit "
                + detik + " Detik");
    }
}
