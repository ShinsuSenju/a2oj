import java.util.Scanner;

public class Football_52 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            if (s.contains("0000000") || s.contains("1111111")) {
                System.out.println("YES");
                return;
            }

            System.out.println("NO");
        }
    }

}
