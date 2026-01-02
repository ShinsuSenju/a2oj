import java.util.*;

public class P092_Seerja_and_Suffixes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
            }

            int[] arr = new int[n];
            Set<Integer> st = new HashSet<>();
            for (int i = n - 1; i >= 0; i--) {
                st.add(input[i]);
                arr[i] = st.size();
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int l = sc.nextInt();
                sb.append(arr[l - 1]).append("\n");
            }

            System.out.print(sb.toString());
        }
    }
}