import java.util.Scanner;

public class P093_Flipping_Game {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] input = new int[n];

            int ones = 0;
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
                if (input[i] == 1)
                    ones++;
            }

            int sum = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int x = (input[i] == 0 ? 1 : -1);

                sum += x;
                if (sum > maxSum)
                    maxSum = sum;
                if (sum < 0)
                    sum = 0;
            }

            if (ones == n) {
                System.out.println(n - 1);
            } else {
                System.out.println(ones + maxSum);
            }
        }
    }
}