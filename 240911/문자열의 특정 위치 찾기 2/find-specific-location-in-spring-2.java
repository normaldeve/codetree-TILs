import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        String[] strings = {"apple", "banana", "grape", "blueberry", "orange"};
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(2) == a || strings[i].charAt(3) == a) {
                count++;
                System.out.println(strings[i]);
            }
        }
        System.out.println(count);
    }
}