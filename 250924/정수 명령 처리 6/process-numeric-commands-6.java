import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int x = sc.nextInt();
                pq.add(-x);
            } else if (cmd.equals("size")) {
                System.out.println(pq.size());
            } else if (cmd.equals("empty")) {
                System.out.println(pq.isEmpty() ? 1 : 0);
            } else if (cmd.equals("pop")) {
                System.out.println(-pq.poll());
            } else if (cmd.equals("top")) {
                System.out.println(-pq.peek());
            }
        }
    }
}