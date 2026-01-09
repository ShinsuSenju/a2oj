package temp;

import java.util.Arrays;
import java.util.Scanner;

public class Upward_Path {
    public static void swap(int[][] arr, int j) {
        int temp = arr[0][j];
        arr[0][j] = arr[1][j];
        arr[1][j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println();
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        if (arr[0][0] > arr[0][1])
            swap(arr, 0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int row = 0, col = 0;
        boolean flag = true;
        while (true) {

            int right = -1, down = -1, diag1 = -1, diag2 = -1;
            if (row >= 1 && col >= n - 1) {
                break;
            }
            if (row + 1 < 2) {
                down = arr[row + 1][col] >= arr[row][col] ? arr[row + 1][col] : -1;
            }
            if (col + 1 < n) {
                right = arr[row][col + 1] >= arr[row][col] ? arr[row][col + 1] : -1;
            }
            if (row + 1 < 2 && col + 1 < n) {
                diag1 = arr[row + 1][col + 1] >= arr[row][col] ? arr[row + 1][col + 1] : -1;
            }
            if (row - 1 >= 0 && col + 1 < n) {
                diag2 = arr[row - 1][col + 1] >= arr[row][col] ? arr[row - 1][col + 1] : -1;
            }

            if (row == 0) {
                if (right == -1 && down == -1 && diag1 == -1) {
                    flag = false;
                    break;
                } else if (right == -1) {
                    if (diag1 <= down && diag1 != -1) {
                        swap(arr, col + 1);
                        col++;
                    } else
                        row++;
                } else if (down == -1) {
                    if (diag1 <= right && diag1 != -1) {
                        swap(arr, col + 1);
                    }
                    col++;
                } else {
                    if (diag2 == -1 && right == -1) {
                        flag = false;
                        break;
                    }
                    if (diag1 <= right) {
                        if (diag1 <= down) {
                            swap(arr, col + 1);
                            col++;
                        } else
                            row++;
                    } else {
                        if (right <= down) {
                            col++;
                        } else
                            row++;
                    }
                }
            } else {

                if (right == -1 && diag2 == -1) {
                    flag = false;
                    break;
                } else if (diag2 <= right && diag2 != -1) {
                    swap(arr, col + 1);
                    col++;
                } else
                    col++;
            }

            System.out.println("Current array:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Currently at:" + arr[row][col]);
        }

        // System.out.println();
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        if (!flag)
            System.out.println("NO");
        else
            System.out.println("YES");

    }

}
