import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, result;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = inp.nextInt();
        result = year % 4;//Artık yıl hesabı yapılır.
        if (year > 0) {//Sıfırdan büyük değer kontrolü yapılır.
            if (result==0 ){
                if((year%100==0) && (year%400!=0)){//100'ün tam katı olup 400'e bölünemeyen sayılar bulunur.
                    System.out.print(year+" bir artık yıl değildir.");
                }else{
                    System.out.print(year+" bir artık yıldır");
                }
            }else{
                System.out.print(year+" bir artık yıl değildir.");
            }
        }
    }
}