import java.util.Scanner;

public class P033_SuperCentral_point {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean flagLeft = false;
                boolean flagRight = false;
                boolean flagTop = false;
                boolean flagBottom = false;

                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        if (arr[i][0] < arr[j][0] && arr[i][1] == arr[j][1])
                            flagRight = true;
                        else if (arr[i][0] > arr[j][0] && arr[i][1] == arr[j][1])
                            flagLeft = true;
                        else if (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1])
                            flagBottom = true;
                        else if (arr[i][0] == arr[j][0] && arr[i][1] < arr[j][1])
                            flagTop = true;
                        if (flagLeft && flagRight && flagTop && flagBottom) {
                            count++;
                            break;
                        }
                    }
                }

            }
            System.out.println(count);

        }
    }

}
