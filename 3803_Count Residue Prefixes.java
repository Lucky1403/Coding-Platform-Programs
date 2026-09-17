import java.util.HashSet;

class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int Count = 0;

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
            
            int prefixLength = i + 1;
            
            if (set.size() == (prefixLength % 3)) {
                Count++;
            }
        }

        return Count;
    }
}