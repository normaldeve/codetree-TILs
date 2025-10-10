import java.util.*;

public class Main {
    public static int N;
    public static boolean[] visited;
    public static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N];

        choose(0);
        
    }

    public static void choose(int num) {
        if (num == N) {
            for(int i = 0; i < N; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            arr.add(i + 1);

            choose(num + 1);

            arr.remove(arr.size() - 1);
            visited[i] = false;
        }

        return;
    }
}