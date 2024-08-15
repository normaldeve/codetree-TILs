import java.util.Scanner;

public class Main {
    public static int n, x, y;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static int dirNum(char dir) {
        if (dir == 'E') {
            return 0;
        } else if (dir == 'S') {
            return 1;
        } else if (dir == 'W') {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int distance = sc.nextInt();

            if (dir == 'N' || dir == 'S') {
                y = y + dy[dirNum(dir)] * distance;
            } else {
                x = x + dx[dirNum(dir)] * distance;
            }
        }

        System.out.println(x + " " + y);
    }
}