class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;

        // cc = currentConsecutive, mc = maxConsecutive 
        int cc = 0;
        int mc = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                cc++;
            } else {
                cc = 0;
            }
            mc = Math.max(cc,mc);
        }
        return mc;
    }
}