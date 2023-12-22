import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı Giriniz : ");
        int sayi = input.nextInt();
        int toplam = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.println("Basamaklarının toplamı: " + toplam);

        input.close();
    }
}
