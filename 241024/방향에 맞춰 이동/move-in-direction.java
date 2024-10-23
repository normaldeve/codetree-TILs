import java.util.*;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nx = 0;
        int ny = 0;
        for(int i = 0; i < n; i++) {
            int dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            if (dir == 'N') {
                nx += dx[0] * dist;
                ny += dy[0] * dist;
            } else if (dir == 'S') {
                nx += dx[2] * dist;
                ny += dy[2] * dist;
            } else if (dir == 'E') {
                nx += dx[1] * dist;
                ny += dy[1] * dist;
            } else if (dir == 'W') {
                nx += dx[3] * dist;
                ny += dy[3] * dist;
            }
        }
        System.out.print(nx + " " + ny);
    }
}