import java.util.*;

public class Effective_Approach_30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] array = new int[n + 1]; 
            int[] pos = new int[n + 1];   

            for (int i = 1; i <= n; i++) {
                array[i] = sc.nextInt();
                pos[array[i]] = i; 
            }

            int m = sc.nextInt();
            long vasya = 0, petya = 0;

            for (int i = 0; i < m; i++) {
                int query = sc.nextInt();
                int index = pos[query];
                vasya += index;          
                petya += (n - index + 1); 
            }

            System.out.println(vasya + " " + petya);
        }
    }
}