import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("Bir sayı Giriniz : ");
        a = input.nextInt();

            int birler = a % 10;
            a /= 10;

            int onlar = a % 10;
            a /= 10;

            int yuzler = a % 10;
            int toplam = birler+onlar+yuzler;

            System.out.println("birler basamağı " + birler);
            System.out.println("Onlar basamağı " + onlar);
            System.out.println("Yüzler basamağı " + yuzler);
            System.out.println("Basamak Toplamı : "+ toplam);




    }
}
