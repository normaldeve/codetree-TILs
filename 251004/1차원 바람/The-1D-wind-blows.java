import java.util.Scanner;

public class Main {
    public static int n, m, q;
    public static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int r = sc.nextInt() - 1;
            char dir = sc.next().charAt(0);

            boolean dirRight = true;

            if (dir == 'L') {
                dirRight = false;
            }

            rotateRow(a[r], dirRight);

            boolean curDir = dirRight;
            for(int j = r - 1; j >= 0; j--) {
                if (!check(a[j], a[j + 1])) break;
                curDir = !curDir;
                rotateRow(a[j], curDir);
            }

            curDir = dirRight;
            for(int j = r + 1; j < n; j++) {
                if (!check(a[j], a[j - 1])) break;
                curDir = !curDir;
                rotateRow(a[j], curDir);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateRow(int[] row, boolean dirRight) {

        if (!dirRight) {
            int last = row[m - 1];
            for(int i = m - 1; i >= 1; i--) {
                row[i] = row[i - 1];
            }
            row[0] = last;
        } else {
            int first = row[0];
            for(int i = 0; i < m - 1; i++) {
                row[i] = row[i + 1];
            }
            row[m - 1] = first;
        }
    }

    public static boolean check(int[] a, int[] b) {

        for(int i = 0; i < m; i++) {
            if (a[i] == b[i]) {
                return true;
            }
        }

        return false;
    }
}