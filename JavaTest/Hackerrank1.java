package JavaTest;

class MissingLetter {
    public static int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}

public class Hackerrank1 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 0 };
        System.out.println("Output: " + MissingLetter.firstMissingPositive(nums1));

        int[] nums2 = { 3, 4, -1, 1 };
        System.out.println("Output: " + MissingLetter.firstMissingPositive(nums2));
    }
}
