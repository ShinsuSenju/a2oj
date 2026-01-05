import java.util.Arrays;
import java.util.Scanner;

public class P016_Laptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] ar = new int[n][2];

        for (int i = 0; i < n; i++) {
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
        }

        Arrays.sort(ar, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        for (int j = 0; j < n - 1; j++) {
            if (ar[j][0] < ar[j + 1][0] && ar[j][1] > ar[j + 1][1]) {
                System.out.println("Happy Alex");
                return;
            }
        }

        System.out.println("Poor Alex");
    }

}
