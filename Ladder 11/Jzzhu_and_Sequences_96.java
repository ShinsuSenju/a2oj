import java.util.Scanner;

public class Jzzhu_and_Sequences_96 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long n = sc.nextInt();
            long mod = 1000000007;
            n = n % 6;
            long ans = 0;
            if (n == 1)
                ans = x;
            else if (n == 2)
                ans = y;

            else if (n == 3)
                ans = y - x;

            else if (n == 4)
                ans = -x;

            else if (n == 5)
                ans = -y;

            else
                ans = x - y;

            ans = ((ans % mod) + mod) % mod;
            System.out.println(ans);
        }

    }

}
