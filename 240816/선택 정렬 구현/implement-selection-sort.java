import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] element = new int[MAX_N];

    public static void selectSort() {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (element[minIndex] > element[j]) {
                    minIndex = j;
                }
            }
            int tmp = element[i];
            element[i] = element[minIndex];
            element[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            element[i] = sc.nextInt();
        }

        selectSort();

        for (int i = 0; i < n; i++) {
            System.out.print(element[i] + " ");
        }
    }
}