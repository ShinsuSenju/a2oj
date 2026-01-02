import java.util.*;

public class Sereja_And_Bottles_99 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            int[][] temp = new int[n][2];

            for (int i = 0; i < n; i++) {
                temp[i][0] = sc.nextInt();
                temp[i][1] = sc.nextInt();
            }

            for (int i = 0; i < temp.length; i++) {
                boolean ok = false;
                for (int j = 0; j < temp.length; j++) {
                    if (i != j && temp[i][0] == temp[j][1]) {
                        ok = true;
                        break;
                    }
                }
                if (!ok)
                    count++;
            }

            System.out.println(count);
        }

    }
}