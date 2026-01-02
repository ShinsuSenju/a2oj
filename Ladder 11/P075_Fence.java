import java.util.*;

public class P075_Fence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++)
                input[i] = sc.nextInt();
            int left = 0, right = 0;
            int sum = 0;
            int minSum = Integer.MAX_VALUE;
            int start = -1;
            while (right < n) {
                sum += input[right];

                if (right - left + 1 > k) {
                    sum -= input[left];
                    left++;
                }

                if (right - left + 1 == k) {
                    if (minSum > sum) {
                        start = left;
                        minSum = sum;
                    }
                }

                right++;
            }
            System.out.println(start + 1);
        }
    }

}
