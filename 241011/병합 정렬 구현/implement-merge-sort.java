import java.util.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static  int[] mergedArr = new int[100000];
    public static void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public static void merge(int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        int k = low;
        while(i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            mergedArr[k++] = arr[i++];
        }

        while(j <= high) {
            mergedArr[k++] = arr[j++];
        }

        for(int l = low; l <= high; l++){
            arr[l] = mergedArr[l];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(0, n - 1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}