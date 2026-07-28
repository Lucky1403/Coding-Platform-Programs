import java.util.HashMap;
import java.util.Map;

class Solution {
    public int reverseDegree(String s) {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetMap.put(ch, 26 - (ch - 'a'));
        }

        int result = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            int number = 0;
            
            if (alphabetMap.containsKey(ch)) {
                number = alphabetMap.get(ch);
            }

            result += number * (i + 1);
        }

        return result;
    }
}