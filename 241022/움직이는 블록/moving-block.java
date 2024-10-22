import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] blocks = new int[n];

        int total = 0;
        for(int i =0; i < n; i++) {
            blocks[i] = sc.nextInt();
            total += blocks[i];
        }

        int avg = total / n;
        int answer = 0;

        for(int i = 0; i < n; i++) {
            if (blocks[i] > avg) {
                answer += blocks[i] - avg;
            }
        }
        System.out.print(answer);
    }
}