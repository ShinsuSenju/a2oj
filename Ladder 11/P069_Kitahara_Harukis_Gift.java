import java.util.Scanner;

public class P069_Kitahara_Harukis_Gift {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count100 = 0, count200 = 0;
            for (int i = 0; i < n; i++) {
                int coin = sc.nextInt();
                if (coin == 100)
                    count100++;
                else
                    count200++;
            }

            int total = count100 * 100 + count200 * 200;
            if (total % 200 != 0) {
                System.out.println("NO");
                return;
            }

            int half = total / 2;
            int use200 = Math.min(count200, half / 200);
            half -= use200 * 200;

            if (half <= count100 * 100 && half % 100 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}