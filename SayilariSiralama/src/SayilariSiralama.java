import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Karşılaştırmak için sayı girişi istedik.
        int a,b,c ;
        System.out.print("1. sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("2. sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.print("3. sayıyı Giriniz : ");
        c = input.nextInt();

        // a değeri için kontrol sağladık.

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }

        // b değeri için kontrol sağladık

        else if ((b<a) && (b<c)) {
            if (a<c){
                System.out.println(" b < a < c");
            } else {
                System.out.println(" b < c < a");
            }
        }

        // c değeri için kontrol sağladık
        else {
            if (a<b){
            System.out.println(" c < a < b");
            } else {
                System.out.println(" c < b < a");
            }
        }


    }
}
