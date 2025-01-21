package FriendsCode;

import java.util.Scanner;

public class ExtendedLoveStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Extended Love Story Generator!");
        System.out.print("Enter hero's name (you, Faizii): ");
        String heroine = input.nextLine();
        System.out.print("Enter heroine's name (me, Nisha): ");
        String hero = input.nextLine();
        System.out.print("Enter favorite romantic location: ");
        String location = input.nextLine();
        System.out.print("Enter special gift symbolizing love: ");
        String gift = input.nextLine();
        System.out.print("Enter hero's favorite hobby: ");
        String hobby = input.nextLine();
        System.out.print("Enter hero's romantic gesture: ");
        String gesture = input.nextLine();
        System.out.println(generateExtendedLoveStory(heroine, hero, location, gift, hobby, gesture));
    }

    static String generateExtendedLoveStory(String heroine, String hero, String location, String gift, String hobby,
            String gesture) {
        return "Once upon a time, in a world filled with love, " +
                heroine + " and " + hero + " met by chance in " +
                location + ". Their hearts collided like stars aligning." +
                hero + " was captivated by " + heroine + "'s beauty and passion for " +
                hobby + ". As they spent more time together, " +
                hero + " realized " + heroine + " was his soulmate." +
                hero + " gifted " + heroine + " a beautiful " + gift +
                ", symbolizing eternal love. " +
                hero + " even planned a surprise " + gesture +
                " to make " + heroine + "'s heart skip a beat." +
                "Together, they danced under sunset skies, forever entwined.\n" +
                "Their love story became a legend, inspiring generations to come.";
    }
}
