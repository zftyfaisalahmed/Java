package ArrayCode;

public class JaggedArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][9];

        // we get outer array length i.e., 3
        System.out.println(arr.length);

        // we get size of the inner array length i.e., 9
        System.out.println(arr[0].length);

        // its because we already given the size of outer and inner array where
        // outer array length is 3 and inner array length is 9
        // if we don't know the inner array length we use jagged array

        // let array named jagged array

        int jagged[][] = new int[3][]; // we have given nothing just because we don't
        // know the inner array size;

        // so we can define the inner array size as follow

        jagged[0] = new int[4]; // just creating new array and referencing the first index
        // of the jagged array with the new array

        // like wise
        jagged[1] = new int[5];
        jagged[2] = new int[6];

        // now we can see the size of inner arrays are different
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);

    }

}
