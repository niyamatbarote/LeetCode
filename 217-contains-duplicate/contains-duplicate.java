class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : arr) {
            map.put(val , map.getOrDefault(val,0) + 1 );
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}