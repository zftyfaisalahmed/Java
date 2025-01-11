package ArmStrong;

import java.util.Scanner;

public class NarcissistCode {
	static int findDigitCount(int n) {
		int temp = n;
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count += 1;
		}
		return count;
	}

	static void checkNarcissist(int n) {
		int temp = n;
		double sum = 0;
		int count = findDigitCount(n);
		while (temp > 0) {
			int rem = temp % 10;
			sum = sum + Math.pow(rem, count);
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("the sum of cubes is: " + (sum));
			System.out.println("And the given number is also:" + (n));
			System.out.println("So the given number is armstrong number");
		} else {
			System.out.println("the sum of cubes is: " + (sum));
			System.out.println("And the given number is:" + (n));
			System.out.println("so its not a armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		checkNarcissist(num);

	}

}
