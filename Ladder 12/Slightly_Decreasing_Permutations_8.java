import java.util.*;

public class Slightly_Decreasing_Permutations_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(i);
        Collections.reverse(list.subList(0, k + 1));
        for (int i : list)
            System.out.print(i + " ");

    }

}
