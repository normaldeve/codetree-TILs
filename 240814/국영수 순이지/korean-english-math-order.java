import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    public String name;
    public int kor_score;
    public int eng_score;
    public int math_score;

    public Student(String name, int kor_score, int eng_score, int math_score) {
        this.name = name;
        this.kor_score = kor_score;
        this.eng_score = eng_score;
        this.math_score = math_score;
    }

    @Override
    public int compareTo(Student student) {
        if (this.kor_score != student.kor_score) {
            return student.kor_score - this.kor_score;
        }

        if (this.eng_score != student.eng_score) {
            return student.eng_score - this.eng_score;
        }

        return student.math_score - this.math_score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor_score = sc.nextInt();
            int eng_score  = sc.nextInt();
            int math_score = sc.nextInt();
            students[i] = new Student(name,  kor_score, eng_score,math_score);
        }

        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].kor_score + " " + students[i].eng_score + " " + students[i].math_score);
        }
    }
}