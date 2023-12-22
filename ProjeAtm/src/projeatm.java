import java.util.Scanner;
public class projeatm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usurName, password;
        int balance = 1500;
        System.out.print("Kullanıcı Adını Giriniz :");
        usurName = input.nextLine();
        System.out.print("Parolanız :");
        password = input.nextLine();

        if (usurName.equals("patika") && password.equals("dev123")){
            System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz...");

            System.out.print("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap\n");
            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçin :");
            int select = input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    balance += price;
                    System.out.println("Mevcut Bakiyeniz :"+ balance);
                    break;

                case 2:
                    System.out.print("Para Miktarı :");
                    price = input.nextInt();
                    if (price > balance){
                        System.out.println("bakiye yetersiz");
                    }else {
                        balance -= price;
                    }
                    System.out.println("Mevcut Bakiyeniz :"+ balance);
                    break;
                case 3:
                    System.out.print("Bakiyeniz " + balance);
                    break;

                case 4:
                    System.out.println("Tekrar Görüşmek Üzere...");
                    break;
            }

        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }



    }
}

