import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if (cmd.equals("push_front")) {
                int num = sc.nextInt();
                list.addFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = sc.nextInt();
                list.addLast(num);
            } else if (cmd.equals("pop_front")) {
                System.out.println(list.pollFirst());
            } else if (cmd.equals("pop_back")) {
                System.out.println(list.pollLast());
            } else if (cmd.equals("size")) {
                System.out.println(list.size());
            } else if (cmd.equals("empty")) {
                if (list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (cmd.equals("front")) {
                System.out.println(list.peekFirst());
            } else {
                System.out.println(list.peekLast());
            }
        }

    }
}