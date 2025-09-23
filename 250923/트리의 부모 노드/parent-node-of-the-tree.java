import java.util.Scanner;
public class Main {
    static final int MAX_NUMBER = 100000
    static int[] visited = new int[MAX_NUMBER + 1];
    static int[] parents = new int[MAX_NUMBER + 1];
    static List<Integer>[] edges new ArrayList<>[MAX_NUMBER + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            edges[x].add(y);
            edges[y].add(x);
        }

        visited[1] = true;
        dfs(1);

        for(int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
        
    }

    static void dfs(int x) {
        for(int i = 0; i < edges[x].size(); i++) {
            int y = edges[x].get(i);
            if (!visited[y]) {
                visited[y] = true;
                parents[y] = x;

                dfs(y);
            }
        }
    }
}