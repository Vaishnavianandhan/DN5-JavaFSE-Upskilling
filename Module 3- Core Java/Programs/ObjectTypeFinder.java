import java.util.Scanner;

public class ObjectTypeFinder {

    static void identify(Object obj) {

        switch(obj) {

            case Integer i ->
                    System.out.println(i + " is Integer");

            case Double d ->
                    System.out.println(d + " is Double");

            case String s ->
                    System.out.println(s + " is String");

            default ->
                    System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Integer");
        System.out.println("2.Double");
        System.out.println("3.String");

        System.out.print("Choose : ");
        int choice = sc.nextInt();

        sc.nextLine();

        switch(choice) {

            case 1:
                System.out.print("Enter Integer : ");
                identify(sc.nextInt());
                break;

            case 2:
                System.out.print("Enter Double : ");
                identify(sc.nextDouble());
                break;

            case 3:
                System.out.print("Enter String : ");
                identify(sc.nextLine());
                break;
        }
    }
}