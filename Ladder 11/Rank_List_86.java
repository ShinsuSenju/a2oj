import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Rank_List_86 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] input = new int[n][2];
            for (int i = 0; i < n; i++) {
                input[i][0] = sc.nextInt();
                input[i][1] = sc.nextInt();
            }

            Arrays.sort(input, Comparator.comparingInt((int[] arr) -> arr[0]).reversed()
                    .thenComparingInt(arr -> arr[1]));
            int[] team = input[k - 1];
            int count = 0;
            for (int[] arr : input) {
                if (arr[0] == team[0] && arr[1] == team[1])
                    count++;
            }
            System.out.println(count);
        }
    }
}