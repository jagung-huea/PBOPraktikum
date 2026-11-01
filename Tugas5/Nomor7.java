
package Tugas5;

public class Nomor7 {
    public void jalankan() {
        int i = 0;
        System.out.println("Menggunakan i++:");
        while (i < 5) {
            System.out.print(i++ + " ");
        }
        i = 0;
        System.out.println("\nMenggunakan ++i:");
        while (i < 5) {
            System.out.print(++i + " ");
        }
        System.out.println();
    }
}
