package mavenemployee;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        JdbcEmployeeOperation j = new JdbcEmployeeOperation();
        j.JdbcEmployeeOp();
        System.out.println("Welecome ot employee management system.\n"
                + "Please select the option to perform\n"
                + "1. Add a new employee\n"
                + "2. view all the employee\n"
                + "3. View emloplyee by id\n"
                + "4. Update the name of the employee\n"
                + "5. Update salary of all employee\n"
                + "6. Update salary of speicfic employee\n"
                + "7. Update the phone number of empolyee\n"
                + "8. Update the email of the employee\n"
                + "9. Delete specific employee\n"
                + "10. Terminate");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                j.insertEmp();
                System.out.println("==============");
                break;
            case 2:
                j.viewAllEmp();
                System.out.println("==============");
                break;
            case 3:
                j.viewSpecificEmp();
                System.out.println("==============");
                break;
            case 4:
                j.updateEmpName();
                System.out.println("==============");
                break;
            case 5:
                j.updateAllEmpSalary();
                System.out.println("==============");
                break;
            case 6:
                j.updatesepicficEmpSalary();
                System.out.println("==============");
                break;
            case 7:
                j.updateEmpPhone();
                System.out.println("==============");
                break;
            case 8:
                j.updateEmpEmail();
                System.out.println("==============");
                break;
            case 9:
                j.deleteEmp();
                System.out.println("==============");
                break;
            case 10:
                System.out.println("Thank you");
                System.exit(0);
            default:
                System.out.println("Wrong Choice. Please try again");
        }
        main(null);
    }
}