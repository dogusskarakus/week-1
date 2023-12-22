import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan hesaplamada kullanmak için sayı isteğinde bulunuyoruz.

        int numberOne, numberTwo, result;
        System.out.print("İlk sayıyı Giriniz : ");
        numberOne = input.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        numberTwo = input.nextInt();

        //Kullanıcıdan İşlem Tercihi Yapmasını istedik.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi Seçin : ");
        result = input.nextInt();


        // Switch case kullanarak inputların matematiksel işlemlerini yaptırdık.
        switch (result){
            case 1:
                System.out.println("İşlemin sonucu = " + (numberOne+numberTwo));
                break;

            case 2:
                System.out.println("İşlemin sonucu = " + (numberOne-numberTwo));
                break;
            case 3:
                System.out.println("İşlemin sonucu = " + (numberOne*numberTwo));
                break;
            case 4:
                if(numberTwo !=0){
                System.out.println("İşlemin sonucu = " + (numberOne/numberTwo));}
                else{
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Hatalı işlem");
                break;
        }








    }
}
