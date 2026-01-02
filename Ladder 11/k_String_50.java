import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class k_String_50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine();

            Map<Character, Integer> map = new HashMap<>();

            for (char c : input.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            if (n == 1) {
                System.out.println(input);
                return;
            }

            StringBuilder base = new StringBuilder();

            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() % n != 0) {
                    System.out.println(-1);
                    return;
                }
                base.append(String.valueOf(e.getKey()).repeat(e.getValue() / n));
            }

            StringBuilder ans = new StringBuilder();
            ans.append(base.toString().repeat(n));

            System.out.println(ans);
        }
    }
}
