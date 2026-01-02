import java.util.Scanner;

public class Little_Elephant_And_Bits_73 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            if (input.contains("0")) {
                input = input.replaceFirst("0", "");
            } else
                input = input.substring(0, input.length() - 1);
            System.out.println(input);
        }

    }
}
