
package Tugas3;

import java.util.Scanner;

public class Nomor4 {
    public void jalankan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Massa (kg): ");
        double massa = input.nextDouble();
        System.out.print("Kecepatan (m/s): ");
        double kecepatan = input.nextDouble();
        System.out.print("Jari-jari (m): ");
        double jariJari = input.nextDouble();

        if (jariJari > 0) {
            double gaya = massa * kecepatan * kecepatan / jariJari;
            System.out.println("Gaya Sentripetal: " + gaya + " Newton");
        } else {
            System.out.println("Jari-jari harus lebih dari 0.");
        }
    }
}
