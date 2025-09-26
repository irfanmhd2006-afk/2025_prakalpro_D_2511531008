package Pekan3;
import java.util.Scanner;

public class Tugas3Prakalpro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double jariJari, tinggi, volume;
        final double phi = 3.14;

        System.out.print("Masukkan jari-jari kerucut: ");
        jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        tinggi = input.nextDouble();
        input.close();

        volume = (1.0 / 3.0) * phi * jariJari * jariJari * tinggi;

        System.out.println("Volume kerucut = " + volume);
    }
}

