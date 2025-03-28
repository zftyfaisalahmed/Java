package Problems;

public class ReverseByword {
    public static void main(String[] args) {
        String str = "Hi Good Evening Everybody";
        int count = 0;
        int pos = 0;
        String str2 = "";

        // Check how many sapce are there
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(count++);
            }
        }

        // Store in the string
        String arr[] = new String[count + 1];

        // Reverse a string by word by word
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                str2 = str2 + str.charAt(i);
            } else if (str.charAt(i) == ' ') {
                arr[pos] = str2;
                pos++;
                str2 = "";
            }
        }

        arr[pos] = str2;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
