import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = Integer.MIN_VALUE;
        for(int i = x; i <= y; i++) {
            int num = i;
            int cal = calculate(num);
            answer = Math.max(cal, answer);
        }

        System.out.print(answer);
    }

    public static int calculate(int x) {
        int sum = 0;
        while(x > 0) {
            sum += (x % 10);
            x /= 10;
        }

        return sum;
    }
}