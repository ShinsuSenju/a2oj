import java.util.Scanner;

public class Life_Without_Zeroes_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int total = x + y;
        String totalWOZero = String.valueOf(Integer.parseInt(String.valueOf(x).replace("0", ""))
                + Integer.parseInt(String.valueOf(y).replace("0", "")));
        if (String.valueOf(total).replace("0", "").equals(totalWOZero)) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }

}
