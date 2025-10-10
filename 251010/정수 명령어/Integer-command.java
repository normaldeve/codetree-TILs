import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            treeSet.clear();
            for (int i = 0; i < n; i++) {
                char command = sc.next().charAt(0);
                int num = sc.nextInt();
                if (command == 'I') {
                    treeSet.add(num);
                } else {
                    if (!treeSet.isEmpty()) {
                        if (num < 0) {
                            treeSet.remove(treeSet.first());
                        } else {
                            treeSet.remove(treeSet.last());
                        }
                    }
                }
            }

            if (treeSet.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(treeSet.last() + " " + treeSet.first());
            }
        }
    }
}