import java.util.*;

class Pair<K, V> {
    K first;
    V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class P071_Big_Segment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<Pair<Integer, Integer>> intervals = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                intervals.add(new Pair<Integer, Integer>(sc.nextInt(), sc.nextInt()));
            }
            int maxSecond = Integer.MIN_VALUE;
            int minFirst = Integer.MAX_VALUE;
            for (var v : intervals) {
                if (v.first < minFirst)
                    minFirst = v.first;
                if (v.second > maxSecond)
                    maxSecond = v.second;
            }

            for (int i = 0; i < n; i++) {
                if (intervals.get(i).first == minFirst && intervals.get(i).second == maxSecond) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(-1);

    }

}
