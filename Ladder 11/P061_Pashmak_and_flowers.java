import java.util.Arrays;
import java.util.Scanner;

public class P061_Pashmak_and_flowers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] beauty = new int[n];
            for (int i = 0; i < n; i++)
                beauty[i] = sc.nextInt();
            Arrays.sort(beauty);

            int maxDiff = beauty[n - 1] - beauty[0];

            int minCount = 0, maxCount = 0;
            for (int b : beauty) {
                if (b == beauty[0])
                    minCount++;
                if (b == beauty[n - 1])
                    maxCount++;
            }

            long totalPair;
            if (maxDiff == 0) {

                totalPair = (long) n * (n - 1) / 2;
            } else {

                totalPair = (long) minCount * maxCount;
            }

            System.out.println(maxDiff + " " + totalPair);
        }
    }
}