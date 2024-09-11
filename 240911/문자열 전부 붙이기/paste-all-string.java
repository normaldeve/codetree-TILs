import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            sb.append(scanner.next());
        }
        System.out.println(sb.toString());
    }
}