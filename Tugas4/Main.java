
package Tugas4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== LATIHAN STRUKTUR KONTROL ===");
        System.out.println("1. Bilangan Ganjil Genap");
        System.out.println("2. Nama Hari");
        System.out.println("3. Gaji Karyawan");
        System.out.println("4. Tahun Kabisat");
        System.out.println("5. Komisi Salesman");
        System.out.println("6. Kasir Sederhana");
        System.out.println("7. Luas Bangun Datar");

        System.out.print("Pilih Nomor: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                Nomor1 soal1 = new Nomor1();
                soal1.jalankan(input);
                break;

            case 2:
                Nomor2 soal2 = new Nomor2();
                soal2.jalankan(input);
                break;

            case 3:
                Nomor3 soal3 = new Nomor3();
                soal3.jalankan(input);
                break;

            case 4:
                Nomor4 soal4 = new Nomor4();
                soal4.jalankan(input);
                break;

            case 5:
                Nomor5 soal5 = new Nomor5();
                soal5.jalankan(input);
                break;

            case 6:
                Nomor6 soal6 = new Nomor6();
                soal6.jalankan(input);
                break;

            case 7:
                Nomor7 soal7 = new Nomor7();
                soal7.jalankan(input);
                break;

            default:
                System.out.println("Pilihan Tidak Tersedia.");
        }
    }
}

class Nomor1 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== BILANGAN GANJIL GENAP ===");

        System.out.print("Masukkan Bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah Bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah Bilangan Ganjil");
        }
    }
}

class Nomor2 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== MENENTUKAN NAMA HARI ===");

        System.out.print("Masukkan Kode Hari (1-7): ");
        int kodeHari = input.nextInt();

        switch (kodeHari) {
            case 1:
                System.out.println("Hari Senin");
                break;

            case 2:
                System.out.println("Hari Selasa");
                break;

            case 3:
                System.out.println("Hari Rabu");
                break;

            case 4:
                System.out.println("Hari Kamis");
                break;

            case 5:
                System.out.println("Hari Jumat");
                break;

            case 6:
                System.out.println("Hari Sabtu");
                break;

            case 7:
                System.out.println("Hari Minggu");
                break;

            default:
                System.out.println("Kode Hari Tidak Valid");
        }
    }
}

class Nomor3 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== GAJI KARYAWAN ===");

        input.nextLine();

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("\nKode Golongan:");
        System.out.println("1. Menikah - Rp1.200.000");
        System.out.println("2. Belum Menikah - Rp1.500.000");
        System.out.println("3. Cerai - Rp1.750.000");
        System.out.println("4. Menikah dan Punya Anak - Rp2.000.000");

        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();

        input.nextLine();

        System.out.print("Status Pernikahan (Menikah/Belum Menikah/Cerai): ");
        String status = input.nextLine();

        System.out.print("Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        double gajiPokok = 0;

        if (golongan == 1) {
            gajiPokok = 1200000;
        } else if (golongan == 2) {
            gajiPokok = 1500000;
        } else if (golongan == 3) {
            gajiPokok = 1750000;
        } else if (golongan == 4) {
            gajiPokok = 2000000;
        } else {
            System.out.println("Kode Golongan Tidak Valid");
            return;
        }

        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        if (jumlahAnak > 0) {
            tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        }

        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n=== HASIL GAJI KARYAWAN ===");
        System.out.println("NIK               : " + nik);
        System.out.println("Nama              : " + nama);
        System.out.println("Golongan          : " + golongan);
        System.out.println("Status Pernikahan : " + status);
        System.out.println("Jumlah Anak       : " + jumlahAnak);
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan);
        System.out.println("Tunjangan Anak    : Rp " + tunjanganAnak);
        System.out.println("Total Tunjangan   : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih       : Rp " + gajiBersih);
    }
}

