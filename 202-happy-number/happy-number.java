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
        while(n != 1 && n != 4) {
            n = squaredSum(n);
        }
        return n == 1;
    }
}