import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        String str = Integer.toString(sum);
        String result = "";

        for(int i = 1; i <= str.length(); i++) {
            result += str.charAt(i % 4);
        }
        System.out.print(result);
    }
}