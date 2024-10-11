import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
// 정말 유명한 황금비율 토스트 문제 였다...
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < n; i++) {
            list.add(str.charAt(i));
        }
        ListIterator<Character> it = list.listIterator(list.size());
        while(m-- > 0) {
            char command = sc.next().charAt(0);

            if(command == 'L') {
                if(it.hasPrevious()) // 빵들의 맨 앞이 아니라면
                    it.previous();   // 앞으로 이동합니다.
            }
            else if(command == 'R') {
                if(it.hasNext())     // 빵들의 맨 뒤가 아니라면
                    it.next();       // 뒤로 이동합니다.
            }
            else if(command == 'D') {
                if(it.hasNext()) {   // 빵들의 맨 뒤가 아니라면
                    it.next();
                    it.remove();     // 바로 뒤에 있는 빵을 제거합니다.
                }
            }
            else if(command == 'P') {
                char c = sc.next().charAt(0);
                it.add(c);           // 가리키는 위치에 문자 c를 추가합니다.
            }
        }
        it = list.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}