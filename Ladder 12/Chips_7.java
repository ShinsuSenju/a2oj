import java.util.Scanner;

public class Chips_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        while (m > 0) {
            int chips = (i % n) == 0 ? n : i % n;
            if (m < chips)
                break;
            m -= chips;
            i++;
        }
        System.out.println(m);

    }

}
