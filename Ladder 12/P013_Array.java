
import java.util.*;

public class P013_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0)
                neg.add(x);
            else if (x > 0)
                pos.add(x);
            else
                zero.add(x);
        }

        ArrayList<Integer> g1 = new ArrayList<>();
        ArrayList<Integer> g2 = new ArrayList<>();
        ArrayList<Integer> g3 = new ArrayList<>();

        g1.add(neg.remove(0));

        if (!pos.isEmpty()) {
            g2.add(pos.remove(0));
        } else {
            g2.add(neg.remove(0));
            g2.add(neg.remove(0));
        }

        g3.addAll(neg);
        g3.addAll(pos);
        g3.addAll(zero);

        StringBuilder sb = new StringBuilder();

        sb.append(g1.size()).append(" ");
        for (int x : g1)
            sb.append(x).append(" ");
        sb.append("\n");

        sb.append(g2.size()).append(" ");
        for (int x : g2)
            sb.append(x).append(" ");
        sb.append("\n");

        sb.append(g3.size()).append(" ");
        for (int x : g3)
            sb.append(x).append(" ");

        System.out.println(sb.toString().trim());
    }
}
