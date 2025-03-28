package ArrayCode;

public class ArrayJagged {
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int jaggedArray[][] = new int[3][];

        // Initialize each row with different lengths
        jaggedArray[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray[1] = new int[4]; // Row 1 has 4 columns
        jaggedArray[2] = new int[3]; // Row 2 has 3 columns

        // Assign values to elements
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;
        // ... and so on

        // Access elements
        System.out.println(jaggedArray[1][2]); // Output: 5
    }
}
