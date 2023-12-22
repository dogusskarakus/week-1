import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String month;
        int a;
        int day;
        String burc;
        System.out.print("Hangi Ay Doğdunuz : ");
        //month= input.nextLine();
        a = input.nextInt();
        System.out.print("Hangi Gün Doğdunuz : ");
        day = input.nextInt();


      /*  if (month.equals("Ocak") || month.equals("ocak"));{
            if (day >= 1  && day<=31){
                if ( day < 22){
                    System.out.println("burcunuz Oğlak");
                }
                else {
                    System.out.println("burcununuz Kova ");
                }

            }
            else {
                System.out.println("Geçersiz Gün Girdiniz..");
            }
        }*/

        if ( (a == 3 && day>=21) || (a==4 && day<=20))
            System.out.println("Burcunuz : Koç ");
        else if ((a ==1 && day>=22) || (a==2 && day<=19))
            System.out.println("Burcunuz : Kova");
        else if ((a ==2 && day>=20) || (a==3 && day<=20))
            System.out.println("Burcunuz : Balık");
        else if ((a == 4 && day>=21) || (a==5 && day<=21))
            System.out.println("Burcunuz : Boğa");
        else if ((a == 5 && day>=22) || (a==6 && day<=22))
            System.out.println("Burcunuz :  İkizler");
        else if ((a == 6 && day>=23) || (a==7 && day<=22))
            System.out.println("Burcunuz : Yengeç");
        else if ((a == 7 && day>=23) || (a==8 && day<=22))
            System.out.println("Burcunuz : Aslan");
        else if ((a == 8 && day>=23) || (a==9 && day<=22))
            System.out.println("Burcunuz : Başak");
        else if ((a == 9 && day>=23) || (a==10 && day<=22))
            System.out.println("Burcunuz : Terazi");
        else if ((a == 10 && day>=23) || (a==11 && day<=21))
            System.out.println("Burcunuz : Akrep");
        else if ((a == 11 && day>=22) || (a==12 && day<=21))
            System.out.println("Burcunuz : Yay");
        else if ((a == 12 && day>=22) || (a==1 && day<=21))
            System.out.println("Burcunuz : Oğlak");
        else
            System.out.println("gecersizzzz ");
    }
}
