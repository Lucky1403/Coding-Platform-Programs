import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char character = s.charAt(i);
            charCounts.put(character, charCounts.getOrDefault(character, 0) + 1);
        }

        for(int j = 0; j < t.length(); j++)
        {
            char ch = t.charAt(j);
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1); 
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        return ' '; 
    }
}