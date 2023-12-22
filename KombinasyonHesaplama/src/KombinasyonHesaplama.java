import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        int n,r,i,j,k;
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini Giriniz : ");
        n = input.nextInt();
        System.out.println("R değerini Giriniz : ");
        r = input.nextInt();

        int nfactorial=1;
        int rfactorial=1;
        int factorial=1;

        for (i =1; i<=n; i++) {
            nfactorial = nfactorial *i;
        }
        for (j=1; j<=r; j++){
            rfactorial=rfactorial*j;
        }
        int factorialfark= n-r;
        for (k=1; k<=factorialfark;k++){
            factorial *=k;

        }
        int kombinasyon = nfactorial/(rfactorial*factorial);
        System.out.println(kombinasyon);



    }
}


