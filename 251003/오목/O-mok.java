import java.util.Scanner;

public class Main {
    static int[] dx = {0, 1, 1, -1}; // →, ↓, ↘, ↗
    static int[] dy = {1, 0, 1,  1};
    static int[][] arr = new int[19][19];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                int cur = arr[i][j];
                if (cur == 0) continue; // 빈 칸

                for (int k = 0; k < 4; k++) {
                    // 이전 칸(반대 방향)이 같은 색이면 시작점 아님 → 스킵
                    int px = i - dx[k];
                    int py = j - dy[k];
                    if (in(px, py) && arr[px][py] == cur) continue;

                    // 현재 칸 포함해서 해당 방향으로 연속 개수 세기
                    int cnt = 1;
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    while (in(nx, ny) && arr[nx][ny] == cur) {
                        cnt++;
                        nx += dx[k];
                        ny += dy[k];
                    }

                    if (cnt == 5) {
                        System.out.println(cur);
                        System.out.println((i + 1 + dx[k] * 2) + " " + (j + 1 + dy[k] * 2));
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }

    static boolean in(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }
}
