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
        String strA = new String(charA);
        Arrays.sort(charB);
        String strB = new String(charB);

        if (strA.equals(strB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}