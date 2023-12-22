import java.util.Scanner;

public class AritmetikIslemler {
     public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int a,b,c;
            System.out.print("A sayısını giriniz : ");
            a = input.nextInt();
            System.out.print("B sayısını giriniz : ");
            b = input.nextInt();
            System.out.print("C sayısını giriniz : ");
            c = input.nextInt();
            int islem = (a+b*c-b);
            System.out.print("İşlem sonucu : " + islem);


        }
    }




