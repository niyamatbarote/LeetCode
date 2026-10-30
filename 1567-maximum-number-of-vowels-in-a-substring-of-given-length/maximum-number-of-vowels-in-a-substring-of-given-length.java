class Solution {

    public boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public int maxVowels(String s, int k) {
        int n = s.length();

        // Base Case :
        if(k>n || k==0) {
            return 0;
        }

        // Window Fixing :
        int currCount = 0;
        for(int i=0; i<k; i++) {
            if(isVowel(s.charAt(i))) {
                currCount++;
            }
        }

        // Sliding The Window:
        int maxCount = currCount;
        for(int i =k; i<n; i++) {
            char first = s.charAt(i-k);
            char last = s.charAt(i);
            if(isVowel(first)) currCount--;
            if(isVowel(last)) currCount++;
            maxCount = Math.max(currCount, maxCount);
            if(maxCount==k) return maxCount;
        }
        return maxCount;
    }
}