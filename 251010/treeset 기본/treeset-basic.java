import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();

        while (n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("add")) {
                int num = sc.nextInt();
                treeSet.add(num);

            } else if (cmd.equals("remove")) {
                int num = sc.nextInt();
                treeSet.remove(num); // 없어도 예외 없음

            } else if (cmd.equals("find")) {
                int num = sc.nextInt();
                System.out.println(treeSet.contains(num) ? "true" : "false");

            } else if (cmd.equals("lower_bound")) { // >=
                int num = sc.nextInt();
                Integer x = treeSet.ceiling(num);
                System.out.println(x == null ? "None" : x);

            } else if (cmd.equals("upper_bound")) { // >
                int num = sc.nextInt();
                Integer x = treeSet.higher(num);
                System.out.println(x == null ? "None" : x);

            } else if (cmd.equals("largest")) {
                System.out.println(treeSet.isEmpty() ? "None" : treeSet.last());

            } else if (cmd.equals("smallest")) {
                System.out.println(treeSet.isEmpty() ? "None" : treeSet.first());

            } else {
            }
        }
    }
}
