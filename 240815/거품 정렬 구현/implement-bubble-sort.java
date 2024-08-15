import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static int n;
    public static final int MAX_N = 100;

    public static int[] element = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            element[i] = sc.nextInt();
        }

        boolean sorted = true;
        do {
            sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (element[i] > element[i + 1]) {
                    int tmp = element[i];
                    element[i] = element[i + 1];
                    element[i + 1] = tmp;
                    sorted = false;
                }
            }
        } while (!sorted);

        for (int i = 0; i < n; i++) {
            System.out.print(element[i] + " ");
        }

    }
}