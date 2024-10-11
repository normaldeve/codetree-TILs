import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = false;
        do {
            sorted = true;
            for(int i = 0; i < arr.length - 1; i ++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sorted = false;
                }
            }
        } while (sorted == false);
        for(int number : arr) {
            System.out.print(number + " ");
        }
    }
}