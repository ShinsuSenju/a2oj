import java.util.*;

public class Comparing_Strings_70 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            if (s1.length() != s2.length()) {
                System.out.println("NO");
                return;
            }
            List<Integer> invalidIndex = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    invalidIndex.add(i);
                }
            }
            if (invalidIndex.size() != 2) {
                System.out.println("NO");
                return;
            }
            if (s1.charAt(invalidIndex.get(0)) == s2.charAt(invalidIndex.get(1))
                    && s1.charAt(invalidIndex.get(1)) == s2.charAt(invalidIndex.get(0))) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }

    }

}
