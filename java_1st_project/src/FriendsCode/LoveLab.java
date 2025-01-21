package FriendsCode;

import java.util.Scanner;

public class LoveLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name (Faizii): ");
        String yourName = input.nextLine();
        System.out.print("Enter my name (Nisha): ");
        String myName = input.nextLine();

        if (loveConfessionDetected()) { // new method to detect sweet words
            System.out.println("Our love percentage is: 100% - Faizii said something sweet!");

        } else {
            int lovePercentage = calculateLovePercentage(yourName, myName);
            System.out.println("Our love percentage is: " + lovePercentage + "%");
        }

    }

    static boolean loveConfessionDetected() {
        Scanner input = new Scanner(System.in);
        System.out.print("Did Faizii say something sweet? (yes/no): ");
        String response = input.nextLine();
        return response.equalsIgnoreCase("yes");
    }

    static int calculateLovePercentage(String yourName, String myName) {
        int yourAsciiSum = 0;
        int myAsciiSum = 0;

        for (char c : yourName.toLowerCase().toCharArray()) {
            yourAsciiSum += (int) c;
        }
        for (char c : myName.toLowerCase().toCharArray()) {
            myAsciiSum += (int) c;
        }

        int totalAsciiSum = yourAsciiSum + myAsciiSum;
        return (totalAsciiSum % 101); // scaling to 0-100 range
    }

}
