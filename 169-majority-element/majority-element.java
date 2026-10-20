class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : arr) {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            if( e.getValue() > n/2 ) {
                return e.getKey();
            }
        }
        return -1;
    }
}