import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    class Pair implements Comparable<Pair>{
        int value;
        String word;

        Pair(int value, String word)
        {
            this.value = value;
            this.word = word;
        }

        public int compareTo(Pair p)
        {
            if(this.value == p.value)
            {
                return p.word.compareTo(this.word);
            }
            return Integer.compare(this.value, p.value);
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            Integer value = entry.getValue();
            pq.add(new Pair(value, word));
            if(pq.size() > k)
            {
                pq.remove();
            }
        }

        String[] wordStrings = new String[k];
        int i = 0;
        while(pq.size() > 0)
        {
            Pair p = pq.remove();
            wordStrings[i++] = p.word;
        }

        List<String> ans = new ArrayList<>();
        for(String word : wordStrings)
        {
            ans.add(word);
        }
        Collections.reverse(ans);
        return ans;
    }
}