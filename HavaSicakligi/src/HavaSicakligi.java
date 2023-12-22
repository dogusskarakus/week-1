import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Sıcaklık Değeri İstedik
        int heat;
        System.out.println("Sıcaklık Değeri Giriniz :");
        heat = input.nextInt();

        // İf-else yardımıyla Heat değerine göre Kullanıcıya Çıktı verdik.
        if (heat < 5) {
            System.out.println("kayak yapabilirsin");
        }

        else if (heat > 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsin tek gitme ama");
        }

        else if (heat > 15 && heat < 25) {

            if (heat > 17 && heat < 19) {
                System.out.println("Deniz Kenarı piknik ");
            }
            if (heat > 20 && heat < 25) {
                System.out.println("Ormanda piknik yapabilirsin çöpünü topla");

            }
        }

        else if (heat > 25 && heat <= 60) {
            if (heat > 25 && heat <= 40) {
                System.out.println("Yüzmeye Gidebilirsin");
            }
            if (heat >= 40 && heat < 50) {
                System.out.println("Yana Yana Yüzersin");
            }
        }


    }
}