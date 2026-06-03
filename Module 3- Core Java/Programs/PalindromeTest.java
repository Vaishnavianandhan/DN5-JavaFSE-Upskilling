import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Word : ");
        String word = sc.nextLine();

        String cleaned = word.replaceAll("[^a-zA-Z0-9]", "")
                             .toLowerCase();

        String reverse = "";

        for(int i = cleaned.length() - 1; i >= 0; i--) {
            reverse += cleaned.charAt(i);
        }

        if(cleaned.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}