class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;

        int count = 0;
        // Base Case :
        if(k>n || k==0) {
            return 0;
        }

        // Window selection :
        int window = 0;
        for(int i=0; i<k; i++) {
            window += arr[i];
        }

        // Sliding the window :
        int windowAvg = window/k;
        if(windowAvg >= threshold) {
                count++;
            }
        for(int i=k; i<n; i++) {
            window += arr[i] - arr[i-k];
            windowAvg = window / k;
            if(windowAvg >= threshold) {
                count++;
            }
        }
        return count;
    }
}