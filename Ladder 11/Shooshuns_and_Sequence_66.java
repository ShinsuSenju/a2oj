import java.util.*;

public class Shooshuns_and_Sequence_66 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
            }
            int target = input[n - 1];
            for (int i = k - 1; i < n; i++) {
                if (input[i] != target) {
                    System.out.println(-1);
                    return;
                }
            }
            int count = 0;
            for (int i = 0; i < k - 1; i++) {
                if (input[i] != target) {
                    count = i + 1;
                }
            }

            System.out.println(count);
        }
    }
}