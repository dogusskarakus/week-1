import java.util.Scanner;
public class KdvHesaplama{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price ;
        double kdvorani =0.18 ;
        double kdvprice;
        System.out.println("Lütfen Bir Tutar Giriniz: ");
        price = input.nextInt();
        if (price > 0 && price <1000 ){
            kdvprice = price+(price*kdvorani);
            System.out.println("Kdv'li fiyat : "+ kdvprice);
        }
        else {
            kdvorani = 0.08;
            kdvprice = price+(price*kdvorani);
            System.out.println("Kdv'li fiyat :"+ kdvprice);

        }


    }

}