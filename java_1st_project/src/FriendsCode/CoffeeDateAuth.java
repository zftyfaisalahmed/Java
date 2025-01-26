package FriendsCode;

import java.util.Scanner;

public class CoffeeDateAuth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Coffee Date Invitation for Astha!");

        // Auth Questions with YES/NO password responses
        String[] questions = { "Will you go on a coffee date with me?", "Is tonight perfect for our date?" };
        String[] yesPasswords = { "YES", "YES", "YES" };
        String[] noPasswords = { "NOD", "NO", "NO" };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter YES password (" + yesPasswords[i] + ") or NO password (" + noPasswords[i] + "): ");
            String response = input.next().toUpperCase();
            if (response.equals(yesPasswords[i])) {
                System.out.println("You responded YES!");
            } else if (response.equals(noPasswords[i])) {
                System.out.println("You responded NO...");
                return; // Exit program if any NO response
            } else {
                System.out.println("Invalid password. Please try again.");
                i--; // Retry current question
            }
        }
        System.out.println("Coffee date confirmed for tomorrow! I'll pick you up at 6 PM!");
    }
}
