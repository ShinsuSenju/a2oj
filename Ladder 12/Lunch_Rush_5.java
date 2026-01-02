import java.util.*;

public class Lunch_Rush_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] input = new int[n][2];
        for (int i = 0; i < n; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        for (int[] i : input) {
            if (i[1] < k) {
                maxValue = Integer.max(maxValue, i[0]);
            } else {
                maxValue = Integer.max(maxValue, i[0] - (i[1] - k));
            }
        }
        System.out.println(maxValue);

    }

}
