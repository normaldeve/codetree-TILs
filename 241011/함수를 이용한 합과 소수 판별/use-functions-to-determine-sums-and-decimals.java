import java.util.*;

public class Main {
    public static boolean isPrime(int a) {
        boolean answer = true;
        for(int i = 2; i < a; i++){
            if (a % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static boolean isEven(int a) {
        boolean answer = true;
        int total = 0;
        while (a != 0) {
            int num = a % 10;
            total += num;
            a /= 10;
        }
        if (total % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;

            for(int i = a; i <= b; i++) {
                if (isPrime(i) && isEven(i)){
                    result++;
                }
            }
        System.out.print(result);
    }
}