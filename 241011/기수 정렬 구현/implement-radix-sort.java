import java.util.*;

public class Main {
    public static final int DIGIT = 10;
    public static int n;
    public static int[] arr;
    public static void radixSort() {
        int p = 1;
        int maxDigits = (int) Math.log10(arr[0]) + 1;
        for(int pos = 0; pos < maxDigits; pos++) {
            ArrayList<Integer>[] arrNew = new ArrayList[DIGIT];
            for(int i = 0; i < DIGIT; i++){
                arrNew[i] = new ArrayList<>();
            }

            for(int i = 0; i < n; i++){
                int digit = (arr[i] / p) % 10;
                arrNew[digit].add(arr[i]);
            }

            int index = 0;
            for(int i = 0; i < DIGIT; i++) {
                for(int j = 0; j < arrNew[i].size(); j++){
                    arr[index++] = arrNew[i].get(j);
                }
            }
            p *= 10;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
        radixSort();
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}