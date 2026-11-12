class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int n = arr.length;

        int inc = 1;
        int maxInc = 0;
        // Check for Only Strictly Increasing Subarrays :
        for(int i=1; i<n; i++) {
            if(arr[i]>arr[i-1]) {
                inc++;
            } else {
                maxInc = Math.max(inc,maxInc);
                inc = 1;
            }
        }
        maxInc = Math.max(inc,maxInc);

        int dec = 1;
        int maxDec = 0;
        // Check for Only Strictly Decraesing Subarrays :
        for(int i = n-1; i>0; i--) {
            if(arr[i]<arr[i-1]) {
                dec++;
            } else {
                maxDec = Math.max(maxDec,dec);
                dec = 1;
            }
        }
        maxDec = Math.max(maxDec,dec);

        return Math.max(maxDec,maxInc);
    }
}