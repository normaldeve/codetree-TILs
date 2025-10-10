import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            map.put(num, i + 1);
        }

        for(int i = 0; i < M; i++) {
            int find = sc.nextInt();
            System.out.print((map.get(find) == null ? 0 : map.get(find)) + " ");
        }
    }
}