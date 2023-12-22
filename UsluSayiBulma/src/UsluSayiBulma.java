import java.util.Scanner;
public class UsluSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        int sayac=1;

        System.out.println("Üssü alınacak sayı : ");
        n= input.nextInt();
        System.out.println("Üs olacal sayı : ");
        k= input.nextInt();

        // İ değerini k değeri kadar döndürdük. n değerini sayac
        // değişkenini ile çarpıp sayac değişkeninde topladık.

        for (int i =1; i<=k;i++){
            sayac *=n;
        }
        System.out.println(sayac);



    }
}
