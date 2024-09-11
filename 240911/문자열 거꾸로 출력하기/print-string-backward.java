import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equals("END")) {
                break;
            }
            for (int i = input.length() - 1; i >= 0; i--) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}