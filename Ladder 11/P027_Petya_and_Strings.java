import java.util.Scanner;

public class P027_Petya_and_Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input1 = sc.nextLine().toLowerCase();
            String input2 = sc.nextLine().toLowerCase();

            int result = input1.compareTo(input2);
            if (result < 0) System.out.println("-1");
            else if (result > 0) System.out.println("1");
            else System.out.println("0");
        }
    }
}