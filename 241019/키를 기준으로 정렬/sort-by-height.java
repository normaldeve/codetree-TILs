import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;
    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] arr = new Person[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Person(name, height, weight);
        }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }
    }
}