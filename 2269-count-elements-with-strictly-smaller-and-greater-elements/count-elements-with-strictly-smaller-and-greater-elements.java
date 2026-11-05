class Solution {
    public int countElements(int[] arr) {
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int a : arr) {
            if(a>max) {
                max = a;
            }
            if(a<min) {
                min = a;
            }
        }
        int count = 0;
        for(int a : arr) {
            if(a>min && a<max) {
                count++;
            }
        }
        return count;
    }
}