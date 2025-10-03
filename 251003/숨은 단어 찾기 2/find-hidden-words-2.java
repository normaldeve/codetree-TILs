import java.util.Scanner;
public class Main {
    static int n, m;
    // 나올 수 있는 방향이 8가지
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            char[] cArr = input.toCharArray();
            for(int j = 0; j < m; j++) {
                arr[i][j] = cArr[j];
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                char cur = arr[i][j];

                if (cur != 'L') continue;

                for(int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (!canGo(nx, ny)) continue;
                    if (arr[nx][ny] != 'E') continue;

                    int nnx = nx + dx[k];
                    int nny = ny + dy[k];

                    if(!canGo(nnx, nny)) continue;
                    if (arr[nnx][nny] == 'E') {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }

    public static boolean canGo(int nx, int ny) {
        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
            return false;
        }

        return true;
    }
}