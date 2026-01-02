
import java.util.Scanner;

public class P004_Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int i = 0;
        String ans = "";
        while (i < input.length()) {
            if (input.charAt(i) == '.' && i == 0) {
                ans += "0";
                i++;
            } else if (i < input.length() - 1 && input.charAt(i) == '-' && input.charAt(i + 1) == '.') {
                ans += "1";
                i += 2;
            } else if (i < input.length() - 1 && input.charAt(i) == '-' && input.charAt(i + 1) == '-') {
                ans += "2";
                i += 2;
            } else {
                ans += "0";
                i++;
            }

        }
        System.out.println(ans);

        sc.close();

    }

}
