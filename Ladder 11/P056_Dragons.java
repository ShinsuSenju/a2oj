import java.util.Arrays;
import java.util.Scanner;

public class P056_Dragons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int[][] inputDragons = new int[n][2];
            for (int i = 0; i < n; i++) {
                inputDragons[i][0] = sc.nextInt();
                inputDragons[i][1] = sc.nextInt();
            }
            Arrays.sort(inputDragons, (a, b) -> Integer.compare(a[0], b[0]));
            for (int[] i : inputDragons) {
                if (i[0] >= s) {
                    System.out.println("NO");
                    return;
                } else {
                    s += i[1];
                }
            }
        }
        System.out.println("YES");

    }

}
