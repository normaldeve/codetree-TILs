import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        boolean isIntersect = false;

        int[] graph = new int[101];
        for(int i = x1; i <= x2; i++) {
            graph[i] = 1;
        }
        for(int i = x3; i <= x4; i++) {
            if (graph[i] == 1) {
                isIntersect = true;
                break;
            } else {
                graph[i] = 1;
            }
        }
        if (isIntersect) {
            System.out.print("intersecting");
        } else {
            System.out.print("nonintersecting");
        }
    }
}