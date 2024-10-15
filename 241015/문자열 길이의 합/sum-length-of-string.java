import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int len = 0;
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            len += str.length();
            char c = str.charAt(0);
            if (c == 'a') {
                count++;
            }
        }
        System.out.print(len + " " + count);
    }
}