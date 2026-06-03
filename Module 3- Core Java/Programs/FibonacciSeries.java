import java.util.Scanner;

public class FibonacciSeries {

    static int fib(int n) {
        if(n < 2)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Position : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Value = " + fib(n));
    }
}