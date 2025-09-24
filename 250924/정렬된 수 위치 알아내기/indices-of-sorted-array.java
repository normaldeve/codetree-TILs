import java.util.Scanner;
import java.util.Arrays;

class Number implements Comparable<Number> {
    int num;
    int index;

    public Number(int num, int index) {
        this.num = num;
        this.index = index;
    }

    @Override
    public int compareTo(Number number) {
        if (this.num != number.num) {
            return this.num - number.num;
        }

        return this.index - number.index;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Number[] numbers = new Number[n];
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            numbers[i] = new Number(x, i);
        }
        
        Arrays.sort(numbers);

        for(int i = 0; i < n; i++) 
            answer[numbers[i].index] = i + 1;

        // 출력:
        for(int i = 0; i < n; i++){
            System.out.print(answer[i] + " ");
        }
    }
}