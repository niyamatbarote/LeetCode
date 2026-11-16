class Solution {
    public String digitSum(String s, int k) {
        // Base Case :
        if(s.length()<=k) {
            return s;
        }
        String newStr = "";
        while(s.length()>k) {
            for(int i =0; i<s.length(); i+=k) {
                int end = Math.min(i+k, s.length());
                // Traverse the k Consecutive Groups & Counting Sum :
                int sum = 0;
                for(int j = i; j<end; j++) {
                    sum += s.charAt(j) - '0';
                }
                newStr += sum;
            }
            s = newStr;
            newStr = "";
        }

        return s;
    }
}