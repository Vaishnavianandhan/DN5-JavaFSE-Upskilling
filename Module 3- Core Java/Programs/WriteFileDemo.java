import java.io.FileWriter;
import java.util.Scanner;

public class WriteFileDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Text : ");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");

            fw.write(text);
            fw.close();

            System.out.println("Data Written Successfully");
        }
        catch(Exception e) {
            System.out.println("Error : " + e);
        }
    }
}