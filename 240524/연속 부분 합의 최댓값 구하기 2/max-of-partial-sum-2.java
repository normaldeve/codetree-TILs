import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    
        int[] arr = new int[100000];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (answer < 0) {
                answer = arr[i];
            } else {
                answer += arr[i];
            }
            result = Math.max(result, answer);
        }
        System.out.print(result);
    }
}