import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] element = new int[MAX_N];

    public static void selectSort() {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = element[i];
            while (j >= 0 && element[j] > key) {
                element[j + 1] = element[j];
                j--;
            }
            element[j + 1] = key;
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