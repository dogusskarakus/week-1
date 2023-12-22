import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcı adı ve Şifre Bilgilerini İstedik.

        System.out.println("Kullanıcı Adını Giriniz : ");
        String username = input.nextLine();

        System.out.println("Lütfen Şifre Giriniz : ");
        String password = input.nextLine();

        // username ve password bilgilerini kontrol ettik.

        if (username.equals("dogus") && password.equals("123"))
        {
            System.out.println("Başarılıyla Giriş Yaptınız!");
        }

        //Hatalı Şifre Kontrolü yaptık.

        else {
            System.out.println("Şifre yanlış şifreni sıfırlamak istiyor musun?\n Evet / Hayır");
            String select = input.nextLine();

            //  Kullanıcının tercihine göre Yeni Şifre oluşturduk.

            if (select.equals("Evet") || select.equals("evet"))
            {
                System.out.println("Yeni Şİfre Giriniz :");
                String NewPassword = input.nextLine();

                // Yeni şifrenin Eski şifre ile aynı olup olmaması kontrol edildi.

                if (NewPassword.equals("123"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }

                else
                {
                    System.out.println("Başarıyla değiştirilmiştir.");
                }
            }

            else if (select.equals("Hayır") || select.equals("hayır"))
            {
                System.out.println("Şifreniz Değiştirilmedi");
            }
            else
            {
                System.out.println("İyi günler");
            }


            }

    }
}
