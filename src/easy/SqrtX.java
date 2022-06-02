package easy;

public class SqrtX {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int mid;
        int answer = 0;
        long temp;

        while (left <= right) {
            mid = (left + (right - left) / 2);
            temp = (long) mid * (long) mid;
            if (temp == x) {
                return mid;
            }
            if (temp < x) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }
}