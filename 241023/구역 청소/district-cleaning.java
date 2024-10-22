import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int start = 0;
        int end = 0;
        if (a < c) {
            start = a;
        } else {
            start = c;
        }

        if (b < d) {
            end = d;
        } else {
            end = b;
        }

        System.out.println(end - start);
    }
}