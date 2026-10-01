class Solution {
    public int evenNumberBitwiseORs(int[] arr) {
        int n = arr.length;
        int or =0;
        for (int i = 0; i<n; i++) {
            if (arr[i]%2==0) {
                or |= arr[i];
            }
        }
        return or;
    }
}