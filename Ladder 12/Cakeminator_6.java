import java.util.*;

public class Cakeminator_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] input = new int[r][c];
        sc.nextLine();
        for (int i = 0; i < r; i++) {
            String temp = sc.nextLine();
            for (int j = 0; j < c; j++) {
                if (temp.charAt(j) == '.')
                    input[i][j] = 0;
                else
                    input[i][j] = 1;
            }
        }
        int consume = 0;
        for (int i = 0; i < c; i++) {
            boolean flag = false;
            for (int j = 0; j < r; j++) {
                if (input[j][i] == 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int count = 0;
                for (int j = 0; j < r; j++) {
                    if (input[j][i] == 0) {
                        count++;
                        input[j][i] = 2;
                    }
                }
                consume += count;
            }
        }
        for (int i = 0; i < r; i++) {
            boolean flag = false;

            for (int j = 0; j < c; j++) {

                if (input[i][j] == 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                int count = 0;
                for (int j = 0; j < c; j++) {
                    if (input[i][j] == 0) {
                        count++;
                        input[i][j] = 2;
                    }
                }
                consume += count;

            }

        }
        System.out.println(consume);
    }

}
