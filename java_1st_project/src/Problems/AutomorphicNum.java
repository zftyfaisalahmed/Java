package Problems;

public class AutomorphicNum {
    public static void main(String[] args) {
        int num = 7;

        int square = num * num;

        String numStr = String.valueOf(num);
        String squStr = String.valueOf(square);
        // System.out.println(squStr);

        if (squStr.endsWith(numStr)) {
            System.out.println("Auto");
        } else {
            System.out.println("Not");
        }

    }
}
