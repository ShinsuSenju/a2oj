import java.util.ArrayList;
import java.util.Scanner;

public class P039_Hexadecimals_theorem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("0 0 0");
                return;
            }
            if (n == 1) {
                System.out.println("0 0 1");
                return;
            }
            if (n == 2) {
                System.out.println("0 1 1");
                return;
            }
            if (n == 3) {
                System.out.println("1 1 1");
                return;
            }
            ArrayList<Integer> fib = new ArrayList<>();

            int a = 0, b = 1;

            if (a <= n)
                fib.add(a);
            if (b <= n)
                fib.add(b);

            while (true) {
                int c = a + b;
                if (c > n)
                    break;
                fib.add(c);
                a = b;
                b = c;
            }
            System.out.println(fib);

            int last = fib.size();
            System.out.println(fib.get(last - 5) + " " + fib.get(last - 4) + " " + fib.get(last - 2));
        }
    }
}