class Nomor4 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== MENENTUKAN TAHUN KABISAT ===");

        System.out.print("Masukkan Tahun: ");
        int tahun = input.nextInt();

        if (tahun % 400 == 0) {
            System.out.println(tahun + " adalah Tahun Kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " bukan Tahun Kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah Tahun Kabisat");
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat");
        }
    }
}

class Nomor5 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== KOMISI SALESMAN ===");

        System.out.print("Masukkan Pendapatan Penjualan: Rp ");
        double penjualan = input.nextDouble();

        double uangJasa = 0;
        double komisi = 0;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;

        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;

        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double totalPendapatan = uangJasa + komisi;

        System.out.println("\n=== HASIL KOMISI ===");
        System.out.println("Penjualan       : Rp " + penjualan);
        System.out.println("Uang Jasa       : Rp " + uangJasa);
        System.out.println("Komisi          : Rp " + komisi);
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}

class Nomor6 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== KASIR SEDERHANA ===");

        System.out.print("Memiliki Kartu Member? (ya/tidak): ");
        String member = input.next();

        System.out.print("Masukkan Total Belanja: Rp ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {

            if (totalBelanja > 500000) {
                diskon = 50000;

            } else if (totalBelanja > 100000) {
                diskon = 15000;

            } else {
                diskon = 0;
            }

        } else {

            if (totalBelanja > 100000) {
                diskon = 10000;

            } else {
                diskon = 0;
            }
        }

        double totalBayar = totalBelanja - diskon;

        System.out.print("Masukkan Uang Pembayaran: Rp ");
        double uangBayar = input.nextDouble();

        double kembalian = uangBayar - totalBayar;

        System.out.println("\n=== STRUK PEMBELANJAAN ===");
        System.out.println("Status Member : " + member);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("Uang Diberikan: Rp " + uangBayar);

        if (uangBayar >= totalBayar) {
            System.out.println("Kembalian     : Rp " + kembalian);
        } else {
            System.out.println("Uang Tidak Mencukupi");
            System.out.println("Kekurangan    : Rp " + (totalBayar - uangBayar));
        }
    }
}

class Nomor7 {

    public void jalankan(Scanner input) {

        System.out.println("\n=== LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");

        System.out.print("Pilih Bangun Datar (1-5): ");
        int pilihan = input.nextInt();

        double luas = 0;

        switch (pilihan) {

            case 1:
                System.out.println("\n=== LUAS PERSEGI ===");

                System.out.print("Masukkan Sisi: ");
                double sisi = input.nextDouble();

                luas = sisi * sisi;
                break;

            case 2:
                System.out.println("\n=== LUAS SEGITIGA ===");

                System.out.print("Masukkan Alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan Tinggi: ");
                double tinggi = input.nextDouble();

                luas = 0.5 * alas * tinggi;
                break;

            case 3:
                System.out.println("\n=== LUAS LINGKARAN ===");

                System.out.print("Masukkan Jari-jari: ");
                double jariJari = input.nextDouble();

                luas = 3.14 * jariJari * jariJari;
                break;

            case 4:
                System.out.println("\n=== LUAS TRAPESIUM ===");

                System.out.print("Masukkan Sisi Atas: ");
                double sisiAtas = input.nextDouble();

                System.out.print("Masukkan Sisi Bawah: ");
                double sisiBawah = input.nextDouble();

                System.out.print("Masukkan Tinggi: ");
                double tinggiTrapesium = input.nextDouble();

                luas = 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
                break;

            case 5:
                System.out.println("\n=== LUAS LAYANG-LAYANG ===");

                System.out.print("Masukkan Diagonal 1: ");
                double diagonal1 = input.nextDouble();

                System.out.print("Masukkan Diagonal 2: ");
                double diagonal2 = input.nextDouble();

                luas = 0.5 * diagonal1 * diagonal2;
                break;

            default:
                System.out.println("Pilihan Tidak Valid");
                return;
        }

        System.out.println("Luas Bangun Datar: " + luas);
    }
}
