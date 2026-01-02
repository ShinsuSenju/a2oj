import java.util.Scanner;

public class Chat_Room_58 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String patt = "hello";
            int i = 0, j = 0;
            while (i < input.length() && j < patt.length()) {
                if (patt.charAt(j) == input.charAt(i))
                    j++;
                i++;

            }
            if (j == patt.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
