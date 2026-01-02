import java.util.Scanner;

public class P041_Xenia_and_ringroad {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++)
                arr[i] = sc.nextInt();

            long moves = 0;
            int currentHouse = 1;

            for (int i = 0; i < m; i++) {
                if (arr[i] >= currentHouse) {
                    moves += arr[i] - currentHouse;
                } else {
                    moves += n - (currentHouse - arr[i]);
                }
                currentHouse = arr[i];
            }

            System.out.println(moves);
        }
    }
}