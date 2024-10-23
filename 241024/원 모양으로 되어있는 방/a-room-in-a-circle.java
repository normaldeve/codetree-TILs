import java.util.*;

class People {
    int num;
    int count;
    People(int num, int count) {
        this.num = num;
        this.count = count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        People[] people = new People[n];
        for(int i = 0; i < n; i++) {
            int count = sc.nextInt();
            people[i] = new People(i + 1, count);
        }

        int minDist = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int tmp_Dist = 0;
            for(int j = 0; j < n; j++) {
                int dist = (j + n - i) % n;
                tmp_Dist += dist * people[j].count;
            }
            minDist = Math.min(tmp_Dist, minDist);
        }
        System.out.print(minDist);
    }
}