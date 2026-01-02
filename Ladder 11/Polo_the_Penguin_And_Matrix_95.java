import java.util.Arrays;
import java.util.Scanner;

public class Polo_the_Penguin_And_Matrix_95 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int total = n * m;
            int[] arr = new int[total];

            for (int i = 0; i < total; i++) {
                arr[i] = sc.nextInt();
            }

            int base = arr[0];

            for (int x : arr) {
                if ((x - base) % d != 0) {
                    System.out.println(-1);
                    return;
                }
            }

            for (int i = 0; i < total; i++) {
                arr[i] = (arr[i] - base) / d;
            }

            Arrays.sort(arr);
            int median = arr[total / 2];

            long moves = 0;
            for (int x : arr) {
                moves += Math.abs(x - median);
            }

            System.out.println(moves);
        }

    }

}
