package easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int insert = 0; // pointer where to insert
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                insert++;
            }
        }

        return insert;
    }
}