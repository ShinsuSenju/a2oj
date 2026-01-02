import java.util.Scanner;

public class P016_Insomnia_cure {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k, l, m, n, d;
            k = sc.nextInt();
            l = sc.nextInt();
            m = sc.nextInt();
            n = sc.nextInt();
            d = sc.nextInt();
            boolean[] arr = new boolean[d];
            for (int i = 0; i < d; i++) {
                int j = i + 1;
                if (j % k == 0 || j % l == 0 || j % m == 0 || j % n == 0) {
                    arr[i] = true;
                }
            }
            int count = 0;
            for (boolean b : arr) {
                if (b)
                    count++;
            }
            System.out.println(count);

        }
    }

}
