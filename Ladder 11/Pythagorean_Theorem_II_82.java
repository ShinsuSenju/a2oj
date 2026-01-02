import java.util.Scanner;

public class Pythagorean_Theorem_II_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int counter = 0;

        for (int i = 1; i < t; i++) {
            for (int j = i; i * i + j * j <= t * t; j++) {

                int k = (int) Math.sqrt(i * i + j * j);
                if (k * k == i * i + j * j)
                    counter++;
            }
        }

        System.out.println(counter);
        sc.close();
    }
}