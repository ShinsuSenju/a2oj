import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P021_is_your_horshoe_on_the_other_hoof {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            Set<Integer> st = new HashSet<>();
            st.add(a);
            st.add(b);
            st.add(c);
            st.add(d);
            System.out.println(4 - st.size());

        }
    }
}
