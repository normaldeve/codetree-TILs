import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr = new int[n];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (answer < 0) {
                answer = arr[i];
            } else {
                answer += arr[i];
            }
            answer = Math.max(-1000, answer);
        }
        System.out.print(answer);
    }
}