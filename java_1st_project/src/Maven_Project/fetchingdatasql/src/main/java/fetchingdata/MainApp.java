package fetchingdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet res;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");

        System.out.println("Connected Successfully");

        String sql = "SELECT * from employee";
        stmt = con.createStatement();

        res = stmt.executeQuery(sql);

    }
}
