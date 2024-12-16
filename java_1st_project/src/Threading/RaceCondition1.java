package Threading;

import java.lang.*;

// Define a class that extends Thread for multi-threading
class MsOffices extends Thread {
    @Override
    public void run() {
        // Identify the task based on the thread's name
        if (Thread.currentThread().getName().equals("Typing")) {
            Typing();
        } else if (Thread.currentThread().getName().equals("SpellCheck")) {
            SpellCheck();
        } else {
            Saving();
        }
    }

    // Primary task: Typing simulation
    public void Typing() {
        try {
            for (int i = 1; i <= 5; i++) { // Simulate typing 5 times
                System.out.println("Typing........");
                Thread.sleep(3000); // Pause for 3 seconds
            }
        } catch (Exception e) {
            System.out.println("Error during Typing: " + e);
        }
    }

    // Secondary task: Continuous spell-check simulation
    public void SpellCheck() {
        try {
            for (;;) { // Infinite loop for continuous spell-check
                System.out.println("SpellCheck........");
                Thread.sleep(3000); // Pause for 3 seconds
            }
        } catch (Exception e) {
            System.out.println("Error during SpellCheck: " + e);
        }
    }

    // Secondary task: Continuous saving simulation
    public void Saving() {
        try {
            for (;;) { // Infinite loop for continuous saving
                System.out.println("Saving........");
                Thread.sleep(3000); // Pause for 3 seconds
            }
        } catch (Exception e) {
            System.out.println("Error during Saving: " + e);
        }
    }
}

// Main class to demonstrate multi-threading
public class RaceCondition1 {
    public static void main(String[] args) {

        // Create thread instances with specific tasks
        MsOffices ms1 = new MsOffices();
        ms1.setName("Typing");

        MsOffices ms2 = new MsOffices();
        ms2.setName("SpellCheck");

        MsOffices ms3 = new MsOffices();
        ms3.setName("Saving");

        // Set thread priorities (Optional and subject to JVM handling)
        ms2.setPriority(8); // Higher priority for spell-check
        ms3.setPriority(9); // Highest priority for saving

        // Mark spell-check and saving threads as daemon threads
        ms2.setDaemon(true);
        ms3.setDaemon(true);

        // Start the threads
        ms1.start(); // Start the Typing thread (Primary task)
        ms2.start(); // Start the SpellCheck thread (Daemon)
        ms3.start(); // Start the Saving thread (Daemon)
    }
}