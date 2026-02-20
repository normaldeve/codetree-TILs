import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // while을 돌면서 날짜를 1씩 올려준다.
        // 특정 월에 말일이 되면 월을 1올리고 일을 1로 변경한다.

        int day_diff = 0; // 날짜 차이 -> 결과
        int[] day_of_month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {
            if (m1 == m2 && d1 == d2) break;

            day_diff++;
            d1++;

            if (d1 > day_of_month[m1]) {
                m1++;
                d1 = 1;
            }
        }

        System.out.print(day_diff + 1);
    }
}