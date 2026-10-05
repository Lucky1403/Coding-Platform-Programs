import java.util.*;

class Solution {
    public String oddString(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);
        map.put('k', 10);
        map.put('l', 11);
        map.put('m', 12);
        map.put('n', 13);
        map.put('o', 14);
        map.put('p', 15);
        map.put('q', 16);
        map.put('r', 17);
        map.put('s', 18);
        map.put('t', 19);
        map.put('u', 20);
        map.put('v', 21);
        map.put('w', 22);
        map.put('x', 23);
        map.put('y', 24);
        map.put('z', 25);

        HashMap<List<Integer>, Integer> result = new HashMap<>();
        HashMap<List<Integer>, String> wordMap = new HashMap<>();

        for(String word : words)
        {
            List<Integer> n = new ArrayList<>();
            for(int i = 1; i < word.length(); i++)
                n.add(map.get(word.charAt(i)) - map.get(word.charAt(i-1)));

            result.put(n, result.getOrDefault(n,0) + 1);
            wordMap.put(n, word);
        }

        for(List<Integer> key : result.keySet())
        {
            if(result.get(key) == 1)
                return wordMap.get(key);
        }

        return "";
    }
}