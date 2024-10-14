import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String concat = a + b;
        String reverse = b + a;
        int num1 = Integer.parseInt(concat);
        int num2 = Integer.parseInt(reverse);

        System.out.print(num1 + num2);
    }
}