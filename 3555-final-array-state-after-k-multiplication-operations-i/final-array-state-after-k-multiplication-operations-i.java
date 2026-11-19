class Solution {
    public int[] getFinalState(int[] arr, int k, int multiplier) {
        
        // K Operations :
        for(int i =0; i<k; i++) {
            // Find Min Index :
            int minInd = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] < arr[minInd] ) {
                    minInd = j;
                }
            }
            arr[minInd] *= multiplier;
        }
        return arr;
    }
}