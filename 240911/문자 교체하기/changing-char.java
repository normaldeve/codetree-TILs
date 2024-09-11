import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        String substring = input1.substring(0, 2);
        String answer = input2.replace(input2.substring(0, 2), substring);
        System.out.println(answer);
    }
}