import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P059_Airport {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < m; i++) {
                int tickets = sc.nextInt();
                maxHeap.add(tickets);
                minHeap.add(tickets);
            }

            int maxRevenue = 0;
            int minRevenue = 0;

            for (int i = 0; i < n; i++) {
                int max = maxHeap.poll();
                maxRevenue += max;
                if (max > 1)
                    maxHeap.add(max - 1);
                int min = minHeap.poll();
                minRevenue += min;
                if (min > 1)
                    minHeap.add(min - 1);
            }

            System.out.println(maxRevenue + " " + minRevenue);
        }

    }
}