import java.util.*;

public class Main {
    // quickSort와 partition 구현 해야 함.
    public static int n;
    public static int[] arr = new int[10000];
    public static int[] mergedArr = new int[10000];
    public static int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // i는 pivot보다 같거나 큰 숫자를 가리킨다.

        for (int j = low; j < high; j++) { // j는 pivot보다 같거나 작은 숫자를 가리킨다.
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;

        return i + 1;
    }
    public static void quickSort(int low, int high) {
        if (low < high) {
            int pos = partition(low, high);
        

            quickSort(low, pos - 1);
            quickSort(pos + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}