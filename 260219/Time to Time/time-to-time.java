import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int hour_diff = c - a;
        int minutes_diff = d - b;

        System.out.print(hour_diff * 60 + minutes_diff);
    }
}