import java.util.Scanner;

public class Myself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of langues");
        int lan = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the number of Cat");
        int cat = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the number of Movie");
        int mov = sc.nextInt();
        sc.nextLine();

        String[] language = new String[lan];
        String[] categories = new String[cat];
        String[] movies = new String[mov];

        System.out.println("Enter the lang");
        for (int i = 0; i < lan; i++) {
            System.out.println("Language " + (i + 1) + " : ");
            language[i] = sc.nextLine();
        }

        System.out.println("Enter the Cat");
        for (int i = 0; i < lan; i++) {
            System.out.println("Categories " + (i + 1) + " : ");
            categories[i] = sc.nextLine();
        }

        System.out.println("Enter the Movies");
        for (int i = 0; i < lan; i++) {
            System.out.println("Movies " + (i + 1) + " : ");
            movies[i] = sc.nextLine();
        }

        int[][][] revenues = new int[lan][cat][mov];

        System.out.println("Enter the last year profit : ");
        int lastYearProfit = sc.nextInt();

        System.out.println("Enter the Investment for 2023-24 : ");
        int investment = sc.nextInt();

        System.out.println("Enter the revenue (in crores) for each movie : ");
        for (int i = 0; i < lan; i++) {
            System.out.println("Language : " + language[i]);
            for (int j = 0; i < cat; j++) {
                System.out.println("Categories : " + categories[j]);
                for (int k = 0; k < mov; k++) {
                    System.out.println("Movie : " + movies[k] + " : ");
                    revenues[i][j][k] = sc.nextInt();
                }
            }
        }

    }
}
