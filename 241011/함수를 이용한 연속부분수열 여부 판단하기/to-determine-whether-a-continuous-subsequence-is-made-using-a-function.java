import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        boolean answer = false;
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        int idx = -1;
        for (int i = 0; i < a; i++) {
            if (arr1[i] == arr2[0]) {
                idx = i;
                break;
            }
        }
        for (int i = 0; i < b; i++) {
            if (arr1[idx + i] != arr2[i]) {
                answer = false;
                break;
            } else {
                answer = true;
            }
        }
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}