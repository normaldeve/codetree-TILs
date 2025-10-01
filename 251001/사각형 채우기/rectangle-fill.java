import java.util.Scanner;
public class Main {
    static final int MAX_NUM = 1000;
    static final int MOD = 10007;
    static final int[] dp = new int[MAX_NUM + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        System.out.print(dp[n]);
    }
}