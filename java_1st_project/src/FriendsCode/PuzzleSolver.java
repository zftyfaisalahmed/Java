package FriendsCode;

public class PuzzleSolver {
    public static void main(String[] args) {
        String cipherText = "JXU SHQPO AUO YI CO IUSHUJ";
        String plainText = decrypt(cipherText);
        System.out.println("Decrypted text: " + plainText);
    }

    static String decrypt(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            // TO DO: implement decryption logic here – YOUR TURN, Faizii!
            if (c == ' ') { // preserve spaces
                plainText.append(c);
            } else if (c >= 'a' && c <= 'z') { // shift lowercase letters
                plainText.append((char) ('a' + (c - 'a' + 3) % 26));
            } else if (c >= 'A' && c <= 'Z') { // shift uppercase letters
                plainText.append((char) ('A' + (c - 'A' + 3) % 26));
            } else if (c == 'X') { // wrap around for 'X' (becomes 'A')
                plainText.append('A');
            } else if (c == 'Y') { // wrap around for 'Y' (becomes 'B')
                plainText.append('B');
            } else if (c == 'Z') { // wrap around for 'Z' (becomes 'C')
                plainText.append('C');
            } else if (c == 'x') { // wrap around for 'x' (becomes 'a')
                plainText.append('a');
            } else if (c == 'y') { // wrap around for 'y' (becomes 'b')
                plainText.append('b');
            } else if (c == 'z') { // wrap around for 'z' (becomes 'c')
                plainText.append('c');
            } else {
                plainText.append((char) (c + 3)); // shift other characters
            }
        }
        return plainText.toString();
    }
}
