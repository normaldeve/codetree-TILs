import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        char[] char1 = arr[0].toCharArray();
        char[] char2 = arr[1].toCharArray();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int idx = 0;
        while(idx < char1.length && char1[idx] >= '0' && char1[idx] <= '9') {
            sb1.append(char1[idx]);
            idx++;
        }

        idx = 0;
        while(idx < char2.length && char2[idx] >= '0' && char2[idx] <= '9') {
            sb2.append(char2[idx]);
            idx++;
        }

        int a = Integer.parseInt(sb1.toString());
        int b = Integer.parseInt(sb2.toString());

        System.out.print(a + b);
    }
}