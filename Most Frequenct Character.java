import java.util.HashMap;

class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        
        int maxFrequency = 0;
        for(char ch : map.keySet())
        {
            int freq = map.get(ch);
            if(freq > maxFrequency)
            {
                maxFrequency = freq;
            }
        }
        
        char ans = 'z';
        for(char ch : map.keySet())
        {
            int freq = map.get(ch);
            if(freq == maxFrequency && ch < ans)
            {
                ans = ch;
            }
        }
        
        return ans;
    }
}