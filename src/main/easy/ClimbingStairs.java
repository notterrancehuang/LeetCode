package main.easy;

import java.util.HashMap;

public class ClimbingStairs {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int n) {
        return fibonacci(n);
    }

    private static int fibonacci(int n) {
        int result = 0;
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n <= 2) {
            return n;
        }

        result =  fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}