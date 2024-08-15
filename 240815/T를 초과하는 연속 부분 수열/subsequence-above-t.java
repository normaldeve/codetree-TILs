import java.util.Scanner;

public class Main {
    public static int n, k;
    public static final int MAX_N = 1000;

    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() - k;
        }

        int ans = 0, cnt = 0;
        for(int i = 0; i < n; i++) {
            // Case 1
            if(i >= 1 && arr[i] * arr[i - 1] > 0)
                cnt++;
                // Case 2
            else
                cnt = 1;

            ans = Math.max(ans, cnt);
        }

        // 출력
        System.out.print(ans);
    }
}