import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int total_minute = A * 24 * 60 + B * 60 + C;
        int after = 11 * 24 * 60 + 11 * 60 + 11;
        if (total_minute < after) {
            System.out.print(-1);
        } else {
            System.out.print(total_minute - after);
        }
    }
}