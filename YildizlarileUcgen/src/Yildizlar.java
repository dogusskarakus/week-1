import java.util.Scanner;
public class Yildizlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println(" Bir sayı giriniz :");
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int k=0; k<(n-i)-1; k++){
                System.out.print(" ");
            }
            for (int j=0; j<(2*i)+1; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        for(int i = n-2; i>=0;i--){
            for (int j = 0; j<(n-i)-1;j++){
                System.out.print(" ");
            }
            for (int k =0; k<(2*i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
