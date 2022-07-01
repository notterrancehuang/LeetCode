package main.easy;

public class SqrtX {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x / 2;
        long square;
        int answer = 0;

        if (x < 2) {
            return x;
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            square = (long) mid * (long) mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}