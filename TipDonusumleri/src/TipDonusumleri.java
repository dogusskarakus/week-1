import java.util.Scanner;
public class TipDonusumleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        double b;

        System.out.print("Lütfen Bir Tam Sayı Giriniz :");
        a = input.nextInt();
        System.out.print("Lütfen Ondalık Bir Sayı Giriniz :");
        b = input.nextDouble();

        int sayiInt = (int) b;
        double sayiDouble = a;
        System.out.println("Tam sayı :" + sayiInt);
        System.out.println("Ondalık sayı :" + sayiDouble);
    }
}
