import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static String[] dayOfWeek = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    static int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String target = sc.next();
        // Please write your code here.

        int start = toDays(m1, d1);
        int end = toDays(m2, d2);

        int targetIndex = Arrays.asList(dayOfWeek).indexOf(target);

        long count = IntStream.rangeClosed(start, end)
        .filter(day -> (day - start) % 7 == targetIndex)
        .count();

        System.out.print(count);
    }

    static int toDays(int month, int day) {
        int sum = 0;
        for(int i = 1; i < month; i++) {
            sum += days[i];
        }

        return sum + day;
    }
}