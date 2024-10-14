import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = Integer.toString(n);

        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i) - '0';
            answer += tmp;
        }
        System.out.print(answer);
    }
}