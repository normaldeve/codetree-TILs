import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrray = new String[10];

        for (int i = 0; i < 10; i++) {
            arrray[i] = scanner.next();
        }

        for (int i = 0; i < arrray.length; i += 2) {
            System.out.println(arrray[i]);
        }

    }
}