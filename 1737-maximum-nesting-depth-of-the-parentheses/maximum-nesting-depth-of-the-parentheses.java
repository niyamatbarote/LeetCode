class Solution {
    public int maxDepth(String s) {
        int len = s.length();
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i<len; i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                count++;
                maxCount = Math.max(count,maxCount);
            }
            if(ch == ')') {
                count--;
            }
        }
        return maxCount;
    }
}