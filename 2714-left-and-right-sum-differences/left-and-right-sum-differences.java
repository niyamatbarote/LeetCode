class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        // Add leftSum :
        for(int i=1; i<n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i-1];
        }
        // Add rightSum :
        for(int i=n-2; i>=0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i+1] ;
        }
        int[] ans = new int[n];
        // Left & Right Sum Differences :
        for(int i=0 ; i<n; i++) {
            ans[i] =  Math.abs(leftSum[i] - rightSum[i])  ;
        }
        return ans;
    }
}