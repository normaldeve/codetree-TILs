import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int index = scanner.nextInt();
        if (index > input.length()) {
            for (int i = input.length() - 1; i >= 0; i--) {
                System.out.print(input.charAt(i));
            }
        } else {
            for (int i = input.length() - 1; i >= input.length() - index ; i--) {
                System.out.print(input.charAt(i));
            }
        }
    }
}