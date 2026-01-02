import java.util.Scanner;

public class P003_Queue_at_the_School {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        StringBuilder s = new StringBuilder(scan.next());

        while (t-- > 0) {
            boolean flag = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'G') {
                    s.setCharAt(i, 'G');
                    s.setCharAt(i + 1, 'B');
                    i++;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }

        System.out.println(s.toString());
        scan.close();
    }
}
