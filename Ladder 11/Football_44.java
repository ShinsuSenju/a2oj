import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football_44 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashMap<String, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }
            Integer maxValue = 0;
            String team = null;
            for (Map.Entry<String, Integer> m : mp.entrySet()) {
                if (m.getValue() > maxValue) {
                    team = m.getKey();
                    maxValue = m.getValue();
                }

            }
            System.out.println(team);
        }
    }

}
