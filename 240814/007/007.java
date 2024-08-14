import java.util.Arrays;
import java.util.Scanner;

class Secret {
     String scret_code;
     char meeting_point;
     int time;

    public Secret(String scret_code, char meeting_point, int time) {
        this.scret_code = scret_code;
        this.meeting_point = meeting_point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scret_code = sc.next();
        char meeting_point = sc.next().charAt(0);
        int time = sc.nextInt();

        Secret secret = new Secret(scret_code, meeting_point, time);
        System.out.println("secret code = " + secret.scret_code);
        System.out.println("meeting point : " + secret.meeting_point);
        System.out.println("time : " + secret.time);
    }
}