class Solution {
    // [100000,99998,99998,100000] test case FAIL : !!!!!!!!!!!!!
    public int mostFrequentEven(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxFreq = -1;
        int mostFreqElement = Integer.MAX_VALUE;

        for (int val : arr) {
            if (val % 2 == 0) {
                map.put(val, map.getOrDefault(val,0) +1);
            }
        }

        if(map.isEmpty()) {
            return -1;
        }

        for (Map.Entry<Integer,Integer> e: map.entrySet()) {
            if(e.getValue() > maxFreq ) {
                maxFreq = e.getValue();
                mostFreqElement = e.getKey();
            }
            if (e.getValue() == maxFreq && e.getKey() < mostFreqElement ) {
                mostFreqElement = e.getKey();
            }
        }
        return mostFreqElement;
    }
}