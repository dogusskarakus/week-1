import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int fibonacci;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i=3 ; i<=n; i++){
            fibonacci = a+b;
            b = fibonacci;
            System.out.print(fibonacci + " ");

            a = b;
            b = fibonacci;

        }
    }
}
