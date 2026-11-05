class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int a1 = arr1.length;
        int a2 = arr2.length;

        int count = 0;
        for(int i = 0; i<a1; i++) {
            int currCount=0;
            for(int j=0; j<a2; j++) {
                if( Math.abs(arr1[i] - arr2[j] ) > d ) {
                    currCount++;
                }
            }
            if(currCount == a2) {
                count++;
            }
        }
        return count;
    }
}