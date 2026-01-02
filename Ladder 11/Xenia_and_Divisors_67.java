import java.util.*;

public class Xenia_and_Divisors_67 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] input = new int[8];
            for (int i = 0; i < n; i++)
                input[sc.nextInt()]++;
            if (n % 3 != 0 || input[5] > 0 || input[7] > 0) {
                System.out.println(-1);
                return;
            }
            StringBuilder sb = new StringBuilder();

            while (input[1] > 0 && input[2] > 0 && input[4] > 0) {
                sb.append("1 2 4\n");
                input[1]--;
                input[2]--;
                input[4]--;

            }
            while (input[1] > 0 && input[2] > 0 && input[6] > 0) {
                sb.append("1 2 6\n");

                input[1]--;
                input[2]--;
                input[6]--;

            }
            while (input[1] > 0 && input[3] > 0 && input[6] > 0) {
                sb.append("1 3 6\n");

                input[1]--;
                input[3]--;
                input[6]--;

            }
            for (int i = 1; i <= 7; i++) {
                if (input[i] > 0) {
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(sb.toString());
        }

    }

}
