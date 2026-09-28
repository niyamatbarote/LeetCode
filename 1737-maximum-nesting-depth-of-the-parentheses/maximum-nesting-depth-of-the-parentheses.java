class Solution {
    public int maxDepth(String s) {
        int len = s.length();
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i<len; i++) {
            if(s.charAt(i) == '(') {
                count++;
                maxCount = Math.max(count,maxCount);
            }
            if(s.charAt(i) == ')') {
                count--;
            }
        }
        return maxCount;
    }
}