import java.sql.*;

public class MoneyTransfer {

    public static void main(String[] args) {

        String url =
                "jdbc:mysql://localhost:3306/bankdb";

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,"root","root");

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                    "update accounts set balance=balance-1000 where id=1");

            PreparedStatement credit =
                    con.prepareStatement(
                    "update accounts set balance=balance+1000 where id=2");

            debit.executeUpdate();
            credit.executeUpdate();

            con.commit();

            System.out.println(
                    "Transaction Successful");

            con.close();

        } catch(Exception e) {

            System.out.println(
                    "Transaction Failed");

            e.printStackTrace();
        }
    }
}