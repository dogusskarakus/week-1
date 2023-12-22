import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int number = input.nextInt();
        double harmonik = 0;
        for (double i = 1;i<=number; i++){
            harmonik +=  (1/i);
        }
        System.out.println(harmonik);

    }
}
