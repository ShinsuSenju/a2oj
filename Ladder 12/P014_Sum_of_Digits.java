import java.util.Scanner;

public class P014_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.length() == 1) {
            System.out.println(0);
            return;
        }

        int counter = 0;

        while (n.length() > 1) {
            long sum = 0;
            for (char c : n.toCharArray()) {
                sum += c - '0';
            }
            n = String.valueOf(sum);
            counter++;
        }

        System.out.println(counter);
    }
}
