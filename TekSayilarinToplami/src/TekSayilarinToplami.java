import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int total =0;

        // Girilen sayının çift ve 4' ün katı olduğunu kontrol ettik.
        do {
            System.out.print("Bir sayı Giriniz :");
            n = input.nextInt();
            if ((n % 2 == 0) && ( n % 4== 0) ){
                 total +=n;
            }
            // Girilen sayı tek olmadığı sürece döngüyü devam ettirdik.
        }while ( n % 2 ==0);
        System.out.println("Toplam "+ total);






    }

}
