import java.io.*;
import java.util.*;

public class Cards_with_numbers_83 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter pw = new BufferedWriter(new FileWriter("output.txt"));

        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split(" ");
        int[] input = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
            input[i] = Integer.parseInt(parts[i]);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 2 * n; i++) {
            map.putIfAbsent(input[i], new ArrayList<>());
            map.get(input[i]).add(i);
        }

        int hcf = 0;
        for (var e : map.entrySet()) {
            int freq = e.getValue().size();
            if (hcf == 0)
                hcf = freq;
            else
                hcf = gcd(hcf, freq);
        }

        if (hcf == 1) {
            pw.write("-1");
        } else {
            StringBuilder sb = new StringBuilder();
            for (var e : map.entrySet()) {
                for (int index : e.getValue())
                    sb.append(index + 1).append(" ");
                sb.append("\n");
            }
            pw.write(sb.toString().trim());
        }

        pw.close();
        br.close();
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
