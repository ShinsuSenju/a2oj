import java.util.Scanner;

public class Little_Element_And_Function_54 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
                return;
            }
            System.out.print(n + " ");
            for (int i = 1; i < n; i++) {
                System.out.print(i);
                if (i < n - 1)
                    System.out.print(" ");
            }
        }

    }

}
