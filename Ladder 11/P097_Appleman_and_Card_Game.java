import java.util.*;

public class P097_Appleman_and_Card_Game {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'A']++;
            }

            Arrays.sort(freq);

            long ans = 0;

            for (int i = 25; i >= 0 && k > 0; i--) {
                int take = Math.min(freq[i], k);
                ans += (long) take * take;
                k -= take;
            }

            System.out.println(ans);
        }
    }
}