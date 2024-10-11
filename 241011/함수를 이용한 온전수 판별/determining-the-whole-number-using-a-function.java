import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for(int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 10 == 5 || i % 3 == 0 && i % 9 != 0) {
                continue;
            }
            count++;
        }
        System.out.print(count);
    }
}