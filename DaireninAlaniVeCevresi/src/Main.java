/*
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yarıçapı ve merkez açısının ölçüsünü al
        System.out.print("Daire diliminin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        System.out.print("Daire diliminin merkez açısının ölçüsünü girin (derece): ");
        double merkezAci = scanner.nextDouble();

        // Merkez açısını radyan cinsine çevir
        double merkezAciRadyan = Math.toRadians(merkezAci);

        // Daire dilimi alanını hesapla
        double alan = (yaricap * yaricap * merkezAciRadyan) / 2;

        // Sonucu ekrana yazdır
        System.out.println("Daire diliminin alanı: " + alan);

        // Scanner'ı kapat
        scanner.close();
    }
}
