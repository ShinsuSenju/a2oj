// import java.util.Scanner;

// public class P084_Domino {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] input = new int[n][2];
//         int left = 0, right = 0;
//         for (int i = 0; i < n; i++) {
//             input[i][0] = sc.nextInt();
//             if (input[i][0] % 2 != 0)
//                 left++;
//             input[i][1] = sc.nextInt();
//             if (input[i][1] % 2 != 0)
//                 right++;
//         }
//         if (left % 2 == 0 && right % 2 == 0) {
//             System.out.println(0);
//             return;
//         } else if ((left % 2 != 0 && right % 2 == 0) || (left % 2 == 0 && right % 2 != 0)) {
//             System.out.println(-1);
//             return;
//         } else {
//             for (int i = 0; i < n; i++) {
//                 if ((input[i][0] % 2 == 0 && input[i][1] % 2 != 0) || (input[i][0] % 2 != 0 && input[i][1] % 2 == 0)) {
//                     System.out.println(1);
//                     return;
//                 }
//             }
//             System.out.println(-1);
//             return;
//         }

//     }

// }
import java.util.Scanner;

public class P084_Domino {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int leftOdd = 0, rightOdd = 0;
            boolean hasMismatch = false;

            for (int i = 0; i < n; i++) {
                int left = sc.nextInt();
                int right = sc.nextInt();

                if (left % 2 != 0)
                    leftOdd++;
                if (right % 2 != 0)
                    rightOdd++;

                if ((left % 2) != (right % 2)) {
                    hasMismatch = true;
                }
            }

            if (leftOdd % 2 == 0 && rightOdd % 2 == 0) {
                System.out.println(0);
            } else if ((leftOdd % 2) != (rightOdd % 2)) {
                System.out.println(-1);
            } else {
                System.out.println(hasMismatch ? 1 : -1);
            }
        }
    }
}
