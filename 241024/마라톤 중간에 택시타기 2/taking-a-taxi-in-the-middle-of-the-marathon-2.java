import java.util.*;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static int getDist(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }
        
        int minDist = Integer.MAX_VALUE;
        for(int i = 1; i < n - 1; i++) {
            int tmpDist = 0;
            int prevIdx = 0;
            for(int j = 1; j < n; j++) {
                if (i == j) {
                    continue;
                }
                tmpDist += getDist(points[prevIdx].x, points[prevIdx].y, points[j].x, points[j].y);
                prevIdx = j;
            }

            minDist = Math.min(tmpDist, minDist);
        }
        System.out.println(minDist);
    }
}