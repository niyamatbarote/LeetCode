class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;

        for (int val : arr) {
            map.put(val, map.getOrDefault(val,0)+1);
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()) {
            if(e.getValue() > n/3) {
                list.add(e.getKey());
            }
        }
        return list;
    }
}