import java.util.*;

public class A_TL_76 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] correct = new int[n];
            int[] wrong = new int[m];
            for (int i = 0; i < n; i++)
                correct[i] = sc.nextInt();
            for (int i = 0; i < m; i++)
                wrong[i] = sc.nextInt();
            int maxPass = Arrays.stream(correct).max().getAsInt();
            int minWrong = Arrays.stream(wrong).min().getAsInt();

            for (int i = maxPass; i < minWrong; i++) {
                for (int j = 0; j < n; j++) {
                    if (2 * correct[j] <= i) {
                        System.out.println(i);
                        return;
                    }
                }

            }
        }
        System.out.println(-1);

    }

}
