class Solution {

    // public void sort(String str, int low, int high) {
    //     if(low >= high) {
    //         return;
    //     }
    //     int start = low;
    //     int end = high;
    //     int pivot = start + (end-start) / 2 ;
    //     char pChar = str.charAt(pivot);

    //     while( start <= end) {
    //         while (str.charAt(start) < pChar) {
    //             start++;
    //         }
    //         while ( str.charAt(end) > pChar) {
    //             end--;
    //         }
    //         if(start <= end) {
    //             char temp = str.charAt(start);
    //             str.charAt(start) = str.charAt(end);
    //             str.charAt(end) = temp;
    //             start++;
    //             end--;
    //         }
    //     }
    //     sort(str,start,high);
    //     sort(str,low,end);
    // }

    public char findTheDifference(String s, String t) {
        int sL = s.length();
        int tL = t.length();

        int max = Math.max(sL,tL);

        int sValue = 0;
        int tValue = 0;
        for(int i = 0; i<max; i++) {
            if(i<sL) {
                sValue += s.charAt(i); 
            }
            if(i<tL) {
                tValue +=t.charAt(i);
            }
        }
        return (char)Math.abs(sValue-tValue);
    }
}