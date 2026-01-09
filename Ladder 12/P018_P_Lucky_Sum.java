
import java.util.*;

public class P018_P_Lucky_Sum {

    static void generate(long n, long r, List<Long> lucky) {
        if (n > 0)
            lucky.add(n);
        if (n > r)
            return;
        generate(n * 10 + 4, r, lucky);
        generate(n * 10 + 7, r, lucky);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        List<Long> lucky = new ArrayList<>();
        generate(0, r, lucky);
        Collections.sort(lucky);

        long ans = 0L;
        for (long x : lucky) {
            if (l > r)
                break;
            if (x < l)
                continue;
            long end = Math.min(r, x);
            ans += (end - l + 1) * x;
            l = end + 1;
        }

        System.out.println(ans);
    }
}
