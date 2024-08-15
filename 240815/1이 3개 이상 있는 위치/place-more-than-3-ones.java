import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int DIR_NUM = 4;

    public static int n;

    public static int[][] arr = new int[MAX_N][MAX_N];
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    // 범위 내 위치하는 숫자인지 확인하는 메서드
    public static boolean range(int x, int y) {
        return 0 <= x && x < n && y >= 0 && y < n;
    }

    public static int adjacentCnt(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < DIR_NUM; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (range(nx, ny) && arr[nx][ny] == 1) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                arr[x][y] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (adjacentCnt(i, j) >= 3) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}