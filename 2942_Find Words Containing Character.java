import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();

        int index =  0;
        for(String str : words)
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == x)
                {
                    result.add(index);
                    break;
                }
            }
            index++;
        }

        return result;
    }
}