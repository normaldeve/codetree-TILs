import java.util.Scanner;

public class Main {
    public static int n;
    public static final int MAX_N = 1000;

    public static int[] check = new int[MAX_N + 1];
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            check[arr[i]] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] == arr[i - 1]) {
                check[arr[i]]++;
            }
        }

        int maxCount = 0;
        for (int i : check) {
            if (i > maxCount) {
                maxCount = i;
            }
        }
        System.out.println(maxCount);
    }
}