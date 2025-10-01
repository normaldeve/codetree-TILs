import java.util.Scanner;
public class Main {
    static final int MOD = 1000000007;
    static final int MAX_NUM = 1000;
    static int[] dp = new int[MAX_NUM + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1] = 2;
        dp[2] = 7;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 2] * 4) % MOD;
        }


        System.out.print(dp[n]);
    }
}