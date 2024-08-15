import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String com = sc.next();

            if (com.equals("push_back")) {
                int num = sc.nextInt();
                list.add(num);
            } else if (com.equals("get")) {
                int index = sc.nextInt();
                System.out.println(list.get(index - 1));
            } else if (com.equals("pop_back")) {
                list.remove(list.size() - 1);
            } else if (com.equals("size")) {
                System.out.println(list.size());
            }
        }
    }
}