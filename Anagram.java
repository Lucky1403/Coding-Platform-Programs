import java.util.HashMap;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        
        if(s1.length() != s2.length())
        {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if(map.containsKey(ch))
            {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        
        for(int i = 0; i < s2.length(); i++)
        {
            char ch = s2.charAt(i);
            if(map.containsKey(ch))
            {
                int freq = map.get(ch);
                map.put(ch, freq - 1);
            }
            else
            {
                return false;
            }
        }
        
        for(char key : map.keySet()){
            if(map.get(key) > 0)
            {
                return false;
            }
        }
        
        return true;
    }
}