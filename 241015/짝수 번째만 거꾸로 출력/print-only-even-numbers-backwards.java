import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] cArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cArr.length; i++) {
            if ((i + 1) % 2 == 0) {
                sb.append(cArr[i]);
            }
        }
        System.out.print(sb.reverse());
    }
}