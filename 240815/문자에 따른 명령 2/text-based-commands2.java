import java.util.Scanner;

public class Main {
    public static int x = 0, y = 0;
    public static int currDir = 3;
    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char cDir = str.charAt(i);
            if (cDir == 'L') currDir = (currDir - 1 + 4) % 4;
            else if (cDir == 'R') currDir = (currDir + 1) % 4;
            else x = x + dx[currDir];
            y = y + dy[currDir];
        }
        System.out.println(x + " " + y);
    }
}