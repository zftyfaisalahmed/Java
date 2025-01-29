package jdbcexecute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    private static Connection con;
    private static PreparedStatement pstmt;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");
        String sql = "INSERT INTO employee ( ename, salary, phone, email, age, exp, company) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pstmt = con.prepareStatement(sql);

        // System.out.println("Enter Id");
        // int eid = sc.nextInt();
        System.out.println("Enter Name:");
        String ename = sc.next();
        System.out.println("Enter Salary:");
        int salary = sc.nextInt();
        System.out.println("Enter Phone Number:");
        long phone = sc.nextLong();
        System.out.println("Enter Email:");
        String email = sc.next();
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.println("Enter Experience:");
        int exp = sc.nextInt();
        System.out.println("Enter Company:");
        String company = sc.next();

        // pstmt.setInt(1, eid);
        pstmt.setString(1, ename);
        pstmt.setInt(2, salary);
        pstmt.setLong(3, phone);
        pstmt.setString(4, email);
        pstmt.setInt(5, age);
        pstmt.setInt(6, exp);
        pstmt.setString(7, company);

        boolean rowsInserted = pstmt.execute();
        if (rowsInserted == true) {
            System.out.println("Record inserted successfully!");
        } else {
            System.out.println("Failed to insert record.");
        }
    }
}
