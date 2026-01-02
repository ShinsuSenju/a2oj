import java.util.*;

public class Amusing_Joke_24 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[] combined = (sc.nextLine() + sc.nextLine()).toCharArray();
            char[] jumbled = sc.nextLine().toCharArray();
            Arrays.sort(combined);
            Arrays.sort(jumbled);
            System.out.println(Arrays.equals(combined, jumbled) ? "YES" : "NO");
        }
    }
}