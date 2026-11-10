class Solution {
    public int sumOfUnique(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr) {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        int sum = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() == 1) {
                sum += e.getKey();
            }
        }
        return sum;
    }
}