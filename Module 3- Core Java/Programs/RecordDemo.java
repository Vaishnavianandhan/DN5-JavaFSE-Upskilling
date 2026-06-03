import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        System.out.print("How Many Persons? : ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            people.add(new Person(name, age));
        }

        System.out.println("\nAll Persons");

        people.forEach(System.out::println);

        System.out.println("\nAge >= 18");

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}