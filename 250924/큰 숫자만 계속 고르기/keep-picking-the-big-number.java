import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            pq.add(num);
        }

        while(M-- > 0) {
            int x = pq.poll();
            x -= 1;
            pq.add(x);
        }

        System.out.print(pq.peek());



    }
}