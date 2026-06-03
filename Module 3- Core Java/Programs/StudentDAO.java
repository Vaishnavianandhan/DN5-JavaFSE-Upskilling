import java.sql.*;
import java.util.Scanner;

public class StudentDAO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url =
                "jdbc:mysql://localhost:3306/studentdb";

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,"root","root");

            System.out.print("Enter ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            PreparedStatement insert =
                    con.prepareStatement(
                    "insert into students values(?,?)");

            insert.setInt(1,id);
            insert.setString(2,name);

            insert.executeUpdate();

            System.out.println(
                    "Record Inserted Successfully");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}