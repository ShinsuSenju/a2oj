import java.util.Scanner;

public class Sail_64 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int ex = sc.nextInt();
            int ey = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            for (int i = 0; i < t; i++) {
                char c = s.charAt(i);

                if (sx < ex && c == 'E')
                    sx++;
                else if (sx > ex && c == 'W')
                    sx--;
                else if (sy < ey && c == 'N')
                    sy++;
                else if (sy > ey && c == 'S')
                    sy--;

                if (sx == ex && sy == ey) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
