import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LambdaSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("How Many Names? : ");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Name : ");
            names.add(sc.nextLine());
        }

        Collections.sort(names,
                (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("\nSorted Names");

        names.forEach(System.out::println);
    }
}