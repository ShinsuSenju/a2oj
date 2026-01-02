import java.util.Arrays;
import java.util.Scanner;

public class P079_Unlucky_Ticket {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] input = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                input[i] = s.charAt(i) - '0';
            }

            int[] firstHalf = Arrays.copyOfRange(input, 0, n);
            int[] secondHalf = Arrays.copyOfRange(input, n, 2 * n);

            Arrays.sort(firstHalf);
            Arrays.sort(secondHalf);

            boolean lessThan = false;
            boolean greaterThan = false;

            for (int i = 0; i < n; i++) {
                if (firstHalf[i] < secondHalf[i])
                    lessThan = true;
                else if (firstHalf[i] > secondHalf[i])
                    greaterThan = true;
                else {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println(lessThan == greaterThan ? "NO" : "YES");
        }
    }
}