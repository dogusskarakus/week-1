import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogum_tarih;
        int zod;
        System.out.print("Doğum Tarihinizi Giriniz : ");
        dogum_tarih = input.nextInt();

        zod = dogum_tarih%12;

        switch (zod){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : at");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : koyun");
                break;



        }



    }
}
