import java.io.FilterOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input1 = scanner.next().charAt(0);
        char input2 = scanner.next().charAt(0);

        int sum = input1 + input2;
        int subtract = Math.abs(input1 - input2);
        System.out.println(sum + " " + subtract);
    }
}