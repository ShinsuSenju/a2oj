import java.util.*;

public class P094_Free_Cash {

    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                mp.putIfAbsent(s, 0);
                mp.put(s, mp.get(s) + 1);
            }
        }
        int max = -1;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }

        }
        System.out.println(max);

    }

}
