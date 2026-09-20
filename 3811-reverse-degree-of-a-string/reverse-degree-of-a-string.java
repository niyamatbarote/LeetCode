class Solution {
    public int reverseDegree(String s) {
        int tot = 0;

        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 26 - i;
        }

        char[] ch = new char[26];
        int ascii = 97;
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char)ascii;
            ascii++;
        }

        for (int i =0; i<s.length(); i++) {
            for(int j = 0; j<ch.length; j++) {
                if (s.charAt(i) == ch[j]) {
                    tot += arr[j] * (i+1); 
                }
            }
        }
        return tot;
    }
}