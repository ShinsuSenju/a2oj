
import java.util.Scanner;

public class Dima_and_Friends_31 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int friends = n;
            int sum = 0;
            while (n-- > 0) {
                sum += sc.nextInt();
            }
            int count = 0;
            for (int finger = 1; finger <= 5; finger++) {
                if ((sum + finger) % (friends + 1) != 1) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

}
