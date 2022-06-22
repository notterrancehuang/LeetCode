package test.easy;

import main.easy.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @org.junit.jupiter.api.Test
    void twoSum1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] output = new int[]{1, 0};
        assertArrayEquals(output, TwoSum.twoSum(nums, target));
    }

    @org.junit.jupiter.api.Test
    void twoSum2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] output = new int[]{2, 1};
        assertArrayEquals(output, TwoSum.twoSum(nums, target));
    }

    @org.junit.jupiter.api.Test
    void twoSum3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] output = new int[]{1, 0};
        assertArrayEquals(output, TwoSum.twoSum(nums, target));
    }
}