import java.util.Scanner;

public class Cut_Ribbon_87 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int maxPieces = 0;
            for (int i = 0; i * a <= n; i++) {
                for (int j = 0; j * b <= n; j++) {
                    int remaining = n - (i * a + j * b);
                    if (remaining >= 0 && remaining % c == 0) {
                        int k = remaining / c;
                        maxPieces = Math.max(maxPieces, i + j + k);
                    }
                }
            }

            System.out.println(maxPieces);
        }
    }
}