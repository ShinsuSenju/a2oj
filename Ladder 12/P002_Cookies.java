import java.util.Scanner;

public class P002_Cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        int oddCount = 0, evenCount = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
            if (input[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
            sum += input[i];
        }
        if (sum % 2 == 0) {
            System.out.println(evenCount);
        } else
            System.out.println(oddCount);

    }

}
