
package Tugas3;

import java.util.Scanner;

public class Nomor1 {

    String nik, nama, alamat, jabatan;
    double gajiPokok, tunjanganJabatan, tunjanganIstri, tunjanganAnak;
    double totalGaji, pajak, gajiBersih;

    Scanner input = new Scanner(System.in);

    public void inputData() {
        System.out.println("=== DATA KARYAWAN ===");

        System.out.print("Nomor Induk Karyawan: ");
        nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("Jabatan: ");
        jabatan = input.nextLine();

        System.out.print("Gaji Pokok: Rp ");
        gajiPokok = input.nextDouble();

        System.out.print("Tunjangan Jabatan: Rp ");
        tunjanganJabatan = input.nextDouble();

        System.out.print("Tunjangan Istri: Rp ");
        tunjanganIstri = input.nextDouble();

        System.out.print("Tunjangan Anak: Rp ");
        tunjanganAnak = input.nextDouble();
    }

    public void hitungTotalGaji() {
        totalGaji = gajiPokok + tunjanganJabatan
                + tunjanganIstri + tunjanganAnak;
    }

    public void hitungGajiBersih() {
        pajak = 0.10 * (gajiPokok + tunjanganJabatan + tunjanganIstri);
        gajiBersih = totalGaji - pajak;
    }

    public void tampilkanHasil() {
        System.out.println("\n=== SLIP GAJI KARYAWAN ===");
        System.out.println("NIK               : " + nik);
        System.out.println("Nama              : " + nama);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Jabatan           : " + jabatan);
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Tunjangan Jabatan : Rp " + tunjanganJabatan);
        System.out.println("Tunjangan Istri   : Rp " + tunjanganIstri);
        System.out.println("Tunjangan Anak    : Rp " + tunjanganAnak);
        System.out.println("Total Gaji        : Rp " + totalGaji);
        System.out.println("Pajak (10%)       : Rp " + pajak);
        System.out.println("Gaji Bersih       : Rp " + gajiBersih);
    }

    public void jalankan() {
        inputData();
        hitungTotalGaji();
        hitungGajiBersih();
        tampilkanHasil();
    }
}
