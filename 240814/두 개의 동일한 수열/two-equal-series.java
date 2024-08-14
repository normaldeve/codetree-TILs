import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static int n;
    public static int[] a = new int[MAX_N];
    public static int[] b = new int[MAX_N];
    
    public static boolean equal() {
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if (equal()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 
    }
}