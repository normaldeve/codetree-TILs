import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrray = new String[10];

        for (int i = 0; i < 10; i++) {
            arrray[i] = scanner.next();
        }
        char a = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < arrray.length; i ++) {
            if (arrray[i].charAt(arrray[i].length() - 1) == a) {
                count++;
                System.out.println(arrray[i]);
            }
        }
        if (count == 0) {
            System.out.println("None");
        }
    }
}