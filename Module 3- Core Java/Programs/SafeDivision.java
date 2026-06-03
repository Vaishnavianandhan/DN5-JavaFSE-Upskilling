import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int first = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int second = sc.nextInt();

        try {
            int result = first / second;
            System.out.println("Answer = " + result);
        }
        catch(ArithmeticException e) {
            System.out.println("Division By Zero Not Allowed");
        }

        System.out.println("Execution Completed");
    }
}