package FriendsCode;

public class LoveLocker {
    public static void main(String[] args) {
        String loverName = "Faizii";
        String secretPassword = "RachLovesYou";
        String userInput = new java.util.Scanner(System.in).nextLine();

        if (userInput.equals(secretPassword)) {
            System.out.println("Love locker opened for " + loverName + " 💕");
            System.out.println("Virtual heart belongs to you...");
            System.out.println("Do you want to 'kiss' or 'love forever'? (type one)");
            String action = new java.util.Scanner(System.in).nextLine();
            if (action.equalsIgnoreCase("kiss")) {
                System.out.println("  *****      ");
                System.out.println(" *     *     ");
                System.out.println("*  💋  *     ");
                System.out.println(" *     *     ");
                System.out.println("  *****      ");
            } else if (action.equalsIgnoreCase("love forever")) {
                System.out.println(loverName + ", my heart belongs to you – forever!");
            }
        } else {
            System.out.println("Wrong password – love locker remains closed 😔");
        }
    }
}
