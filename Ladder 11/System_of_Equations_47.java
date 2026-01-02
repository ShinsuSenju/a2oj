import java.util.Scanner;

public class System_of_Equations_47 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            for (int a = 0; a * a <= n; a++) {
                int b = n - a * a;
                if (b >= 0 && a + b * b == m)
                    count++;
            }

            System.out.println(count);
        }
    }
}