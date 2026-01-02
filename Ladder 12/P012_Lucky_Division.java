
import java.util.Scanner;

public class P012_Lucky_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] luckyNumbers = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };

        boolean isLucky = false;
        for (int num : luckyNumbers) {
            if (n % num == 0) {
                isLucky = true;
                break;
            }
        }

        System.out.println(isLucky ? "YES" : "NO");
    }
}
