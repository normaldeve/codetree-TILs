import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i< n; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int sum = 0;
        int count = 0;

        for(int i = 0; i< n; i++) {
            char tmp = arr[i].charAt(0);
            if (tmp == c) {
                sum += arr[i].length();
                count++;
            }
        }
        float result = (float)sum / count;
        System.out.printf(count + " %.2f", result);
    }
}