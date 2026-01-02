import java.util.*;

public class Yaroslav_and_Permutations_74 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] input = new int[n];
            for (int i = 0; i < n; i++)
                input[i] = sc.nextInt();
            if (n == 1) {
                System.out.println("YES");
                return;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : input) {
                map.putIfAbsent(i, 0);
                map.put(i, map.get(i) + 1);
            }
            int limit = (n + 1) / 2;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > limit) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }

}
