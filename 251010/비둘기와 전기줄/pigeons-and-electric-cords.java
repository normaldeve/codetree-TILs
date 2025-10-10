import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int moveDir = sc.nextInt();

            if (!map.containsKey(num)) {
                map.put(num, moveDir);
            } else {
                if (map.get(num) != moveDir) {
                    cnt++;
                    map.put(num, moveDir);
                }
            }
        }

        System.out.print(cnt);
    }
}