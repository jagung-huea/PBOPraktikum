
package Tugas3;

import java.io.*;
import java.util.Scanner;

public class Nomor2 {
    public void jalankan() throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(input.nextLine());
        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.nextLine());
        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(input.nextLine());

        double potongan = totalBelanja * diskon / 100;
        double total = totalBelanja - potongan;
        double kembalian = bayar - total;

        DataOutputStream output = new DataOutputStream(
                new FileOutputStream("belanja.dat"));

        output.writeUTF(nama);
        output.writeDouble(totalBelanja);
        output.writeDouble(diskon);
        output.writeDouble(total);
        output.writeDouble(bayar);
        output.writeDouble(kembalian);
        output.close();

        DataInputStream data = new DataInputStream(
                new FileInputStream("belanja.dat"));

        System.out.println("\n=== HASIL BELANJA ===");
        System.out.println("Nama: " + data.readUTF());
        System.out.println("Total Belanja: " + data.readDouble());
        System.out.println("Diskon (%): " + data.readDouble());
        System.out.println("Total: " + data.readDouble());
        System.out.println("Bayar: " + data.readDouble());
        System.out.println("Kembalian: " + data.readDouble());

        data.close();
    }
}
