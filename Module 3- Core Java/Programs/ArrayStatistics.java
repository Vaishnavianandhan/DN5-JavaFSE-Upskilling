import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? : ");
        int size = input.nextInt();

        int numbers[] = new int[size];
        int total = 0;

        for(int i = 0; i < size; i++) {
            System.out.print("Enter Number " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
            total += numbers[i];
        }

        double avg = (double) total / size;

        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);
    }
}