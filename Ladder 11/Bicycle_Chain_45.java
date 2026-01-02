import java.util.Scanner;

public class Bicycle_Chain_45 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] input1 = new int[n];
            for (int i = 0; i < n; i++)
                input1[i] = sc.nextInt();
            int m = sc.nextInt();
            int[] input2 = new int[m];
            for (int i = 0; i < m; i++)
                input2[i] = sc.nextInt();
            int max_ratio = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int a = input1[i];
                    int b = input2[j];
                    int ratio = b / a;
                    if (b == ratio * a) {
                        if (max_ratio < ratio)
                            max_ratio = ratio;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int a = input1[i];
                    int b = input2[j];
                    int ratio = b / a;
                    if (b == ratio * a) {
                        if (ratio == max_ratio) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);

        }

    }

}
