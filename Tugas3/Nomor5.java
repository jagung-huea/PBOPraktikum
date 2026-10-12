
package Tugas3;

import java.io.*;

public class Nomor5 {

    int mangga;
    int tetangga;
    int jambuPerTetangga;
    int manggaBusuk;
    int totalJambu;
    int totalBuah;
    int totalSetelahPengembalian;

    public void inputData() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("=== PEMBELIAN BUAH ===");

        System.out.print("Jumlah Mangga Dibeli: ");
        mangga = Integer.parseInt(br.readLine());

        System.out.print("Jumlah Tetangga: ");
        tetangga = Integer.parseInt(br.readLine());

        System.out.print("Jumlah Jambu per Tetangga: ");
        jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Jumlah Mangga Busuk: ");
        manggaBusuk = Integer.parseInt(br.readLine());
    }

    public void hitungBuah() {
        totalJambu = tetangga * jambuPerTetangga;
        totalBuah = mangga + totalJambu;
        totalSetelahPengembalian = totalBuah - manggaBusuk;
    }

    public void Hasil() {
        System.out.println("\n=== HASIL PEMBELIAN ===");
        System.out.println("Jumlah Mangga: " + mangga);
        System.out.println("Jumlah Jambu: " + totalJambu);
        System.out.println("Total Buah Dibeli: " + totalBuah);
        System.out.println("Mangga Dikembalikan: " + manggaBusuk);
        System.out.println("Total Setelah Pengembalian: "
                + totalSetelahPengembalian);
    }

    public void jalankan() throws IOException {
        inputData();
        hitungBuah();
        Hasil();
    }
}
