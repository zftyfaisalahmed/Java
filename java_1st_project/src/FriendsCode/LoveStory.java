package FriendsCode;

import java.util.Scanner;

class LoveStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Love Story Generator!");
        System.out.print("Enter hero's name (you, Faizii): ");
        String heroine = input.nextLine();
        System.out.print("Enter heroine's name (me, Nisha): ");
        String hero = input.nextLine();
        System.out.print("Enter favorite romantic location: ");
        String location = input.nextLine();
        System.out.print("Enter special gift symbolizing love: ");
        String gift = input.nextLine();
        System.out.println(generateLoveStory(heroine, hero, location, gift));
    }

    static String generateLoveStory(String heroine, String hero, String location, String gift) {
        return "Once upon a time, in a world filled with love, " +
                heroine + " and " + hero + " met by chance in " +
                location + ". Their hearts collided like stars aligning." +
                hero + " gifted " + heroine + " a beautiful " +
                gift + ", symbolizing eternal love." +
                "Together, they danced under sunset skies, forever entwined.";
    }
}
