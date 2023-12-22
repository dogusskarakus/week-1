import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m, kg, indeks;

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = input.nextDouble();
        indeks = (kg / (m*m));
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);

    }
}
