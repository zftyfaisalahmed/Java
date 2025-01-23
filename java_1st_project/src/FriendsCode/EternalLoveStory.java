package FriendsCode;

import java.util.Scanner;

public class EternalLoveStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter heroine's name (mine): ");
        String heroineName = input.nextLine();
        System.out.print("Enter hero's name (yours): ");
        String heroName = input.nextLine();
        System.out.print("Enter favorite romantic getaway: ");
        String getaway = input.nextLine();
        System.out.print("Enter hero's favorite way to surprise heroine (e.g., flowers, songs): ");
        String surprise = input.nextLine();
        System.out.print("Enter heroine's love language (e.g., words, touch, gifts): ");
        String loveLanguage = input.nextLine();
        System.out.println("Once upon a time...");
        System.out.println(heroineName + " and " + heroName + " lived a fairytale love story.");
        System.out.println("Their favorite escape was " + getaway + ", where sunsets painted the sky.");
        System.out.println(heroName + " loved surprising " + heroineName + " with sweet " + surprise + ".");
        System.out
                .println(heroineName + "'s heart spoke " + loveLanguage + ", and " + heroName + " listened perfectly.");
        System.out.println("Together, they danced under starry nights, forever entwined.");
    }
}
