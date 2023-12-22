import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Matematik, Fizik, Turkce, Kimya, Muzik;
        int avarage= 0, toplam=0 ;


        System.out.print("Matematik Notunuz : ");
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        Fizik= input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        Kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        Muzik = input.nextInt();
        if ( Matematik < 100 && Matematik >0)
        {
            toplam += Matematik;
            avarage++;
        }
        if ( Fizik < 100 && Fizik>0)
        {
            toplam += Fizik;
            avarage++;
        }if ( Turkce < 100 && Turkce >0)
        {
            toplam += Turkce;
            avarage++;
        }if ( Kimya < 100 && Kimya >0)
        {
            toplam += Kimya;
            avarage++;
        }if ( Muzik < 100 && Muzik >0)
        {
            toplam += Muzik;
            avarage++;
        }


        System.out.print("Ortalama: "+(toplam/avarage));


    }
}
