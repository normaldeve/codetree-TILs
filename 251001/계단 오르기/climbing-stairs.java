import java.util.Scanner;
public class Main {
    static final int MAX_NUMS = 1000;
    static final int MOD = 10007;
    static int[] memo = new int[MAX_NUMS + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        memo[0] = 1;
        memo[1] = 0;
        memo[2] = 1;
        memo[3] = 1;

        for(int i = 4; i <= n; i++) {
            memo[i] = (memo[i - 2] + memo[i - 3]) % MOD;
        }

        System.out.println(memo[n]);
    }
}