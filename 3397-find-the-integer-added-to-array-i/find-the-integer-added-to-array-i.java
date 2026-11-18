class Solution {



    public int addedInteger(int[] arr1, int[] arr2) {
        
        int min1 = arr1[0];
        int min2 = arr2[0];

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i]<min1) {
                min1 = arr1[i];
            }
            if(arr2[i]<min2) {
                min2 = arr2[i];
            }
        }
        // Diffn b/w min2-min1 :
        return min2-min1;

    }
}