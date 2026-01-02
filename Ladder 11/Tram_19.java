import java.util.Scanner;

public class Tram_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int maxSum = Integer.MIN_VALUE;
            int curr = 0;
            for (int[] pass : arr) {
                curr = curr + pass[1] - pass[0];
                maxSum = Math.max(maxSum, curr);
            }
            System.out.println(maxSum);

        }
    }

}
