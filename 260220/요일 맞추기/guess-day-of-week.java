import java.util.*;

public class Main {
    static String[] day_of_week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int day_diff = numOfDays(m2, d2) - numOfDays(m1, d1);

        while(day_diff < 0){
            day_diff += 7;
        }

        System.out.print(day_of_week[day_diff % 7]);
    }

    public static int numOfDays(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        totalDays += d;
        
        return totalDays;
    }
}