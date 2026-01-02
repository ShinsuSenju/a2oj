import java.util.Scanner;

public class P001_Young_Physicist {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int sum_i = 0, sum_j = 0, sum_k = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            sum_i += x;
            sum_j += y;
            sum_k += z;
        }

        if (sum_i == 0 && sum_j == 0 && sum_k == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
