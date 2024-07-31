import java.util.Scanner;

public class Main {
    public static int n, m;
    public static final int MAX_N = 100;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[] seq = new int[MAX_N];

    public static boolean isHappyCount() {
        int seqCount = 1, maxCount = 1;
        for (int i = 1; i < n; i++) {
            if (seq[i - 1] == seq[i]) {
                seqCount++;
            } else {
                seqCount = 1;
            }
            maxCount = Math.max(maxCount, seqCount);
        }
        return maxCount >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int numHappy = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                seq[col] = grid[row][col];
            }
            if (isHappyCount()) {
                numHappy++;
            }
        }

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                seq[row] = grid[row][col];
            }
            if (isHappyCount()) {
                numHappy++;
            }
        }
        System.out.println(numHappy);
    }
}