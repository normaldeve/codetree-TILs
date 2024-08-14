import java.util.Arrays;
import java.util.Scanner;

class User {
    char code;
    int score;

    public User(char code, int score) {
        this.code = code;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            char code = sc.next().charAt(0);
            int score = sc.nextInt();
            users[i] = new User(code, score);
        }

        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (users[minIndex].score > users[i].score) {
                minIndex = i;
            }
        }

        System.out.println(users[minIndex].code + " " + users[minIndex].score);
    }
}