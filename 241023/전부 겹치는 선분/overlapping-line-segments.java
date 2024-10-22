import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];

        int idx = 0;
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        boolean isOverlap = true;
        for(int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (arr[1] < a || arr[0] > b) {
                isOverlap = false;
                break;
            }
        }
        if (isOverlap) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}