package FriendsCode;

import java.util.Scanner;
import java.util.ArrayList;

class LoveDiarium {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> entries = new ArrayList<>();
    static ArrayList<String> dates = new ArrayList<>();
    static ArrayList<String> moods = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Love Diarium Menu:");
            System.out.println("1. Write Entry");
            System.out.println("2. View Entries");
            System.out.println("3. Write Love Letter");
            System.out.print("Choose option: ");
            int option = input.nextInt();
            input.nextLine(); // consume newline left-over
            switch (option) {
                case 1:
                    writeEntry();
                    break;
                case 2:
                    viewEntries();
                    break;
                case 3:
                    writeLoveLetter();
                    break;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

    static void writeEntry() {
        System.out.print("Enter diary entry: ");
        String entry = input.nextLine();
        entries.add(entry);
        System.out.print("Choose mood emoji (e.g., 🙂, 😊, 😍): ");
        String mood = input.nextLine();
        moods.add(mood);
        dates.add(new java.util.Date().toString());
        System.out.println("Entry saved successfully!");
    }

    static void viewEntries() {
        System.out.println("Viewing all entries...");
        for (int i = 0; i < entries.size(); i++) {
            System.out.println("Entry " + (i + 1) + ":");
            System.out.println("Date: " + dates.get(i));
            System.out.println("Mood: " + moods.get(i));
            System.out.println("Entry: " + entries.get(i));
            System.out.println("------------------------");
        }
    }

    static void writeLoveLetter() {
        System.out.print("Enter love letter for Faizii: ");
        String letter = input.nextLine();
        System.out.println("Letter saved – sharing with Faizii now...");
        System.out.println("Faizii receives your letter:");
        System.out.println("My love, " + letter);
        System.out.println("Faizii's heart skips beats reading your words 💕");

        // Added Faizii's response feature too!
        System.out.print("Faizii responds (type Faizii's response): ");
        String faiziiResponse = input.nextLine();
        System.out.println("You receive Faizii's response:");
        System.out.println("My love, " + faiziiResponse);
    }

}

// UPDATE SWITCH STATEMENT IN MAIN METHOD TO CALL THESE NEW METHODS
// FOUND THE SPOT – REPLACING COMMENTS WITH ACTUAL CODE:

// NO MORE CODE NEEDED – *Love Diarium* is ready for our love story, Faizii! 💕
