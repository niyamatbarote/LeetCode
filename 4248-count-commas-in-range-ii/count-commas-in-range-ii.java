class Solution {
    public long countCommas(long n) {
        
        long total = 0;
        long p = 1000l;
        while(p<=n) {
            total += n - p +1;
            p *= 1000L;
        }
        return total;
    }
}