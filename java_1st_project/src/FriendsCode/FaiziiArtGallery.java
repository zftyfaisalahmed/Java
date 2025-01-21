package FriendsCode;

import java.util.concurrent.TimeUnit;
import java.time.LocalTime;
import java.util.function.Supplier;
import java.util.function.Consumer;

enum ArtPiece {
    SERENITY("Moonlit Ocean"),
    BLISS("Sunset Mountains"),
    DREAMSCAPE("Galaxy Night");

    private String description;

    ArtPiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class FaiziiArtGallery {
    public static void main(String[] args) throws InterruptedException {
        // Thread for gallery opening announcement
        Thread openingAnnouncer = new Thread(
                () -> System.out.println("Faizii's Virtual Art Gallery opens at " + LocalTime.of(7, 0) + " pm!"));

        // Lambda expression for featured art piece
        Supplier<String> featuredArt = () -> "Tonight's featured piece: " + ArtPiece.DREAMSCAPE + " - "
                + ArtPiece.DREAMSCAPE.getDescription();

        Supplier<String> featuredArt1 = () -> "Tonight's featured piece: " + ArtPiece.BLISS + " - "
                + ArtPiece.BLISS.getDescription();

        // Method reference for printing invitation
        Consumer<String> printInvite = System.out::println;

        // Invite Faizii to gallery opening
        printInvite.accept("You're invited to Faizii's Virtual Art Gallery Opening!");
        printInvite.accept(featuredArt.get());
        printInvite.accept(featuredArt1.get());

        // Wait before opening announcement
        TimeUnit.SECONDS.sleep(20);
        openingAnnouncer.start();
    }
}
