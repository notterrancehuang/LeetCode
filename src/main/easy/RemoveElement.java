package main.easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int pointer = 0; 
        for (int num : nums) {
            if (num != val) {
                nums[pointer++] = num;
            }
        }
        return pointer;
    }
}