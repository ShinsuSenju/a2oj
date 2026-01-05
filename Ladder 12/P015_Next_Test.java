import java.util.Scanner;

public class P015_Next_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] index = new boolean[3000 + 2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            index[x] = true;
        }

        for (int i = 1; i <= 3001; i++) {
            if (!index[i]) {
                System.out.println(i);
                return;
            }
        }

    }

}
