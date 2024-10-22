import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[100];
        for(int i = a; i < b; i++) {
            arr[i] = 1;
        }

        for(int i = c; i< d; i++) {
            arr[i] = 1;
        }

        int answer = 0;
        for(int num : arr) {
            if (num == 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}