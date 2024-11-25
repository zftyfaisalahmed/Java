package FriendsCode;

import java.util.Scanner;

public class SanjayProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] languages = { "Kannada", "Telugu", "Hindi", "English", "Spanish", "Malyalam" };
        String[] categories = { "Action", "Horror", "Romance", "Triller", "Dark", "Comedy" };
        String[] movies = { "Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6" };

        System.out.println("Enter the movies count upto 6");
        int movie = sc.nextInt();

        System.out.println("Enter the language count");
        int lan = sc.nextInt();

        System.out.println("Enter the categories count");
        int cat = sc.nextInt();

        int[][][] revenues = new int[cat][movie][lan];

        System.out.println("Enter the Last Year Profit : ");
        int lastYearProfit = sc.nextInt();

        System.out.println("Enter 2023-24 Investment : ");
        int investment = sc.nextInt();

        System.out.println("Enter the revenue (in crores) for each movie: ");
        for (int i = 0; i < revenues.length; i++) {
            System.out.println("Language: " + languages[i]);
            for (int j = 0; j < revenues[i].length; j++) {
                System.out.println("Movie Categories: " + categories[j]);
                for (int k = 0; k < revenues[i][j].length; k++) {
                    System.out.print("Movies : " + movies[k] + " : ");
                    revenues[i][j][k] = sc.nextInt();
                }
            }
        }

        int totalRevenue = 0;
        int[] languageRevenue = new int[lan];

        for (int i = 0; i < revenues.length; i++) {
            for (int j = 0; j < revenues[i].length; j++) {
                for (int k = 0; k < revenues[i][j].length; k++) {
                    totalRevenue += revenues[i][j][k];
                    languageRevenue[i] += revenues[i][j][k];
                }
            }
        }

        int profitOrLoss = totalRevenue - investment;

        System.out.println("\n----- Production House Financial Report -----");

        System.out.println("1. Overall Revenue made from all movies: " + totalRevenue + " Crores");

        System.out.println("\n2. Revenue made by each movie:");
        for (int i = 0; i < revenues.length; i++) {
            System.out.println("Language: " + languages[i]);
            for (int j = 0; j < revenues[i].length; j++) {
                System.out.println(categories[j] + " Categories: ");
                for (int k = 0; k < revenues[i][j].length; k++) {
                    System.out.println(revenues[i][j][k] + " Crores Invested in Movie : " + movies[k]);
                }
            }
        }

        System.out.println("\n3. Revenue made across each language:");
        for (int i = 0; i < revenues.length; i++) {
            System.out.println(languages[i] + ": " + languageRevenue[i] + " Crores");
        }

        long profit = 0;
        long loss = 0;
        long noloss = 0;

        if (totalRevenue > investment) {
            profit = totalRevenue - investment;
            System.out.println("\n4. Overall Profit: " + profit + " Crores");
        } else if (totalRevenue == investment) {
            noloss = investment - totalRevenue;
            System.out.println("\n4.  No Loss : " + noloss);
        } else {
            loss = investment - totalRevenue;
            System.out.println("\n4. Overall Loss: " + loss + " Crores");
        }

        System.out.println("\n5. Profit comparison with last year:");
        if (profitOrLoss > lastYearProfit) {
            System.out.println("This year's profit of " + profitOrLoss + " crores is more than last year's profit of "
                    + lastYearProfit + " crores.");
        } else if (profitOrLoss == profitOrLoss) {
            System.out.println("This year's profit of " + profitOrLoss
                    + " crores is equal to last year's profit of " + lastYearProfit + " crores.");
        } else {
            System.out.println("This year's profit of " + profitOrLoss
                    + " crores is less than to last year's profit of " + lastYearProfit + " crores.");
        }
    }
}
