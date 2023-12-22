import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.print("1. sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            int enBuyuk = sayi;
            int enKucuk = sayi;

            for (int i = 2; i <= n; i++) {
                System.out.print(i + ". sayıyı giriniz: ");
                sayi = scanner.nextInt();

                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }

                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }

            System.out.println("En büyük sayı: " + enBuyuk);
            System.out.println("En küçük sayı: " + enKucuk);
        } else {
            System.out.println("Geçerli bir N sayısı girmelisiniz.");
        }

        scanner.close();
    }
}
