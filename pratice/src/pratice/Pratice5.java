package pratice;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Pratice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x == 0) {
                if (minHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(minHeap.poll());
                }
            } else {
                minHeap.offer(x);
            }
        }
        scanner.close();
    }
}
