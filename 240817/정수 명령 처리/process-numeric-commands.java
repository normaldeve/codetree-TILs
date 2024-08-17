import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int n;
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String string = sc.next();
            if (string.equals("push")) {
                int x = sc.nextInt();
                stack.push(x);
            } else if (string.equals("pop")) {
                System.out.println(stack.pop());
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