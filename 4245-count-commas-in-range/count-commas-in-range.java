class Solution {
    public int countCommas(int n) {
        
        if (n<1000) {
            return 0;
        }
        
        long total = 0;
        long p = 1000L;

        while (p <= n) {
            total += n - p + 1;
            p *= 1000;
        }
        return (int) total;
    }
}