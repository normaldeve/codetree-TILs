import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        if (str1.length() > str2.length()) {
            System.out.println(str1 + " " + str1.length());
        } else if (str2.length() == str1.length()) {
            System.out.println("same");
        } else {
            System.out.println(str2 + " " + str2.length());
        }
    }
}