import java.util.Scanner;

public class P053_String_Task {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine().toLowerCase();
            StringBuilder sb = new StringBuilder();

            for (char c : input.toCharArray()) {
                if ("aeiouy".indexOf(c) != -1 || !Character.isLetter(c)) {
                    continue;
                }
                sb.append('.').append(c);
            }

            System.out.println(sb.toString());
        }
    }
}