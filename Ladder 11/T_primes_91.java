import java.util.*;

public class T_primes_91 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long[] input = new long[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextLong();
            }

            int limit = 1000000;
            boolean[] isPrime = new boolean[limit + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;
            for (int i = 2; i * i <= limit; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= limit; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (long x : input) {
                long root = (long) Math.sqrt(x);
                if (root * root == x && isPrime[(int) root]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}