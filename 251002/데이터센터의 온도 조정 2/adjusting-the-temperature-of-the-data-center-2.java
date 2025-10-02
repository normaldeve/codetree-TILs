import java.util.Scanner;
public class Main {
    static int c, g, h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        int min_temp = 0;
        int max_temp = 0;
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            min_temp = Math.min(min_temp, ta[i]);
            tb[i] = sc.nextInt();
            max_temp = Math.max(max_temp, tb[i]);
        }

        int answer = 0;
        for(int i = min_temp; i <= max_temp; i++) {
            int score = 0;
            int cur_temp = i;

            for(int j = 0; j < n; j++) {
                int t_a = ta[j];
                int t_b = tb[j];
                score += getScore(cur_temp, t_a, t_b);
            }

            answer = Math.max(answer, score);
        }

        System.out.print(answer);

    }

    public static int getScore(int temp, int ta, int tb) {
        if (temp < ta) {
            return c;
        } else if (temp >= ta && temp <= tb) {
            return g;
        } else {
            return h;
        }
    }
}