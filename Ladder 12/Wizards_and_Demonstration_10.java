import java.util.Scanner;

public class Wizards_and_Demonstration_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double temp = ((double) y / 100.0) * n;
        int reqPeople = (int) Math.ceil(temp);
        int clone = (reqPeople - x) < 0 ? 0 : reqPeople - x;

        System.out.println(clone);

    }

}
