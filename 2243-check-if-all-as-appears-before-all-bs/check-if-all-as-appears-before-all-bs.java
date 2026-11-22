class Solution {
    public boolean checkString(String s) {
        boolean a = true;
        boolean b = false;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a' && b) return false;
            if(s.charAt(i) == 'b')  b = true;
        }
        return true;
    }
}