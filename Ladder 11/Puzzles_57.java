import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_57 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] input = new int[m];
            for (int i = 0; i < m; i++)
                input[i] = sc.nextInt();
            Arrays.sort(input);

            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i <= m - n; i++) {
                int diff = input[i + n - 1] - input[i];
                minDiff = Math.min(minDiff, diff);
            }
            System.out.println(minDiff);
        }

    }

}
