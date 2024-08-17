import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int n, k;
    public static Queue<Integer> stack = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            stack.add(i);
        }

        while (stack.size() != 0) {
            for (int i = 0; i < k - 1; i++) {
                stack.add(stack.poll());
            }
            System.out.print(stack.poll() + " ");
        }


    }
}