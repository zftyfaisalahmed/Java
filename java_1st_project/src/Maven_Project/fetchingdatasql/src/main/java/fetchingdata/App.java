package fetchingdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet res;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");
        System.out.println("Connected to DB");

        // SQL Query
        String sql = "SELECT * FROM employee";
        stmt = con.createStatement();

        // Execute Query
        res = stmt.executeQuery(sql);

        // Print ResultSet
        while (res.next()) {
            System.out.println("ID: " + res.getInt(1));
            System.out.println("Name: " + res.getString(2));
            System.out.println("School: " + res.getString(3));
            System.out.println("Father Name: " + res.getString(4));
            System.out.println("Mother Name: " + res.getString(5));
            System.out.println("Email: " + res.getString(6));
            System.out.println("=========================");
        }

        // Close Resources
        res.close();
        stmt.close();
        con.close();
    }
}