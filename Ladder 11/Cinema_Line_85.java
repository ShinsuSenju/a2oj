import java.util.Scanner;

public class Cinema_Line_85 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int twoFive = 0, fiveZero = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 25)
                    twoFive++;
                else if (x == 50) {
                    fiveZero++;
                    if (twoFive < 1)
                        flag = false;
                    else
                        twoFive--;

                } else {

                    if (fiveZero >= 1 && twoFive >= 1) {
                        fiveZero--;
                        twoFive--;
                    } else if (twoFive >= 3) {
                        twoFive -= 3;
                    } else
                        flag = false;
                }
            }

            System.out.println(flag == true ? "YES" : "NO");
        }
    }

}
