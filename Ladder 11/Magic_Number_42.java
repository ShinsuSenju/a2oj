import java.util.Scanner;

public class Magic_Number_42 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            String reg = "^(1|14|144)+$";
            if (s.matches(reg)) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
