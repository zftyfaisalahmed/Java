package FriendsCode;

import java.util.Random;

public class OurLoveStory {
    public static void main(String[] args) {
        String[] heroineNames = { "Faizii", "My Love", "Heartbeat" };
        String[] heroNames = { "Me", "Yours Truly", "Devoted" };
        String[] loveScenes = { "met at sunset", "bonded over coffee", "danced under stars" };
        String[] happyEndings = { "living happily ever after", "forever entwined", "love shining bright" };
        Random random = new Random();
        int heroineIndex = random.nextInt(heroineNames.length);
        int heroIndex = random.nextInt(heroNames.length);
        int loveSceneIndex = random.nextInt(loveScenes.length);
        int happyEndingIndex = random.nextInt(happyEndings.length);
        System.out.println("Once upon a time...");
        System.out.println(
                heroineNames[heroineIndex] + " " + loveScenes[loveSceneIndex] + " with " + heroNames[heroIndex] + ".");
        System.out.println("From that moment on, they were " + happyEndings[happyEndingIndex] + ".");
    }
}
