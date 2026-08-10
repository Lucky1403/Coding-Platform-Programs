import java.util.HashMap;

class Solution {
    public char nonRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        char answer = s.charAt(0);
        for(int i = 0; i < s.length(); i++)
        {
            char ele = s.charAt(i);
            if(map.get(ele) == 1)
            {
                answer = ele;
                return answer;
            }
        }
        return '$';
    }
}
