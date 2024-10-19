import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    Student(int h, int w, int n) {
        height = h;
        weight = w;
        number = n;
    }
    @Override
    public int compareTo(Student s) {
        if (s.height == height) {
            return s.weight - weight;
        }
        return height - s.height;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();
            arr[i] = new Student(weight, height, i + 1);
        }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i].height + " " + arr[i].weight + " " + arr[i].number);
            System.out.println();
        }
    }
}