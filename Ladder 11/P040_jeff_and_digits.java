import java.util.Scanner;

public class P040_jeff_and_digits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count0 = 0, count5 = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 0)
                    count0++;
                else
                    count5++;
            }

            if (count0 == 0) {
                System.out.println("-1");
                return;
            }

            if (count5 < 9) {
                System.out.println("0");
                return;
            }

            int usable5 = (count5 / 9) * 9;
            System.out.println("5".repeat(usable5) + "0".repeat(count0));

        }
    }
}
