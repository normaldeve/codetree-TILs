import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 출력
        // a가 중앙값
        if (b > c) {
            if (b > a && a > c) {
                System.out.print(a);
            }
        }
        // b < c
        else {
            if (c > a && a > b) {
                System.out.print(a);
            }
        }

        // b가 중앙값
        if (a > c) {
            if (a > b && b > c) {
                System.out.print(b);
            }
        }
        // a < c
        else {
            if (b > a && c > b) {
                System.out.print(b);
            }
        }

        // c가 중앙값
        if (a > b) {
            if (a > c && c > b) {
                System.out.print(c);
            }
        }
        // a < b
        else {
            if (b > c && c > a) {
                System.out.print(c);
            }
        }



    }
}