import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;
public class KuvvetHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Bir sayı Giriniz :");
        n = input.nextInt();

        // 4' ün kuvvetleri
        for (int i =1; i<n; i*=4){
            System.out.print(i+",");
        }

        // 5' in kuvvetleri
        for (int i =1; i<n; i*=5){
            System.out.print(i+",");
        }


    }
}
