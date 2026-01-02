import java.util.Scanner;

public class Letter_68 {
    public static void main(String[] args) {
        int[] letters = new int[256];
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String s2 = sc.nextLine();
            for (char c : s.toCharArray())
                letters[c]++;
            for (char c : s2.toCharArray()) {
                letters[c]--;
                if (letters[c] < 0 && c != ' ') {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }

}
