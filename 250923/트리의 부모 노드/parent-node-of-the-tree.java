
import java.util.*;
public class Main {
    static int n;
    static final int MAX_NUMBER = 100000;
    static boolean[] visited = new boolean[MAX_NUMBER + 1];
    static int[] parent = new int[MAX_NUMBER + 1];
    static List<Integer>[] edges = new ArrayList[MAX_NUMBER + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
            edges[i] = new ArrayList<>();

        // n - 1개의 간선 정보를 입력받습니다.
        for(int i = 1; i<= n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // 간선 정보를 인접리스트에 넣어줍니다.
            edges[x].add(y);
            edges[y].add(x);
        }

        // 1번부터 트리 순회를 진행합니다.
        visited[1] = true;
        dfs(1);

        // 부모 노드를 출력합니다.
        for(int i = 2; i <= n; i++)
            System.out.println(parent[i]);
    }

    static void dfs(int x) {
        for(int i = 0; i < edges[x].size(); i++) {
            int y = edges[x].get(i);
            if (!visited[y]) {
                visited[y] = true;
                parent[y] = x;

                dfs(y);
            }
        }
    }
}