import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] forSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            forSum[i + 1] = forSum[i] + arr[i];
        }

        int answer = 0;
        for(int i = 0; i <= n - k; i++) {
            int subSum = forSum[i + k] - forSum[i];
            answer = Math.max(answer, subSum);
        }

        System.out.print(answer);
    }
}