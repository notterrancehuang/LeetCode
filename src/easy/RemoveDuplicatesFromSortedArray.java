package easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        // Input: [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, num = [0, 1, 2, 3, 4, _, _]
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePointer]) {
                nums[++uniquePointer] = nums[i];
            }
        }
        return uniquePointer + 1;
    }
}