package main.easy;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePointer]) {
                nums[++uniquePointer] = nums[i];
            }
        }
        return uniquePointer + 1;
    }
}