import java.util.*;

public class Two_Bags_of_Potatoes_78 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt();
            int k = sc.nextInt();
            int n = sc.nextInt();
            StringBuilder ans = new StringBuilder();
            int first = k - (y % k);
            if (first <= 0) {
                System.out.println(-1);
            }
            for (int i = first; i <= n - y; i += k)
                if ((i + y) % k == 0)
                    ans.append(i + " ");
            if (ans.isEmpty()) {
                System.out.println(-1);
                return;
            }
            System.out.println(ans.toString().trim());
        }

    }

}
