package Problems;

import java.util.Scanner;

public class SirCode {

	public static void main(String[] args) {
		long overall_revenue = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the language count");
		int lan = sc.nextInt();
		long arr_lang[] = new long[lan];

		System.out.println("Enter the categories count");
		int cat = sc.nextInt();

		System.out.println("Enter the movies count");
		int movies = sc.nextInt();

		long arr[][][] = new long[lan][cat][movies];

		System.out.println("Enter the previous year profit");
		long pre_profit = sc.nextLong();

		System.out.println("Enter the current year investment");
		long investment = sc.nextLong();

		System.out.println("Collecting the revenue for each movies");
		for (int i = 0; i < arr.length; i++) {
			int temp = i;
			long revenue = 0;
			System.out.println("Language Number: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Category Number" + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the revenue made by movie number: " + (k + 1));
					arr[i][j][k] = sc.nextLong();

					overall_revenue = overall_revenue + arr[i][j][k];
					revenue = revenue + arr[i][j][k];
				}
			}
			arr_lang[temp] = revenue;
		}

		System.out.println("===============");
		System.out.println("Revenue made by the each movie: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Language number: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Category number: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("The revenue made by movie number: " + (k + 1) + " is " + arr[i][j][k]);
				}
			}
		}

		System.out.println("=====================");
		System.out.println("The overall revernue is: " + (overall_revenue));
		System.out.println("======================");
		System.out.println("Revenue made across each language: ");
		for (int i = 0; i < arr_lang.length; i++) {
			System.out.println("the revenue of language no: " + (i + 1) + "=" + (arr_lang[i]));
		}

		System.out.println("======================");
		long profit = 0;
		long loss = 0;
		if (overall_revenue > investment) {
			profit = overall_revenue - investment;
			System.out.println("sahil is on profit side with the profit of :" + (profit));
		} else {
			loss = investment - overall_revenue;
			System.out.println("sahil is on loss side with the loss of :" + (loss));
		}

		System.out.println("======================");
		if (profit > pre_profit) {
			System.out.println("sahil has profit more than last year");
		} else {
			System.out.println("sahil not having profit more than last year");
		}

	}

}