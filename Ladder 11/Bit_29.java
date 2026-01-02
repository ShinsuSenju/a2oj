import java.util.Scanner;

public class Bit_29 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] operations = new String[n];
            for (int i = 0; i < n; i++) {
                operations[i] = sc.next();
            }
            int x = 0;
            for (String opr : operations) {
                if (opr.equals("++X") || opr.equals("X++"))
                    ++x;
                else
                    x--;
            }
            System.out.println(x);
        }
    }

}
