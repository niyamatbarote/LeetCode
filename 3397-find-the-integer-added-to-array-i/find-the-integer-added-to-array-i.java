class Solution {



    public int addedInteger(int[] arr1, int[] arr2) {
        
        int min1 = arr1[0];
        int min2 = arr2[0];

        for(int i=1; i<arr1.length; i++) {
            min1= Math.min(arr1[i],min1);
            min2= Math.min(arr2[i],min2);
        }
        // Diffn b/w min2-min1 :
        return min2-min1;

    }
}