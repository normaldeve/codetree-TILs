import java.util.Scanner;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {
        if(this.x + this.y != p.x + p.y)
            return (this.x + this.y) -
                   (p.x + p.y);
        if(this.x != p.x)
            return this.x - p.x;
        return this.y - p.y;
    }
}

public class Main {
    public static PriorityQueue<Pair> pq = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair pair = new Pair(x, y);
            pq.add(pair);
        }

        while(m-- > 0) {
            Pair nearest = pq.poll();
            Pair update = new Pair(nearest.x + 2, nearest.y + 2);
            pq.add(update);
        }

        Pair answer = pq.poll();
        System.out.print(answer.x + " " + answer.y);
        

    }
}