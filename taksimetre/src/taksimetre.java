import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double a = 2.20;
        int b = 10;
        int km ;
        System.out.print("Mesafeyi Km olarak giriniz : ");

        km = input.nextInt();
        double ucret = b+(km*a);

        if (ucret < 20 ){
            ucret = 20;
            System.out.println(" Ücretiniz : "+ ucret);
        }
        else {
            System.out.println("Ücretiniz : "+ ucret);
        }
        double tutar;
        System.out.print("verilen tutar : ");
        tutar = input.nextDouble();
        double paraustu;
        paraustu = tutar-ucret;
        System.out.println("Para üstünüz : " + paraustu);



    }

}
