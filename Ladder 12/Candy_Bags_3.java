import java.util.Scanner;

public class Candy_Bags_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[(n * n) + 1];
        for (int i = 1; i < (n * n) + 1; i++)
            arr[i] = i;
        int left = 1, right = arr.length - 1;
        StringBuilder sb = new StringBuilder();
        while (left < right) {
            int i = n / 2;
            StringBuilder temp = new StringBuilder();
            while (i-- > 0) {
                temp.append(" ").append(arr[left++]).append(" ").append(arr[right--]);
            }
            sb.append(temp.toString().trim()).append("\n");

        }
        System.out.println(sb.toString().trim());

    }

}
