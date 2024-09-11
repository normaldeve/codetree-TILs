import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (input.equals(scanner.next())) {
                count++;
            }
        }
        System.out.println(count);
    }
}