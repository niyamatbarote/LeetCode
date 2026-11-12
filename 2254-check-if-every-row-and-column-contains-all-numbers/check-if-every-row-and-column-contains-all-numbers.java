class Solution {
    public boolean checkValid(int[][] arr) {


        // Horizontal Check:
        for(int i=0; i<arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<arr.length; j++) {
                if(set.contains(arr[i][j])) {
                    return false;
                }
                set.add(arr[i][j]);
            }
        }
        // Vertical Check :
        for(int i=0; i<arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j =0; j<arr.length; j++) {
                if(set.contains(arr[j][i])) {
                    return false;
                }
                set.add(arr[j][i]);
            }
        }
        return true;
    }
}