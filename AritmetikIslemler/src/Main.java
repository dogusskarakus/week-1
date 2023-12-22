import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam; //Değişkenler tanımlanır.
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5; //Değişken fiyatları girilir.
        Scanner deger = new Scanner(System.in);
        //Tanımlanan kilo miktarları için kullanıcıdan bilgi alınır.
        System.out.print("Armut Kaç Kilo ? :");
        armut = deger.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elma = deger.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domates = deger.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muz = deger.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = deger.nextDouble();

        toplam = (armutFiyat*armut) + (elmaFiyat*elma) + (domatesFiyat*domates)+ (muzFiyat*muz) + (patlicanFiyat*patlican); //Toplam tutar hesabı yapılır.
        System.out.println("Toplam tutar :" + toplam);//Tutar sonucu ekrana yazdırılır.

    }
}