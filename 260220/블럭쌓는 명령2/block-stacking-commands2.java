import java.util.*;
import java.util.stream.*;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_K = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[k];
        int[] b = new int[k];
        int[] blocks = new int[n + 1];

        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        // 구간 누적 (이중 for → Stream)
        IntStream.range(0, k)
                .forEach(i ->
                        IntStream.rangeClosed(a[i], b[i])
                                .forEach(j -> blocks[j]++)
                );

        // 최댓값 구하기
        int max = IntStream.rangeClosed(1, n)
                .map(i -> blocks[i])
                .max()
                .orElse(0);

        System.out.println(max);
    }
}