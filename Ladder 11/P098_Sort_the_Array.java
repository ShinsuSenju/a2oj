import java.util.*;

public class P098_Sort_the_Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int l = -1, r = -1;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    l = i;
                    break;
                }
            }

            if (l == -1) {
                System.out.println("yes");
                System.out.println("1 1");
                return;
            }
            for (int i = n - 1; i > 0; i--) {
                if (a[i] < a[i - 1]) {
                    r = i;
                    break;
                }
            }

            reverse(a, l, r);

            if (isSorted(a)) {
                System.out.println("yes");
                System.out.println((l + 1) + " " + (r + 1));
            } else {
                System.out.println("no");
            }
        }
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }

    static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return false;
        }
        return true;
    }
}