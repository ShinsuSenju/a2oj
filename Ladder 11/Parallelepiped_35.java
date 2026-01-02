import java.util.Scanner;

public class Parallelepiped_35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = (int) Math.sqrt(a * b / c);
            int y = (int) Math.sqrt(a * c / b);
            int z = (int) Math.sqrt(b * c / a);
            System.out.println(x * 4 + y * 4 + z * 4);

        }
    }

}
