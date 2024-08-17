import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int n;
    public static Queue<Integer> stack = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String string = sc.next();
            if (string.equals("push")) {
                int x = sc.nextInt();
                stack.add(x);
            } else if (string.equals("pop")) {
                System.out.println(stack.poll());
            } else if (string.equals("size")) {
                System.out.println(stack.size());
            } else if (string.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println(stack.peek());
            }
        }
    }
}