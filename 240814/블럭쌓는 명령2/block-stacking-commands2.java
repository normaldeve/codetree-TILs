import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_K = 100;

    public static int n, k;
    public static int[] a = new int[MAX_K + 1];
    public static int[] b = new int[MAX_K + 1];

    public static int[] blocks = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        k = sc.nextInt();

        for(int i = 1; i <= k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 1; i <= k; i++) {
            for (int j = a[i]; j <= b[i] ; j++) {
                blocks[i]++;
            }
        }

        int max_sum = 0;
        for (int block : blocks) {
            if (block > max_sum) {
                max_sum = block;
            }
        }
        System.out.println(max_sum);
    }
}