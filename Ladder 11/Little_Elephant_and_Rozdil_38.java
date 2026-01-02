import java.util.ArrayList;

import java.util.Scanner;

public class Little_Elephant_and_Rozdil_38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int minEle = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
                if (list.get(i) < minEle) {
                    minEle = list.get(i);
                }
            }
            if (list.indexOf(minEle) != list.lastIndexOf(minEle)) {
                System.out.println("Still Rozdil");
            } else
                System.out.println(list.indexOf(minEle) + 1);

        }
    }

}
