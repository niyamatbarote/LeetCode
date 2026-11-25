class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {

        // HashMap< arr[i] --> index >
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = arr.length;
        for(int i = 0; i<n ; i++) {
            if(map.containsKey(arr[i])) {
                if( Math.abs( map.get(arr[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(arr[i],i);
        }
        return false;
    }
}