import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] charArray = input.toCharArray();
        charArray[1] = 'a';
        charArray[charArray.length - 2] = 'a';
        String answer = String.valueOf(charArray);
        System.out.println(answer);
    }
}