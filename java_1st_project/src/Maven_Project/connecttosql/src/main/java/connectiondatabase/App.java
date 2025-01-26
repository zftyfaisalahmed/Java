package connectiondatabase;

import java.sql.Connection;
import java.sql.Statement;
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
    private static Statement stmt;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Step 1: Load the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish Connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");

        if (con == null) {
            System.out.println("Connection Failed");
        } else {
            System.out.println("Connection to the Database");

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Create Table");
                System.out.println("2. Insert");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                int choice = sc.nextInt();

                switch (choice) {
                    case 2:
                        insertData(sc);
                        break;
                    case 3:
                        updateData(sc);
                        break;
                    case 4:
                        deleteData(sc);
                        break;
                    case 1:
                        createTable();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        closeAll();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    private static void createTable() throws SQLException {
        String sql1 = "CREATE TABLE IF NOT EXISTS student1 (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(30), " +
                "school VARCHAR(30), " +
                "fname VARCHAR(30), " +
                "mname VARCHAR(30), " +
                "email VARCHAR(30))";

        try (Statement stmt = con.createStatement()) {
            int result = stmt.executeUpdate(sql1);
            if (result == 0) {
                System.out.println("Table created successfully or already exists.");
            }
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    // Function to insert data
    private static void insertData(Scanner sc) throws SQLException {
        String sql = "INSERT INTO student1 (id, name, school, fname, mname, email) VALUES (?, ?, ?, ?, ?, ?)";
        pstmt = con.prepareStatement(sql);

        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter school:");
        String school = sc.next();
        System.out.println("Enter father name:");
        String fname = sc.next();
        System.out.println("Enter mother name:");
        String mname = sc.next();
        System.out.println("Enter email:");
        String email = sc.next();

        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, school);
        pstmt.setString(4, fname);
        pstmt.setString(5, mname);
        pstmt.setString(6, email);

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Record inserted successfully!");
        } else {
            System.out.println("Failed to insert record.");
        }
    }

    // Function to update data
    private static void updateData(Scanner sc) throws SQLException {
        String sql = "UPDATE student1 SET name = ? WHERE id = ?";
        pstmt = con.prepareStatement(sql);

        System.out.println("Enter id of the record to update:");
        int id = sc.nextInt();
        System.out.println("Enter new name:");
        String newName = sc.next();

        pstmt.setString(1, newName);
        pstmt.setInt(2, id);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Record updated successfully!");
        } else {
            System.out.println("Failed to update record or ID not found.");
        }
    }

    // Function to delete data
    private static void deleteData(Scanner sc) throws SQLException {
        String sql = "DELETE FROM student1 WHERE id = ?";
        pstmt = con.prepareStatement(sql);

        System.out.println("Enter id of the record to delete:");
        int id = sc.nextInt();

        pstmt.setInt(1, id);

        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Record deleted successfully!");
        } else {
            System.out.println("Failed to delete record or ID not found.");
        }
    }

    // Function to close All
    private static void closeAll() throws SQLException {
        if (pstmt != null) {
            pstmt.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("Resources closed successfully.");
    }

}
