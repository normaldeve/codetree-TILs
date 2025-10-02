import java.util.Scanner;
import java.util.*;

public class Main {
    public static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Set을 사용해서 원소가 2개면 통과!

        int count = 0;
        for(int i = x; i <= y; i++) {
            if (getSize(i)) {
                count++;
            }
        }

        System.out.print(count);

    }

    public static boolean getSize(int input) {
        set.clear();

        while(input > 0) {
            set.add(input % 10);
            input = input / 10;
        }

        if (set.size() == 2) {
            return true;
        }

        return false;
    }
}