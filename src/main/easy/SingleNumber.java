package main.easy;

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                // if set already has num, remove it
                set.remove(num);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        int single = SingleNumber.singleNumber(nums);
        System.out.println(single);
    }
}