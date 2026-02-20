import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        if (A < 11 || B < 11 || C < 11) {
            System.out.print(-1);
            return;
        }

        int day_diff = A - 11;
        int hour_diff = B - 11;
        int minute_diff = C - 11;

        System.out.print(day_diff * 24 * 60 + hour_diff * 60 + minute_diff);
    }
}