import java.util.Scanner;

public class Vasily_the_bear_and_Triangle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("0 " + (x + y) + " " + (x + y) + " 0");
            } else {
                System.out.println("0 " + (y - x) + " " + (x - y) + " 0");
            }
        } else {
            if (y > 0) {
                System.out.println((x - y) + " 0 0 " + (y - x));
            } else {
                System.out.println((x + y) + " 0 0 " + (x + y));
            }
        }

    }

}
