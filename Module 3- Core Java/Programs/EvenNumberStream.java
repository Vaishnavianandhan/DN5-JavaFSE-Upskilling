import java.util.*;
import java.util.stream.Collectors;

public class EvenNumberStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.print("How Many Numbers? : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Number : ");
            numbers.add(sc.nextInt());
        }

        List<Integer> evenList =
                numbers.stream()
                       .filter(num -> num % 2 == 0)
                       .collect(Collectors.toList());

        System.out.println("Even Numbers : " + evenList);
    }
}