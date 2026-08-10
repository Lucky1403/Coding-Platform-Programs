import java.util.HashMap;

class Solution {
    public int equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int answer = 0;
        for(char ch : map.keySet())
        {
            answer += (map.get(ch) * map.get(ch));
        }
        
        return answer;
    }
}