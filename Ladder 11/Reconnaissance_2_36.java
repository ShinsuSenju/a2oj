import java.util.Scanner;

public class Reconnaissance_2_36 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int index1 = -1;
            int index2 = -1;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int diff = Math.abs(arr[i] - arr[(i + 1) % n]);
                if (diff < minDiff) {
                    minDiff = diff;
                    index1 = i;
                    index2 = (i + 1) % n;
                }

            }
            System.out.println(index1 + 1 + " " + (index2 + 1));
        }
    }

}
