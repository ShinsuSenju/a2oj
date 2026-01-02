import java.util.Scanner;

public class P055_Present_from_Lena {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i <= n; i++) {
                printLine(i, n);
            }
            for (int i = n - 1; i >= 0; i--) {
                printLine(i, n);
            }
        }
    }

    private static void printLine(int i, int n) {

        for (int j = 0; j < 2 * (n - i); j++) {
            System.out.print(" ");
        }

        for (int j = 0; j <= i; j++) {
            System.out.print(j);
            if (j < i)
                System.out.print(" ");
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(" " + j);
        }

        System.out.println();
    }
}