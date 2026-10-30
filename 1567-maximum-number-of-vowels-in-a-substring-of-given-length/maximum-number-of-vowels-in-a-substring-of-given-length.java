class Solution {

    public boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
        

    public int maxVowels(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        int n = sb.length();

        // Base Case :
        if(k>n || k==0) {
            return 0;
        }

        int currWindowCount = 0;
        // Window Creation :
        StringBuilder window = new StringBuilder(sb.substring(0,k-1));
        for(int i = 0; i<k; i++) {
            char ch = sb.charAt(i);
            if( isVowel(ch) ) {
                currWindowCount++;
            }
        }

        // Sliding Window :
        int max = currWindowCount;
        for(int i = k; i<n ; i++) {
            char prev = sb.charAt(i-k);
            char curr = sb.charAt(i);
            if (isVowel(prev)) {
                currWindowCount--;
            }
            if(isVowel(curr)) {
                currWindowCount++;
            }
            window.append(curr);
            window.deleteCharAt(0);

            max = Math.max(max,currWindowCount);
            if(max==k) {
                return max;
            }
        }
        return max;
    }
}