class Solution {
    public int mostWordsFound(String[] sent) {
        // Space Count :
        int maxCount=0;

        // Traverse Each Sentence in Array:
        for(int i=0; i<sent.length; i++) {
            // Traverse ith sentence :
            int count = 0;
            for(int j = 0; j<sent[i].length(); j++) {
                if(sent[i].charAt(j) == ' ') {
                    count++;
                }
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount+1;
    }
}