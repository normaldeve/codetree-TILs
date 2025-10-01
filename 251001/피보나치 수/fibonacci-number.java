import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] memo = new int[n + 1];

        memo[1] = 1;
        memo[2] = 1;

        if (n <= 2) {
            System.out.println(memo[n]);
            return;
        }

        for(int i = 3; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        System.out.println(memo[n]);
    }
}