import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        int count = 0;
        for(int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (arr[0] > b || arr[1] < a) {
                count++;
            }
        }
        if (count > 1) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}