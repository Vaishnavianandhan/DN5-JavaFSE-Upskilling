import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        long factValue = 1;

        for(int count = number; count >= 1; count--) {
            factValue *= count;
        }

        System.out.println("Factorial = " + factValue);
    }
}