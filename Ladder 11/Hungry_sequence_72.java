import java.util.*;

public class Hungry_sequence_72 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = n + 1; i <= 2 * n; i++)
                System.out.print(i + " ");
        }
    }
}
