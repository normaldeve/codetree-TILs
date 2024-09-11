import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean existsEE = false;
        boolean existsAB = false;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((i + 2) < input.length() - 1 && input.substring(i, i + 2).equals("ee")) {
                existsEE = true;
            }
            if ((i + 2) < input.length() - 1 && input.substring(i, i + 2).equals("ab")) {
                existsAB = true;
            }
        }
        if (existsEE) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }


        if (existsAB) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}