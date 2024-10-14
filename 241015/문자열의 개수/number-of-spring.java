import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] arr = new String[200];
        while(true) {
            String str = sc.next();
            if (str.equals("0")) break;
            count++;
            if (count % 2 == 1) {
                arr[count] = str;
            }
        }
        System.out.println(count);
        for(String str : arr) {
            if (str != null) {
                System.out.println(str);
            }
        }
    }
}