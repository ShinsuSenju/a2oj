import java.util.Scanner;

public class Increase_and_Decrease_77 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += sc.nextInt();
            System.out.println(sum % n == 0 ? n : n - 1);
        }
    }

}
