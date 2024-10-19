import java.util.*;

class Person {
    String name;
    int height;
    double weight;
    Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] arr = new Person[5];
        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            arr[i] = new Person(name, height, weight);
        }

        Arrays.sort(arr, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }

        System.out.println();

        Arrays.sort(arr, (a, b) -> (b.height - a.height));
        System.out.println("height");
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i].name + " " + arr[i].height + " " + arr[i].weight);
        }
    }
}