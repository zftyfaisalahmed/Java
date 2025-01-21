package FriendsCode;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class MoonlightSerenadeInvite {
    public static void main(String[] args) {
        // Create event object with details
        class Event {
            String name;
            LocalDateTime date;
            String location;
            String message;

            public Event(String name, LocalDateTime date, String location, String message) {
                this.name = name;
                this.date = date;
                this.location = location;
                this.message = message;
            }
        }

        // Initialize event details
        Event moonlightSerenade = new Event(
                "Moonlight Serenade for Faizii",
                LocalDateTime.of(LocalDate.now(), LocalTime.of(8, 0)), // Tonight 8 pm
                "Riverwalk under the willow tree",
                "Will you serenade the night with me?");

        // Print invitation with formatted date/time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MMM d yyyy, h:mm a");
        System.out.println("Inviting Faizii to...");
        System.out.println(moonlightSerenade.name);
        System.out.println("Date/Time: " + moonlightSerenade.date.format(dtf));
        System.out.println("Location: " + moonlightSerenade.location);
        System.out.println(moonlightSerenade.message);
    }
}
