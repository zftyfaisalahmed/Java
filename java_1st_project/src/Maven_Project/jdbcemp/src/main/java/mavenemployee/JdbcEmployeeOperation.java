package mavenemployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEmployeeOperation {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet res;
    private PreparedStatement pstmt;
    Scanner sc = new Scanner(System.in);

    public void JdbcEmployeeOp() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/janjdbc", "root", "@Faisal123");

            if (con == null) {
                System.out.println("Connection Failed");
            } else {
                System.out.println("Connection to the Database");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertEmp() {
        try {
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

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully!");
            } else {
                System.out.println("Failed to insert record.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewAllEmp() {
        try {
            String sql = "SELECT * FROM employee";
            stmt = con.createStatement();
            res = stmt.executeQuery(sql);

            System.out.println("Employee Details:");
            while (res.next()) {
                System.out.println("ID: " + res.getInt("eid") + ", Name: " + res.getString("ename") +
                        ", Salary: " + res.getInt("salary") + ", Phone: " + res.getLong("phone") +
                        ", Email: " + res.getString("email") + ", Age: " + res.getInt("age") +
                        ", Experience: " + res.getInt("exp") + ", Company: " + res.getString("company"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewSpecificEmp() {
        try {
            System.out.println("Enter Employee ID:");
            int eid = sc.nextInt();

            String sql = "SELECT * FROM employee WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eid);

            res = pstmt.executeQuery();
            if (res.next()) {
                System.out.println("ID: " + res.getInt("eid") + ", Name: " + res.getString("ename") +
                        ", Salary: " + res.getInt("salary") + ", Phone: " + res.getLong("phone") +
                        ", Email: " + res.getString("email") + ", Age: " + res.getInt("age") +
                        ", Experience: " + res.getInt("exp") + ", Company: " + res.getString("company"));
            } else {
                System.out.println("No Employee Found with ID: " + eid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmpName() {
        try {
            System.out.println("Enter Employee ID:");
            int eid = sc.nextInt();
            System.out.println("Enter New Name:");
            String newName = sc.next();

            String sql = "UPDATE employee SET ename = ? WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, newName);
            pstmt.setInt(2, eid);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee Name Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateAllEmpSalary() {
        try {
            System.out.println("Enter the Percentage Increment for All Employees:");
            int percentage = sc.nextInt();

            String sql = "UPDATE employee SET salary = salary + (salary * ? / 100)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, percentage);

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated + " Employees' Salaries Updated Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatesepicficEmpSalary() {
        try {
            System.out.println("Enter Employee ID:");
            int eid = sc.nextInt();
            System.out.println("Enter New Salary:");
            int newSalary = sc.nextInt();

            String sql = "UPDATE employee SET salary = ? WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, newSalary);
            pstmt.setInt(2, eid);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee Salary Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmpPhone() {
        try {
            System.out.println("Enter Employee ID:");
            int eid = sc.nextInt();
            System.out.println("Enter New Phone Number:");
            long newPhone = sc.nextLong();

            String sql = "UPDATE employee SET phone = ? WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setLong(1, newPhone);
            pstmt.setInt(2, eid);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee Phone Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateEmpEmail() {
        try {
            System.out.println("Enter Employee ID:");
            int eid = sc.nextInt();
            System.out.println("Enter New Email:");
            String newEmail = sc.next();

            String sql = "UPDATE employee SET email = ? WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, newEmail);
            pstmt.setInt(2, eid);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee Email Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmp() {
        try {
            System.out.println("Enter Employee ID to Delete:");
            int eid = sc.nextInt();

            String sql = "DELETE FROM employee WHERE eid = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eid);

            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee Deleted Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
