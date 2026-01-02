import java.util.Scanner;

public class P005_Beautiful_Year {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            for (int i = year + 1; i < 9000; i++) {
                boolean[] map = new boolean[10];
                String textYear = String.valueOf(i);
                boolean flag = true;
                for (char c : textYear.toCharArray()) {
                    if (!map[c - '0']) {
                        map[c - '0'] = true;

                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                    return;
                }
            }
        }
        return;
    }

}
