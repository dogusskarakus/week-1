import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,yas,yol_tip;
        double ucret=0;

        //Kullanıcıdan veri aldık.

        System.out.print("Mesafeyi Km Olarak Giriniz :");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz 1=> Tek yön , 2 => Gidiş Dönüş : ");
        yol_tip = input.nextInt();

        //Kullanıcının yaş ve yol tipine göre ücretini hesapladık.

        if (yas > 0 && km > 0 && (yol_tip == 1 || yol_tip==2)) {
            ucret = km * 0.10;

            if (yas < 12) {
                ucret = (ucret - (ucret * 0.5));

            }
            else if (yas >= 12 && yas <= 24) {
                ucret = (ucret - (ucret * 0.1));

            }
            else if (yas >= 65) {
                ucret = (ucret - (ucret * 0.3));
            }

            if (yol_tip == 2) {
                ucret = (ucret - (ucret * 0.2)) * 2;
            }
            System.out.print("Toplam Tutar: " + ucret + "TL");
        }
        else
            System.out.print("Hatalı Veri Girdiniz...");







    }
}
