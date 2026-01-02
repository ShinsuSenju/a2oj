import java.util.Scanner;

public class Way_too_long_words_22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine()); 

            for (int i = 0; i < n; i++) {
                String input = sc.nextLine().trim(); 

                if (input.length() > 10) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(input.charAt(0));
                    stringBuilder.append(input.length() - 2);
                    stringBuilder.append(input.charAt(input.length() - 1));

                    System.out.println(stringBuilder.toString());
                } else {
                    System.out.println(input);
                }
            }
        }
    }
}
