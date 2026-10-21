class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();

        // Traversing s String : 
        for(char ch : s.toCharArray()) {
            mapS.put(ch, mapS.getOrDefault(ch,0)+1) ;
        }
        // Traversing t String :
        for (char ch : t.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch,0)+1);
        }

        // Both HashMap Size Check :
        // if (mapT.size() != mapS.size()) {
        //     return false;
        // }

        for (Map.Entry<Character,Integer> e: mapS.entrySet()) {
            char temp = e.getKey();
            if(mapT.containsKey(temp)) {
                // ***** BIGGEST CATCH : e.getValue().equals:
                // BCZ we are Comparing Integer w Integer.
                // The Reference or Address of That Integer is Stored
                // Not Actual Integer Value ;
                // Therefore, "".equals"
                if( !(e.getValue().equals(mapT.get(temp))) ) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}