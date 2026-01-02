import java.util.Scanner;

public class P088_IQ_Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] input = new String[4];
            for (int i = 0; i < 4; i++) {
                input[i] = sc.nextLine();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int hashCount = 0;
                    int dotCount = 0;
                    if (input[i].charAt(j) == '#')
                        hashCount++;
                    else
                        dotCount++;
                    if (input[i].charAt(j + 1) == '#')
                        hashCount++;
                    else
                        dotCount++;
                    if (input[i + 1].charAt(j) == '#')
                        hashCount++;
                    else
                        dotCount++;
                    if (input[i + 1].charAt(j + 1) == '#')
                        hashCount++;
                    else
                        dotCount++;

                    if (hashCount >= 3 || dotCount >= 3) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}