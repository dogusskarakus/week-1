import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double aci;
        double pi = 3.14;
        System.out.print("Lütfen Yarı Çapını Giriniz : ");
        r = input.nextInt();

        System.out.print("Lütfen Merkez Açısını Giriniz : ");
        aci = input.nextInt();

        double cevre = (2*pi*r);
        double alan = (pi*(r*r)*aci)/ 360;
        System.out.println("Dairenin Çevresi   : "+ cevre);
        System.out.println("Dairenin Alani   : " + alan);



    }
}
