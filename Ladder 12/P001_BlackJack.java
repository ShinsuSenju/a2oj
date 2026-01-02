import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P001_BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 4);
        mp.put(2, 4);
        mp.put(3, 4);
        mp.put(4, 4);
        mp.put(5, 4);
        mp.put(6, 4);
        mp.put(7, 4);
        mp.put(8, 4);
        mp.put(9, 4);
        mp.put(10, 15);
        mp.put(11, 4);
        System.out.println(mp.getOrDefault(n - 10, 0));

    }

}
