import java.util.Scanner;

public class Main {
    public static final int MAX_N = 10;
    public static int n,k;
    public static int result;
    public static int[] coins = new int[MAX_N];
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i --) {
            result += k / coins[i];
            k %= coins[i];
        }
        System.out.print(result);
    }
}