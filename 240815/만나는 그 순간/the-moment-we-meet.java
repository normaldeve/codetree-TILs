import java.util.Scanner;

public class Main {
    public static final int MAX_T = 1000000;

    public static int n, m;
    public static int[] a = new int[MAX_T + 1];
    public static int[] b = new int[MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R') {
                    a[timeA] = a[timeA - 1] + 1;
                } else {
                    a[timeA] = a[timeA - 1] - 1;
                }
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R') {
                    b[timeB] = b[timeB - 1] + 1;
                } else {
                    b[timeB] = b[timeB - 1] - 1;
                }
                timeB++;
            }

        }

        int ans = -1;
        for (int i = 1; i < timeA; i++) {
            if (a[i] == b[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}