import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = scanner.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arrA[i] - arrB[i];
        }

        String answer = "";
        for (int i = 0; i < n; i++) {
            if (result[i] == 0) {
                answer = "Yes";
            } else {
                answer = "No";
            }
        }
        System.out.println(answer);
    }
}