import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P048_Business_Trip {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();

            Integer[] input = new Integer[12];
            for (int i = 0; i < 12; i++)
                input[i] = sc.nextInt();
            Arrays.sort(input, Collections.reverseOrder());

            int sum = 0;
            int i;
            for (i = 0; i < 12; i++) {
                if (sum >= k)
                    break;
                sum += input[i];

            }
            if (sum < k)
                System.out.println(-1);
            else
                System.out.println(i);
        }
    }

}
