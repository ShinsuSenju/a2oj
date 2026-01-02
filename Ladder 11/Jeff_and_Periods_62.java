// import java.util.*;

// public class Jeff_and_Periods_62 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Map<Integer, List<Integer>> map = new TreeMap<>();

//         for (int i = 0; i < n; i++) {
//             int x = sc.nextInt();
//             map.putIfAbsent(x, new ArrayList<>());
//             map.get(x).add(i);
//         }

//         List<int[]> res = new ArrayList<>();

//         for (var e : map.entrySet()) {
//             List<Integer> pos = e.getValue();
//             if (pos.size() == 1) {
//                 res.add(new int[] { e.getKey(), 0 });
//             } else {
//                 int d = pos.get(1) - pos.get(0);
//                 boolean ok = true;
//                 for (int i = 2; i < pos.size(); i++) {
//                     if (pos.get(i) - pos.get(i - 1) != d) {
//                         ok = false;
//                         break;
//                     }
//                 }
//                 if (ok)
//                     res.add(new int[] { e.getKey(), d });
//             }
//         }

//         System.out.println(res.size());
//         for (int[] p : res)
//             System.out.println(p[0] + " " + p[1]);
//     }
// }

import java.util.Scanner;

public class Jeff_and_Periods_62 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] last = new int[100001];
            int[] diff = new int[100001];
            int[] cnt = new int[100001];
            boolean[] bad = new boolean[100001];
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                cnt[x]++;
                if (cnt[x] > 1) {
                    int d = i - last[x];
                    if (diff[x] == 0)
                        diff[x] = d;
                    else if (diff[x] != d)
                        bad[x] = true;
                }
                last[x] = i;
            }
            int t = 0;
            StringBuilder sb = new StringBuilder();
            for (int x = 1; x <= 100000; x++) {
                if (cnt[x] > 0 && !bad[x]) {
                    t++;
                    sb.append(x + " " + diff[x] + "\n");
                }
            }
            System.out.println(t);
            System.out.print(sb);
        }
    }

}