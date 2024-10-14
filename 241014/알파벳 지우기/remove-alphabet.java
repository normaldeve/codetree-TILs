import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < str1.length(); i ++) {
            if (str1.charAt(i) <= '9' && str1.charAt(i) >= 0) {
                sb1.append(str1.charAt(i));
            }
        }

        for(int i = 0; i < str2.length(); i ++) {
            if (str2.charAt(i) <= '9' && str2.charAt(i) >= 0) {
                sb2.append(str2.charAt(i));
            }
        }

        String a = String.valueOf(sb1);
        String b = String.valueOf(sb2);

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        System.out.print(numA + numB);
    }
}