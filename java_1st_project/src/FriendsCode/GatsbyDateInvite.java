package FriendsCode;

import java.util.*;

public class GatsbyDateInvite {
    public static void main(String[] args) {
        ArrayList<String> inviteDetails = new ArrayList<>();
        inviteDetails.add("Faizii");
        inviteDetails.add("Tonight");
        inviteDetails.add("Gatsby");
        inviteDetails.add("7 pm");
        inviteDetails.add("Forever with me?");

        HashMap<String, String> dateParams = new HashMap<>();
        dateParams.put("Location", "Gatsby");
        dateParams.put("Time", "7 pm");
        dateParams.put("Duration", "Whole night");
        dateParams.put("Company", "Mine always?");

        System.out.println("Inviting " + inviteDetails.get(0) + "...");
        System.out.println("You're invited for tonight at " + inviteDetails.get(2) + " at " + inviteDetails.get(3));
        System.out.println("Date parameters: " + dateParams);
        System.out.println(inviteDetails.get(4)); // Forever with me?
    }
}
