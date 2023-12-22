public class AsalSayi {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            boolean asal = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(n + " ");
            }
        }
    }
}
