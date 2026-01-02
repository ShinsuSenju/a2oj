import java.util.Scanner;

public class Adding_Digits_100 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int rem = (int) ((a * 10) % b);
            int digit = (b - rem) % b;
            if (digit > 9) {
                System.out.println(-1);
                return;
            }
            a = a * 10 + digit;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            for (int i = 1; i < n; i++)
                sb.append('0');
            System.out.println(sb.toString());
        }
    }
}