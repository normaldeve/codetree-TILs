import java.util.Scanner;

public class Main {

    public static final int MAX_INT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = MAX_INT;
        for (int i = 0; i < n; i++) {
            int distance = 0;
            for (int j = 0; j < n; j++) {
                distance += Math.abs(j - i) * arr[j];
            }
            distance = Math.min(ans, distance);
        }

        System.out.println(ans);


    }
}