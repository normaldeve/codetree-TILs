import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char character = scanner.next().charAt(0);

        int i = input.indexOf(character);
        if (i < 0) {
            System.out.println("No");
        } else {
            System.out.println(i);
        }
    }
}