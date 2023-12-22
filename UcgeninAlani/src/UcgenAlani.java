import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        double c;
        System.out.print("a kenar uzunluğu giriniz : ");
        a = input.nextInt();
        System.out.print("b kenar uzunluğu giriniz : ");
        b = input.nextInt();
        System.out.print("c kenar uzunluğu giriniz  : ");
        c = input.nextInt();
        double u = (a+b+c)/2;
        double cevre = (2*u);
        double alan = (u*(u-a)* (u-b)* (u-c));
        System.out.println("Alanı  : " + alan );
        System.out.println("Çevresi  : "+ cevre);



      /*  c = (a*a) + (b*b);
        c = Math.sqrt(c);
        System.out.println("hipotenüs : " + c);*/

    }
}
