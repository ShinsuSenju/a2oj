import java.util.Arrays;
import java.util.Scanner;

public class Sale_46 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++)
                input[i] = sc.nextInt();
            int saved = 0;
            Arrays.sort(input);
            for (int i = 0; i < m; i++) {
                int prev = saved;
                if (input[i] < 0) {
                    saved += Math.abs(input[i]);
                } else
                    saved -= input[i];
                if (prev > saved) {
                    saved = prev;
                    break;
                }
            }
            System.out.println(saved);

        }
    }

}
