import java.util.Scanner;

public class P006_Lights_Out {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] input = new int[3][3];
            int[][] lightMat = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    input[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (input[i][j] % 2 != 0) {
                        toggle(lightMat, i, j);
                        toggle(lightMat, i - 1, j);
                        toggle(lightMat, i + 1, j);
                        toggle(lightMat, i, j - 1);
                        toggle(lightMat, i, j + 1);
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(lightMat[i][j]);
                }
                System.out.println();
            }
        }
    }

    static void toggle(int[][] mat, int i, int j) {
        if (i >= 0 && i < 3 && j >= 0 && j < 3) {
            mat[i][j] ^= 1;
        }
    }
}
