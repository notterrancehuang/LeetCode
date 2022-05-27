package easy;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curr < 0) {
                curr = 0;
            }
            curr += nums[i];
            maxSum = Math.max(maxSum, curr);
        }
        return maxSum;
    }
}