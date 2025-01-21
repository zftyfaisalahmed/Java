package FriendsCode;

import java.util.Scanner;
import java.lang.Thread;
import java.lang.InterruptedException;

public class SurpriseCelebration {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Faizii's Celebration Hub!");

    while (true) {
      System.out.println("Choose your surprise:");
      System.out.println("1. Virtual Fireworks Display");
      System.out.println("2. Customized Love Coupon Book");
      System.out.println("3. Interactive Couple's Trivia");
      System.out.println("4. Secret Message Scavenger Hunt");
      System.out.println("5. Exit Celebration Hub");

      int choice = input.nextInt();
      switch (choice) {
        case 1:
          virtualFireworks();
          break;
        case 2:
          loveCouponBook();
          break;
        case 3:
          couplesTrivia(input);
          break;
        case 4:
          secretMessageHunt(input);
          break;
        case 5:
          System.out.println("Thanks for celebrating with me, Machii!");
          return;
        default:
          System.out.println("Invalid choice. Please try again!");
      }
    }
  }

  static String randomColor() {
    String[] colors = { "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m" };
    return colors[(int) (Math.random() * colors.length)];
  }

  static String resetColor() {
    return "\u001B[0m";
  }

  // Methods for each surprise activity...
  static void virtualFireworks() {
    System.out.println("***VIRTUAL FIREWORKS DISPLAY***");
    // Fireworks animation code here...
    for (int i = 0; i < 10; i++) {
      System.out.println(randomColor() + "********** FIREWORKS **********" + resetColor());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  static void loveCouponBook() {
    System.out.println("***MISSING YOU MORE***");
    // Coupon book generation code here...
    String[] coupons = { "Come back soon", "I already missing you" };
    for (String coupon : coupons) {
      System.out.println(coupon);
    }
  }

  static void couplesTrivia(Scanner input) {
    System.out.println("***INTERACTIVE TRIVIA***");
    // Trivia game code here...
    String[] questions = { "What is my favorite color?", "What is my favorite food?" };
    String[] answers = { "Black", "Pizza" };
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      String userAnswer = input.next();
      if (userAnswer.equalsIgnoreCase(answers[i])) {
        System.out.println("Correct!");
      } else {
        System.out.println("Incorrect. The answer is " + answers[i]);
      }
    }
  }

  static void secretMessageHunt(Scanner input) {
    System.out.println("***SECRET MESSAGE SCAVENGER HUNT***");
    // Scavenger hunt code here...
    String[] clues = { "Look under the couch cushion", "Check the fridge" };
    String secretMessage = "I MISS YOU AlREADY!";
    for (String clue : clues) {
      System.out.println(clue);
      input.next(); // Wait for user to press enter
    }
    System.out.println("SECRET MESSAGE: " + secretMessage);
    System.out.println("Message me when you coming back...");
  }
}
