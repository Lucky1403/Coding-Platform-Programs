import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");
        if (pattern.length() != array.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
               if (map.containsValue(array[i]))
                    return false;
                map.put(pattern.charAt(i), array[i]);
            } 
            else{
                if(!map.get(pattern.charAt(i)).equalsIgnoreCase(array[i]))
                    return false;
            }
        }            
        return true;
    }
}