import java.util.Scanner;

public class P034_Petr_and_Book {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] weekDay = new int[7];
            for (int i = 0; i < 7; i++) {
                weekDay[i] = sc.nextInt();
            }
            int i = 0;
            while (n > 0) {
                n -= weekDay[i % 7];
                if (n <= 0)
                    System.out.println(i % 7 + 1);
                i++;
            }

        }
    }

}
