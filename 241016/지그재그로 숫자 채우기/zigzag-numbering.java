import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[100][100];

        int num = 0;
        for(int col = 0; col < m; col++) {
            if (col % 2 == 0) {
                for(int row = 0; row < n; row++) {
                    arr[row][col] = num++;
                }
            } else {
                for(int row = n - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}