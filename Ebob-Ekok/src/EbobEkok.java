import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz :");
        int n = input.nextInt();
        System.out.print("İkinci sayıyı Giriniz : ");
        int k = input.nextInt();

        int ekok =1;
        int j =1;
        int i =1;

        while (j<=(n*k)){
            if (j%n == 0 && j%k ==0){
                ekok = j;
                System.out.println("Ekok : " + ekok);
                break;
            }
            j++;
        }
        int ebob = 1;
        if (n > k) {
            while (i <= k){
                if (n % i == 0 && k % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        if (n < k) {
            while (i <= n) {
                if (n % i == 0 && k % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Ebob : " + ebob);


    }
}

