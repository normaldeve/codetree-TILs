import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        if (input == 'a') {
            System.out.println("z");
        } else {
            char answer =(char)(input - 1);
            System.out.println(answer);
        }

    }
}