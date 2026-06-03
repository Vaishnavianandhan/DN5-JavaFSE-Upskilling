import java.util.Scanner;

public class OverloadDemo {

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter 2 decimal values: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.print("Enter 3 integers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Sum1 = " + add(a,b));
        System.out.println("Sum2 = " + add(d1,d2));
        System.out.println("Sum3 = " + add(p,q,r));
    }
}