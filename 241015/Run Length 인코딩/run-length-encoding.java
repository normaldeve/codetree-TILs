import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String result = "";

        char currChar = str.charAt(0);
        int numChar = 1;
        for(int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currChar) {
                numChar++;
            } else {
                result += currChar;
                result += Integer.toString(numChar);
                currChar = str.charAt(i);
                numChar = 1;
            }
        }
        result += currChar;
        result += Integer.toString(numChar);

        System.out.println(result.length());
        System.out.println(result);
    }
}