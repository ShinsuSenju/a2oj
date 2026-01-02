import java.util.Scanner;

public class DZY_Loves_Chessboard_60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            char[][] board = new char[n][m];

            for (int i = 0; i < n; i++) {
                String row = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    board[i][j] = row.charAt(j);
                }
            }

            int flag = 1;

            for (int i = 0; i < n; i++) {
                int colorToggle = flag;
                for (int j = 0; j < m; j++) {
                    if (board[i][j] != '-') {
                        board[i][j] = (colorToggle == 0) ? 'W' : 'B';
                    }
                    colorToggle ^= 1;
                }
                flag ^= 1;
            }

            for (char[] row : board) {
                System.out.println(new String(row));
            }
        }
    }
}