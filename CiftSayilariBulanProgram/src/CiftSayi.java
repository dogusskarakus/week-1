import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int  sayac =0;
        int toplam =0;
        System.out.println("Bir sayı Giriniz :");
        a = input.nextInt();

        // For kullanarak n kadar sayıya kadar i değerini döndürdük.

        for (int i=1; i<=a; i++){

            // koşulun sağladığı durumlarda yapılması gereken işlemleri belirttik

            if ( (i % 3 == 0) && (i % 4==0) ) {
                toplam +=i;
                sayac++;
            }

        }
        if (sayac >0 )
        System.out.println("Ortalama " +toplam/sayac);
        else
            System.out.println("Hatalı Değer Girdiniz");


    }
}
