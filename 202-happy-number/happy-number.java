class Solution {

    public int squaredSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));
        while(slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        return slow == 1;
    }
}