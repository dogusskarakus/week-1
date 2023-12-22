import java.text.DecimalFormat;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.37, domates = 1.11, muz = 0.95, patlican = 5.00;
        double a,b,c,d,e;
        System.out.print("Armut kaç kilo : ");
        a = input.nextDouble();
        System.out.print("Elma kaç kilo : ");
        b= input.nextDouble();
        System.out.print("Domates kaç kilo : ");
        c = input.nextDouble();
        System.out.print("Muz kaç kilo : ");
        d = input.nextDouble();
        System.out.print("Patlıcan kaç kilo : ");
        e = input.nextDouble();

        double tutar= (armut*a) + (elma*b)+ (domates*c)+ (muz*d) + (patlican*e);
        System.out.println("Toplam Tutar : " + tutar);

    }
}
