import java.util.Scanner;
import java.util.*;

public class Main {
    static int[] arr;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            System.out.println(binarySearch(x));
        }
    }

    static int binarySearch(int target) {
        int left_index = 0;
        int right_index = n - 1;

        while(left_index <= right_index) {
            int mid = left_index + (right_index - left_index) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            }
            if (arr[mid] < target) {
                left_index = mid + 1;
            } else {
                right_index = mid - 1;
            }
        }

        return -1;
    }
}