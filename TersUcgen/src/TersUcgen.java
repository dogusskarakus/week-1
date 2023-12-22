import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < n - i; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }


    }
}