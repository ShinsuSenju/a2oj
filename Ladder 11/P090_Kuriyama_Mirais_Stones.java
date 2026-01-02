import java.util.Arrays;
import java.util.Scanner;

public class P090_Kuriyama_Mirais_Stones {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long[] input = new long[n];
            for (int i = 0; i < n; i++)
                input[i] = sc.nextLong();
            int t = sc.nextInt();
            long[] arr = input.clone();
            Arrays.sort(arr);
            long[] preInputSum = new long[n];
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    preInputSum[0] = input[0];
                else
                    preInputSum[i] = input[i] + preInputSum[i - 1];
            }
            long[] preArrSum = new long[n];
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    preArrSum[0] = arr[0];
                else
                    preArrSum[i] = arr[i] + preArrSum[i - 1];
            }
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int type = sc.nextInt();
                int left = sc.nextInt() - 1;
                int right = sc.nextInt() - 1;

                long sum = 0;
                if (type == 1) {
                    sum = preInputSum[right] - (left > 0 ? preInputSum[left - 1] : 0);
                } else {
                    sum = preArrSum[right] - (left > 0 ? preArrSum[left - 1] : 0);
                }

                sb.append(sum + "\n");
            }
            System.out.println(sb.toString().trim());
        }
    }

}