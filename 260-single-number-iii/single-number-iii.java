class Solution {
    public int[] singleNumber(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};

        // Put the <val,Freq> in the HashMap : 
        for(int val : arr) {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        //Retrieve the Unique/Single Frequency Number : 
        int i = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue()==1) {
                ans[i] = e.getKey();
                i++;
            }
        }
        return ans;
    }
}