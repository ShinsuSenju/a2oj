import java.util.Scanner;

public class P026_HQ9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.next();
            String pattern = ".*[HQ9].*";
            if(input.matches(pattern)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
