
import java.util.Scanner;

public class P002_Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int pos_i = -1, pos_j = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    pos_i = i;
                    pos_j = j;

                }

            }
        }
        int moves = Math.abs(2 - pos_i) + Math.abs(2 - pos_j);
        System.out.println(moves);

        sc.close();

    }

}
