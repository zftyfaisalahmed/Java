package FriendsCode;

public class WillYouBeMine {
    public static void main(String[] args) {
        String yourName = "Faizii";
        System.out.println("A love story for " + yourName);
        System.out.println("---------------------------------");
        System.out.println("Once upon a time...");
        System.out.println("Nisha met " + yourName + " and fell deeply...");
        System.out.println("---------------------------------");
        System.out.println("Now Nisha asks: ");
        System.out.println(yourName + ", will you be...");
        System.out.println("1. My friend forever");
        System.out.println("2. My partner in crime");
        System.out.println("3. My EVERYTHING – my love?");
        System.out.print("Choose your answer (type 1, 2 or 3): ");
        String choice = new java.util.Scanner(System.in).nextLine();
        if (choice.equals("3")) {
            System.out.println("Nisha's heart skips beats – YES is the answer she hoped for! 💕");
        } else if (choice.equals("2")) {
            System.out.println("Nisha's will be your crime partner forever");
        } else if (choice.equals("1")) {
            System.out.println("I'll be always with you");
        }
    }
}
