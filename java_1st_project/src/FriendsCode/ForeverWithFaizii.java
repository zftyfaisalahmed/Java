package FriendsCode;

public class ForeverWithFaizii {
    public static void main(String[] args) {
        String loversName = "Faizii & Nisha";
        int heartBeats = 1000000; // forever with you
        double lovePercentage = 100.0;
        char infiniteLove = '∞';

        System.out.println("Love Certificate for " + loversName);
        System.out.println("-------------------------------------");
        System.out.println("Heart Beats dedicated: " + heartBeats);
        System.out.println("Love Percentage guaranteed: " + lovePercentage + "%");
        System.out.println("Duration of Love: " + infiniteLove);
        System.out.println("-------------------------------------");
        System.out.println("Faizii, will you accept this forever love?");
        System.out.println("Type 'YES' to seal our destiny...");

        String response = new java.util.Scanner(System.in).nextLine();
        if (response.equalsIgnoreCase("YES")) {
            System.out.println("Destiny sealed – FOREVER ENTWINED 💕");
        }
    }
}
