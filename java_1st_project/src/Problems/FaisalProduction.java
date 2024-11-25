package Problems;

import java.util.Scanner;

public class FaisalProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of languages: ");
        int lan = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the number of categories: ");
        int cat = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the number of movies: ");
        int movie = sc.nextInt();
        sc.nextLine();

        String[] languages = new String[lan];
        String[] categories = new String[cat];
        String[] movies = new String[movie];

        System.out.println("Enter the languages: ");
        for (int i = 0; i < lan; i++) {
            System.out.print("Language " + (i + 1) + ": ");
            languages[i] = sc.nextLine();
        }

        System.out.println("Enter the categories: ");
        for (int i = 0; i < cat; i++) {
            System.out.print("Category " + (i + 1) + ": ");
            categories[i] = sc.nextLine();
        }

        System.out.println("Enter the movie names: ");
        for (int i = 0; i < movie; i++) {
            System.out.print("Movie " + (i + 1) + ": ");
            movies[i] = sc.nextLine();
        }

        int[][][] revenues = new int[lan][cat][movie];

        System.out.println("Enter the Last Year Profit (in crores): ");
        int lastYearProfit = sc.nextInt();

        System.out.println("Enter the Investment for 2023-24 (in crores): ");
        int investment = sc.nextInt();

        System.out.println("Enter the revenue (in crores) for each movie: ");
        for (int i = 0; i < lan; i++) {
            System.out.println("Language: " + languages[i]);
            for (int j = 0; j < cat; j++) {
                System.out.println("Category: " + categories[j]);
                for (int k = 0; k < movie; k++) {
                    System.out.print("Revenue for Movie " + movies[k] + ": ");
                    revenues[i][j][k] = sc.nextInt();
                }
            }
        }

        int totalRevenue = 0;
        int[] languageRevenue = new int[lan];

        for (int i = 0; i < lan; i++) {
            for (int j = 0; j < cat; j++) {
                for (int k = 0; k < movie; k++) {
                    totalRevenue += revenues[i][j][k];
                    languageRevenue[i] += revenues[i][j][k];
                }
            }
        }

        int profitOrLoss = totalRevenue - investment;

        System.out.println("\n----- Production House Financial Report -----");

        System.out.println("1. Overall Revenue made from all movies: " + totalRevenue + " Crores");

        System.out.println("\n2. Revenue made by each movie:");
        for (int i = 0; i < lan; i++) {
            System.out.println("Language: " + languages[i]);
            for (int j = 0; j < cat; j++) {
                System.out.println("Category: " + categories[j]);
                for (int k = 0; k < movie; k++) {
                    System.out.println("Revenue for Movie " + movies[k] + ": " + revenues[i][j][k] + " Crores");
                }
            }
        }

        System.out.println("\n3. Revenue made across each language:");
        for (int i = 0; i < lan; i++) {
            System.out.println(languages[i] + ": " + languageRevenue[i] + " Crores");
        }

        if (profitOrLoss > 0) {
            System.out.println("\n4. Overall Profit: " + profitOrLoss + " Crores");
        } else if (profitOrLoss == 0) {
            System.out.println("\n4. No Profit, No Loss.");
        } else {
            System.out.println("\n4. Overall Loss: " + (-profitOrLoss) + " Crores");
        }

        System.out.println("\n5. Profit comparison with last year:");
        if (profitOrLoss > lastYearProfit) {
            System.out.println("This year's profit of " + profitOrLoss + " crores is more than last year's profit of "
                    + lastYearProfit + " crores.");
        } else if (profitOrLoss == lastYearProfit) {
            System.out.println("This year's profit is equal to last year's profit.");
        } else {
            System.out.println("This year's profit of " + profitOrLoss + " crores is less than last year's profit of "
                    + lastYearProfit + " crores.");
        }
    }
}
