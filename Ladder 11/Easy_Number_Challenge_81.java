import java.util.Scanner;

public class Easy_Number_Challenge_81 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int maxProduct = a * b * c;
            int mod = 1073741824;
            int[] arr = new int[maxProduct + 1];
            for (int i = 1; i <= maxProduct; i++) {
                for (int j = i; j <= maxProduct; j += i) {
                    arr[j]++;
                }
            }
            long sum = 0;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    for (int k = 1; k <= c; k++) {
                        sum += arr[i * j * k];
                        sum = sum % mod;
                    }
                }
            }
            System.out.println(sum);
        }

    }

}
