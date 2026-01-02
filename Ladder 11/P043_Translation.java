
import java.util.Scanner;

public class P043_Translation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            StringBuilder rev = new StringBuilder(s).reverse();
            if (rev.toString().equals(t)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

}
