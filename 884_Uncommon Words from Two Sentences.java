import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word : array1)
            map.put(word, map.getOrDefault(word, 0) +1);

        for(String word : array2)
            map.put(word, map.getOrDefault(word, 0) +1);

        ArrayList<String> list = new ArrayList<>();

        for(String key : map.keySet())
        {
            int value = map.get(key);
            if(value == 1)
                list.add(key);
        }

        String[] result = new String[list.size()];
        int idx = 0;
        for(String word : list)
            result[idx++] = word;

        return result;
    }
}