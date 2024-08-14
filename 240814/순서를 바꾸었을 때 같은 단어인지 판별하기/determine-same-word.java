import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            if (charA[i] != charB[i]) {
                answer = "No";
            } else {
                answer = "Yes";
            }
        }
        System.out.println(answer);
    }
}