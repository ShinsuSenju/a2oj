import java.util.*;

public class Little_Girl_and_Game_63 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int[] freq = new int[26];
            for (char c : s.toCharArray())
                freq[c - 'a']++;
            int odd = 0;
            for (int f : freq)
                if ((f & 1) == 1)
                    odd++;
            if (odd == 0 || (odd & 1) == 1)
                System.out.println("First");
            else
                System.out.println("Second");
        }
    }
}