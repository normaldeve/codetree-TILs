import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(-pq.poll());
                }
            } else {
                pq.add(-x);
            }
        }
    }
}