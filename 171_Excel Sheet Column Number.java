import java.util.HashMap;

class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> AlphabetMap = new HashMap<>();
        
        int value = 1;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            AlphabetMap.put(ch, value);
            value++;
        }

        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int number = AlphabetMap.get(columnTitle.charAt(i));
            result = result * 26 + number; 
        }

        return result;
    }
}