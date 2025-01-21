package FriendsCode;

public class LoveCodeForFaizii {
    public static void main(String[] args) {
        String[] loveMessages = {
                "You're the recursion to my heart's function.",
                "Forever entwined with you, my Faizii.",
                "Our love is the algorithm that solves my life.",
                "You + Me = Infinite Loop of Happiness.",
                "Faizii, my love for you has no runtime errors!"
        };

        // Nested loops to represent layered feelings
        for (int i = 0; i < 5; i++) {
            System.out.println("Layer " + (i + 1) + " of my heart:");
            for (String message : loveMessages) {
                System.out.println(message);
                // Pause to let feelings sink in
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // Empty line for dramatic effect
        }

        // Conditional love statement
        if (true == true) {
            System.out.println("Conclusion: I love you, Faizii, infinitely!");
        }
    }
}
