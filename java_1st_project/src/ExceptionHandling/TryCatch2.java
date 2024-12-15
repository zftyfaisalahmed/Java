package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the num1 : ");
            int n1 = sc.nextInt();
            System.out.println("Enter the num2 : ");
            int n2 = sc.nextInt();

            int res = n1 / n2;

            System.out.println(res);

            System.out.println("Division Operation is Completed");

            System.out.println("Array Based operation is started");
            System.out.println("Enter the array size : ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.println("Enter the position into which value has to stored : ");
            int pos = sc.nextInt();
            System.out.println("Enter the value to be inserted : ");
            int val = sc.nextInt();

            arr[pos] = val;

            System.out.println("Data added");
            System.out.println("Array operation is completed");
            // Specific catch block
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Excrption generated due to / by 0 problem is handled");
        } catch (InputMismatchException e2) {
            System.out.println("Invalid input is provided");
        } catch (NegativeArraySizeException e3) {
            System.out.println("Array size cannot be negative");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.println("The specified position is beyond the size of the array");
        } catch (Exception e) { // generic catch block
            e.printStackTrace();
        }
    }
}
