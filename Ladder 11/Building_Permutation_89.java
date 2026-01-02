import java.util.Arrays;
import java.util.Scanner;

public class Building_Permutation_89 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            Arrays.sort(arr);
            long count = 0;
            for (int i = 0; i < n; i++) {
                count += Math.abs((i + 1) - arr[i]);
            }
            System.out.println(count);
        }

    }

}
