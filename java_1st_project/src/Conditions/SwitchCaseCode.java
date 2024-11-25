package Conditions;

import java.util.Scanner;

public class SwitchCaseCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {

			case 1:
				System.out.println("Choice made is 1");
				break;
			case 2:
				System.out.println("Choice made is 2");
				break;
			default:
				System.out.println("No Choices are made");
				break;

		}
	}

}
